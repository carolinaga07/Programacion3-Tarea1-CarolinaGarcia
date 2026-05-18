


public class CuentaBancaria {

    private long NumeroDeCuenta;
    private String Titular;
    private String TipoDeCuenta;
    private int Saldo;
    

    public CuentaBancaria( long numerodecuenta, String titular, String tipodecuenta, int saldo){
        this.TipoDeCuenta = tipodecuenta;
        this.Titular = titular;
        this.NumeroDeCuenta = numerodecuenta;
        this.Saldo = saldo;
    }

    public String getTipoDeCuenta(){
        return TipoDeCuenta;
    }

    public void setTipoDeCuenta(String TipoDeCuenta){
        this.TipoDeCuenta = TipoDeCuenta;
    }

    public String getTitular(){
        return Titular;
    }

    public void setTitular(String Titular){
        this.Titular = Titular;
    }

    public long getNumeroDeCuenta(){
        return NumeroDeCuenta;
    }

    public void setNumeroDeCuenta(long NumeroDeCuenta){
        this.NumeroDeCuenta = NumeroDeCuenta;
    }

    public int getSaldo(){
        return Saldo;
    }

    public void setSaldo(int Saldo){
        this.Saldo = Saldo;
    }

    public void Retiro( int CantidadRetirar){

        Saldo = Saldo - CantidadRetirar;
         
        System.out.println("Retiro Exitoso");
        System.out.println("Nuevo Saldo:" + Saldo);

    }

    public void Deposito ( int CantidadDepositar){

        Saldo = Saldo + CantidadDepositar;

        System.out.println("Deposito Exitoso");
        System.out.println("Nuevo Saldo:" + Saldo);
        

    }

    public void MostrarCuenta (){
        System.out.println("======================");
        System.out.println("   DATOS DE CUENTA    ");
        System.out.println("======================");
        System.out.println(    "Numero de cuenta: " + getNumeroDeCuenta());
        System.out.println(    "Tipo de cuenta: " + getTipoDeCuenta());
        System.out.println(    "Titular: " + getTitular());
        System.out.println(    "Saldo: " + getSaldo());
        System.out.println("======================");
        
    }

    
}
