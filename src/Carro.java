

public class Carro extends Vehiculo {

     private int Puertas;
     private String TipoCombustible;
    
    public Carro(String marca, String modelo, int anio, String color, int puertas, String tipocombustible) {
        super(marca, modelo, anio, color);
        this.Puertas = puertas;
        this.TipoCombustible = tipocombustible;
    }
   
    
}
