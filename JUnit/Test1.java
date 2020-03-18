/**********************************************************
*Unit test para el metodo de ordenar un arbol BST
**********************************************************/
import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		 BinarySearchTree dictionary = new BinarySearchTree(); //Arbol creado para el diccionario
		 dictionary.insert(new Association("Hello", "Hi")); 
		 
		 String esperados = "(Hello, Hi)";
		 String insertados =  dictionary.inorder();
		 
		 assertEquals(esperados, insertados);
	}

}