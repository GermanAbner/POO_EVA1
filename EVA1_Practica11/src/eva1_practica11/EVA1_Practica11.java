/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica11;

/**
 *
 * @author Usuario
 */
public class EVA1_Practica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CLASE MATH
        System.out.println("PI = " + Math.PI);
        System.out.println("Valor Aleatorio = " + Math.random());
        System.out.println("Potencia (5) = " + Math.pow(5, 2));
        
        
        //CLASE MATEMATICAS
        System.out.println("CLASE MATEMATICAS**********");
        Matematicas mate = new Matematicas();   //CUANDO SE HACE ESA INSTRUCCION LA CLASE SE CREA NO ANTES ASIQUE HAY QUE DECLARARLA DESDE ANTES PARA QUE TU CLASE PUEDA FUNCIONAR CORRECTAENTE
        System.out.println("PI: " + mate.PI);
        System.out.println("PI: " + Matematicas.PI);
        }
    
}
        
class Matematicas{
            //TODO LO QUE ESTE EN SU CODIGO SE CREEE EN CUANTO SE LA CONMPUTADORA ARRANCA OGMOGMGOMGOMOGMOGMOGMOMGOMGOMGOMGOGMOGMOM
    public static final double PI = 3.14159;
}