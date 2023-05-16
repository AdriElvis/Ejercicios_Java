package com.softtek.modelo;
/*
Crear la clase abstracta Animal con los métodos abstractos comer() y moverse(). A
continuación crearemos varias clases Perro, Pez, Pajaro, Gusano, ...etc.
¿Qué ocurre si no implemento todos los métodos?
Que la clase sería abstracta
¿Puedo crear instancias igualmente?
No se pueden crear instancias de una clase abstracta
¿Puedo modificar parte de la definición de los métodos abstractos?
Los métodos abstractos han de ser utilizados con el mismo nombre y cantidad de parámetros pasados.
¿Puedo utilizar polimorfismo?
Sí, se puede instanciar un clase como si fuera una clase abstracta.
Crea clases extendiendo la clase Pajaro, por ejemplo Gorrión y Buitre.
¿También son abstractas estas clases?
Las clases serán abstractas si tienen un algún método abstracto
*/
public abstract class Animal {
    public abstract void comer();
    public abstract void moverse();
}
