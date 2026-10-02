import java.util.ArrayList;

public class Main {
    private static ArrayList<String> inventario = new ArrayList<>();

    public static void main(String[] args) {
        // 1. Cargar al menos cinco objetos
        agregarObjeto("Espada legendaria");
        agregarObjeto("Escudo de mithril");
        agregarObjeto("Poción de vida");
        agregarObjeto("Anillo de poder");
        agregarObjeto("Arco corto");

        System.out.println("=== INFORME INICIAL ===");
        mostrarInforme();

        // 2. Eliminar un objeto existente
        System.out.println("\n--- ELIMINANDO OBJETO EXISTENTE ---");
        retirarObjeto("Poción de vida");

        // 3. Intentar eliminar un objeto inexistente sin provocar errores
        System.out.println("\n--- INTENTANDO ELIMINAR OBJETO INEXISTENTE ---");
        retirarObjeto("Varita mágica");

        // 4. Comprobar la existencia de un objeto
        System.out.println("\n--- COMPROBANDO EXISTENCIA ---");
        boolean encontrado = buscarObjeto("Espada legendaria");
        System.out.println("¿La 'Espada legendaria' está en el inventario? " + encontrado);

        // 5. Mostrar el tamaño final
        System.out.println("\nTamaño final del inventario: " + inventario.size());

        System.out.println("\n=== INFORME FINAL ===");
        mostrarInforme();
    }

    // Método para agregar objetos usando add()
    public static void agregarObjeto(String objeto) {
        inventario.add(objeto);
    }

    // Método para retirar objetos de forma segura usando contains() y remove()
    public static void retirarObjeto(String objeto) {
        if (inventario.contains(objeto)) {
            inventario.remove(objeto);
            System.out.println("Objeto '" + objeto + "' eliminado correctamente.");
        } else {
            System.out.println("Aviso: No se puede eliminar '" + objeto + "' porque no existe en el inventario.");
        }
    }

    // Método para buscar si un objeto existe usando contains()
    public static boolean buscarObjeto(String objeto) {
        return inventario.contains(objeto);
    }

    // Método para mostrar informe recorriendo la lista con un for tradicional, get() y size()
    public static void mostrarInforme() {
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println("Posición " + i + ": " + inventario.get(i));
        }
    }
}