/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerMecanico.test;

/**
 *
 * @author bizco
 */
import TallerMecanico.Mecanicos.listaMecanicos;
import TallerMecanico.Mecanicos.mecanico;
public class test {
  
   
    public static void main(String[] args) {
         mecanico mecanic = new mecanico("1","Samuel", "buses");
     listaMecanicos list = new listaMecanicos();
        System.out.println("nuevo ");
        System.out.println(list);
        list.agregarMecanico(mecanic);
        System.out.println(list);
        list.buscarMecanico("1");
        System.out.println("Eliminar");
        list.eliminarMecanico("1");
        System.out.println(list);
        System.out.println("buscar");
        list.buscarMecanico("1");
    }
}
