import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {

        Pelicula onePieceRed = new Pelicula();
        onePieceRed.nombre = "One Piece: Red";
        onePieceRed.duracionMinutos = 115;
        onePieceRed.fechaLanzamiento = 2022;
        onePieceRed.incluidoEnPlan = false;
        onePieceRed.evalua(4.8);
        onePieceRed.evalua(3.4);
        onePieceRed.evalua(4.2);
        /*System.out.println("Calificación = " + onePieceRed.promedioEvaluaciones());*/
        onePieceRed.muestraFichaTecnica();



        Pelicula interstellar = new Pelicula();
        interstellar.nombre = "Interstellar";
        interstellar.duracionMinutos = 290;
        interstellar.fechaLanzamiento = 2014;
        interstellar.incluidoEnPlan = true;
        interstellar.evalua(5);
        interstellar.evalua(4.4);
        interstellar.evalua(4.5);
        /*System.out.println("Calificación = " + interstellar.promedioEvaluaciones());*/
        interstellar.muestraFichaTecnica();


        System.out.println("Total de usuarios votaron = "  + onePieceRed.getContador());




    }
}
