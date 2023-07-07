package ejecucion;
import java.util.InputMismatchException;
import java.util.Scanner; 
import lista.ListaPolinomio;
import nodo.NodoPolinomios;
import nodo.Polinomio;
import polinomio.OperacionesPolinomio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    // Crear algunos polinomios de ejemplo
		
		/*
		 * 3 2
		 * 2 5
		 * 4 5
		 * 
		 * */
		    Polinomio polinomio1 = new Polinomio(2.0, 3); //X^y
		    Polinomio polinomio2 = new Polinomio(1.5, 2);
		    Polinomio polinomio3 = new Polinomio(3.0, 1);
		    Polinomio polinomio4 = new Polinomio(4.5, 1);

		    // Crear la lista 1 y agregar los polinomios
		    ListaPolinomio<NodoPolinomios<Polinomio>> lista1 = new ListaPolinomio<>();
		    lista1.insertarInicio(new NodoPolinomios<>(polinomio1));
		    lista1.insertarInicio(new NodoPolinomios<>(polinomio2));
		    lista1.insertarInicio(new NodoPolinomios<>(polinomio3));
		    lista1.insertarInicio(new NodoPolinomios<>(polinomio4));

		    // Crear la lista 2 y agregar los polinomios
		    ListaPolinomio<NodoPolinomios<Polinomio>> lista2 = new ListaPolinomio<>();
		    lista2.insertarInicio(new NodoPolinomios<>(polinomio2));
		    lista2.insertarInicio(new NodoPolinomios<>(polinomio4));
		    System.out.println("Lista 1");
		    System.out.println( lista1.visualizar());
		    System.out.println("Lista 2");
		    System.out.println( lista1.visualizar());
		    // Realizar la suma de polinomios
		    ListaPolinomio<NodoPolinomios<Polinomio>> suma = OperacionesPolinomio.sumar(lista1, lista2);
		    System.out.println("Suma de polinomios:");
		    suma.visualizar();

		    // Realizar la resta de polinomios
		    ListaPolinomio<NodoPolinomios<Polinomio>> resta = OperacionesPolinomio.restar(lista1, lista2);
		    System.out.println("Resta de polinomios:");
		    resta.visualizar();

		    // Realizar la multiplicación de polinomios
		    ListaPolinomio<NodoPolinomios<Polinomio>> multiplicacion = OperacionesPolinomio.multiplicar(lista1, lista2);
		    System.out.println("Multiplicación de polinomios:");
		    multiplicacion.visualizar();

		    // Realizar la división de polinomios
		    ListaPolinomio<NodoPolinomios<Polinomio>> division = OperacionesPolinomio.dividir(lista1, lista2);
		    System.out.println("División de polinomios:");
		    division.visualizar();
		

		/*Scanner input = new Scanner (System.in);
		int opcion;
		 boolean salir = false; 
		 while(!salir) {
			 System.out.println(
					   "------------------------------------\n"
					 + "              Polinomio             \n"
					 + "------------------------------------\n"
					 + "- 1.  EsVacia\r\n"
					 + "\r\n"
					 + "- 2.  Insertar\r\n"
					 + "\r\n"
					 + "- 3.  Buscar\r\n"
					 + "\r\n"
					 + "- 4.  Eliminar\r\n"
					 + "\r\n"
					 + "- 5.  Visualizar"
					 + ""
					 + ""
					 + ""
					 + ""
					 + ""
					 
					 );
			 try {
				// Insert the option you want to view
				System.out.print("Seleccione una opcion: ");
				opcion=input.nextInt();
				Operaciones nuevo = new Operaciones();
				nuevo.lista();

			 }catch(InputMismatchException e) {
				 System.out.println("-----------------------------------------");
		         System.out.println("Error: No se acepta letras");
		         input.next();
			 }
		 }
		 */
		 

	}

}
