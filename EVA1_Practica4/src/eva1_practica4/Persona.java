/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_practica4;

/**
 *
 * @author Usuario
 */
public class Persona {
    //ATRIBUTOS
    
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    //CONSTRUCTORES
    //COMPORTAMIENTO(Metodos)
    //metodo get(obtener) y set(poner)
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public String getApellidos(){
        return apellido;
    }
    public void setApellido(String valor){
        apellido = valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public char getGenero(){
        return genero;
    }
    public void setGenero(char valor){
        genero = valor;
    }
    public void imprimirDatos(){
        System.out.println("************************");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Genero: " + genero);
        System.out.println("Edad: " + edad);
        System.out.println("************************");
    }
}
