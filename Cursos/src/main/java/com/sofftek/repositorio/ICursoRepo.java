package com.sofftek.repositorio;

import com.sofftek.modelo.Curso;

import java.util.List;

public interface ICursoRepo {
    List<Curso> consultarTodos();
    Curso consultarUno(int id);
    Curso crear(Curso curso);
    Curso modificar(Curso curso);
    void eliminar(int id);
}
