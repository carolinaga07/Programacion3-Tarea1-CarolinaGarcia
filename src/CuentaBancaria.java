
import java.util.Scanner;

public class CuentaBancaria {

    private int NumeroDeCuenta;
    private String Titular;
    private String TipoDeCuenta;
    private int Saldo;
    

    public CuentaBancaria( int numerodecuenta, String titular, String tipodecuenta, int saldo){
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

    public int getNumeroDeCuenta(){
        return NumeroDeCuenta;
    }

    public void setNumeroDeCuenta(int NumeroDeCuenta){
        this.NumeroDeCuenta = NumeroDeCuenta;
    }

    public int getSaldo(){
        return Saldo;
    }

    public void setSaldo(int Saldo){
        this.Saldo = Saldo;
    }

    public int Retiro( int CantidadRetirar){

        int resultado = Saldo - CantidadRetirar;
        return resultado;

    }

    public int Deposito ( int CantidadDepositar){

        int resultado = Saldo - CantidadDepositar;
        return resultado;

    }

    
}
