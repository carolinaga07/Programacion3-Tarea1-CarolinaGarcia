import java.util.Scanner;

public class TablaMultiplicar {
   
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un numero para conocer su tabla de multiplicar");
        int num = sc.nextInt();

        MostrarTablaMultiplicar(num);
        
       
    } 
    public static void MostrarTablaMultiplicar(int num){
        
         int contador = 1;
         System.out.println("========================");
         System.out.println("TABLA DE MULTIPLICAR DEL"  +  num);
         System.out.println("========================");
         
         while (contador <= 10)
        {
            int multiplicar = num * contador;
            System.out.println(num + "x" + contador + "="+ multiplicar  );
            contador++;
        }
    }
}
