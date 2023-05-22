package com.softtek.web.modelo.repository;

import com.softtek.web.modelo.model.Paciente;
import lombok.*;
import org.springframework.stereotype.Repository;

@NoArgsConstructor
@Repository
public class PacienteRepoImp implements IPacienteRepo{
    @Override
    public String obtenerUno(Paciente p1) {
        return p1.toString();
    }
}
