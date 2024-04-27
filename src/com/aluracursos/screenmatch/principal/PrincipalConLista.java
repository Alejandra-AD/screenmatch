package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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


    }
}
