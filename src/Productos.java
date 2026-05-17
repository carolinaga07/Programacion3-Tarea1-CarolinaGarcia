
public class Productos {

    private String Nombre;
    private int Cantidad;
    private double Precio;

    public Productos(String nombre, int cantidad, double precio){
        this.Cantidad = cantidad;
        this.Nombre = nombre;
        this.Precio = precio;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;

    }

    
}
