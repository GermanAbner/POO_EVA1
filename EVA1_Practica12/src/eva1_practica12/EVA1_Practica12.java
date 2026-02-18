/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica12;

/**
 *
 * @author Usuario
 */
public class EVA1_Practica12 {
    public int x = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("50 °C = " + Temperatura.celAFahr(50) +  "°F");
        System.out.println("50 °F = " + Temperatura.fahrACel(50) +  "°C");
        System.out.println("50 °C = " + Temperatura.celAFahr(50) +  "°K");
        System.out.println("50 °K = " + Temperatura.kelACel(50) +  "°C");
        System.out.println("50 °F = " + Temperatura.fahrAKel(50) +  "°K");
        System.out.println("50 °K = " + Temperatura.kelAFahr(50) +  "°F");
        EVA1_Practica12 obj = new EVA1_Practica12();
        System.out.println("X = " + obj);
    }
    
}
class Temperatura {
    public static double celAFahr(double celsius){
        double resu;
        resu = celsius * (9.0/5.0) + 32;
        return resu;
    }
        // EL STATIC RETIRA TODO LO CREADO Y LIT SOLO MUESTRA UN ARCHIVO COMO SI FUESE UN METODO SIN QUE SEA UN CLASE CON SUS ATRIBUTOS 
    public static double fahrACel(double fahrenheit){
            double resu;
            resu = (5.0/9.0)*(fahrenheit - 32);
            return resu;
    }
    public static double celAKel(double celsius){
        double resu;
        resu = celsius + 273.15;
        return resu;
    }
        // EL STATIC RETIRA TODO LO CREADO Y LIT SOLO MUESTRA UN ARCHIVO COMO SI FUESE UN METODO SIN QUE SEA UN CLASE CON SUS ATRIBUTOS 
    public static double kelACel(double kelvin){
            double resu;
            resu = kelvin - 273.15;
            return resu;
    }
    public static double fahrAKel(double fahrenheit){
        double resu;
        resu = (5.0/9.0) * (fahrenheit - 32) + 273.15 ;
        return resu;
    }
        // EL STATIC RETIRA TODO LO CREADO Y LIT SOLO MUESTRA UN ARCHIVO COMO SI FUESE UN METODO SIN QUE SEA UN CLASE CON SUS ATRIBUTOS 
    public static double kelAFahr(double kelvin){
            double resu;
            resu = (9.0/5.0)*(kelvin - 273.15) + 32;
            return resu;
    }
}