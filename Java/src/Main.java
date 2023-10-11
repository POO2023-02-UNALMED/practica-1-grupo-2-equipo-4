import gestorAplicacion.administracion.Contabilidad;
import gestorAplicacion.restaurante.Gaseosas;
import gestorAplicacion.restaurante.Ingredientes;
import gestorAplicacion.restaurante.Inventario;

public class Main {
    public static void main(String[] args) {
        // Test Comprar gaseosas
        Gaseosas coca_cola = new Gaseosas("Coca cola",2000,9);
        Gaseosas Sprite = new Gaseosas("Sprite",2000,9);
        System.out.println(Gaseosas.listaGaseosas.toString());
        Sprite.comprar(6,Sprite);
        System.out.println(Gaseosas.listaGaseosas.toString());
        System.out.println(Contabilidad.saldo);
        coca_cola.comprar(9,coca_cola);
        System.out.println(Contabilidad.saldo);
        System.out.println(Gaseosas.listaGaseosas.toString());

        // Test Comprar Ingredientes
        Ingredientes albahaca = new Ingredientes("albahaca",3657,3);
        Ingredientes tomate = new Ingredientes("tomate",5657,4);
        System.out.println(Ingredientes.listaIngredientes.toString());
        System.out.println(Contabilidad.saldo);
        tomate.comprar(7,tomate);
        albahaca.comprar(6,albahaca);
        System.out.println(Ingredientes.listaIngredientes.toString());
        System.out.println(Contabilidad.saldo);

        // Test unión listas ingredientes - gaseosas
        System.out.println(Inventario.listaInventario.toString());
        tomate.comprar(7,tomate);
        System.out.println(Inventario.listaInventario.toString());
    }

}