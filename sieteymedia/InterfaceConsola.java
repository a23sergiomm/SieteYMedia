package sieteymedia;
import java.util.Scanner;
import recursos.Carta;


public class InterfaceConsola {
    
    public static Scanner sc = new Scanner(System.in);

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarCartas(Carta[] cartas) {
        for (int i  = 0; i < cartas.length; i++) {
            if (cartas[i] == null) break;
            System.out.print("\t" + cartas[i]);
        }
    }

    public static char leerOpcion() {
        return sc.next().toUpperCase().charAt(0);
    }
}
