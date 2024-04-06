public class Principal {
    public static void main(String[] args) {

        Pelicula onePieceRed = new Pelicula();
        onePieceRed.nombre = "One Piece: Red";
        onePieceRed.duracionMinutos = 115;
        onePieceRed.fechaLanzamiento = 2022;
        onePieceRed.incluidoEnPlan = false;
        onePieceRed.muestraFichaTecnica();

        Pelicula interstellar = new Pelicula();
        interstellar.nombre = "Interstellar";
        interstellar.duracionMinutos = 290;
        interstellar.fechaLanzamiento = 2014;
        interstellar.incluidoEnPlan = true;
        interstellar.muestraFichaTecnica();

    }
}
