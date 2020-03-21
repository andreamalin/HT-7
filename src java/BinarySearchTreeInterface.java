/**********************************************************
*BinarySearchTreeInterface.java     Fecha de creacion: 21 de marzo
*                                   Ultima fecha de modificacion: 21 de marzo
*                           
*Clase que incluye los metodos de un binary search tree
*
*@author Andrea Amaya #19357
**********************************************************/
public interface BinarySearchTreeInterface{ 
    /**
    @param Association     Se manda la asociacion a insertar al arbol
    //Pre: Existe una raiz
    //Post: Se agrega al arbol
    */
    public void insert(Association association);
      
    /**
    @param root             Se manda la raiz actual del arbol
    @param association      Se manda la asociacion a agregar al arbol
    //Pre: Existe una reaiz
    @return La posicion de la raiz actual
    */
    public Node insertRec(Node root, Association association);

    /**
    Pre: Existe un arbol a ordenar
    @return El arbol ordenado
    */
    public String inorder();

    /**
    @param root         Se manda la raiz del arbol
    Pre: Existe un arbol
    Post: Se retorna el arbol ordenado
    */
    public void inorderRec(Node root);

    /**
    Pre: Se desea encontrar un valor por medio de la llave
    @param  word            La palabra que se desea traducir
    @return la traduccion de la palabra
    */
    public String searchValue(String word);

    /**
    Pre: Se encontro la llave
    @return se regresa el valor de la llave
    */
    public String getValue();
    /**
    Pre: Existe un arbol
    @param temp         Nodo temporal con el que se trabaja
    @param word         Palabra que se desea encontrar 
    @return el booleano bandera
    */
    public boolean searchNode(Node temp, String word);
    /**
    Pre: Existe un arbol
    @return el tamano del arbol
    */
    public int size();

}