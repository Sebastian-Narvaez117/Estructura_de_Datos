public class ListaCircular extends ListaBase {

    private Nodo inicio;
    private Nodo finalNodo;

    @Override
<<<<<<< Updated upstream
    public void insertarNodo(int posicion) {
        // Metodo para insertar un nodo
    }

    @Override
    public void agregarNodo(int posicion) {
        // Metodo para agregar un nodo
    }

    @Override
    public void eliminarNodo(int posicion) {
        // Metodo para eliminar un nodo
    }

    @Override
    public void recorrerSiguiente() {
        // Metodo para recorrer el siguiente nodo
    }

    public void recorrerUltimoAInicio() {
        // Metodo para recorrer el ultimo nodo al inicio
=======
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
        System.out.println(temp.getValor());
>>>>>>> Stashed changes
    }
}
