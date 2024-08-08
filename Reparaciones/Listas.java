/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author galla
 */
public class Listas {

    private Queue<Reparacion> colaReparaciones;
    private Stack<Reparacion> historialR;

    public Listas() {
        this.colaReparaciones = new LinkedList<>();
        this.historialR = new Stack<>();
    }

    public void agregarR(Reparacion reparacion) {
        colaReparaciones.add(reparacion);
    }

    public void procesar() {
        if (!colaReparaciones.isEmpty()) {
            Reparacion reparacion = colaReparaciones.poll();
            reparacion.setEstado(Estado.Reparado);
            historialR.push(reparacion);
            JOptionPane.showMessageDialog(null, "Se proceso ");
        } else {
            JOptionPane.showMessageDialog(null, "no se ha procesado ");

        }
    }
}
