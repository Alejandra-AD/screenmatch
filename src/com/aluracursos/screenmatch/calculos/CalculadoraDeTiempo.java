package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Titulo;


//Este paquete incluye clase y metodos para calcular tiempo total de una lista de películas
public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(Titulo titulo){
        tiempoTotal += titulo.getDuracionMinutos();
    }

    public int getTiempoTotal(){
        return tiempoTotal;
    }
}
