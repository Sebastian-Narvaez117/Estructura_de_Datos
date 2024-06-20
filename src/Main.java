//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArbolBinarioBase arbol = new ArbolBinarioBase(10);
        arbol.agregar(5);
        arbol.agregar(3);
        arbol.agregar(2);
        arbol.agregar(10);
        arbol.agregar(15);
        arbol.recorrerIzquierda();
        arbol.recorrerDerecha();
        System.out.println("Recorrido InOrden");
        arbol.recorridoInOrden();
        System.out.println("Recorrido PreOrden");
        arbol.recorridoPreOrden();
        System.out.println("Recorrido PostOrden");
        arbol.recorridoPostOrden();


        System.out.println("\nArbol AVL:");
        ArbolBinarioBase arbolAVL = new AVL(30);
        arbolAVL.agregar(2);
        arbolAVL.agregar(3);
        arbolAVL.agregar(40);
        arbolAVL.agregar(50);
        arbolAVL.agregar(64);
        arbolAVL.recorrerDerecha();
        arbolAVL.recorrerIzquierda();


        System.out.println("Arbol ROJO, Negro:");
        ArbolBinarioBase arbolrojonegro = new RojoNegro(56);
        arbolrojonegro.agregar(2);
        arbolrojonegro.agregar(5);
        arbolrojonegro.agregar(7);
        arbolrojonegro.agregar(10);
        arbolrojonegro.agregar(60);
        arbolrojonegro.recorridoPostOrden();
        arbolrojonegro.recorrerDerecha();




        // Lista Enlazada Simple
        ListaEnlazadaSimple listaSimple = new ListaEnlazadaSimple();
        listaSimple.agregarNodo(1);
        listaSimple.agregarNodo(2);
        listaSimple.agregarNodo(3);
        System.out.println("Lista Enlazada Simple:");
        listaSimple.recorrerSiguiente();

        // Lista Doblemente Enlazada
        ListaDoblementeEnlazada listaDoble = new ListaDoblementeEnlazada();
        listaDoble.agregarNodo(4);
        listaDoble.agregarNodo(5);
        listaDoble.agregarNodo(6);
        System.out.println("Lista Doblemente Enlazada - Siguiente:");
        listaDoble.recorrerSiguiente();
        System.out.println("Lista Doblemente Enlazada - Anterior:");
        listaDoble.recorrerAnterior();

        // Lista Circular
        ListaCircular listaCircular = new ListaCircular();
        listaCircular.agregarNodo(7);
        listaCircular.agregarNodo(8);
        listaCircular.agregarNodo(9);
        System.out.println("Lista Circular:");
        listaCircular.recorrerUltimoAlInicio();

        // Lista Doblemente Circular
        ListaDoblementeCircular listaDobleCircular = new ListaDoblementeCircular();
        listaDobleCircular.agregarNodo(10);
        listaDobleCircular.agregarNodo(11);
        listaDobleCircular.agregarNodo(12);
        System.out.println("Lista Doblemente Circular - Inicio a Final:");
        listaDobleCircular.recorrerInicioFinal();
        System.out.println("Lista Doblemente Circular - Final a Inicio:");
        listaDobleCircular.recorrerFinalInicio();


    }
}