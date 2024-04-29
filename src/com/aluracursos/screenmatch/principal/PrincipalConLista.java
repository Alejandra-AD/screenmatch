package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConLista {
    public static void main(String[] args) {

        Pelicula onePieceRed = new Pelicula("One Piece: Red",2022);
        Pelicula interstellar = new Pelicula("Interstellar",2014);
        Serie casaDragon = new Serie("House of the dragon",2022);

        ArrayList<Titulo>lista = new ArrayList<>();
        lista.add(onePieceRed);
        lista.add(interstellar);
        lista.add(casaDragon);

        for(Titulo item : lista){
            System.out.println(item);
        }

       ArrayList<String> nombreArtistas = new ArrayList<>();
        nombreArtistas.add("Ella Purnell");
        nombreArtistas.add("Sydney Sweeney");
        nombreArtistas.add("Heilee Steinfeld");

        System.out.println("Lista no ordenada= "+ nombreArtistas);

        Collections.sort(nombreArtistas);
        System.out.println("Lista ordenada= " + nombreArtistas);

        Collections.sort(lista);
        System.out.println(lista);

        //Tarea de investigación

        lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));

        //Comparator es una interfaz en Java que tiene un método estático llamado comparing.
        // Este método estático se utiliza para crear un Comparator basado en una función que extrae
        // la clave de ordenación de los elementos.

        List<String>listaDeArtistas2 = new ArrayList<>();
        listaDeArtistas2.add("Henry Cavill");
        listaDeArtistas2.add("Tom Hardy");
        listaDeArtistas2.add("Steve Carell");


    }
}
