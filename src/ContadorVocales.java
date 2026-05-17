import java.util.Scanner;

public class ContadorVocales {
    
    public static void ContarVocales(){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String cadena = sc.nextLine();
        
        int Vocales = 0;

        for(int i = 0; i < cadena.length(); i++){
            
            char caracter = Character.toLowerCase(cadena.charAt(i));
            
            if (caracter == 'a'|| caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                Vocales++;
            }
             
            
        }

        System.out.println("Cantidad de vocales:" + Vocales);
    }
    

   

    
    
}
