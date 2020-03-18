/**********************************************************
*Association.java           Fecha de creacion: 17 de marzo
*                           Ultima fecha de modificacion: 17 de marzo
*                           
*Clase encargada de los atributos de una asociacion
*
*@author Andrea Amaya #19357
*Codigo adaptado de: Java Structures: Data Structures pagina 16 y pagina 257
**********************************************************/
public class Association<K, V> {
    private K key;
    private V value;

    /**
    @param key          Llave
    @param value        Valor
    Post: Se construye la asosiaccion
    */
    public Association(K key, V value){
        this.key = key;
        this.value = value;
    }

    /**
    Pre: Asocacion a obtener la llave
    @return La llave de la asociacion
    */
    public K getKey(){
        return this.key;
    }

    /**
    Pre: Asocacion a obtener el valor
    @return El valor de la asociacion
    */
    public V getValue() {
        return this.value;
    }

    /**
    @param that         Se recibe la asociacion a comparar
    Pre: Tener una asociacion a comparar con otra asociacion
    @return Un entero que representa la comparacion 
    */
    public int compareTo(Association<K,V> that){
        String k = key.toString();
        String j = that.key.toString();
        return k.compareTo(j);
    }

}
