package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int fechaLanzamiento;
    private int duracionMinutos;

    private boolean incluidoEnPlan;
    private double sumaEvaluaciones;

    private int contador;


    //setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setFechaLanzamiento (int fechaLanzamiento){
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionMinutos (int duracionMinutos){
        this.duracionMinutos = duracionMinutos;
    }

    public void setIncluidoEnPlan (boolean incluidoEnPlan){
        this.incluidoEnPlan = incluidoEnPlan;
    }

    //get
    public int getContador(){
        return contador;
    }

    public void evalua (double nota){
        sumaEvaluaciones += nota;
        contador++;

    }
    double promedioEvaluaciones(){
        return Math.round((sumaEvaluaciones/contador) * 10.0) / 10.0;


    }

    public void muestraFichaTecnica(){
        System.out.println("Nombre de la película = " + nombre);
        System.out.println("Fecha de lanzamiento = " + fechaLanzamiento);
        System.out.println("Duración = " + duracionMinutos + " minutos");
        String mensajePlan = incluidoEnPlan? "Incluida en su plan" : "No disponible en su plan" ;
        System.out.println(mensajePlan);
        System.out.println("Calificación = " + promedioEvaluaciones() + " / 5");
        System.out.println("\n");
    }


}