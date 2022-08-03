public class Emenigo extends Personaje{
    private static final int PUNTOS_DE_DANO = 10;

    public Emenigo(int posicionX, int posicionY){
        super(posicionX, posicionY);
    }

    public int obtenerPuntosDeDano(){
        return PUNTOS_DE_DANO;
    }

    public void emitirSonidoDeFuria(){
        System.out.println("grrrrr");
    }
}
