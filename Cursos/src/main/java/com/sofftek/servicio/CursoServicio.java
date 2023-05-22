package com.sofftek.servicio;

import com.sofftek.modelo.Curso;
import com.sofftek.repositorio.ICursoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CursoServicio implements ICursoServicio{

    @Autowired
    private ICursoRepo cursoRepo;
    @Override
    public List<Curso> consultarTodos() {
        return cursoRepo.consultarTodos();
    }

    @Override
    public Curso consultarUno(int id) {
        return cursoRepo.consultarUno(id);
    }

    @Override
    public Curso crear(Curso curso) {
        return cursoRepo.crear(curso);
    }

    @Override
    public Curso modificar(Curso curso) {
        return cursoRepo.modificar(curso);
    }

    @Override
    public void eliminar(int id) { cursoRepo.eliminar(id); }
}
