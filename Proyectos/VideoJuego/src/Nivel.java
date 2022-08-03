public class Nivel {
    public static void main(String[] args) {
        Personaje enemigo = new Personaje(5,5);
        Protagonista protagonista = new Protagonista(0,0,"Andres");
        enemigo.emitirSonidoDeDolor();
        protagonista.emitirSonidoDeDolor();
    }
}
