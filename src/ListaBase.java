public abstract class ListaBase implements Lista{

    protected NodoLista inicio;
    protected int posicion;

    public boolean agregarNodo(int valor) {
        NodoLista nuevoNodo = new NodoLista(valor);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            NodoLista temp = inicio;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(temp);
        }
        posicion++;
        return true;
    }

    public void eliminarNodo(int valor) {
        if (inicio == null) return;

        NodoLista temp = inicio;
        while (temp != null && temp.getValor() != valor) {
            temp = temp.getSiguiente();
        }

        if (temp != null) {
            if (temp.getAnterior() != null) {
                temp.getAnterior().setSiguiente(temp.getSiguiente());
            } else {
                inicio = temp.getSiguiente();
            }

            if (temp.getSiguiente() != null) {
                temp.getSiguiente().setAnterior(temp.getAnterior());
            }
        }
    }

    public void recorrerSiguiente() {
        NodoLista temp = inicio;
        while (temp != null) {
            System.out.println(temp.getValor());
            temp = temp.getSiguiente();
        }
    }


}
