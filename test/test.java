/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author bizco
 */
import Mecanicos.listaMecanicos;
import Mecanicos.mecanico;
import Reparaciones.listaReparaciones;
public class test {
  
   
    public static void main(String[] args) {
    listaReparaciones lista = new listaReparaciones();
/*
             mecanico mecanic = new mecanico("1","Samuel", "buses");
     listaMecanicos list = new listaMecanicos();
        System.out.println("nuevo ");
        System.out.println(list);
    
    */
  
        mecanico mecanico1 = new mecanico("1","Samuel", "buses");
        mecanico mecanico2 = new mecanico("2","dylan", "motos");


        lista.agregarReparacion("REPO01", mecanico1, "Cambio de aceite");
        lista.agregarReparacion("REPO02", mecanico2, "Reparación de frenos");
        lista.agregarReparacion("REPO03", mecanico1, "Ajuste de motor");

        System.out.println("\nReparaciones pendientes:");
        lista.mostrarReparacionesPendientes();

        System.out.println("\nRealizando una reparacion...");
        lista.realizarReparacion();

        System.out.println("\nReparaciones pendientes después de realizar una:");
        lista.mostrarReparacionesPendientes();

        System.out.println("\nHistorial de reparaciones realizadas:");
        lista.mostrarHistorial();
    }
}
