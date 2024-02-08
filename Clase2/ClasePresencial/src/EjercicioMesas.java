import java.util.Scanner;

public class EjercicioMesas{
    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println("Ingrese un numero");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        boolean resultado = esPrimo(numero);
        System.out.println("resultado = " + resultado);

        // Ejercicio 2

        int numero1 = 1, numero2 = 3, numero3 = 44;
        System.out.println(maximoEntreTres(numero1,numero2,numero3));

        // Ejercicio 3

        String cadena1 = "Hola2", cadena2 = "Hola";
        System.out.println("resultado: "+ cadenasDeTextoDistintas(cadena1,cadena2));

        // comparacion con == y con equals
        Integer int1 = 2500;
        Integer int2 = 2500;
        System.out.println("son iguales? "+ (int1 == int2));
        System.out.println("son iguales? "+ (int1.equals(int2)));


    }
    // Ejercicio 1
    static boolean esDivisble(int n, int divisor){
        return (n%divisor == 0);
    }

    static boolean esPrimo(int numero){
        if (numero < 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Ejercicio 2

    static Integer maximoEntreTres(Integer a, Integer b, Integer c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            return a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            return b;
        } else {
            return c;
        }
    }

    // Ejercicio 3

    static boolean cadenasDeTextoDistintas(String textoA, String textoB){
        if (textoA.equals(textoB)) return false;
        else return true;
    }

}
