/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_practica10;

/**
 *
 * @author Usuario
 */
public class Tv {
    
    private boolean Interruptor; //TRUE O FALSE
    private double Canal; // variable de ripo 7.1
    private int Volumen;   // Variable que suba o baje el volumen +/-
            
    public Tv(){
        Interruptor = false;
        Canal = 0.0;
        Volumen = 0;
    }
    
    public Tv(boolean Interruptor, double Canal, int Volumen){
        this.Interruptor = Interruptor;
        this.Canal = Canal;
        this.Volumen = Volumen;
        }
    
    public void Interruptor(boolean Interruptor){
        if (Interruptor = false)
            System.out.println("La televicion se encuentra apagada");
        else{
            System.out.println("La televicion se encuentra encendida");
        }
        Interruptor = !Interruptor;
    }
    public void consultarEstado(){
        if (Interruptor) {
            System.out.println("Encendida!!");
        }else{
            System.out.println("Apagada!!");
            System.out.println("Volumen: " + Volumen);
        }
    }
    public void cambiarCanal(double Canal){
        if  (Interruptor ==true)
        this.Canal = Canal;
            
        }      
    
    public void subirVolumen(){
            Volumen++;
    }
    public void bajarVolumen(){
            Volumen--;
    }
    public void subirCanal(){
        if (Interruptor == true) {
            if (Canal == 100) {
                Canal = 0;
            }else{
                Canal++;
            }
        }
    
    }
    public void bajarCanal(){
        if (Interruptor == true) {
            if (Canal == 0) {
                Canal = 100;
            }else{
                Canal--;
            }
        }
    
    }
}

