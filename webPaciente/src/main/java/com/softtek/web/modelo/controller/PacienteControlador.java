package com.softtek.web.modelo.controller;

import com.softtek.web.modelo.model.Paciente;
import com.softtek.web.modelo.service.IPacienteServicio;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteControlador {
    @Autowired
    private IPacienteServicio servicio;

    @GetMapping
    public String obtenerUno(){
        Paciente p1 = new Paciente(1,"Adrián",20);
        return servicio.obtenerUno(p1);
    }
}
