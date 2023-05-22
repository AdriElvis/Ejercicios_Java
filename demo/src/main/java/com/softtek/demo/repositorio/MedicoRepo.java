package com.softtek.demo.repositorio;

import com.softtek.demo.modelo.Medico;
import org.springframework.stereotype.Repository;

@Repository
public class MedicoRepo implements IMedicoRepo{

    @Override
    public Medico[] listar() {
        Medico[] medicos = {new Medico(1,"11111111-F","Luis",29),
                new Medico(2,"22222222-F","María",31),
                new Medico(3,"33333333-F","José",30)};
        return medicos;
    }
}
