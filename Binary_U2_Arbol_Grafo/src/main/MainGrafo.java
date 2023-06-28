package main;
import grafoNoDirigido.*;

public class MainGrafo {
	  public static void main(String[] args) {
	    GrafoNoDirigido grafo = new GrafoNoDirigido();
	    grafo.insertarNodo(1);
	    grafo.insertarNodo(2);
	    grafo.insertarNodo(3);
	    grafo.insertarNodo(4);
	    grafo.insertarNodo(5);

	    grafo.insertarArista(1, 2);
	    grafo.insertarArista(1, 3);
	    grafo.insertarArista(2, 3);
	    grafo.insertarArista(2, 4);
	    grafo.insertarArista(3, 4);
	    grafo.insertarArista(4, 5);

	    System.out.print("Recorrido del grafo: ");
	    grafo.recorrer();
	    System.out.println();

	    grafo.eliminarNodo(3);

	    System.out.print("Recorrido del grafo después de eliminar el nodo con valor 3: ");
	    grafo.recorrer();
	    System.out.println();
	  }
	}