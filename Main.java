import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<>();
        
        inventario.add("Espada de hierro");
        inventario.add("Poción curativa");
        inventario.add("Mapa del tesoro");
        
        // 1. Recorrer la lista con un ciclo for tradicional desde 0 hasta inventario.size() usando get(indice)
        System.out.println("--- Inventario Inicial ---");
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println("Índice " + i + ": " + inventario.get(i));
        }
        
        // 2. Reemplazar el segundo elemento usando set(1, nuevoValor)
        inventario.set(1, "Escudo de acero");
        
        // 3. Comprobar que el tamaño continúe siendo 3 usando size()
        System.out.println("\nComprobación de tamaño tras set(): " + inventario.size());
        
        // 4. Recorrer la lista en sentido inverso desde inventario.size() - 1 hasta 0 usando get(indice)
        System.out.println("\n--- Inventario en Sentido Inverso ---");
        for (int i = inventario.size() - 1; i >= 0; i--) {
            System.out.println("Índice " + i + ": " + inventario.get(i));
        }
    }
}