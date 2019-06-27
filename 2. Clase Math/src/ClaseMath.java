public class ClaseMath {
    public static void main(String[] args) {

        //Metodo sqrt para raiz cuadrada.
        double raiz = Math.sqrt(9);
        System.out.println(raiz);

        //Metodo round para redondeo
        double num = 5.85;
        int resultado = (int) Math.round(num);
        System.out.println(resultado);

        //Metodo pow para exponentes
        double base = 5;
        double exponente = 3;

        int respuesta = (int) Math.pow(base, exponente);
        System.out.println(respuesta);

    }
}
