//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArbolBinarioBase arbol = new ArbolBinarioBase(10);
        arbol.agregar(5);
        arbol.agregar(2);
        arbol.recorrerIzquierda();
        arbol.recorrerDerecha();
        /*arbol.agregar(3);
        arbol.agregar(8);
        arbol.agregar(15);
        arbol.agregar(16);
        arbol.agregar(18);
        arbol.agregar(19);
        arbol.agregar(1);
        arbol.recorrerDerecha();
        System.out.println("no paren bola \n\n");
        arbol.recorrerIzquierda();*/

    }
}