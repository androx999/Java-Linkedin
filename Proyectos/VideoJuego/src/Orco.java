public class Orco extends Emenigo{
    public Orco(int posicionX,int posicionY){
        super(posicionX,posicionY);
    }

    @Override
    public void emitirSonidoDeDolor(){
        System.out.println("!Nooo¡");
    }
}
