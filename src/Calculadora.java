
import java.util.Scanner;

public class Calculadora {

    static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        if (sc.hasNextDouble()){
            double numero1 = sc.nextDouble();
        }
        else{
            System.out.println("Entrada invalida, debe ser un numero");
        }

        System.out.println("Introduce el segundo numero:");
        if(sc.hasNextDouble()){
            double numero2 = sc.nextDouble();
        }
        else{
            System.out.println("Entrada invalida, debe ser un numero");
        }

        
    }
    
}
