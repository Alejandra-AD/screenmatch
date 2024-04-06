public class Pelicula {
    String nombre;
    int fechaLanzamiento;
    int duracionMinutos;

    boolean incluidoEnPlan;

    void muestraFichaTecnica(){
        System.out.println("Nombre de la película = " + nombre);
        System.out.println("Fecha de lanzamiento = " + fechaLanzamiento);
        System.out.println("Duración = " + duracionMinutos);
        String mensajePlan = incluidoEnPlan? "Incluida en su plan" : "No disponible en su plan" ;
        System.out.println(mensajePlan);
    }
}
