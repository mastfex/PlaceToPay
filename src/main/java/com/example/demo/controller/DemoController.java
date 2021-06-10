package com.example.demo.controller;

import com.example.demo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @PostMapping("/tokenize")
    public com.example.demo.request.tokenize.Input tokenizer(
         @RequestBody com.example.demo.request.tokenize.Input input
    ){
    	
        return input;
    }
    
    @PostMapping("/process")
    public com.example.demo.request.transaction.Input processTransaction(
         @RequestBody com.example.demo.request.transaction.Input input
    ){
        return input;
    }

}
