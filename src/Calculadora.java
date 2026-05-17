
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


        do{
            MostrarMenuCalculadora();
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Calculadora.Sumar( );
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
        }

    }


    public double Sumar( double numero1, double numero2){

       return numero1 + numero2;

    }

    public double Restar( double numero1, double numero2){

       return numero1 - numero2;
       

    }

    public double Multiplicar( double numero1, double numero2){

       return  numero1 * numero2;
      

    }

    public double Dividir( double numero1, double numero2){

       return numero1 / numero2;
       

    }
    
}
