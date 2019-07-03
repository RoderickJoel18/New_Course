import javax.swing.*;
import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*String clave ="Roderick";
        String password ="";

        while (clave.equals(password)== false){
            password = JOptionPane.showInputDialog("Introduzca la contraseña, por favor.");

            if (clave.equals(password) == false){
             q   System.out.println("La contraseña es incorrecta.");
            }
        }
        System.out.println("contraseña correcta, acceso permitido,");

         */
        int aleatorio = (int) (Math.random()*100);
        int numero = 0;
        int intentos = 0;

        while(numero != aleatorio){
            System.out.print("Introduzca un numero: ");
            numero = sc.nextInt();
            intentos++;

            if (numero > aleatorio){
                System.out.print("Te pasaste, el numero que introduciste es nayor.");
            }else if (numero < aleatorio) {
                System.out.print("Te falta, el numero introducido es menor.");
            }
        }
        System.out.print("Lo lograste, los numeros son iguales.");
        System.out.print("Lo lograste con "+ intentos+ " intentos.");

    }
}
