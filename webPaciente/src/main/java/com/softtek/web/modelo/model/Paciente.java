package com.softtek.web.modelo.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Paciente {
    private int idPaciente;
    private String nombre;
    private int edad;
}
