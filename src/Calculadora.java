
import java.util.Scanner;

public class Calculadora {

    static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        

        System.out.println("Introduce el primer numero:");
        double numero1 = sc.nextDouble();
        
        System.out.println("Introduce el segundo numero:");
        double numero2 = sc.nextDouble();
       
        MostrarMenuCalculadora();
        int opcion = sc.nextInt();
        do{ 
            
           
            switch (opcion) {
                case 1:
                    System.out.println("Resultado Suma: " + Sumar(numero1, numero2));
                    break;
                case 2:
                    Calculadora.Restar();
                    break;
                case 3:
                    Calculadora.Multiplicar();
                    break;
                case 4:
                    Calculadora.Dividir();
            
              
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
    
}
