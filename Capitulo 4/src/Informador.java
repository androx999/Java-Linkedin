public class Informador {
    public static final String COLOR_POR_DEFECTO = "\u0018[0m";
    public static final String COLOR_NEGRO = "\u0018[30m";
    public static final String COLOR_ROJO = "\u0018[31m";
    public static final String COLOR_VERDE = "\u0018[32m";
    public static final String COLOR_AMARILLO = "\u0018[33m";
    public static final String COLOR_AZUL = "\u0018[34m";

    void mostrarPorPantalla(int entero){
        System.out.println("Mostrando el entero: "+entero);
    }

    void mostrarPorPantalla(double decimal){
        System.out.println("Mostrando el decimal "+decimal);
    }

    void mostrarPorPantalla(String palabra){
        System.out.println("Mostrando la palabra "+palabra);
    }

    void mostrarPorPantalla(String palabra, String color){
        System.out.println(color+" Mostrando la palabra con color "+palabra+ COLOR_POR_DEFECTO);
    }
}
