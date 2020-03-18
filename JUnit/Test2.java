/**********************************************************
*Unit test para el metodo de buscar la asociacion en el arbol
**********************************************************/
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test2 {

	@Test
	void test() {
		 BinarySearchTree dictionary = new BinarySearchTree(); //Arbol creado para el diccionario
		 dictionary.insert(new Association("Hello", "Hi")); 

		 String encontrado = dictionary.searchValue("Hello");
		 String traduccion = dictionary.getValue();
		 
		 assertEquals("Hi", traduccion);
	}
}
