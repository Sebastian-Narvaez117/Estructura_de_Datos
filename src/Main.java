//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

<<<<<<< Updated upstream
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
=======
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

        System.out.println("Arbol Rojo,Negro");

        ArbolBinarioBase arbolAVL = new AVL(10);
        arbolAVL.agregar(2);
        arbolAVL.agregar(14);
        arbolAVL.recorrerDerecha();
        arbolAVL.recorrerIzquierda();

        System.out.println("\nInicalizando lista enlazada simple");
        ListaEnlazadaSimple listaSimple = new ListaEnlazadaSimple();
        listaSimple.agregarNodo(1);
        listaSimple.agregarNodo(2);
        listaSimple.agregarNodo(3);
        System.out.println("Lista Enlazada Simple:");
        listaSimple.recorrerSiguiente();

        System.out.println("\nInicializando lista doblemente enlazada");
        ListaDoblementeEnlazada listaDoble = new ListaDoblementeEnlazada();
        listaDoble.agregarNodo(4);
        listaDoble.agregarNodo(5);
        listaDoble.agregarNodo(6);
        System.out.println("Lista Doblemente Enlazada - Siguiente:");
        listaDoble.recorrerSiguiente();
        System.out.println("Lista Doblemente Enlazada - Anterior:");
        listaDoble.recorrerAnterior();

        System.out.println("\nInicalizando lista circular");
        ListaCircular listaCircular = new ListaCircular();
        listaCircular.agregarNodo(7);
        listaCircular.agregarNodo(8);
        listaCircular.agregarNodo(9);
        System.out.println("Lista Circular:");
        listaCircular.recorrerUltimoAlInicio();

        System.out.println("\nInicalizando lista doblemente circular");
        ListaDoblementeCircular listaDobleCircular = new ListaDoblementeCircular();
        listaDobleCircular.agregarNodo(10);
        listaDobleCircular.agregarNodo(11);
        listaDobleCircular.agregarNodo(12);
        System.out.println("Lista Doblemente Circular - Inicio a Final:");
        listaDobleCircular.recorrerInicioFinal();
        System.out.println("Lista Doblemente Circular - Final a Inicio:");
        listaDobleCircular.recorrerFinalInicio();

>>>>>>> Stashed changes
    }
}