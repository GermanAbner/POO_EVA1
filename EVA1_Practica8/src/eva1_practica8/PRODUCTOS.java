/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_practica8;

/**
 *
 * @author Usuario
 */
public class PRODUCTOS {
        
    private String Nombre;
    private String Marca;
    private int Unidad;
    private double Precio;
    private int Cantidad;
    
    public PRODUCTOS(){
        Nombre = "---";
        Marca = "---";
        Unidad = 0;
        Precio = 0;
        Cantidad = 0;    
        }
    public PRODUCTOS(String Nombre, String Marca, int Unidad, double Precio, int Cantidad){
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Unidad = Unidad;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
     public String getMarca(){
        return Marca;
    }
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
     public int getUnidad(){
        return Unidad;
    }
    public void setUnidad(int Unidad){
        this.Unidad = Unidad;
    }
    public double getPrecio(){
        return Precio;
    }
    public void setPrecio(double Precio){
        this.Precio = Precio;
    }
    public int getCantidad(){
        return Cantidad;
    }
    public void SetCantidad(int Cantidad){
             this.Cantidad             =                 Cantidad;
        //VARIABLE DE LA CLASE                       VARIABLE DEL METODO
    }
    public void imprimirDatos(){
        System.out.println("**********Detalles del Producto************");
        System.out.println("Nombre:" + Nombre);
        System.out.println("Marca:" + Marca);
        System.out.println("Unidad:" + Unidad);
        System.out.println("Precio:" + Precio);
        System.out.println("Cantidad:" + Cantidad);
        System.out.println("**********Detalles del Producto************");
    }
    
    public double calcularMonto(){
        
        return Cantidad * Precio;
    }
    
}
