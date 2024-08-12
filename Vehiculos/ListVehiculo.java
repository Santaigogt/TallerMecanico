/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerMecanico.Vehiculos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jcone
 */
public class ListVehiculo {

    ArrayList<Vehiculo> vehiculos;

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public ListVehiculo(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos = new ArrayList();
    }

    public ListVehiculo() {
        this(new ArrayList());
    }

    public void agregar(Vehiculo vehi) {
        vehiculos.add(vehi);
    }

    public boolean eliminar(String matricula) {
        for (Iterator<Vehiculo> it = this.vehiculos.iterator(); it.hasNext();) {
            if (matricula.equals(it.next().getMatricula())) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public Vehiculo buscar(String matricula) {
        for(Vehiculo vehi : vehiculos){
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
