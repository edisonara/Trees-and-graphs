package grafoNoDirigido;
import java.util.List;
import java.util.*;

import nodo.*;
public class GrafoNoDirigido {
	  List<Nodo> nodos;

	  public GrafoNoDirigido() {
	    this.nodos = new ArrayList<>();
	  }

	  public void insertarNodo(int valor) {
	    this.nodos.add(new Nodo(valor));
	  }

	  public void eliminarNodo(int valor) {
	    Nodo nodo = buscarNodo(valor);
	    if (nodo != null) {
	      for (Nodo vecino : nodo.lista) {
	        vecino.lista.remove(nodo);
	      }
	      this.nodos.remove(nodo);
	    }
	  }

	  public void insertarArista(int valor1, int valor2) {
	    Nodo nodo1 = buscarNodo(valor1);
	    Nodo nodo2 = buscarNodo(valor2);
	    if (nodo1 != null && nodo2 != null) {
	      nodo1.agregar(nodo2);
	    }
	  }

	  public void eliminarArista(int valor1, int valor2) {
	    Nodo nodo1 = buscarNodo(valor1);
	    Nodo nodo2 = buscarNodo(valor2);
	    if (nodo1 != null && nodo2 != null) {
	      nodo1.eliminar(nodo2);
	    }
	  }

	  public void recorrer() {
	    Set<Nodo> visitados = new HashSet<>();
	    for (Nodo nodo : this.nodos) {
	      if (!visitados.contains(nodo)) {
	        recorrerRec(nodo, visitados);
	      }
	    }
	  }

	  private void recorrerRec(Nodo nodo, Set<Nodo> visitados) {
	    visitados.add(nodo);
	    System.out.print(nodo.valor + " ");
	    for (Nodo vecino : nodo.lista) {
	      if (!visitados.contains(vecino)) {
	        recorrerRec(vecino, visitados);
	      }
	    }
	  }

	  private Nodo buscarNodo(int valor) {
	    for (Nodo nodo : this.nodos) {
	      if (nodo.valor == valor) {
	        return nodo;
	      }
	    }
	    return null;
	  }
	}
