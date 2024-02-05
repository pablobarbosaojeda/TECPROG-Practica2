 import java.util.Scanner;
    public class ElTiempo2 {

        public static void main(String [] args) {
            //Se crea un objeto Scanner para leer la temperatura desde el input estandar
            Scanner scanner = new Scanner(System.in);

            //Se pide al usuario que ingrese la temperatura
            System.out.println("Ingrese la temperatura en Celsius: ");

            //Lectura de la temperatura ingresada por el usuario
            double temperatura = scanner.nextDouble();

            //Determinacion del mensaje según la temperatura

            String mensaje;
            if (temperatura < 2){
                mensaje = "Riesgo de Hielo";
            } else if (temperatura < 15) {
                mensaje = "Hace frio";
            } else if (temperatura < 30) {
                mensaje = "Buena Temperatura";
            }
            else {
                mensaje = "Demasiado Calor";
            }

            //Mostrar el mensaje correspondiente
            System.out.println("Mensaje:" + mensaje);


            scanner.close();

        }
    }

