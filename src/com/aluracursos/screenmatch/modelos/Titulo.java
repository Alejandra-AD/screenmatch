package com.aluracursos.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nombre;

    @SerializedName("Year")
    private int fechaLanzamiento;
    private int duracionMinutos;

    private boolean incluidoEnPlan;
    private double sumaEvaluaciones;

    private int contador;

    public Titulo(String nombre, int fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        if(miTituloOmdb.runtime().contains("N/A")){
            throw new NumberFormatException();
        }
        String[] duracionMinutosSplit = miTituloOmdb.runtime().split(" ") ;
        this.nombre = miTituloOmdb.title();
        this.fechaLanzamiento = Integer.valueOf(miTituloOmdb.year().substring(0,3));
        this.duracionMinutos = Integer.valueOf(duracionMinutosSplit[0]);// Integer.valueOf(miTituloOmdb.getDuracionMinutos.substring(0,2))

    }


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
    public String getNombre(){
        return nombre;
    }

    public int getDuracionMinutos(){ //override indica que a este metodo se le realizó una sobre escritura
        return duracionMinutos;
    }

    public int getFechaLanzamiento(){return fechaLanzamiento;}

    /************************ Otros métodos *************************************************************/
    public void evalua (double nota){
        sumaEvaluaciones += nota;
        contador++;

    }
    public double promedioEvaluaciones(){
        return Math.round((sumaEvaluaciones/contador) * 10.0) / 10.0;


    }

    public void muestraFichaTecnica(){
        System.out.println("Nombre de la película = " + nombre);
        System.out.println("Fecha de lanzamiento = " + fechaLanzamiento);
        System.out.println("Duración = " + getDuracionMinutos()+ " minutos");
        String mensajePlan = incluidoEnPlan? "Incluida en su plan" : "No disponible en su plan" ;
        System.out.println(mensajePlan);
        System.out.println("Calificación = " + promedioEvaluaciones() + " / 5");
        System.out.println("\n");
    }


    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {

        return "Título: " + getNombre() +
                "\nFecha de lanzamiento: " + (getFechaLanzamiento()) +
                "\nDuración en minutos: " + getDuracionMinutos()+
                "\ntoString desde Titulo";
    }
}
