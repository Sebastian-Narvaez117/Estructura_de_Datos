public abstract class ArbolBinarioBase implements ArbolBinario{

    protected Nodo raiz;
    protected Nodo rama;
    protected Nodo hoja;

    @Override
    public abstract void recorridoEnOrden();

    @Override
    public abstract void recorridoPostOrden();

    @Override
    public abstract void recorridoPreOrden();

    @Override
    public abstract void recorrerDerecha();

    @Override
    public abstract void recorrerIzquierda();

    @Override
    public abstract void insertarNodo();

    @Override
    public abstract void agregarNodo();

    @Override
    public abstract void eliminarNodo();

    @Override
    public abstract String obtenerValorNodo();

}
