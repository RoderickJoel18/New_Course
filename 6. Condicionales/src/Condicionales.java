import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*System.out.print("Introduzca su edad: ");
        int edad = sc.nextInt();

        //Condicionales con if y else.
        if (edad < 18){
            System.out.println("Eres un adolecente.");
        }else if (edad >= 18 && edad <40 ){
            System.out.println("Eres un joven.");
        }else if (edad >= 40 && edad < 65){
            System.out.println("Eres unadulto.");
        }else{
            System.out.println("Debes cuidarte.");
        }*/

        /*Condicionales con switch
          Ejemplo practico de progla que despliega un menu para determinar el area ded 4 figuras geometricas*/

        System.out.println("\tMenu");
        System.out.println("1. Area de un cuadrado \n2. Area de un rectangulo \n3. Area de un triangulo" +
                "\n4. Area de un circulo.");
        System.out.print("\nElija una opcion: ");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.print("Introduzca el lado: ");
                float ladoCuadrado = sc.nextFloat();
                float areaCuadrado = (float) Math.pow(ladoCuadrado, 2);

                System.out.print("\nEl area es: "+ areaCuadrado);
                break;
            case 2:
                System.out.print("Introduzca la base: ");
                float baseRectangulo = sc.nextFloat();
                System.out.print("\nIntroduzca la altura: ");
                float alturaRectangulo = sc.nextFloat();
                float areaRectangulo = baseRectangulo*alturaRectangulo;

                System.out.print("\nEl area es: "+ areaRectangulo);
                break;
            case 3:
                System.out.print("Introduzca la base: ");
                float baseTriangulo = sc.nextFloat();
                System.out.print("\nIntroduzca la altura: ");
                float alturaTriangulo = sc.nextFloat();
                float areaTrinagulo = (baseTriangulo*alturaTriangulo)/2;

                System.out.print("\nEl area es: "+ areaTrinagulo);
                break;
            case 4:
                System.out.print("Introduzca el radio: ");
                float radioCirculo = sc.nextFloat();
                float areaCirculo = (float) Math.PI* ((float) Math.pow(radioCirculo, 2));

                System.out.printf("\nEl area es: %.2f", areaCirculo);
                break;
            default:
                System.out.println("Opcion invalida.");
        }
    }
}

