/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica10;

/**
 *
 * @author Usuario
 */
public class EVA1_Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Tv Tele = new Tv();
    Tele.consultarEstado();
    Tele.Interruptor(false);
    Tele.consultarEstado();
    Tele.subirVolumen();
    Tele.consultarEstado();
    Tele.subirVolumen();
    Tele.consultarEstado();
    Tele.bajarVolumen();
    Tele.consultarEstado();
    Tele.bajarVolumen();
    Tele.consultarEstado();
    Tele.bajarCanal();
      
    }
    
}
