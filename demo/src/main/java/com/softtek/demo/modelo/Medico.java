package com.softtek.demo.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medico {
    private int id;
    private String dni;
    private String nombre;
    private int edad;
}
