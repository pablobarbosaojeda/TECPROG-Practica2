import java.util.Scanner;
public class RiesgoHielo {

    public static void main(String [] args) {
        //Se crea un objeto Scanner para leer la temperatura desde el input estandar
        Scanner scanner = new Scanner(System.in);

        //Se pide al usuario que ingrese la temperatura
        System.out.println("Ingrese la temperatura en Celsius: ");

        //Lectura de la temperatura ingresada por el usuario
        double temperatura = scanner.nextDouble();

        //Verificacion si la temperatura es inferior a 2ºC

        if (temperatura < 2) {
            System.out.println("Riesgo de Hielo");
        } else {
            System.out.println("La temperatura es estable");
        }
        scanner.close();
    }
}
