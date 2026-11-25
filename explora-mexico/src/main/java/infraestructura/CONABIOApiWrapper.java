/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infraestructura;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class CONABIOApiWrapper {
//
//    private final HttpClient httpClient;
//
//    public CONABIOApiWrapper() {
//        this.httpClient = HttpClient.newBuilder()
//                .connectTimeout(Duration.ofSeconds(10))
//                .build();
//    }
//
//    public String consultarEspeciePorId(Long idEspecie) {
//        try {
//            String url = "https://enciclovida.mx/especies/" + idEspecie + ".json";
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(URI.create(url))
//                    .header("Accept", "application/json")
//                    .GET()
//                    .build();
//
//            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//            if (response.statusCode() == 200) {
//                return response.body();
//            }
//        } catch (Exception e) {
//            System.err.println("Error al consultar CONABIO: " + e.getMessage());
//        }
//        return null;
//    }
}