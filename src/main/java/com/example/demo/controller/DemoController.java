package com.example.demo.controller;

import com.example.demo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {
    
    @Autowired
    private DemoService service;

    /**
     * Template para futuras creaciones
     * @param Nombre
     * @return
     */ 
    @GetMapping("/template")
    public String template(
         @RequestParam(name = "nombre", required = true) String Nombre
    ){
        return service.Template(Nombre);
    }

}
