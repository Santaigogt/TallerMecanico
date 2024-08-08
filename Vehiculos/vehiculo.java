/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author jcone
 */

   public class Vehiculo {
    private String matricula;
    private String modelo;
    private String marca;
    private int añoFabricacion;

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public Vehiculo(String matricula, String modelo, String marca, int añoFabricacion) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.añoFabricacion = añoFabricacion;
    }


    public Vehiculo() {
        this("", "", "", 0);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", a\u00f1oFabricacion=" + añoFabricacion + '}';
    }
} 

