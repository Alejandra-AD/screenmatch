package com.aluracursos.screenmatch.modelos;

public class Episodio {

    private String nombre;
    private int numeroEpisodio;
    private Serie serie;


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
}
