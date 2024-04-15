package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{

    private int temporadas;
    private int episodiosPorTemporadas;
    private int minutosPorEpisodio;


    //get

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    @Override
    public int getDuracionMinutos(){
        return minutosPorEpisodio*episodiosPorTemporadas*temporadas;
    }

    //set

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas){
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }








}
