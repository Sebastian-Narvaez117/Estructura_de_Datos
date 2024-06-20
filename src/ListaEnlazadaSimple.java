public class ListaEnlazadaSimple extends ListaBase{
    public void recorrerAnterior() {
        NodoLista temp = inicio;
        while (temp.getSiguiente() != null) {
            temp = temp.getSiguiente();
        }

        while (temp != null) {
            System.out.println(temp.getValor());
            temp = temp.getAnterior();
        }
    }
}
