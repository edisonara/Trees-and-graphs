package lista;


import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import nodo.NodoPolinomios;
import nodo.Polinomio;


public class ListaPolinomio<T> {
    private T inicio;
    private int identificador;

    // constructor
    public ListaPolinomio() {// crea lista vacia
        inicio = null;
    }

    public ListaPolinomio(T ini) {// crea una lista con un Nodo
        inicio = ini;
    }

    public T getInicio() {
        return inicio;
    }

    public void setInicio(T inicio) {
        this.inicio = inicio;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    @Override
	public int hashCode() {
    	
		return Objects.hash(identificador)%100;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaPolinomio other = (ListaPolinomio) obj;
		return identificador == other.identificador && Objects.equals(inicio, other.inicio);
	}

	@Override
    public String toString() {
        return "ListaGenerica [inicio=" + inicio + ", identificador=" + identificador + "]";
    }

    public void insertarInicio(T e1) {
        NodoPolinomios<T> nuevo = new NodoPolinomios<>(((NodoPolinomios<T>) e1).getDato());
        if (inicio != null) {
            nuevo.setNext((NodoPolinomios<T>) inicio);
        }
        inicio = (T) nuevo;
        System.out.println("Insertado con éxito.");
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public T BuscarLista(Polinomio destino) {
        T indice;
        for (indice = inicio; indice != null; indice = (T) ((NodoPolinomios<T>) indice).getNext()) {
            if (destino.equals(((NodoPolinomios<T>) indice).getDato())) {
                System.out.println("Encontrado");
                return indice;
            }
        }
        
        
        return null;
    }

    public String visualizar() {
        T actual = inicio;
        String dato = "";
        int contador = 0;
        if (inicio == null) {
            System.out.println("Lista vacia");
        } else {
            while (actual != null) {
                contador = contador + 1;
                dato += ("Dato: " + ((NodoPolinomios<T>) actual).getDato() +
                        ". Code:" + actual.hashCode()+System.lineSeparator());
                actual = (T) ((NodoPolinomios<T>) actual).getNext();
            }
        }
        return  dato;
    }
    
    public ArrayList<String[]> lista() {
        T actual = inicio;
        ArrayList<String[]> datos = new ArrayList<String[]>();
    
     
        int contador = 0;
        if (inicio == null) {
            System.out.println("Lista vacia");
        } else {
            while (actual != null) {
                contador = contador + 1;
                
                datos.add(new String[] {"Lista",String2(actual.hashCode()), String(((NodoPolinomios<T>) actual).getDato().getCoef()), String2(((NodoPolinomios<T>) actual).getDato().getExp())});
            
                actual = (T) ((NodoPolinomios<T>) actual).getNext();
            }
        }
        return  datos;
    }

    private String String2(int i) {
		// TODO Auto-generated method stub
		return String.valueOf(i);
	}
    private String String(double i) {
		// TODO Auto-generated method stub
		return Double.toString(i);
	}

	public String eliminarNodo2(int code) {
        int respuesta = code;
        String dato= "";
        T actual = inicio, anterior = null;

        boolean encontrado = false;
        while ((actual != null) && (actual.hashCode() != respuesta)) {
            anterior = actual;
            actual = (T) ((NodoPolinomios<T>) actual).getNext();
        }
        if (actual != null) {
            if (actual == inicio) {
                inicio = (T) ((NodoPolinomios<T>) actual).getNext();
                dato = inicio.toString();
            } else {
                ((NodoPolinomios<T>) anterior).setNext(((NodoPolinomios<T>) actual).getNext());
            }
            System.out.println("Dato eliminado.");
        } else {
            System.out.println("No se encontró el nodo.");
        }
        return dato;
    }
     
}