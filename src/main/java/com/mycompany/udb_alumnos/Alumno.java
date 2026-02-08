/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udb_alumnos;
// add
/**
 *
 * @author vc758
 */
public class Alumno {
    private String carnet;
    private String nombreCompleto;

    public Alumno(String carnet, String nombreCompleto) {
        this.carnet = carnet;
        this.nombreCompleto = nombreCompleto;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    @Override
    public String toString() {
        return "Carnet: " + carnet + " | Nombre: " + nombreCompleto;
    }
}
