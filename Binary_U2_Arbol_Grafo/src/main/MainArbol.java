package main;
import arbolBinario.*;

public class MainArbol {
	  public static void main(String[] args) {
	    ArbolBinario árbol = new ArbolBinario();
	    árbol.insertar(5);
	    árbol.insertar(3);
	    árbol.insertar(7);
	    árbol.insertar(1);
	    árbol.insertar(4);
	    árbol.insertar(6);
	    árbol.insertar(8);

	    System.out.print("Recorrido preorden: ");
	    árbol.preorden();
	    System.out.println();

	    System.out.print("Recorrido inorden: ");
	    árbol.inorden();
	    System.out.println();

	    System.out.print("Recorrido postorden: ");
	    árbol.postorden();
	    System.out.println();

	    árbol.eliminar(3);

	    System.out.print("Recorrido inorden después de eliminar el nodo con valor 3: ");
	    árbol.inorden();
	    System.out.println();
	  }
	}