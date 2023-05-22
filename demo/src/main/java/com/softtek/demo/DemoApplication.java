package com.softtek.demo;

import com.softtek.demo.controlador.MedicoControlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Autowired
    MedicoControlador mc;
    public void run(String... args) throws Exception {

    }
}
