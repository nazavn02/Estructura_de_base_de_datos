package clientes;

public class nodo {
    //nodo que permite darle forma a la lista con sus respectiva partes 
    private datos dato;
    private nodo siguiente;
    public nodo(datos dato) {
        this.dato = dato;
        this.siguiente=null;
    }

    public datos getDato() {
        return dato;
    }

    public void setDato(datos dato) {
        this.dato = dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return  "dato=" + dato + '}';
    }
}
