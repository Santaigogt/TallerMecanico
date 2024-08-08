/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jcone
 */
public class ListVehiculo {

    ArrayList<vehiculo> vehiculos;

    public ArrayList<vehiculo> getVehiculos() {
        return vehiculos;
    }

    public ListVehiculo(ArrayList<vehiculo> vehiculos) {
        this.vehiculos = vehiculos = new ArrayList();
    }

    public ListVehiculo() {
        this(new ArrayList());
    }

    public void agregar(vehiculo vehi) {
        vehiculos.add(vehi);
    }

    public boolean eliminar(String matricula) {
        for (Iterator<vehiculo> it = this.vehiculos.iterator(); it.hasNext();) {
            if (matricula.equals(it.next().getMatricula())) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public vehiculo buscar(String matricula) {
        for(vehiculo vehi : vehiculos){
            if(matricula.equals(vehi.getMatricula())){
                return vehi;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ListVehiculo{" + "vehiculos=" + vehiculos + '}';
    }

}
