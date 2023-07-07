package ejercicios.mezclaDirecta;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Arreglo original:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("\nArreglo mezclado:");
        for (int i = 0; i < arreglo.length; i++) {
            int indiceAleatorio = ThreadLocalRandom.current().nextInt(i + 1);
            int a = arreglo[indiceAleatorio];
            arreglo[indiceAleatorio] = arreglo[i];
            arreglo[i] = a;
            System.out.print(arreglo[i] + " ");
        }
    }
}