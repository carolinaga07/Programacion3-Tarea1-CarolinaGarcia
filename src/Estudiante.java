


public class Estudiante {

   
    private String Nombre;
    private String Apellido;
    private String Matricula;
    private String Carrera;
    

   public Estudiante(String nombre, String apellido, String matricula, String carrera){

    this.Nombre = nombre;
    this.Apellido = apellido;
    this.Matricula = matricula;
    this.Carrera = carrera;

   }

   public String getNombre(){
    return Nombre;
   }

   public void setNombre(String Nombre){
    this.Nombre = Nombre;
   }

   public String getApellido(){
    return Apellido;
   }

   public void setApellido(String Apellido){
    this.Apellido = Apellido;
   }

   public String getMatricula(){
    return Matricula;
   }

   public void setMatricula(String Matricula){
    this.Matricula = Matricula;
   }

   public String getCarrera(){
    return Carrera;
   }

   public void setCarrera(String Carrera){
    this.Carrera = Carrera;
   }

   public void MostrarEstudiante(){
           System.out.println("======================");
           System.out.println(" DATOS DEL ESTUDIANTE ");
           System.out.println("======================");
           System.out.println(    "Nombre: " + getNombre());
           System.out.println(    "Apellido: " + getApellido());
           System.out.println(    "Matricula: " + getMatricula());
           System.out.println(    "Carrera: " + getCarrera());
           System.out.println("======================");
           System.out.println(    Nombre + Apellido + 
            "con matricula" + Matricula + 
            "es estudiante de " + Carrera);
   }
    
}
