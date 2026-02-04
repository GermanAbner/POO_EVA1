/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica1;

/**
 *
 * @author Usuario
 */
public class EVA1_Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //UNA CLASE SIRVE PARA CREAR OBJETOS
        //1.-DECLARAR UN IDENTIFICADOR DEL TIPO DE LA CLASE
        Persona perso1;
        //2.-INSTANCIAR EL OBJETO --> new (crea el objeto en memoria principal)
        // identificador = new NOMBRE_DE_LA_CLASE(argumento);
        perso1 = new Persona(); 
        System.out.println("*****************************");
        System.out.println(perso1);//REFERENCIA
        Persona perso2 = perso1 = new Persona();       
        System.out.println("*****************************");
        System.out.println(perso2);
        System.out.println("*****************************");
        perso1.apellido = "Rangel"; /*QUE SALGA TODO ESO ES PORQUE LO ESTA HEREDANDO POR OTRO LADO*/
        perso1.nombre = "German";/*QUE SALGA TODO ESO ES PORQUE LO ESTA HEREDANDO POR OTRO LADO*/
        perso1.edad = 18;/*QUE SALGA TODO ESO ES PORQUE LO ESTA HEREDANDO POR OTRO LADO*/
        perso1.imprimir();
        System.out.println("*****************************");
        perso2.apellido = "Ana";
        perso2.edad = 30;
        perso2.nombre = "Gonzalez";
        perso2.imprimir();
        System.out.println("*****************************");
    }
    
}
    
    //CLASES INICIAN EN MAYUSCULA
    //MiClasePersona
    //TODAS LAS CLASES SON TIPOS DE DATOS ABSTRACTOS
    //sirven para guardar datos
    /*NO PUEDE IR PUBLIC AQUI PORQUE SOLO PUEDE TENER 1 SOLO PUBLIC POR ARCHIVO EN */class Persona{
        //ESTADO --> DATOS(VARIABLES) --> ATRIBUTOS
        String nombre;
        String apellido;
        int edad;
        //Comportamiento --> Metodos
        void imprimir() {
            
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellidos: " + apellido);
            System.out.println("Edad: " + edad);
            
        }
    }