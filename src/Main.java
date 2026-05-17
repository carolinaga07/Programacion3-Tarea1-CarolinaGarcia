import java.util.Scanner ;

public class Main {
    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int opcion;

        do 
        {
            MostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    Calculadora.MostrarMenuCalculadora(); // ejecutar es el default para el metodo que se creara.
                    break;
                case 2:
                    System.out.println("Ingresa un numero entero:");
                    int num1 = sc.nextInt();
                    ParImpar.ParOImpar(num1);
                    break;
                case 3:
                    System.out.println("ingrese un numero para conocer su tabla de multiplicar");
                    int num2 = sc.nextInt();
                    TablaMultiplicar.MostrarTablaMultiplicar(num2);
                    break;
                case 4: 
                    ContadorVocales.ContarVocales();
                    break;
                case 5:
                    PromedioNotas.calcularPromedio();
                    break;
                case 6:
                   System.out.println("Ingresa el nombre del estudiante:");
                   String Nombre = sc.nextLine();

                   System.out.println("Ingresa el apellido del estudiante:");
                   String Apellido = sc.nextLine();

                   System.out.println("Ingresa la matricula del estudiante:");
                   String Matricula = sc.nextLine();

                   System.out.println("Ingresa la carrera del estudiante:");
                   String Carrera = sc.nextLine();

                   Estudiante nuevo = new Estudiante(Nombre, Apellido, Matricula, Carrera);

                   nuevo.MostrarEstudiante();
                    break;

                case 7:
                   System.out.println("Ingresa el Numero de cuenta:");
                   int NumeroDeCuenta = sc.nextInt();
                   sc.nextLine();

                   System.out.println("Ingresa el Tipo de cuenta:");
                   String TipoDeCuenta = sc.nextLine();

                   System.out.println("Ingresa el Titular de la cuenta:");
                   String Titular = sc.nextLine();

                   System.out.println("Ingresa el saldo inicial de la cuenta:");
                   int Saldo = sc.nextInt();
                   sc.nextLine();

                   CuentaBancaria Cuenta = new CuentaBancaria(NumeroDeCuenta, Titular, TipoDeCuenta, Saldo);

                   
                    int Opcion;

                    do{
                    System.out.println("==========================");
                    System.out.println("      CUENTA BANCARIA     ");
                    System.out.println("==========================");
                    System.out.println("        1. Ver datos      ");
                    System.out.println("        2. Retirar        ");
                    System.out.println("        3. Depositar      ");
                    System.out.println("        4. Salir          ");
                    System.out.println("==========================");
                    System.out.println("==========================");
                    System.out.println("Elige una opcion:         ");

                    Opcion = sc.nextInt();
                    sc.nextLine();

                    switch (Opcion) {
                        case 1:
                            Cuenta.MostrarCuenta();
                            break;
                        case 2:
                            System.out.println("Ingrese el monto a Retirar:");
                            int Cantidad1 = sc.nextInt();
                            sc.nextLine();

                            Cuenta.Retiro(Cantidad1);
                            break;
                        case 3:
                            System.out.println("Ingrese el monto a Depositar:");
                            int Cantidad2 = sc.nextInt();
                            sc.nextLine();

                            Cuenta.Deposito(Cantidad2);
                            break;
                        case 4:
                            System.out.println("Saliendo...");
                            break;
                    
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }

                    }while (Opcion != 4); 
                    break;
                case 8:
                    int Variable;

                    do{
                    System.out.println("==========================");
                    System.out.println("   REGISTRO DE VEHICULOS  ");
                    System.out.println("==========================");
                    System.out.println("   1. Registrar vehiculo  ");
                    System.out.println("   2. Salir               ");
                    System.out.println("==========================");
                    System.out.println("==========================");
                    System.out.println("Elige una opcion:         ");

                    Variable = sc.nextInt();
                    sc.nextLine();

                    switch (Variable) {
                        case 1:

                            System.out.println("==========================");
                            System.out.println("   QUE DESEAS REGISTRAR?  ");
                            System.out.println("==========================");
                            System.out.println("   1. Carro               ");
                            System.out.println("   2. Moto                ");
                            System.out.println("==========================");
                            System.out.println("==========================");
                            System.out.println("Elige una opcion:         ");

                            int tipo = sc.nextInt();
                            sc.nextLine();

                            if (tipo == 1){
                                 System.out.println("===========================");
                                 System.out.println("     REGISTRO DE CARRO     ");
                                 System.out.println("===========================");
                                 System.out.println("Marca:");
                                 String MarcaC = sc.nextLine();

                                 System.out.println("Modelo:");
                                 String ModeloC = sc.nextLine();

                                 System.out.println("Año:");
                                 int AnioC = sc.nextInt();
                                 sc.nextLine();

                                 System.out.println("Color:");
                                 String ColorC = sc.nextLine();

                                 System.out.println("Numero de puertas:");
                                 int Puertas = sc.nextInt();
                                 sc.nextLine();

                                 System.out.println("Tipo de Combustible:");
                                 String Combustible = sc.nextLine();

                                 Carro carro = new Carro(MarcaC, ModeloC, AnioC, ColorC, Puertas, Combustible);
                                 carro.MostrarInformacion();
                            }
                            else if(tipo == 2){
                               System.out.println("===========================");
                                 System.out.println("     REGISTRO DE MOTO     ");
                                 System.out.println("===========================");
                                 System.out.println("Marca:");
                                 String MarcaM = sc.nextLine();

                                 System.out.println("Modelo:");
                                 String ModeloM = sc.nextLine();

                                 System.out.println("Año:");
                                 int AnioM = sc.nextInt();
                                 sc.nextLine();

                                 System.out.println("Color:");
                                 String ColorM = sc.nextLine();

                                 System.out.println(" Tipo de moto:");
                                 String TipoMoto = sc.nextLine();

                                 System.out.println(" Cilindraje:");
                                 int Cilindraje = sc.nextInt();
                                 sc.nextLine();

                                 Moto moto = new Moto(MarcaM, ModeloM, AnioM, ColorM, TipoMoto, Cilindraje);
                                 moto.MostrarInformacion();
                            }
                            else{
                                System.out.println("Tipo Invalido");
                            }
                            break;
                        case 2:
                            System.out.println("Saliendo...");
                            break;
                    
                        default:
                            System.out.println("Opcion Invalida");
                            break;
                    }
                    }while(Variable != 2);
                    break;
                case 9:
                    Matriz matriz = new Matriz();
                    matriz.ImprimirMatriz(null);;
                    break;
                case 10:
                    Inventario.Ejecutar(sc);
                    break;
                case 11:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");   
            }

        } while (opcion != 11);
    }


        static void MostrarMenu(){
            System.out.println("================================");
            System.out.println("======== MENU PRINCIPAL ========");
            System.out.println(" 1. Calculadora Basica");
            System.out.println(" 2. Numero par o impar");
            System.out.println(" 3. Tabla de multiplicar");
            System.out.println(" 4. Contador de Vocales");
            System.out.println(" 5. Promedio de Notas");
            System.out.println(" 6. Clase Estudiante");
            System.out.println(" 7. Cuenta Bancaria");
            System.out.println(" 8. Herencia de Vehiculos");
            System.out.println(" 9. Matriz 3 x 3");
            System.out.println(" 10. Sistema de Inventario");
            System.out.println(" 11. Salir");
            System.out.println("=================================");
            System.out.println("seleccione:");

        }
    }
