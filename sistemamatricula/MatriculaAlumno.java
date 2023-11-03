/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamatricula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
class MatriculaAlumno {
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void añadirAlumno() {
        System.out.println("Ingrese el nombre del alumno:");
        String nombre = scanner.next();
        System.out.println("Ingrese la edad del alumno:");
        int edad = scanner.nextInt();
        Alumno alumno = new Alumno(nombre, edad);
        listaAlumnos.add(alumno);
        System.out.println("Alumno añadido exitosamente.");
    }

    public void eliminarAlumno() {
        System.out.println("Ingrese el nombre del alumno a eliminar:");
        String nombre = scanner.next();
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                listaAlumnos.remove(alumno);
                System.out.println("Alumno eliminado.");
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    public void modificarAlumno() {
        System.out.println("Ingrese el nombre del alumno a modificar:");
        String nombre = scanner.next();
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ingrese el nuevo nombre del alumno:");
                alumno.setNombre(scanner.next());
                System.out.println("Ingrese la nueva edad del alumno:");
                alumno.setEdad(scanner.nextInt());
                System.out.println("Alumno modificado exitosamente.");
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    public void mostrarAlumnos() {
        System.out.println("Lista de Alumnos:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }

    public void opcionAdicional1() {
        System.out.println("Opción adicional 1 seleccionada.");
    }

    public void opcionAdicional2() {
        System.out.println("Opción adicional 2 seleccionada.");
    }

    public void opcionAdicional3() {
        System.out.println("Opción adicional 3 seleccionada.");
    }

    public void salir() {
        System.out.println("Saliendo del programa.");
        System.exit(0);
    }
}
