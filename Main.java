import java.util.ArrayList;

public class Main {
    // Declaración del ArrayList inventario
    private static ArrayList<String> inventario = new ArrayList<>();

    public static void main(String[] args) {
        // Agregando al menos cuatro objetos utilizando el método propio (sin duplicar lógica en main)
        agregarObjeto("Espada de hierro");
        agregarObjeto("Poción curativa");
        agregarObjeto("Mapa del tesoro");
        agregarObjeto("Escudo de madera");

        // Mostrar el inventario inicial
        System.out.println("=== Inventario Inicial ===");
        mostrarInventario();

        // Retirar un objeto utilizando el método propio
        retirarObjeto("Poción curativa");

        // Volver a mostrar el inventario actualizado
        System.out.println("\n=== Inventario Tras Retirar un Objeto ===");
        mostrarInventario();
    }

    // Método propio para agregar objetos usando add()
    public static void agregarObjeto(String objeto) {
        inventario.add(objeto);
    }

    // Método propio para recorrer la lista y mostrar sus elementos
    public static void mostrarInventario() {
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println("Índice " + i + ": " + inventario.get(i));
        }
    }

    // Método propio para retirar objetos usando remove()
    public static void retirarObjeto(String objeto) {
        inventario.remove(objeto);
    }
}