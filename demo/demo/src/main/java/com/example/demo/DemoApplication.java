package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
        return String.format("Olá %s!", name);
    }

    @GetMapping("/nome")
    public String nome() {
        return "João da Silva";
    }

    @GetMapping("/cpf")
    public String cpf() {
        return "123.456.789-00";
    }

    @GetMapping("/endereco")
    public String endereco() {
        return "João da Silva - Rua das Flores, 123";
    }

    @GetMapping("/soma")
    public String soma(@RequestParam int a, @RequestParam int b) {
        int resultado = a + b;
        return "Resultado: " + resultado;
    }

}

