/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_Practica13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {         
        Areas areas = new Areas();
        System.out.println("*********Calculadora de Areas****************");
        System.out.println("Escoje que area deseas sacar");
        System.out.println("Cuadrado = 1");
        System.out.println("Rectangulo = 2");
        System.out.println("Triangulo = 3");
        System.out.println("Circulo = 4");
        System.out.println("Rombo = 5");
        System.out.println("Trapecio = 6");
            Scanner captu = new Scanner(System.in);
        System.out.println("*********************************************");                       
        System.out.println("Cual es el area que desea sacar?");
        int numArea = captu.nextInt();
        System.out.println("*********************************************");
        if (numArea == 1) {
            System.out.println("********BIENVENIDO A AREA (CUADRADO)**********");
            System.out.println("Brindame el valor del un lado del cuadrado");
            double lado = captu.nextInt();
            System.out.println("*********************************************");
            System.out.println("El area de un cuadrado cuyo lado es de " + lado + " es de " + areas.AreaCuadrado(lado));
            System.out.println("*********************************************");
        }else if (numArea == 2) {
            System.out.println("********BIENVENIDO AREA (RECTANGULO)**********");
            System.out.println("Brindame el valor de la base del rectangulo");
            double base = captu.nextInt();
            System.out.println("Brindame el valor de la altura del rectangulo");
            double altura = captu.nextInt();
            System.out.println("*********************************************");
            System.out.println("El area de un rectangulo cuya base es de " + base + " y su altura de " + altura + "Es igual a " + areas.AreaRectangulo(base, altura));
            System.out.println("*********************************************");
        }else if (numArea == 3){
            System.out.println("********BIENVENIDO A AREA (TRIANGULO)**********");
            System.out.println("Brindame el valor de la base");
            double base = captu.nextInt();
            System.out.println("Brindame el valor de la altura");
            double altura =captu.nextInt();
            System.out.println("El area de un triangulo cuya base es de " + base + " y su altura es de " + altura + " es de " + areas.AreaTriangulo(base, altura));
            System.out.println("*********************************************");
        }else if (numArea == 4){
            System.out.println("********BIENVENIDO A AREA (CIRCULO)**********");
            System.out.println("Brindame el valor del radio");
            double radio = captu.nextInt();
            System.out.println("El area de un circulo cuyo radio es de " + radio + " es de " + areas.AreaCirculo(radio));
            System.out.println("*********************************************");
        }else if (numArea == 5){
            System.out.println("********BIENVENIDO A AREA (ROMBO)************");
            System.out.println("Brindame el valor de la Diagonal Mayor");
            double D = captu.nextInt();
            System.out.println("Brindame el valor de la Diagonal Menor");
            double d = captu.nextInt();
            System.out.println("El area de un rombo cuya diagonal mator es de " + D + " y su diagonal menor es de " + d + " es de " + areas.AreaRombo(D, d));
            System.out.println("*********************************************");
        }else if (numArea == 6){
            System.out.println("********BIENVENIDO A AREA (Trapecio)************");
            System.out.println("Brindame el valor de la Base Mayor");
            double base1 = captu.nextInt();
            System.out.println("Brindame el valor de la Base Menor");
            double base2 = captu.nextInt();
            System.out.println("Brindame el valor de la Altura");
            double altura = captu.nextInt();
            System.out.println("El area de un Trapecio cuya Base Mayor es de " + base1 + " su base menor es de  " + base2 + " y su altura es de " + " es de " + areas.AreaTrapecio(base1, base2, altura));
            System.out.println("*********************************************");
        }else{
            System.out.println("No es un numero valido vuelvelo a intentar");
        }
    }  
}
class Areas {
    public double AreaCuadrado(double lado){
        double areaCuadrado = lado*lado;
        return areaCuadrado;
    }    
    public double AreaRectangulo(double base, double altura){
        double areaRectangulo = base*altura;
        return areaRectangulo;
    }
    public double AreaTriangulo(double base, double altura){
        double areaTriangulo = (base*altura)/2;
        return areaTriangulo;
    }
    public double AreaCirculo(double radio){
        double areaCirculo = Math.PI*(radio*radio);
        return areaCirculo;
    }
    public double AreaRombo(double D, double d){
        double areaRombo = (D*d)/2;
        return areaRombo;
    }
    public double AreaTrapecio(double base1, double base2, double altura){
        double areaTrapecio = ((base1 + base2)*altura)/2;
        return areaTrapecio;
    }
}
