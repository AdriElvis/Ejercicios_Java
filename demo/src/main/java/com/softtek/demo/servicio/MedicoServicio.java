package com.softtek.demo.servicio;

import com.softtek.demo.modelo.Medico;
import com.softtek.demo.repositorio.IMedicoRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class MedicoServicio implements IMedicoServicio{
    private IMedicoRepo medicoRepo;
    @Override
    public Medico[] listar() {
        return medicoRepo.listar();
    }
}
