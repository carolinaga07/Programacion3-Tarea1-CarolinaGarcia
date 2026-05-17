
import java.util.Scanner;

public class Matriz {
    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int [] [] matriz = new int [3] [3] ;
        System.out.println("Ingrese los elementos de la matriz:");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
              System.out.println("Ingrese el numero para la posicion " + "[" + i + "," + j + "]"); 
              matriz [i][j] =  sc.nextInt();
            }
            
        }

    }

    public static void ImprimirMatriz(int [][] matriz){
        for (int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
