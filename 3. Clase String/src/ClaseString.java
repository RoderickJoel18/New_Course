public class ClaseString {
    public static void main(String[] args) {

        String nombre = "Roderick";
        System.out.println("Mi nombre es: " + nombre);

        //Metodo lengh paara saber la cantidada de caracteres que tiene una cadena.
        System.out.println("Mi nombre tiene: " + nombre.length() + " letras.");

        //Metodo para traer una letra de una cadena.
        System.out.println("La primera letra de mi nombre es: " + nombre.charAt(0));

        //Metodo para traer cierta parte de una cadena de caracter
        String frase = "Intentando aprender el metodo substring de la clase String";
        String fraseResumen = frase.substring(11, 20);
        System.out.println(fraseResumen);

        //Metodo para determinar si 2 cadenas son iguales(Las mayusculas afectan el metodo)
        String nombre1 = "Roderick";
        String nombre2 = "Roderick";
        System.out.println(nombre1.equals(nombre2));


    }
}
