import java.util.Scanner;

public class EjercitacionClase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        
        char inicialNombre = nombre.charAt(0);
        char inicialApellido = apellido.charAt(0);
        String iniciales = inicialNombre +""+ inicialApellido;
        // soutv
        System.out.println("iniciales = " + iniciales);

        // ingreso de fechas
        System.out.println("Ingreso de fecha de nacimiento");
        System.out.println("Ingrese el dia: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = sc.nextInt();
        String fechaObtenida = fechaCumpleanio(dia, mes, anio);
        System.out.println("fechaObtenida = " + fechaObtenida);


    }
    public static String fechaCumpleanio(int d, int m, int a){
        return "La fecha de cumpleaños es: "+ d +"/"+m+"/"+a;
    }

}
