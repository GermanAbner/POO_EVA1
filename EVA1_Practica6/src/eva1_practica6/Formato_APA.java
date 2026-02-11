/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_practica6;

/**
 *
 * @author Usuario
 */
public class Formato_APA {
    //**************DECLARACION DE VARIABLES*****************************
    private String Autor;
    private String Titulo;
    private int Year;
    private String Ciudad;
    private String Provincia;
    private String Pais;
    private String Editorial;
    private int Paginas;
    //**************DECLARACION DE VARIABLES*****************************
    //*******************************************************************
    //**************COMPORTAMIENTOS*****************************
    public String getAutor(){
        return Autor;
    }
    public void setAutor(String valor){
        Autor = valor;
    }
    public String getTitulo(){
        return Titulo;
    }
    public void setTitulo(String valor){
        Titulo = valor;
    }
    public int getYear(){
        return Year;
    }
    public void setYear(int valor){
        Year = valor;
    }
    public String getCiudad(){
        return Ciudad;
    }
    public void setCiudad(String valor){
        Ciudad = valor;
    }
    public String getProvincia(){
        return Provincia;
    }
    public void setProvincia(String valor){
        Provincia = valor;
    }
    public String getPais(){
        return Pais;
    }
    public void setPais(String valor){
        Pais = valor;
    }
    public String getEditorial(){
        return Editorial;
    }
    public void setEditorial(String valor){
        Editorial = valor;
    }
    public int getPaginas(){
        return Paginas;
    }
    public void setPaginas(int valor){
        Paginas = valor;
    }
    //**************COMPORTAMIENTOS*****************************
    //*******************************************************************
    //***************IMPRIMIR LOS DATOS*****************************************
    public void imprimirDatos(){
        System.out.println("********DATOS DEL LIBRO**********");
        System.out.println("Autor: " + Autor);
        System.out.println("Titulo: " + Titulo);
        System.out.println("Ano: " + Year);
        System.out.println("Ciudad: " + Ciudad);
        System.out.println("Provincia: " + Provincia);
        System.out.println("Pais: " + Pais);
        System.out.println("Editorial: " + Editorial);
        System.out.println("Paginas: " + Paginas);
        System.out.println("********DATOS DEL LIBRO**********");
        }
}
  
