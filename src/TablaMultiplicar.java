

public class TablaMultiplicar {
   
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
