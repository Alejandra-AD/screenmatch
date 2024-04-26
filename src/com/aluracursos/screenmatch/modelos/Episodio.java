package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {

    private String nombre;
    private int numeroEpisodio;
    private Serie serie;
    private int totalVisualizaciones;


    //getters

    public String getNombre(){
        return nombre;
    }

    public int getNumeroEpisodio(){
        return numeroEpisodio;
    }

    public Serie getSerie(){
        return serie;
    }


    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public void setNombre(Serie serie){
        this.serie = serie;
    }

    public int getClasificacion(){
        if (totalVisualizaciones > 100){
            return 4;
        }else {
            return 2;
        }
    };

}
