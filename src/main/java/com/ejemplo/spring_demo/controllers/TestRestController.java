package com.ejemplo.spring_demo.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.spring_demo.dao.UsuarioDAO;
import com.ejemplo.spring_demo.models.Usuario;


@RestController
@RequestMapping("/apirest")
public class TestRestController {
    // UsuarioDAO usuarioDAO = new UsuarioDAO();

    private final UsuarioDAO usuarioDAO;

    public TestRestController(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @GetMapping("/cosas")
    public Map<String, Object> getMethodName() {
        Map<String, Object> map = new HashMap<>();
        map.put("hola", "nose");
        map.put("papa", new HashMap<>(map));
        map.put("capa", "nosexdddd ffffff");
        map.put("xyz", new HashMap<>(map));
        map.put("xyx", new HashMap<>(map));
        map.put("xyy lololool", new HashMap<>(map));
        return map;
    }
    
    @GetMapping({"/usuarios", "/usuarios/"})
    public List<Usuario> getUsuarios() {
        return usuarioDAO.obtenerUsuarios();
    }
}
