package com.example.demo.service;

import com.fasterxml.jackson.core.sym.Name;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    

    public String Template(String Name){
        return "¡Hola " + Name + "!";
    }
}
