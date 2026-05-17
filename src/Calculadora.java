
import java.util.Scanner;

public class Calculadora {

    static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Introduce el primer numero:");
        double numero1 = sc.nextDouble();
        
        System.out.println("Introduce el segundo numero:");
        double numero2 = sc.nextDouble();
       
        do{ 
             MostrarMenuCalculadora();
             opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Resultado Suma: " + Sumar(numero1, numero2));
                    break;
                case 2:
                    System.out.println("Resultado Resta: " + Restar(numero1, numero2));
                    break;
                case 3:
                    System.out.println("Resultado Multiplicacion: " + Multiplicar(numero1, numero2));
                    break;
                case 4:
                    System.out.println("Resultado Division: " + Dividir(numero1, numero2));
                    break;
                case 5:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("Opcion invalida");
        
            }
        }while(opcion != 5);

    }


    public static double Sumar( double numero1, double numero2){

       return numero1 + numero2;

    }

    public static double Restar( double numero1, double numero2){

       return numero1 - numero2;
       

    }

    public static double Multiplicar( double numero1, double numero2){

       return  numero1 * numero2;
      

    }

    public static double Dividir( double numero1, double numero2){

       return numero1 / numero2;
       

    }

    public static void MostrarMenuCalculadora(){
        System.out.println("==========================");
        System.out.println("        CALCULADORA       ");
        System.out.println("==========================");
        System.out.println("        1. Sumar          ");
        System.out.println("        2. Restar         ");
        System.out.println("        3. Multiplicar    ");
        System.out.println("        4. Dividir        ");
        System.out.println("        5. Salir          ");
        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println("Elige una opcion:         ");


    }
    
}
