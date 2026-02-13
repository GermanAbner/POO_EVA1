/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_practica9;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
   
    private String Titular;    
    private double Monto;
    /*
    
    Constructores
    Retirar
    Ingresar
    Mostrar Saldo
    
    */
    
    public CuentaBancaria(){
        Titular = "-------";
        Monto = 0.0;
        
    }
    public CuentaBancaria(String Titular,double Monto){
        this.Titular = Titular;
        this.Monto = Monto;
        }
    public void ingresar(double Monto){
        if (Monto > 0) {
            this.Monto += Monto;
        }else {
            System.out.println("No tienes esa lana papa");
        }
    }
    public void retirar(double Monto){
      if (Monto <= this.Monto && Monto >= 0) {
            this.Monto -= Monto;
        }else {
            System.out.println("No tienes esa lana papa");
        }
        
    }
    public void imprimirSaldo(){
        System.out.println("Saldo: " + Monto);
    }
}
