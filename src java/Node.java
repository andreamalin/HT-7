/**********************************************************
*Node.java      			Fecha de creacion: 18 de marzo
*                           Ultima fecha de modificacion: 18 de marzo
*                           
*Clase para simular la raiz del arbol
*
*@author Andrea Amaya #19357
*Código adaptado de: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
**********************************************************/
public class Node{ 
	Association association; //Asociacion que contiene la llave actual
	Node left, right; 
  
	/**
	@param item 		Asociacion agregada al arbol
	Pre: Existe un arbol
	Post: Se agrega al arbol
	*/
	public Node(Association item) { 
		association = item; 
		left = right = null; 
	}

} 
  