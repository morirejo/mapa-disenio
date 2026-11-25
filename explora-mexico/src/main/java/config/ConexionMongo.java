/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import model.Estudiante;
import model.Usuario;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.ClassModel;
import org.bson.codecs.pojo.PojoCodecProvider;

public class ConexionMongo {

    private static final String URI = "mongodb://localhost:27017";
    private static final String NOMBRE_BD = "Mapa_regiones";
    private static MongoClient cliente;
    private static MongoDatabase baseDatos;

    private ConexionMongo() {
    }

    public static MongoDatabase getDatabase() {
        if (baseDatos == null) {
            CodecRegistry pojoCodecRegistry = fromProviders(
                    PojoCodecProvider.builder()
                            .register(ClassModel.builder(Usuario.class).enableDiscriminator(true).build())
                            .register(ClassModel.builder(Estudiante.class).enableDiscriminator(true).build())
                            .automatic(true)
                            .build()
            );

            CodecRegistry codecRegistry = fromRegistries(
                    MongoClientSettings.getDefaultCodecRegistry(),
                    pojoCodecRegistry
            );

            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(new ConnectionString(URI))
                    .codecRegistry(codecRegistry)
                    .build();

            cliente = MongoClients.create(settings);
            baseDatos = cliente.getDatabase(NOMBRE_BD);
        }
        return baseDatos;
    }

    public static void cerrarConexion() {
        if (cliente != null) {
            cliente.close();
            cliente = null;
            baseDatos = null;
        }
    }
}