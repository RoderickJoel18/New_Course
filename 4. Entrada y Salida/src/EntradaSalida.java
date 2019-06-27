import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Introduzca su nombre: ");
        String nombre = sc.nextLine();

        System.out.printf("Introduzca su edad: ");
        int edad = sc.nextInt();

        System.out.println(nombre);
        System.out.println(edad + "años.");
    }
}
