package polinomio;
import java.util.Scanner;
import lista.ListaPolinomio;
import nodo.*;
//private double base; 
//private int expo; 
/*
 * RECIBO:
 * OPCIONAL NODO: 
 * OPCIONAL PUNTO:
 * LISTA: 
 * 
 * base: 23. 
 * expo: 4.
 * hashCode: 1.
 * 
 * base: 2. 
 * expo: 3.
 * hashCode: 2.
 * 
 * RETORNO: 
 * base: 23. 
 * expo: 4
 * resul1: 279,841 .
 * 
 * suma: 
 * resta:
 * multiplicaion:
 * division: 
 *
 * */


import nodo.NodoPolinomios;
import nodo.Polinomio;

import nodo.NodoPolinomios;
import nodo.Polinomio;
import lista.ListaPolinomio;


public class OperacionesPolinomio {
    public static ListaPolinomio<NodoPolinomios<Polinomio>> sumar(ListaPolinomio<NodoPolinomios<Polinomio>> lista1, 
    		ListaPolinomio<NodoPolinomios<Polinomio>> lista2) {
    	
    	
    	
        ListaPolinomio<NodoPolinomios<Polinomio>> resultado = new ListaPolinomio<>();

        NodoPolinomios<Polinomio> nodo1 = lista1.getInicio();
        NodoPolinomios<Polinomio> nodo2 = lista2.getInicio();

        while (nodo1 != null && nodo2 != null) {
            Polinomio polinomio1 = nodo1.getDato();
            Polinomio polinomio2 = nodo2.getDato();

            Polinomio suma = sumarPolinomios(polinomio1, polinomio2);
            resultado.insertarInicio(new NodoPolinomios<>(suma));
            System.out.println(polinomio1.toString());
            System.out.println(polinomio2.toString());
            nodo1 = nodo1.getNext();
            
            nodo2 = nodo2.getNext();
        }

        return resultado;
    }

    public static ListaPolinomio<NodoPolinomios<Polinomio>> restar(ListaPolinomio<NodoPolinomios<Polinomio>> lista1, ListaPolinomio<NodoPolinomios<Polinomio>> lista2) {
        ListaPolinomio<NodoPolinomios<Polinomio>> resultado = new ListaPolinomio<>();

        NodoPolinomios<Polinomio> nodo1 = lista1.getInicio();
        NodoPolinomios<Polinomio> nodo2 = lista2.getInicio();

        while (nodo1 != null && nodo2 != null) {
            Polinomio polinomio1 = nodo1.getDato();
            Polinomio polinomio2 = nodo2.getDato();

            Polinomio resta = restarPolinomios(polinomio1, polinomio2);
            resultado.insertarInicio(new NodoPolinomios<>(resta));

            nodo1 = nodo1.getNext();
            nodo2 = nodo2.getNext();
        }

        return resultado;
    }

    public static ListaPolinomio<NodoPolinomios<Polinomio>> multiplicar(ListaPolinomio<NodoPolinomios<Polinomio>> lista1, ListaPolinomio<NodoPolinomios<Polinomio>> lista2) {
        ListaPolinomio<NodoPolinomios<Polinomio>> resultado = new ListaPolinomio<>();

        NodoPolinomios<Polinomio> nodo1 = lista1.getInicio();
        NodoPolinomios<Polinomio> nodo2 = lista2.getInicio();

        while (nodo1 != null && nodo2 != null) {
            Polinomio polinomio1 = nodo1.getDato();
            Polinomio polinomio2 = nodo2.getDato();

            Polinomio multiplicacion = multiplicarPolinomios(polinomio1, polinomio2);
            resultado.insertarInicio(new NodoPolinomios<>(multiplicacion));

            nodo1 = nodo1.getNext();
            nodo2 = nodo2.getNext();
        }

        return resultado;
    }

    public static ListaPolinomio<NodoPolinomios<Polinomio>> dividir(ListaPolinomio<NodoPolinomios<Polinomio>> lista1, ListaPolinomio<NodoPolinomios<Polinomio>> lista2) {
        ListaPolinomio<NodoPolinomios<Polinomio>> resultado = new ListaPolinomio<>();

        NodoPolinomios<Polinomio> nodo1 = lista1.getInicio();
        NodoPolinomios<Polinomio> nodo2 = lista2.getInicio();

        while (nodo1 != null && nodo2 != null) {
            Polinomio polinomio1 = nodo1.getDato();
            Polinomio polinomio2 = nodo2.getDato();

            Polinomio division = dividirPolinomios(polinomio1, polinomio2);
            resultado.insertarInicio(new NodoPolinomios<>(division));

            nodo1 = nodo1.getNext();
            nodo2 = nodo2.getNext();
        }

        return resultado;
    }

    private static Polinomio sumarPolinomios(Polinomio p1, Polinomio p2) {
    	/// base coef
    	/// expo expo
    	    double base = Math.pow(p1.getCoef(), p1.getExp()) + Math.pow(p2.getCoef(), p2.getExp());
    	    int exponente = 1;
    	    return new Polinomio(base, exponente);
    	
    }

    private static Polinomio restarPolinomios(Polinomio p1, Polinomio p2) {
    	/// base coef
    	/// expo expo
    	    double base = Math.pow(p1.getCoef(), p1.getExp()) - Math.pow(p2.getCoef(), p2.getExp());
    	    int exponente = 1;
    	    return new Polinomio(base, exponente);
    }

    private static Polinomio multiplicarPolinomios(Polinomio p1, Polinomio p2) {
    	/// base coef
    	/// expo expo
    	    double base = Math.pow(p1.getCoef(), p1.getExp()) * Math.pow(p2.getCoef(), p2.getExp());
    	    int exponente = 1;
    	    return new Polinomio(base, exponente);
    }

    private static Polinomio dividirPolinomios(Polinomio p1, Polinomio p2) {
    	/// base coef
    	/// expo expo
    	    double base = Math.pow(p1.getCoef(), p1.getExp()) / Math.pow(p2.getCoef(), p2.getExp());
    	    int exponente = 1;
    	    return new Polinomio(base, exponente);
    }
}
