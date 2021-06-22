package com.example.demo.controller;

import java.util.List;

import com.example.demo.request.QueryRequest;
import com.example.demo.response.QueryResponse;
import com.example.demo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("demo")
public class DemoController {
    
    @Autowired
    private DemoService service;

    @PostMapping("/tokenize")
    public Mono<List<com.example.demo.response.TokenizeResponse>> tokenizer(
         @RequestBody com.example.demo.request.TokenizeRequest input
    ) throws Exception{
    	
        return service.postTokenize(input);
    }
    
    @PostMapping("/process")
    public Mono<List<com.example.demo.response.ProcessResponse>> processTransaction(
         @RequestBody com.example.demo.request.ProcessRequest input
    ){
    	return service.postProcess(input);
    }
    
    @GetMapping("/query")
    public Mono<List<QueryResponse>> query(
    		@RequestBody QueryRequest input
    ){
    	return service.getQuery(input);
    }

}
