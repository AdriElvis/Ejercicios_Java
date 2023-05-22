package com.softtek.web.modelo.service;

import com.softtek.web.modelo.model.Paciente;
import com.softtek.web.modelo.repository.IPacienteRepo;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Service
public class PacienteServicioImp implements IPacienteServicio{
    @Autowired
    private IPacienteRepo pacienteRepo;
    @Override
    public String obtenerUno(Paciente p1) {
        return pacienteRepo.obtenerUno(p1);
    }
}
