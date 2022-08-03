import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca el dia de la semanan en el cual va a querer su cita: ");
        String dia = entrada.nextLine();
        switch (dia){
            case "lunes":
            case "Lunes":
            case "LUNES":
                System.out.println("El lunes tenemos disponible de 11:00 a 12:30");
                break;
            case "martes":
            case "Martes":
            case "MARTES":
                System.out.println("El martes tenemos disponible de 15:30 a 17:30");
                break;
            case "miercoles":
            case "Miercoles":
            case "MIERCOLES":
                System.out.println("El miercoles tenemos disponible de 11:00 a 12:30");
                break;
            case "jueves":
            case "Jueves":
            case "JUEVES":
                System.out.println("El jueves tenemos disponible de 15:30 a 17:30");
                break;
            case "viernes":
            case "Viernes":
            case "VIERNES":
                System.out.println("El viernes tenemos disponible de 9:00 a 11:00");
                break;
            case "sabado":
            case "Sabado":
            case "SABADO":
                System.out.println("El sabado esta cerrado");
                break;
            case "domingo":
            case "Domingo":
            case "DOMINGO":
                System.out.println("El domingo esta cerrado");
                break;
            default:
                System.out.println("Lo siento, usted ha introducido un dia invalido");
        }
    }
}
