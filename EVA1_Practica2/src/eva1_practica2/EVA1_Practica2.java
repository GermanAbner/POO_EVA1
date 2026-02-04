/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica2;

/**
 *
 * @author Usuario
 */
public class EVA1_Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso = new Persona(); // Instanciando el objeto perso
        System.out.println(perso); //Guarda una direccion (REFERENCIA)
        perso.nombre = "A";
            
    }
}
    class Persona { //PRIVATE HACE INVISIBLE A TODO LO QUE ESTA FUERA DE LA CLASE
    String  nombre;
    String  apellido;
    int edad;
    
} 
