package Tarea3.Readers;

import Tarea3.Models.Empleado;

import java.util.Scanner;

public class EmpleadoReader {
    private final Scanner scanner;

    public EmpleadoReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Empleado read () {
        System.out.println("cual es el nif");
        String nif = scanner.nextLine();

        System.out.println("cual es el nombre");
        String name = scanner.nextLine();

        System.out.println("cual es el apellido");
        String lastName = scanner.nextLine();

        System.out.println("cual es su puesto");
        String job = scanner.nextLine();
        return new Empleado(nif, name, lastName, job);
    }

}
