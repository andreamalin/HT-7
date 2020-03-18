/**********************************************************
*BinarySearchTree.java      Fecha de creacion: 18 de marzo
*                           Ultima fecha de modificacion: 18 de marzo
*                           
*Clase para ordenar los datos ingresados al arbol
*
*@author Andrea Amaya #19357
*Código adaptado de: https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
*Código adaptado de: https://www.javatpoint.com/program-to-search-a-node-in-a-binary-tree
**********************************************************/
public class BinarySearchTree{ 
    private Node root; 
    private Node actual_word;
    private static String orderedTree = "";
    private int size = 0;
    public static boolean bandera = false;
  
    //Post: Se construye la raiz del arbol
    public BinarySearchTree() {  
        root = null;  
    } 
  
    /**
    @param Association     Se manda la asociacion a insertar al arbol
    //Pre: Existe una raiz
    //Post: Se agrega al arbol
    */
    public void insert(Association association) { 
        root = insertRec(root, association);
        size++;
    } 
      
    /**
    @param root             Se manda la raiz actual del arbol
    @param association      Se manda la asociacion a agregar al arbol
    //Pre: Existe una reaiz
    @return La posicion de la raiz actual
    */
    public Node insertRec(Node root, Association association) { 
        if (root == null) { 
            root = new Node(association); 
            return root; 
        } 

        if (association.compareTo(root.association) < 0) {
            root.left = insertRec(root.left, association); 
        } else if (association.compareTo(root.association) > 0) {
            root.right = insertRec(root.right, association); 
        }
  
        return root; 
    } 
  
    /**
    Pre: Existe un arbol a ordenar
    @return El arbol ordenado
    */
    public String inorder()  { 
        inorderRec(root); 

        return orderedTree;
    } 
    
    /**
    @param root         Se manda la raiz del arbol
    Pre: Existe un arbol
    Post: Se retorna el arbol ordenado
    */
    public void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            this.orderedTree += "("+root.association.getKey().toString()+", "+root.association.getValue().toString()+")\n"; 
            inorderRec(root.right); 
        } 
    }

    /**
    Pre: Se desea encontrar un valor por medio de la llave
    @param  word            La palabra que se desea traducir
    @return la traduccion de la palabra
    */
    public String searchValue(String word) { 
        if (searchNode(root, word)) {
            return actual_word.association.getKey().toString();
        }
        return "";
    } 

    /**
    Pre: Se encontro la llave
    @return se regresa el valor de la llave
    */
    public String getValue(){
        bandera = false; //Se regresa a falso la bandera
        return actual_word.association.getValue().toString();
    }

    /**
    Pre: Existe un arbol
    @param temp         Nodo temporal con el que se trabaja
    @param word         Palabra que se desea encontrar 
    @return el booleano bandera
    */
    public boolean searchNode(Node temp, String word){  
        if(root == null){  
            bandera = false;
        }  else{ 
                //Se revisa si el nodo actual contiene la palabra buscada
                if(temp.association.getKey().toString().equalsIgnoreCase(word)){  
                    actual_word = temp;
                    bandera = true;  
                } 
                //Se busca en los nodos de la izquierda
                if(bandera == false && temp.left != null){  
                    searchNode(temp.left, word);
                }  
                //Se busca en los nodos de la derecha
                if(bandera == false && temp.right != null){  
                    searchNode(temp.right, word);  
                }  
            }
        return bandera; 
    }  
    /**
    Pre: Existe un arbol
    @return el tamano del arbol
    */
    public int size(){
        return this.size;
    }

}