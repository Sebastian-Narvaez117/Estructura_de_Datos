public class AVL extends ArbolBinarioBase {

    public AVL(int valor) {
        super(valor);
    }

    public void recorridoInOrden() {
        this.getRaiz().recorridoInOrden();
    }


    public void recorridoPostOrden() {
        this.getRaiz().recorridoPostOrden();
    }


    public void recorridoPreOrden() {
        this.getRaiz().recorridoPreOrden();
    }


    public void recorrerDerecha() {
       this.getRaiz().recorrerDerecha();
    }


    public void recorrerIzquierda() {
        this.getRaiz().recorrerIzquierda();
    }



    @Override
    public boolean agregar(int valor) {
        return getRaiz().agregar(valor);

    }

    @Override
    public boolean eliminarNodo() {
        // Implementación aquí
        return false;
    }

    @Override
    public boolean obtenerValorNodo() {
        // Implementación aquí
        return false;
    }

    public void balancear(int numNodosRama) {
        // Implementación aquí
    }




}
