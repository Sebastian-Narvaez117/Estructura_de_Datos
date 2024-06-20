public  class ArbolBinarioBase implements ArbolBinario{

    private Nodo raiz;
    private Nodo ramamayor;
    private Nodo ramamenor;
    private Nodo hoja;

    public ArbolBinarioBase(int valor){
        this.raiz = new Nodo(valor);

    }


    public void recorridoInOrden(){
        this.raiz.recorridoInOrden();

    }


    public void recorridoPostOrden(){
        this.raiz.recorridoPostOrden();

    }


    public  void recorridoPreOrden(){
        this.raiz.recorridoPreOrden();

    }


    public  void recorrerDerecha(){
        this.raiz.recorrerDerecha();
        //this.hoja.recorrerDerecha();
        //this.rama.recorrerDerecha();


    }


    public  void recorrerIzquierda(){
        this.raiz.recorrerIzquierda();
        //this.hoja.recorrerIzquierda();
        //this.rama.recorrerIzquierda();
    }



    @Override
    public boolean agregar(int valor){

        return raiz.agregar(valor);
    }

    @Override
    public  boolean eliminarNodo(){
        return false;
    }

    @Override
    public  boolean obtenerValorNodo(){
        return false;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}
