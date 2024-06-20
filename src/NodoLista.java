public class NodoLista {
    private int valor;
    private NodoLista siguiente;
    private NodoLista anterior;

    public NodoLista(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLista getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLista anterior) {
        this.anterior = anterior;
    }
}
