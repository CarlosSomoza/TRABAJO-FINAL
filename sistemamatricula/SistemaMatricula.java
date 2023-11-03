/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemamatricula;

/**
 *
 * @author carlo
 */
public class SistemaMatricula {
    public static void main(String[] args) {
        MatriculaAlumno matricula = new MatriculaAlumno();
        
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Añadir Alumno");
            System.out.println("2. Eliminar Alumno");
            System.out.println("3. Modificar Alumno");
            System.out.println("4. Mostrar Alumnos");
            System.out.println("5. Opción adicional 1");
            System.out.println("6. Opción adicional 2");
            System.out.println("7. Opción adicional 3");
            System.out.println("8. Salir");
            
            int opcion = matricula.scanner.nextInt();
            switch (opcion) {
                case 1:
                    matricula.añadirAlumno();
                    break;
                case 2:
                    matricula.eliminarAlumno();
                    break;
                case 3:
                    matricula.modificarAlumno();
                    break;
                case 4:
                    matricula.mostrarAlumnos();
                    break;
                case 5:
                    matricula.opcionAdicional1();
                    break;
                case 6:
                    matricula.opcionAdicional2();
                    break;
                case 7:
                    matricula.opcionAdicional3();
                    break;
                case 8:
                    matricula.salir();
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
  

