package Ventana;


import lista.ListaPolinomio;
import polinomio.MezclaDirecta;
import nodo.NodoPolinomios;
import nodo.Polinomio;

import java.util.Scanner;

public class EjercicioVentana2 {

    public static void main(String[] args) {
        ListaPolinomio<NodoPolinomios<Polinomio>> listaPolinomios = new ListaPolinomio<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Agregar polinomio");
            System.out.println("2. Mostrar polinomios");
            System.out.println("3. Ordenar polinomios");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarPolinomio(listaPolinomios, scanner);
                    break;
                case 2:
                    mostrarPolinomios(listaPolinomios);
                    break;
                case 3:
                    ordenarPolinomios(listaPolinomios);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }

    private static void agregarPolinomio(ListaPolinomio<NodoPolinomios<Polinomio>> lista, Scanner scanner) {
        System.out.print("Ingrese el coeficiente del polinomio: ");
        double coeficiente = scanner.nextDouble();
        System.out.print("Ingrese el exponente del polinomio: ");
        int exponente = scanner.nextInt();

        Polinomio polinomio = new Polinomio(coeficiente, exponente);
        NodoPolinomios<Polinomio> nodoPolinomio = new NodoPolinomios<>(polinomio);

        lista.insertarInicio(nodoPolinomio);

        System.out.println("Polinomio agregado con éxito.");
        System.out.println();
    }

    private static void mostrarPolinomios(ListaPolinomio<NodoPolinomios<Polinomio>> lista) {
        String polinomios = lista.visualizar();
        System.out.println("Polinomios:");
        System.out.println(polinomios);
        System.out.println();
    }

    private static void ordenarPolinomios(ListaPolinomio<NodoPolinomios<Polinomio>> lista) {
        ListaPolinomio<NodoPolinomios<Polinomio>> listaOrdenada = MezclaDirecta.mezclar(lista);
        lista.setInicio(listaOrdenada.getInicio());

        System.out.println("Polinomios ordenados.");
        System.out.println();
    }

}
