/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_practica5;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    private String Marca;
    private String Modelo;
    private int year;
    private String Color;
    private double Precio;
    private int Kilometraje;
    
    //COMPORTAMIENTO
    
    public String getMarca(){
        return Marca;
    }
    public void setMarca(String valor){
        Marca = valor;
    }
    public String getModelo(){
        return Modelo;
    }
    public void setModelo(String valor){
        Modelo = valor;
    }
    public int getYear(){
        return year;
    }
    public void SetYear(int valor){
        year = valor;
    }
    public String getColor(){
        return Color;
    }
    public void setColor(String valor){
        Color = valor;
    }
    public double getPrecio(){
        return Precio;
    }
    public void setPrecio(double valor){
        Precio = valor;
    }
    public int getKilometraje(){
        return Kilometraje;
    }
    public void setKilometraje(int valor){
        Kilometraje = valor;
    }
    public void imprimirDatos(){
        System.out.println("******** DATOS DEL VEHICULO************");
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Ano: " + year);
        System.out.println("Color: "+ Color);
        System.out.println("Kilometraje: "+ Kilometraje);
        System.out.println("Precio: "+ Precio);
    }
}
