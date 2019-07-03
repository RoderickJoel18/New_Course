import javax.swing.*;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Sintaxis del bucle for
        /*for (int i = 0; i < 10; i++){
            System.out.println("Roderick");
        }
         */

        //Ejemplo práctico que comprueba si un correo es valido si utiliza un '@'
        /*
        String correo = JOptionPane.showInputDialog("Introduzca su correo electrinico");
        int cantidadArroba = 0;
        Boolean punto = false;
        for (int i = 0; i < correo.length(); i++){
            if (correo.charAt(i) == '@'){
                cantidadArroba++;

            }if (correo.charAt(i) == '.'){
                punto = true;
            }
        }
        if (cantidadArroba == 1 && punto == true){
            System.out.println("El correo es valido.");

        }else {
            System.out.println("El correo no es valido.");
        }

         */

        //Ejemplo practico para determinar el factorial de un numero
        int factorial =1;
        int respuesta = 0;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzaca un numero para sacar su factorial"));

        for (int i = numero ; i > 0; i--){
            factorial = factorial * i;

        }
        System.out.println("El factorial es: "+ factorial);


    }
}
