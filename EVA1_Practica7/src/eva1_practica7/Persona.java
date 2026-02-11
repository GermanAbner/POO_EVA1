/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_practica7;

/**
 *
 * @author Usuario
 */
public class Persona {

    //ATRIBUTOS
    private String Nombre;
    private String Apellido;
    private int Edad;
    //CONSTRUCTORES
    
    //MODIFICADOR DE ACCESO NOMBRE_CLASE(ARGUMENTOS)[CUERPO DEL CONSTRUCTOR]
    public Persona(){
        //SE USAN PARA INICIALIZAR LOS OBJETOS
        //SIEMPRE SE DECLARA AQUI String NOMBRE = a; (AQUI SE HACE JUAJUAS)
        System.out.println("EJECUCION DEL CONSTRUCTOR");
        Nombre = "-----";
        Apellido = "-----";
        Edad = 0;
    }
            //FIRMA
    public Persona(String Nombre,String Apellido,int Edad){
        //THIS -->> APUNTADOR A TODO EL CONTENIDO DEL OBJETO
        //METODOS Y ATRIBUTOS DEFINIDOS EN LA CLASE, SIN IMPORTAR
        
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        
        //ESTA ES LA CLASE //ESTO ES EL METODO
    }
    
    //COMPORTAMIENTO
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String valor){
        Nombre = valor;
    }
    public String getApellido(){
        return Apellido;
    }
    public void setApellido(String valor){
        Apellido = valor;
    }
    public int getEdad(){
        return Edad;
    }
    public void setEdad(int valor){
        Edad = valor;
    }
    public void imprimirDatos(){
        System.out.println("----DATOS DE LA PERSONA----");
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Edad: " + Edad);
    }
}
