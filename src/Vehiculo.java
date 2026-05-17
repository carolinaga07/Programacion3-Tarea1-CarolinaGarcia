public class Vehiculo {
    private String Marca;
    private String Modelo;
    private int Anio;
    private String Color;

    public Vehiculo (String marca, String modelo, int anio, String color){
        this.Anio = anio;
        this.Color = color;
        this.Marca = marca;
        this.Modelo = modelo;
    }

    public String getMarca(){
    return Marca;
   }

   public void setMarca(String Marca){
    this.Marca = Marca;
   }

    public String getModelo(){
    return Modelo;
   }

   public void setModelo(String Modelo){
    this.Modelo = Modelo;
   }

    public int getAnio(){
    return Anio;
   }

   public void setAnio(int Anio){
    this.Anio = Anio;
   }

    public String getColor(){
    return Color;
   }

   public void setColor(String Color){
    this.Color = Color;
   }

   public void MostrarInformacion(){
    System.out.println("======================");
    System.out.println("  DATOS DEL VEHICULO  ");
    System.out.println("======================");
    System.out.println(    "Marca: " + getMarca());
    System.out.println(    "Modelo: " + getModelo());
    System.out.println(    "Año: " + getAnio());
    System.out.println(    "Color: " + getColor());
    System.out.println("======================");

   }






}
