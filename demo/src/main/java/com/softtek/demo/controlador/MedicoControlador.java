package com.softtek.demo.controlador;

import com.softtek.demo.modelo.Medico;
import com.softtek.demo.servicio.IMedicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/medicos")
public class MedicoControlador {
    @Autowired
    private IMedicoServicio medicoServicio;

    @GetMapping
    public Medico[] listar(){
        return medicoServicio.listar();
    }
}
