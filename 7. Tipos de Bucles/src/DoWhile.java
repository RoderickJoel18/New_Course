import javax.swing.*;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Do-While
        //El bucle do se ejecutara siempre que la condicion del while sea verdadera.
        String genero;
        int pesoIdeal = 0;
        do {
            genero = JOptionPane.showInputDialog("Introduzca su genero (M/F)");

        } while (!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su altura en cm"));

        if (genero.equalsIgnoreCase("M")) {
            pesoIdeal = altura - 110;

        }else if (genero.equalsIgnoreCase("F")){
            pesoIdeal = altura - 120;
        }
        System.out.println("Su peso ideal es " + pesoIdeal + " kg");

    }
}


