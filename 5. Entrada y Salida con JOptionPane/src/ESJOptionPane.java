import javax.swing.*;


public class ESJOptionPane {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduzca su nombre: ");
        String  edad = JOptionPane.showInputDialog("Introduzca su edad: ");

        int proximaEdad = Integer.parseInt(edad);

        System.out.print(nombre + ". el siguiente año tendras " + (proximaEdad+1) + " años");
    }
}
