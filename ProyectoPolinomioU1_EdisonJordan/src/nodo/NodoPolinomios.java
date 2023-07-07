package nodo;

import java.util.Objects;

public class NodoPolinomios<T> {
	private Polinomio dato;
	private NodoPolinomios<T> next = null;
	
	public NodoPolinomios() {
		dato = null;
	}
	
	public NodoPolinomios(Polinomio dato) {
		this.dato = dato;
	}
	
	public NodoPolinomios(Polinomio d, T e) {
		dato = d;
	}
	
	public Polinomio getDato() {
		return dato;
	}
	
	public void setDato(Polinomio dato) {
		this.dato = dato;
	}
	
	
	public NodoPolinomios<T> getNext() {
		return next;
	}
	
	public void setNext(NodoPolinomios<T> next) {
		this.next = next;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(next)%10;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NodoPolinomios other = (NodoPolinomios) obj;
		return Objects.equals(dato, other.dato) && Objects.equals(next, other.next);
	}

	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", next=" + next + "]";
	}
}
