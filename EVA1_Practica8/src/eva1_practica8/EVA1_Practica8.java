/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica8;

/**
 *
 * @author Usuario
 */
public class EVA1_Practica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PRODUCTOS Producto = new PRODUCTOS();
        Producto.imprimirDatos();
        PRODUCTOS Producto1 =  new PRODUCTOS("Laptop","ASUS",1,15000,1);
        PRODUCTOS Producto2 =  new PRODUCTOS("Laptop","HP",1,6000,1);
        PRODUCTOS Producto3 =  new PRODUCTOS("PC","ghia",1,10000,40);
        Producto1.imprimirDatos();
        Producto2.imprimirDatos();
        Producto3.imprimirDatos();
        
        double Monto = Producto.calcularMonto();
        System.out.println("Monto Invertido en el Producto: " + Monto);
    }
    
}
