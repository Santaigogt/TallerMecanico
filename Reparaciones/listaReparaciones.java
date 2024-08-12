/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import Mecanicos.mecanico;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class listaReparaciones {
    private Queue<Reparacion> colaReparaciones;
    private Stack<Reparacion> historialReparaciones;
    public listaReparaciones() {
        colaReparaciones = new LinkedList<>();
        historialReparaciones = new Stack<>();
    }
    public void agregarReparacion(String id, mecanico mecanico, String descripcion) {
        Reparacion reparacion = new Reparacion(id, mecanico, LocalDate.now(), descripcion, Estado.Espera);
        colaReparaciones.add(reparacion);
        System.out.println("Reparación añadida a la cola: " + reparacion);
    }

    public void realizarReparacion() {
        if (!colaReparaciones.isEmpty()) {
            Reparacion reparacion = colaReparaciones.poll();
            reparacion.setEstado(Estado.Reparado);
            historialReparaciones.push(reparacion);
            System.out.println("Reparación realizada: " + reparacion);
        } else {
            System.out.println("No hay reparaciones en la cola.");
        }
    }

    public void mostrarHistorial() {
        if (historialReparaciones.isEmpty()) {
            System.out.println("No hay reparaciones realizadas.");
        } else {
            System.out.println("Historial de reparaciones realizadas:");
            for (Reparacion reparacion : historialReparaciones) {
                System.out.println(reparacion);
            }
        }
    }

    public void mostrarReparacionesPendientes() {
        if (colaReparaciones.isEmpty()) {
            System.out.println("No hay reparaciones en espera.");
        } else {
            System.out.println("Reparaciones en espera:");
            for (Reparacion reparacion : colaReparaciones) {
                System.out.println(reparacion);
            }
        }
    }
}

