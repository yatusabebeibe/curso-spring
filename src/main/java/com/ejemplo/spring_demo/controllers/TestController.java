package com.ejemplo.spring_demo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping({"/", "/hola", "/brrrrr"})
    public String test(Map<String, Object> map) {
        map.put("coso", "djgak");
        map.put("bua", "nose");
        return "x";
    }

    @GetMapping({"/nose"})
    public String test2(Map<String, Object> map) {
        map.put("coso", "djgak alkjvsdnce");
        map.put("bua", "nose dasfdsf 😊");
        return "x";
    }
}
