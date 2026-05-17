import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    
    public static void main(Scanner sc){
        ArrayList<Productos> lista = new ArrayList<>();
        int opcion;

        do {
        System.out.println("======================");
        System.out.println("      INVENTARIO      ");
        System.out.println("======================");
        System.out.println( "  1. Agregar producto");
        System.out.println( "  2. Listar productos");
        System.out.println("   3.Buscar producto  ");
        System.out.println( "  4. Volver al menu  ");
        System.out.println("======================");
         System.out.println( "Seleccione una opcion:");
         opcion = sc.nextInt();

         switch (opcion) {
            case 1:
                System.out.println("Nombre:");
                String nombre = sc.nextLine();
                System.out.println("Cantidad:");
                int cantidad = sc.nextInt();
                System.out.println("Precio:");
                double precio = sc.nextDouble();
                                
                break;
         
            default:
                break;
         }

        }
    }
}
