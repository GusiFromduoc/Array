import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<>();
        
        inventario.add("Espada de hierro");
        inventario.add("Poción curativa");
        inventario.add("Mapa del tesoro");
        
        System.out.println("Inventario actual: " + inventario);
        
        System.out.println("Tamaño del inventario: " + inventario.size());
    }
}