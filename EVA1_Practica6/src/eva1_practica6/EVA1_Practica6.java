/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica6;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class EVA1_Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Formato_APA[] libro = new Formato_APA[3];
        libro[0] = new Formato_APA();
        //ARREGLO DE A 3 PARA QUE SEA MAS COMODO
        libro[0].setAutor("J.K. Rowling");
        libro[0].setTitulo("Harry Potter and the Philosopher's Stone");
        libro[0].setYear(1997);
        libro[0].setCiudad("London");
        libro[0].setProvincia("England");
        libro[0].setPais("United Kingdom");
        libro[0].setEditorial("Bloomsbury");
        libro[0].setPaginas(223);
        libro[0].imprimirDatos();
        //1
        libro[1] = new Formato_APA();
        libro[1].setAutor("F. Scott Fitzgerald");
        libro[1].setTitulo("The Great Gatsby");
        libro[1].setYear(1925);
        libro[1].setCiudad("New York");
        libro[1].setProvincia("New York");
        libro[1].setPais("United States");
        libro[1].setEditorial("Charles Scribner's Sons");
        libro[1].setPaginas(218);
        libro[1].imprimirDatos();
        //2
        libro[2] = new Formato_APA();
        libro[2].setAutor("Gabriel Garcia Marquez");
        libro[2].setTitulo("Cien anos de soledad");
        libro[2].setYear(1967);
        libro[2].setCiudad("Buenos Aires");
        libro[2].setProvincia("Buenos Aires");
        libro[2].setPais("Argentina");
        libro[2].setEditorial("Editorial Sudamericana");
        libro[2].setPaginas(217);
        libro[2].imprimirDatos();
        //3
    
    }
    //NOMBRE_CLASE identificador = new NOMBRE_CLASE();
    //Metodo que tiene el mismo nombre que la clase --> CONSTRUCTOR
    //TODAS LAS CLASES TIENEN UN CONSTRUCTOR
    //TODAS LAS CLASES PUEDEN TENER UNO O MAS CONSTRUCTORES
    }
