package polinomio;

import lista.ListaPolinomio;
import nodo.NodoPolinomios;
import nodo.Polinomio;

public class MezclaDirecta {

    public static ListaPolinomio<NodoPolinomios<Polinomio>> mezclar(ListaPolinomio<NodoPolinomios<Polinomio>> lista) {
        if (lista == null || lista.getInicio() == null || ((NodoPolinomios<?>) lista.getInicio()).getNext() == null) {
            return lista;
        }
        ListaPolinomio<NodoPolinomios<Polinomio>> lista1 = new ListaPolinomio<>(); // Lista para la primera mitad
        ListaPolinomio<NodoPolinomios<Polinomio>> lista2 = new ListaPolinomio<>(); // Lista para la segunda mitad

        dividirLista(lista, lista1, lista2); // Dividir la lista en dos mitades

        lista1 = mezclar(lista1); // Aplicar mezcla directa a la primera mitad
        lista2 = mezclar(lista2); // Aplicar mezcla directa a la segunda mitad

        return fusionarListas(lista1, lista2); // Combinar las dos listas mezcladas
    }

    private static void dividirLista(ListaPolinomio<NodoPolinomios<Polinomio>> lista, ListaPolinomio<NodoPolinomios<Polinomio>> lista1, ListaPolinomio<NodoPolinomios<Polinomio>> lista2) {
        NodoPolinomios<Polinomio> medio = encontrarMitad(lista);
        lista1.setInicio(lista.getInicio()); // El inicio de la primera lista es el mismo que el inicio de la lista original
        lista2.setInicio(medio.getNext()); // El inicio de la segunda lista es el siguiente al elemento medio

        medio.setNext(null); // Separar las dos listas estableciendo el siguiente del elemento medio como null
    }

    private static NodoPolinomios<Polinomio> encontrarMitad(ListaPolinomio<NodoPolinomios<Polinomio>> lista) {
        NodoPolinomios<Polinomio> rapido = lista.getInicio();
        NodoPolinomios<Polinomio> lento = lista.getInicio();

        while (rapido.getNext() != null && rapido.getNext().getNext() != null) {
            rapido = rapido.getNext().getNext();
            lento = lento.getNext();
        }

        return lento;
    }

    private static ListaPolinomio<NodoPolinomios<Polinomio>> fusionarListas(ListaPolinomio<NodoPolinomios<Polinomio>> lista1, ListaPolinomio<NodoPolinomios<Polinomio>> lista2) {
        ListaPolinomio<NodoPolinomios<Polinomio>> listaCombinada = new ListaPolinomio<>();
        NodoPolinomios<Polinomio> inicioCombinado;

        if (lista1.getInicio() == null) { // Si la primera lista está vacía, la lista combinada es la segunda lista
            return lista2;
        }

        if (lista2.getInicio() == null) { // Si la segunda lista está vacía, la lista combinada es la primera lista
            return lista1;
        }

        // Comparar el primer elemento de ambas listas y establecer el inicio de la lista combinada
        if (((NodoPolinomios<Polinomio>) lista1.getInicio()).getDato().getCoef() <= ((NodoPolinomios<Polinomio>) lista2.getInicio()).getDato().getCoef()) {
            inicioCombinado = lista1.getInicio();
            lista1.setInicio(((NodoPolinomios<Polinomio>) lista1.getInicio()).getNext());
        } else {
            inicioCombinado = lista2.getInicio();
            lista2.setInicio(((NodoPolinomios<Polinomio>) lista2.getInicio()).getNext());
        }

        NodoPolinomios<Polinomio> nodoActual = inicioCombinado;

        while (lista1.getInicio() != null && lista2.getInicio() != null) {
            if (((NodoPolinomios<Polinomio>) lista1.getInicio()).getDato().getCoef() <= ((NodoPolinomios<Polinomio>) lista2.getInicio()).getDato().getCoef()) {
                nodoActual.setNext(lista1.getInicio());
                lista1.setInicio(((NodoPolinomios<Polinomio>) lista1.getInicio()).getNext());
            } else {
                nodoActual.setNext(lista2.getInicio());
                lista2.setInicio(((NodoPolinomios<Polinomio>) lista2.getInicio()).getNext());
            }
            nodoActual = nodoActual.getNext();
        }

        if (lista1.getInicio() == null) {
            nodoActual.setNext(lista2.getInicio());
        } else {
            nodoActual.setNext(lista1.getInicio());
        }

        listaCombinada.setInicio(inicioCombinado);

        return listaCombinada;
    }

}
