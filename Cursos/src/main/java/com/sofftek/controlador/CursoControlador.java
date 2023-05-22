package com.sofftek.controlador;

import com.sofftek.excepciones.ExcepcionCursoNoEncontrado;
import com.sofftek.modelo.Curso;
import com.sofftek.servicio.ICursoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoControlador {

    @Autowired
    private ICursoServicio cursoServicio;

    @GetMapping
    public ResponseEntity<List<Curso>> consultarTodos(){
        return new ResponseEntity(cursoServicio.consultarTodos(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> consultarUno(@PathVariable("id") int id){
        Curso resultado = cursoServicio.consultarUno(id);
        if(resultado == null){
            throw new ExcepcionCursoNoEncontrado("El ID "+id+" no se encontró");
        }
        return new ResponseEntity(cursoServicio.consultarUno(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Curso> crear(@RequestBody Curso curso){
        return new ResponseEntity(cursoServicio.crear(curso), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Curso> modificar(@RequestBody Curso curso){
        Curso resultado = cursoServicio.consultarUno(curso.getIdCurso());
        if(resultado==null){
            throw new ExcepcionCursoNoEncontrado("El ID "+curso.getIdCurso()+" no se encontró");
        }
        return new ResponseEntity(cursoServicio.modificar(curso), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        Curso resultado = cursoServicio.consultarUno(id);
        if(resultado==null){
            throw new ExcepcionCursoNoEncontrado("El ID "+id+" no se encontró");
        }
        cursoServicio.eliminar(id);
    }
}
