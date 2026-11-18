package com.exploramexico.controller;

import com.exploramexico.dao.UsuarioDAO;
import com.exploramexico.model.Usuario;
import java.util.Optional;

public class UsuarioController {

    private final UsuarioDAO usuarioDAO;

    public UsuarioController(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public Optional<Usuario> buscarUsuario(Long idUsuario) {
        return usuarioDAO.buscarPorId(idUsuario);
    }
}
