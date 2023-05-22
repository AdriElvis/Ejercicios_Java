package com.sofftek.repositorio;

import com.sofftek.modelo.Curso;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CursoRepo implements ICursoRepo{

    private List<Curso> cursos = new ArrayList<>();
    @Override
    public List<Curso> consultarTodos() {

        return cursos;
    }

    @Override
    public Curso consultarUno(int id) {
        for (Curso curso : cursos) {
            if (curso.getIdCurso() == id) {
                return curso;
            }
        }
        return null;
    }

    @Override
    public Curso crear(Curso curso) {
        cursos.add(curso);
        return curso;
    }

    @Override
    public Curso modificar(Curso curso) {
        for (int i = 0; i < cursos.size(); i++) {
            Curso c = cursos.get(i);
            if (c.getIdCurso() == curso.getIdCurso()) {
                cursos.set(i, curso);
                return curso;
            }
        }
        return null;
    }

    @Override
    public void eliminar(int id) {
        cursos.removeIf(curso -> curso.getIdCurso() == id);
    }
}
