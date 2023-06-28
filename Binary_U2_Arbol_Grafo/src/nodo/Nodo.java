package nodo;

import java.util.*;

public class Nodo {
	  public int valor;
	  public Nodo izquierdo;
	  public Nodo derecho;
	  // Para el grafo
	  public List<Nodo> lista;

	  public Nodo(int valor) {
	    this.valor = valor;
	    this.izquierdo = null;
	    this.derecho = null;
	    this.lista = new ArrayList<>();
	  }
	  
	  public void agregar(Nodo valor) {
		    this.lista.add(valor);
		    valor.lista.add(this);
		  }

	  public void eliminar(Nodo valor) {
	    this.lista.remove(valor);
	    valor.lista.remove(this);
	  }
	  
	}