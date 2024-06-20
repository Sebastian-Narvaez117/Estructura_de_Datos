public class ListaCircular extends ListaBase {

    private NodoLista finalNodo;

    @Override
    public boolean agregarNodo(int valor) {
        NodoLista nuevoNodo = new NodoLista(valor);
        if (inicio == null) {
            inicio = nuevoNodo;
            finalNodo = nuevoNodo;
            inicio.setSiguiente(finalNodo);
            finalNodo.setSiguiente(inicio);
        } else {
            finalNodo.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(inicio);
            finalNodo = nuevoNodo;
        }
        posicion++;
        return true;
    }

    public void recorrerUltimoAlInicio() {
        NodoLista temp = finalNodo;
        do {
            System.out.println(temp.getValor());
            temp = temp.getAnterior();
        } while (temp != finalNodo);
    }
}
