import java.util.Scanner ;

public class Main {
    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        TablaMultiplicar tabla = new TablaMultiplicar();
        int opcion;

        do 
        {
            MostrarMenu();
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    Calculadora.MostrarMenuCalculadora(); // ejecutar es el default para el metodo que se creara.
                    break;
                case 2:
                    System.out.println("Ingresa un numero entero:");
                    int num1 = sc.nextInt();
                    ParImpar.ParOImpar(num1);
                    break;
                case 3:
                    System.out.println("ingrese un numero para conocer su tabla de multiplicar");
                    int num2 = sc.nextInt();
                    TablaMultiplicar.MostrarTablaMultiplicar(num2);
                    break;
                case 4: 
                    ContadorVocales.ejecutar(sc);
                    break;
                case 5:
                    PromedioNotas.ejecutar(sc);
                    break;
                case 6:
                    Estudiante.ejecutar(sc);
                    break;
                case 7:
                    CuentaBancaria.ejecutar(sc);
                    break;
                case 8:
                    Vehiculo.ejecutar(sc);
                    break;
                case 9:
                    Matriz.ejecutar(sc);
                    break;
                case 10:
                    Inventario.ejecutar(sc);
                    break;
                case 11:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");   
            }

        } while (opcion != 11);
    }


        static void MostrarMenu(){
            System.out.println("\n================================");
            System.out.println("\n======== MENU PRINCIPAL ========");
            System.out.println("\n 1. Calculadora Basica");
            System.out.println("\n 2. Numero par o impar");
            System.out.println("\n 3. Tabla de multiplicar");
            System.out.println("\n 4. Contador de Vocales");
            System.out.println("\n 5. Promedio de Notas");
            System.out.println("\n 6. Clase Estudiante");
            System.out.println("\n 7. Cuenta Bancaria");
            System.out.println("\n 8. Herencia de Vehiculos");
            System.out.println("\n 9. Matriz 3 x 3");
            System.out.println("\n 10. Sistema de Inventario");
            System.out.println("\n 11. Salir");
            System.out.println("\n=================================");
            System.out.println("\n     seleccione:");

        }
    }
