import arcade.Nave;

public class Main {
    public static void main(String[] args) {
        Nave nave1 = new Nave(10,20,'N',25.5,5);
        nave1.irA(15, 5, 'E');
        System.out.println(nave1);
    }
}
