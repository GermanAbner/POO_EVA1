/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica5;

/**
 *
 * @author Usuario
 */
public class EVA1_Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Ford");
        vehiculo.setModelo("Mustang");
        vehiculo.SetYear(1970);
        vehiculo.setColor("Azul");
        vehiculo.setKilometraje(100000);
        vehiculo.setPrecio(100000);
        vehiculo.imprimirDatos();
    
        Vehiculo[] agencia = new Vehiculo[10];
            System.out.println("Arreglo: " + agencia);
        for (int i = 0; 1 <= agencia.length; i++){
             agencia[i] = new Vehiculo();//ESTA SIRVE PARA CREAR VARIOS VEHICULOS PARA QUE PUEDA CORRER EL ARREGLO QUE LUEGO NO LO DETECTA Y VALE COLA AJAJAJA
             agencia[i].setMarca("Ford");
             agencia[i].setModelo("Mustang");
             agencia[i].SetYear(1970);
             agencia[i].setColor("Azul");
             agencia[i].setKilometraje(100000);
             agencia[i].setPrecio(100000);
             agencia[i].imprimirDatos();
        
            }
    }
}
