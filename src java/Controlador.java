/**********************************************************
*Controlador.java			Fecha de creacion: 16 de marzo
*							Ultima fecha de modificacion: 17 de marzo
*							
*Clase que lleva a cabo las acciones del usuario
*
*@author Andrea Amaya #19357
**********************************************************/
import java.util.*;
import java.io.*; 

public class Controlador{
	private BinarySearchTree dictionary = new BinarySearchTree(); //Arbol creado para el diccionario
	private ArrayList<String> text = new ArrayList<String>(); //Texto

	//Se leen ambos txt
	public String read(){
		String txt = "", exception="";
		try {
			Scanner r = new Scanner(new File("diccionario.txt")); 
			while (r.hasNextLine()) {
				txt = r.nextLine(); //Mientras hayan lineas por leer se meten a la variable txt
				txt = txt.replace("(","");
				txt = txt.replace(")","");

				String[] word = txt.split(", ");  
				dictionary.insert(new Association(word[0], word[1])); //Se agrega al diccionario
			}
			r.close();	
		} catch (Exception e) { //Se muestra la razon de error por la que no se encuentra el doc
			e.printStackTrace();
			exception += "\nEl archivo diccionario no se encuentra";
		}

		try {
			Scanner r = new Scanner(new File("texto.txt")); 
			while (r.hasNextLine()) {
				txt = r.nextLine(); //Mientras hayan lineas por leer se meten a la variable txt
				txt = txt.replace(".", ""); 
				String[] word = txt.split(" "); 

				for (int i=0; i<word.length; i++) {
					text.add(word[i]); //Se agrega al texto	
				}
				
			}
			r.close();	
		} catch (Exception e) { //Se muestra la razon de error por la que no se encuentra el doc
			e.printStackTrace();
			exception += "\nEl archivo texto no se encuentra";
		}

		return exception;
	}
	//Se devuelve el arbol ordenado
	public String order(){
		return dictionary.inorder(); 
	}
	//Se devuelve lo traducido
	public ArrayList<String> translate(){
		//Por cada palabra en el texto/
		for (int i=0; i<text.size(); i++) {
			String actual = text.get(i);
			//Por cada palabra en el diccionario
			for (int j=0; j<dictionary.size(); j++) {
				//Si la palabra del diccionario es igual a la palabra actual del texto
				if (actual.equalsIgnoreCase(dictionary.searchValue(actual))) {
					if (i+1 == text.size()) {
						text.set(i,dictionary.getValue()+"."); //Se vuelve a colocar el punto
					} else{
						text.set(i,dictionary.getValue()); //Se coloca la palabra
					}
					
					break;
				}
			}
		}
		return text;
		
	}




	
}