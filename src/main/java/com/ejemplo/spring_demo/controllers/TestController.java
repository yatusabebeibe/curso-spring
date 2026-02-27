package com.ejemplo.spring_demo.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ejemplo.spring_demo.models.Usuario;


@Controller
public class TestController {

    @GetMapping({"","/", "/hola", "/brrrrr"})
    public String test(Map<String, Object> map) {
        map.put("coso", "djgak");
        map.put("bua", "nose");
        return "x";
    }

    @GetMapping({"/nose"})
    public String test2(Map<String, Object> map) {
        map.put("coso", "djgak alkjvsdnce");
        map.put("bua", "nose dasfdsf 😊");
        return "verUsuarios";
    }

    @ModelAttribute("listaUsuarios")
    public List<Usuario> listaUsuarios() {
        return Arrays.asList(
            new Usuario("jesus", "nose", "c nose 14", 676)
        );
    }
    
}
