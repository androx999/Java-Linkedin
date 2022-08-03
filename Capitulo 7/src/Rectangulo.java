public class Rectangulo extends Figura2D {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        return base*altura;
    }

    @Override
    public double obtenerPerimetro() {
        return 2*base + 2 * altura;
    }
}
