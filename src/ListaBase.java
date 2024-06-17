public abstract class ListaBase implements Lista{

    protected Nodo nodos;
    protected int posicion;
    protected Nodo siguiente;

    @Override
    public abstract void insertarNodo(int posicion);

    @Override
    public abstract void agregarNodo(int posicion);

    @Override
    public abstract void eliminarNodo(int posicion);

    @Override
    public abstract void recorrerSiguiente();



}
