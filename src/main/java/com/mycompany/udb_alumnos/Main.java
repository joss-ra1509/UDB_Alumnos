/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udb_alumnos;
//add
/**
 *
 * @author vc758
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n--- MENU UDB VIRTUAL ---");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar todos los alumnos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    ingresarAlumno();
                    break;
                case 2:
                    buscarAlumno();
                    break;
                case 3:
                    eliminarAlumno();
                    break;
                case 4:
                    mostrarAlumnos();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 5);
    }

    // Ingresar alumno
    public static void ingresarAlumno() {
        System.out.print("Ingrese carnet: ");
        String carnet = sc.nextLine();

        System.out.print("Ingrese nombre completo: ");
        String nombre = sc.nextLine();

        listaAlumnos.add(new Alumno(carnet, nombre));
        System.out.println("Alumno ingresado exitosamente");
    }

    // Buscar alumno
    public static void buscarAlumno() {
        System.out.print("Ingrese carnet a buscar: ");
        String carnet = sc.nextLine();

        for (Alumno a : listaAlumnos) {
            if (a.getCarnet().equals(carnet)) {
                System.out.println(a);
                return;
            }
        }
        System.out.println("Alumno no encontrado, no se puede Mostrar");
    }

    // Eliminar alumno
    public static void eliminarAlumno() {
        System.out.print("Ingrese carnet a eliminar: ");
        String carnet = sc.nextLine();

        for (Alumno a : listaAlumnos) {
            if (a.getCarnet().equals(carnet)) {
                listaAlumnos.remove(a);
                System.out.println("Alumno eliminado exitosamente");
                return;
            }
        }
        System.out.println("Alumno no encontrado, no se puede Eliminar");
    }

    // Mostrar todos
    public static void mostrarAlumnos() {
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            for (Alumno a : listaAlumnos) {
                System.out.println(a);
            }
        }
    }
}

