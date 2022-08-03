public class Casteo {
    public static void main (String[] args){
        int variableDelTipoInt = 10;
        float variableDelTipoFloat = variableDelTipoInt;
        double variableDelTipoDouble = variableDelTipoFloat;

        double otraVariableDelTipoDouble = 2.76;

        int otraVariableDelTipoInt = (int) otraVariableDelTipoDouble;


        System.out.println("El resultado del casteo es: "+otraVariableDelTipoInt);


        byte variable1 = 5;
        byte variable2 = 10;
/*En el caso de que la suma de bytes con valor de enteros y/o flotantes es incorrecta esto es debido al rango de los bytes*/

        byte suma = (byte)(variable1 + variable2);

        System.out.println("El resultado del casteo a byte es "+suma);

    }
}
