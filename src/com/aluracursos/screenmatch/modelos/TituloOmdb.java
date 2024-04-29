package com.aluracursos.screenmatch.modelos;

public record TituloOmdb(String title, String year , String runtime) {

    @Override
    public String toString() {
        return "Titulo: " + title +"\nFecha lanzamiento: " + year + "\nDuración en minutos: " + runtime;
    }
}
