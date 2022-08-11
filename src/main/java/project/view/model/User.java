/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.view.model;

/**
 *
 * @author David
 */
public class User {
    private Integer id;
    private String nombre;
    private String apellido;
    private String edad;
    private String pais;
    private String dni;
    
    public Integer getId(){
       return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getEdad(){
        return edad;
    }
    public void setEdad(String edad){
        this.edad = edad;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
}
