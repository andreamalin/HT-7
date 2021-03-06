/**********************************************************
*Main.java					Fecha de creacion: 17 de marzo
*							Ultima fecha de modificacion: 17 de marzo
*							
*Clase principal para interactuar con el usuario
*
*@author Andrea Amaya #19357
**********************************************************/
public class Main{
	public static void main(String[] args) {
		Controlador control = new Controlador();
		control.read(); //Se leen los txt
		System.out.println("Diccionario ordenado: \n"+control.order()); //Se muestra el arbol ordenado

		System.out.println("Oracion sin traducir: \n"+control.getSentence()); //Se muestra la oracion sin traducir
		control.translate(); //Se traduce
		System.out.println("\nOracion traducida: \n"+control.getSentence()); //Se muestra la oracion traducida
	}
}