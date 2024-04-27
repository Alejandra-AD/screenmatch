package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {// se usa extends para que la clase "Pelicula" herede de la clase "Titulo"

    private String director;


    public Pelicula(String nombre, int fechaLanzamiento) {
        super(nombre, fechaLanzamiento);
    }

    public String getDirector(){
        return director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    @Override
    public int getClasificacion() { //interfaz
        /*return (int) promedioEvaluaciones()/2; // (int) casteo para convertir a entero.*/
        return (int) Math.round(promedioEvaluaciones());
    }

    @Override
    public String toString() {
        return "Película = " + this.getNombre()+ " ("+this.getFechaLanzamiento() +")";
    }
}
