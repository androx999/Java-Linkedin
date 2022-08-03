public class Juego {
    private int numeroDeJugadores;
    private int puntuación = 0;

    public Juego(int numeroDeJugadores){
        this.numeroDeJugadores = numeroDeJugadores;
    }

    public int obtenerPuntuacion(){
        return puntuación;
    }

    public class Contador{
        public void incrementarPuntuacion(int puntos){
            puntuación+= puntos;
        }
        public void decrementarPuntuacion(int puntos){
            puntuación -= puntos;
        }
    }
}
