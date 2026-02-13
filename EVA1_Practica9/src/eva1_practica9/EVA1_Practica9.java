/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica9;

/**
 *
 * @author Usuario
 */
public class EVA1_Practica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria Cuenta = new CuentaBancaria("Juan Perez",5000);
        Cuenta.imprimirSaldo();
        Cuenta.retirar(1500);
        Cuenta.imprimirSaldo();
        Cuenta.ingresar(6000);
        Cuenta.imprimirSaldo();
        Cuenta.retirar(100000);
        Cuenta.imprimirSaldo();
        Cuenta.retirar(-1000);
        Cuenta.imprimirSaldo();
    }
    
}
