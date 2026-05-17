

public class Carro extends Vehiculo {

     private int Puertas;
     private String TipoCombustible;
    
    public Carro(String marca, String modelo, int anio, String color, int puertas, String tipocombustible) {
        super(marca, modelo, anio, color);
        this.Puertas = puertas;
        this.TipoCombustible = tipocombustible;
    }

    public int getPuertas(){
        return Puertas;
    }

    public void setPuertas(int Puertas){
        this.Puertas = Puertas;
    }

    public String getTipoCombustible(){
        return TipoCombustible;
    }

    public void setTipoCombustible(String TipoCombustible){
        this.TipoCombustible = TipoCombustible;
    }
   
    
}
