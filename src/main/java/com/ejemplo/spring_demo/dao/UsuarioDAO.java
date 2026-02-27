package com.ejemplo.spring_demo.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ejemplo.spring_demo.models.Usuario;

@Service
public class UsuarioDAO {

    ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public void añadirUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public ArrayList<Usuario> obtenerUsuarios() {
        return listaUsuarios;
    }
    
}
