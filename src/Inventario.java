import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    
    public static void Ejecutar (Scanner sc){
        ArrayList<Productos> lista = new ArrayList<>();
        int opcion;

        do {
        System.out.println("======================");
        System.out.println("      INVENTARIO      ");
        System.out.println("======================");
        System.out.println( "  1. Agregar producto");
        System.out.println( "  2. Listar productos");
        System.out.println( "  3. Volver al menu  ");
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

                lista.add(new Productos(nombre, cantidad, precio));
                System.out.println("Producto Agregado"); 
                                
                break;
            case 2:
                if(lista.isEmpty()){
                    System.out.println("no hay productos"); 
                }
                else{
                    for(int i = 0; i < lista.size(); i++){
                        Productos p = lista.get(i);
                        System.out.println("." + p.getNombre() + "|" + p.getCantidad() + "|" + p.getPrecio()); 
                    }
                }
                break;

         }

        }while (opcion != 3);
    }
}
