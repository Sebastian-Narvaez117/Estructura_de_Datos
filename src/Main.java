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

        System.out.println("Arbol Rojo,Negro");

        ArbolBinarioBase arbolAVL = new AVL(10);
        arbolAVL.agregar(2);
        arbolAVL.agregar(14);
        arbolAVL.recorrerDerecha();
        arbolAVL.recorrerIzquierda();



    }
}