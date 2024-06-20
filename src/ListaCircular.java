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
            inicio.setAnterior(finalNodo);
            finalNodo.setAnterior(inicio);
        } else {
            finalNodo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(finalNodo);
            nuevoNodo.setSiguiente(inicio);
            inicio.setAnterior(nuevoNodo);
            finalNodo = nuevoNodo;
        }
        posicion++;
        return true;
    }

    public void recorrerUltimoAlInicio() {
        if (finalNodo == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoLista temp = finalNodo;
        do {
            System.out.println(temp.getValor());
            temp = temp.getAnterior();
        } while (temp != finalNodo);
        // Aseguramos imprimir el valor del nodo final
        System.out.println(temp.getValor());
    }
}
