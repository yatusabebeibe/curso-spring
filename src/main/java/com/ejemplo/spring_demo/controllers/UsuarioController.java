package com.ejemplo.spring_demo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ejemplo.spring_demo.dao.UsuarioDAO;
import com.ejemplo.spring_demo.models.Usuario;


@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    // UsuarioDAO usuarioDAO = new UsuarioDAO();

    private final UsuarioDAO usuarioDAO;

    public UsuarioController(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @GetMapping({"","/"})
    public String getUsuarios(Map<String, Object> map) {

        map.put("listaUsuarios", usuarioDAO.obtenerUsuarios());

        return "verUsuarios";
    }

    @PostMapping({"","/"})
    public String procesarFormulario2(Usuario usuario) { 
        // se validarian los datos y demas

        usuarioDAO.añadirUsuario(usuario);

        return "redirect:/usuarios/"; // recarga la pagina para que use el metodo GET y cargue la lista
    }


    @GetMapping({"/añadir"})
    public String mostrarFormulario() {
        return "añadirUsuario";
    }

    @PostMapping({"/añadir"})
    public String procesarFormulario(Usuario usuario) { 
        // se validarian los datos y demas

        usuarioDAO.añadirUsuario(usuario);

        return "redirect:./";
    }
    
}
