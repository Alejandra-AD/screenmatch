
public class Pelicula {
    String nombre;
    int fechaLanzamiento;
    int duracionMinutos;

    boolean incluidoEnPlan;
    private double sumaEvaluaciones;

    private int contador;

    int getContador(){
        return contador;
    };


    void evalua (double nota){
        sumaEvaluaciones += nota;
        contador++;

    }
    double promedioEvaluaciones(){
        return Math.round((sumaEvaluaciones/contador) * 10.0) / 10.0;


    }

    void muestraFichaTecnica(){
        System.out.println("Nombre de la película = " + nombre);
        System.out.println("Fecha de lanzamiento = " + fechaLanzamiento);
        System.out.println("Duración = " + duracionMinutos + " minutos");
        String mensajePlan = incluidoEnPlan? "Incluida en su plan" : "No disponible en su plan" ;
        System.out.println(mensajePlan);
        System.out.println("Calificación = " + promedioEvaluaciones() + " / 5");
        System.out.println("\n");
    }


}
