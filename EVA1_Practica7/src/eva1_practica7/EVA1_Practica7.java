/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica7;

/**
 *
 * @author Usuario
 */
public class EVA1_Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                            //CONSTRUCTOR DEFAULT (SIN ARGUMENTOS EN LOS (PARENTESIS))
        Persona perso = new Persona();
        perso.imprimirDatos();
        
        Persona perso1 = new Persona("Juan", "Perez", 50);
        perso1.imprimirDatos();
        }
    
}
