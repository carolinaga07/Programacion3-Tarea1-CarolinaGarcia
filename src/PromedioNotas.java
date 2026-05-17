
import java.util.Scanner;

public class PromedioNotas {
    
    public static void main (String [] args){
        calcularPromedio();
    }
    
    public static void calcularPromedio(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("¿Cuantas materias llevas este cuatrimestre?");
    int cantidad = sc.nextInt();

    double suma = 0;
    for(int i = 1; i < cantidad; i++){
        System.out.println("Nota:" + i + ":");
        double nota = sc.nextDouble();
        suma+= nota;
    }

    double promedio = suma / cantidad;
    System.out.printf("Promedio:%.2f%n", promedio);

    if (promedio > 70 ){
        System.out.println("Estado: Aprobado");
    }
    else{
        System.out.println("Estado: Reprobado");
    }
}


}
