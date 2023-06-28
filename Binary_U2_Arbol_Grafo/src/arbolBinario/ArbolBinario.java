package arbolBinario;
import nodo.*;



public class ArbolBinario {
	  Nodo raíz;

	  public ArbolBinario() {
	    this.raíz = null;
	  }

	  public void insertar(int valor) {
	    this.raíz = insertarRec(this.raíz, valor);
	  }

	  private Nodo insertarRec(Nodo nodo, int valor) {
	    if (nodo == null) {
	      nodo = new Nodo(valor);
	    } else if (valor < nodo.valor) {
	      nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
	    } else if (valor > nodo.valor) {
	      nodo.derecho = insertarRec(nodo.derecho, valor);
	    }
	    return nodo;
	  }

	  public void eliminar(int valor) {
	    this.raíz = eliminarRec(this.raíz, valor);
	  }

	  private Nodo eliminarRec(Nodo nodo, int valor) {
	    if (nodo == null) {
	      return null;
	    } else if (valor < nodo.valor) {
	      nodo.izquierdo = eliminarRec(nodo.izquierdo, valor);
	    } else if (valor > nodo.valor) {
	      nodo.derecho = eliminarRec(nodo.derecho, valor);
	    } else {
	      if (nodo.izquierdo == null) {
	        return nodo.derecho;
	      } else if (nodo.derecho == null) {
	        return nodo.izquierdo;
	      }
	      nodo.valor = encontrarMin(nodo.derecho);
	      nodo.derecho = eliminarRec(nodo.derecho, nodo.valor);
	    }
	    return nodo;
	  }

	  private int encontrarMin(Nodo nodo) {
	    int min = nodo.valor;
	    while (nodo.izquierdo != null) {
	      min = nodo.izquierdo.valor;
	      nodo = nodo.izquierdo;
	    }
	    return min;
	  }

	  public void preorden() {
	    preordenRec(this.raíz);
	  }

	  private void preordenRec(Nodo nodo) {
	    if (nodo != null) {
	      System.out.print(nodo.valor + " ");
	      preordenRec(nodo.izquierdo);
	      preordenRec(nodo.derecho);
	    }
	  }

	  public void inorden() {
	    inordenRec(this.raíz);
	  }

	  private void inordenRec(Nodo nodo) {
	    if (nodo != null) {
	      inordenRec(nodo.izquierdo);
	      System.out.print(nodo.valor + " ");
	      inordenRec(nodo.derecho);
	    }
	  }

	  public void postorden() {
	    postordenRec(this.raíz);
	  }

	  private void postordenRec(Nodo nodo) {
	    if (nodo != null) {
	      postordenRec(nodo.izquierdo);
	      postordenRec(nodo.derecho);
	      System.out.print(nodo.valor + " ");
	    }
	  }
	}
