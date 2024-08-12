/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerMecanico.Reparaciones;

import TallerMecanico.Mecanicos.mecanico;
import java.time.LocalDate;

/**
 *
 * @author galla
 */
public class Reparacion {
    
    private String id;
    private mecanico mecanico;
    private LocalDate fecha;
    private String descripcion;
    private Estado estado;

    public String getId() {
        return id;
    }

    public mecanico getMecanico() {
        return mecanico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Reparacion(String id, mecanico mecanico, LocalDate fecha, String descripcion, Estado estado) {
        this.id = id;
        this.mecanico = mecanico;
        this.fecha = LocalDate.now();
        this.descripcion = descripcion;
        this.estado = Estado.Espera;
    }

   
        public Reparacion() {
        this.id = "";
        this.mecanico = null;
        this.fecha = LocalDate.now();
        this.descripcion = "";
        this.estado = Estado.Espera; 
    }

    @Override
    public String toString() {
        return "Reparacion{" + "id=" + id + ", mecanico=" + mecanico + ", fecha=" + fecha + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }

    
    
}