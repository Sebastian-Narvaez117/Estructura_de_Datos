public class Nodo {

    private int valor;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(int valor) {
        this.valor = valor;
    }

    public void getValor() {
        this.valor = valor;

    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public boolean agregar(int valor) {
        if (this.valor > valor) {
            if (this.izquierda == null) {
                this.izquierda = new Nodo(valor);
                return true;
            } else {
                this.izquierda.agregar(valor);
              }
        } else {
            if (this.derecha == null) {
                this.derecha = new Nodo(valor);
                return true;
            } else {
                this.derecha.agregar(valor);
              }
           }
        return false;
    }

    public void recorridoPostOrden() {
        if (this.izquierda != null) {
            this.izquierda.recorridoPostOrden();
        }
        if (this.derecha != null) {
            this.derecha.recorridoPostOrden();
        }
        System.out.println(this.valor);
    }

    public void recorridoPreOrden() {
        System.out.println(this.valor);
        if (this.izquierda != null) {
            this.izquierda.recorridoPreOrden();
        }
        if (this.derecha != null) {
            this.derecha.recorridoPreOrden();
        }
    }

    public void recorridoInOrden() {
        if (this.izquierda != null) {
            this.izquierda.recorridoInOrden();
        }
        System.out.println(this.valor);
        if (this.derecha != null) {
            this.derecha.recorridoInOrden();
        }
    }

    public void recorrerDerecha() {
        System.out.println(this.valor);
        if (this.derecha == null) {
            System.out.println("No hay más nodos a la derecha");
        }
        if (this.derecha != null) {
            this.derecha.recorrerDerecha();
        }


    }

    public void recorrerIzquierda() {
        System.out.println(this.valor);
        if (this.izquierda == null) {
            System.out.println("No hay más nodos a la izquierda");
        }
        if (this.izquierda != null) {
            this.izquierda.recorrerIzquierda();
        }


    }


}
