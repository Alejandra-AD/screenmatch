package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("De los mejores valorados por los usuarios");
        }else if (clasificacion.getClasificacion() < 4 && clasificacion.getClasificacion() >= 2){
            System.out.println("recomendada");
        }else{
            System.out.println("película aun no descubierta por los usuario");
        }
    };
    /*En realidad, cuando pasas "Clasificacion clasificacion" como parámetro al método "filtra", no estás creando un objeto de nombre "clasificacion" de la clase "Clasificacion". Lo que estás haciendo es declarar un parámetro llamado "clasificacion" que espera recibir un objeto que implemente la interfaz "Clasificacion".

En otras palabras, cuando llamas al método "filtra" más adelante en tu código, debes pasar un objeto que implemente la interfaz "Clasificacion" como argumento. Este objeto puede ser de cualquier clase que implemente la interfaz "Clasificacion".*/
}
