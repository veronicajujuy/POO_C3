import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {

        Scanner sc;
        try {
            sc = new Scanner(System.in);
            System.out.println("Ingrese un divisor para el numero 10");
            String respuesta = sc.nextLine();
            int divisor = Integer.parseInt(respuesta);
            if(divisor < 0){
                // lanzar nuestro error personalizado
                throw new NumerosNoValidosException("El numero no debe ser menor que cero");
            }
            int division = 10 / divisor;
            System.out.println("la division es "+ division);
        } catch (ArithmeticException e){
            System.out.println("se produjo la excepcion "+ e.getMessage());
            main(args);
        } catch (NumberFormatException e){
            System.out.println("se produjo la excepcion "+ e.getMessage());
            main(args);
        } catch (NumerosNoValidosException e){
            System.out.println("se produjo la excepcion "+ e.getMessage());
            main(args);
        } finally {
            System.out.println("Me ejecuto de todos modos");
        }

        System.out.println("El programa sigue realizando tareas");
    }
}
