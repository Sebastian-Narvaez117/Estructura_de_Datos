public class RojoNegro extends ArbolBinarioBase {
    enum Color { ROJO,NEGRO }
    Color color;

    public RojoNegro(int valor) {
        super(valor);
        pintarRaizNegro(getRaiz());
        //Todos los nodos se pintaran de rojo
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

    public void pintarRaizNegro(Nodo raiz) {
        if (getRaiz() != null)  {
            System.out.println("La raiz es negra");
        }
    }



    public void pintarRamasRojo() {
        if(getRaiz().getIzquierda() != null) {
            System.out.println("La rama izquierda es roja");
        }
    }

    public void balancearNodosNegrosARojos() {
        // Metodo para balancear los nodos negros con relacion a los nodos rojos
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
