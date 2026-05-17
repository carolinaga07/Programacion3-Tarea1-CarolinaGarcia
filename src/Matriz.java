
import java.util.Scanner;

public class Matriz {
    
    public void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int [] [] matriz = new int [3] [3] ;
        System.out.println("Ingrese los elementos de la matriz:");

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
              System.out.println("Ingrese el numero para la posicion " + "[" + i + "," + j + "]"); 
              matriz [i][j] =  sc.nextInt();
            }
            
        }

        ImprimirMatriz(matriz);

    }

    public  void ImprimirMatriz(int [][] matriz){
        for (int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
