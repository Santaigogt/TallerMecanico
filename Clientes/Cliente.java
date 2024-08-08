/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author javierortizdobles
 */
public class Cliente {
    private int id;
    private String nombre;
    private String telefono;
    private String direccion;

    public Cliente(int id, String nombre, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Cliente() {
        this(0,"","","");
    }
    
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
    
    
            
    
}
