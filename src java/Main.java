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
		System.out.println(control.order()); //Se muestra el arbol ordenado

		control.translate(); //Se traduce
		System.out.println(control.getTranslate()); //Se muestra la oracion traducida
	}
}