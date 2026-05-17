
public class Moto extends Vehiculo {

    private String TipoMoto;
    private int Cilindraje;

    public Moto(String marca, String modelo, int anio, String color, String tipomoto, int cilindraje) {
        super(marca, modelo, anio, color);
       this.TipoMoto = tipomoto;
       this.Cilindraje = cilindraje;
    }

    public String getTipoMoto(){
        return TipoMoto;
    }

    public void setTipoMoto( String TipoMoto){
        this.TipoMoto = TipoMoto;
    }

    public int getCilindraje(){
        return Cilindraje;
    }

    public void setCilindraje( int Cilindraje){
        this.Cilindraje = Cilindraje;
    }


    @Override
    public void MostrarInformacion(){
        super.MostrarInformacion();
        System.out.println("Tipo de vehiculo: Motocicleta");
        System.out.println("Tipo de motocicleta  : " + TipoMoto);
        System.out.println("Cilindraje:" + Cilindraje + "cc");
    }


    
}
