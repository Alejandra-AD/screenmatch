package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pelicula onePieceRed = new Pelicula("One Piece: Red",2022);
       /* onePieceRed.nombre = "One Piece: Red";*/
       /* onePieceRed.duracionMinutos = 115;*/
        onePieceRed.setDuracionMinutos(115);
        /*onePieceRed.incluidoEnPlan = false;*/
        onePieceRed.setIncluidoEnPlan(false);

        onePieceRed.evalua(4.8);
        onePieceRed.evalua(3.4);
        onePieceRed.evalua(4.2);
        /*System.out.println("Calificación = " + onePieceRed.promedioEvaluaciones());*/
        onePieceRed.muestraFichaTecnica();
        System.out.println("Total de usuarios votaron = "  + onePieceRed.getContador() +"\n");



        Pelicula interstellar = new Pelicula("Interstellar",2014);
        interstellar.setDirector("Christopher Nolan");
        interstellar.setDuracionMinutos(290);
        interstellar.setIncluidoEnPlan(true);
        interstellar.evalua(5);
        interstellar.evalua(4.4);
        interstellar.evalua(4.5);
        interstellar.evalua(4.8);
        /*System.out.println("Calificación = " + interstellar.promedioEvaluaciones());*/
        interstellar.muestraFichaTecnica();
        System.out.println("Total de usuarios votaron = "  + interstellar.getContador() +"\n");




        //otras pruebas con get
        System.out.println(onePieceRed.getNombre());
        System.out.println(interstellar.getNombre());

        Serie casaDragon;
        casaDragon = new Serie("House of the dragon",2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporadas(10);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setIncluidoEnPlan(true);
        casaDragon.muestraFichaTecnica();
        System.out.println("\nSerie = " + casaDragon.getNombre() + ".\nDuración total de la serie = " +casaDragon.getDuracionMinutos() + " minutos.");
        System.out.println("\nSerie = " + onePieceRed.getNombre() + ".\nDuración total de la película = " +onePieceRed.getDuracionMinutos() + " minutos.");
        System.out.println("\nSerie = " + interstellar.getNombre() + ".\nDuración total de la película = " +interstellar.getDuracionMinutos() + " minutos.");
        System.out.println("\n");
/*
        System.out.println("\nSerie = "+ casaDragon.getNombre() + "\nTotal minutos serie = " + casaDragon.getduracionTotalSerie() + " minutos.");
*/
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(onePieceRed);
        calculadora.incluye(casaDragon);
        calculadora.incluye(interstellar);
        System.out.println("Tiempo total necesario para ver el contenido incluido en su lista = " + calculadora.getTiempoTotal() + " minutos.");


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();

        for (int i = 0; i < 500 ; i++) {
            onePieceRed.evalua(Math.random()*5+1);
        }
        onePieceRed.muestraFichaTecnica();

        System.out.println(onePieceRed.getClasificacion());

        filtroRecomendacion.filtra(onePieceRed);


        //practicando con Arraylist

        ArrayList<Titulo>listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(onePieceRed);
        listaDePeliculas.add(interstellar);

        System.out.println( "Tamaño del arraylist = "+ listaDePeliculas.size());
        System.out.println("primer elemento de la lista = " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);
        listaDePeliculas.toString();













    }
}
