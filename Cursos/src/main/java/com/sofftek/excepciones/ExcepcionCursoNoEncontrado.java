package com.sofftek.excepciones;

public class ExcepcionCursoNoEncontrado extends RuntimeException{

    private static final long serialVersionUID=1L;

    public ExcepcionCursoNoEncontrado(String mensaje){
        super(mensaje);
    }
}
