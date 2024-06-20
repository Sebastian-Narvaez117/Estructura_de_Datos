public class ListaDoblementeCircular extends ListaBase {

    private NodoLista finalNodo;
    private NodoLista anterior;

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

    public void recorrerAnterior() {
        NodoLista temp = finalNodo;
        do {
            System.out.println(temp.getValor());
            temp = temp.getAnterior();
        } while (temp != finalNodo);
    }

    public void recorrerInicioFinal() {
        NodoLista temp = inicio;
        do {
            System.out.println(temp.getValor());
            temp = temp.getSiguiente();
        } while (temp != inicio);
    }

    public void recorrerFinalInicio() {
        NodoLista temp = finalNodo;
        do {
            System.out.println(temp.getValor());
            temp = temp.getAnterior();
        } while (temp != finalNodo);
    }
}
