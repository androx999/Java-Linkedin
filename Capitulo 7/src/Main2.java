public class Main2 {
    public static void main(String[] args) {

        ReproductorDeVideo reproductorDeVideo = new ReproductorDeVideo();
        reproductorDeVideo.reproducir();
        reproductorDeVideo.rebobinar(5);
        reproductorDeVideo.parar();


        ReproductoDeMp3 reproductoDeMp3 = new ReproductoDeMp3();
        reproductoDeMp3.rebobinar(5);
        reproductoDeMp3.parar();
    }
}
