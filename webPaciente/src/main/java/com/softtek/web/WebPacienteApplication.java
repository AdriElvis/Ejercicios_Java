package com.softtek.web;

import com.softtek.web.modelo.controller.PacienteControlador;
import com.softtek.web.modelo.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebPacienteApplication {
    @Autowired
    PacienteControlador pc;

    public static void main(String[] args) {
        SpringApplication.run(WebPacienteApplication.class, args);
    }

    public void run(String... args) throws Exception {

    }
}
