/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mecanicos;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author bizco
 */
public class listaMecanicos {

    private HashSet<mecanico> listaMecanico;

    public listaMecanicos(HashSet<mecanico> listaMecanico) {
        this.listaMecanico = listaMecanico = new HashSet();
    }

    public listaMecanicos() {
        this.listaMecanico = new HashSet();
    }

    public HashSet<mecanico> getListaMecanicos() {
        return listaMecanico;
    }

    public void agregarMecanico(mecanico mecanico) {
        listaMecanico.add(mecanico);
    }

    public void eliminarMecanico(String id) {
        Iterator<mecanico> iterator = listaMecanico.iterator();
        while (iterator.hasNext()) {
            mecanico m = iterator.next();
            if (m.getId().equals(id)) {
                iterator.remove();
                break;
            }
        }
    }

    public mecanico buscarMecanico(String id) {
        for (mecanico m : listaMecanico) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;

    }

    @Override
    public String toString() {
        return "listaMecanicos{" + "listaMecanico=" + listaMecanico + '}';
    }
    
}
