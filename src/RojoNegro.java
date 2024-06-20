public class RojoNegro extends ArbolBinarioBase {

    public RojoNegro(int valor) {
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
        // Metodo que agrega un nodo al arbol
        return false;
    }

    @Override
    public boolean eliminarNodo() {
        // Metodo que elimina un nodo del arbol
        return false;
    }

    @Override
    public boolean obtenerValorNodo() {
        //  Metodo que obtiene el valor de un nodo
        return false;
    }

    public void pintarRaizNegro() {
        // Metodo que pinta la raiz de color negro
    }

    public void pintarHojasNullNegro() {
        // Metodo que pinta las hojas unicas de negro
    }

    public void pintarRamasRojo() {
        // Metodo que pinta las ramas de rojo
    }

    public void balancearNodosNegrosARojos() {
        // Metodo para balancear los nodos negros con relacion a los nodos rojod
    }


}
