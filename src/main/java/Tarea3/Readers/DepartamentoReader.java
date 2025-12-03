package Tarea3.Readers;

import Tarea3.Models.Departamento;
import Tarea3.Models.Empleado;

import java.util.Scanner;

public class DepartamentoReader {
    private final Scanner scanner;
    private final EmpleadoReader empleadoReader;

    public DepartamentoReader(Scanner scanner, EmpleadoReader empleadoReader) {
        this.scanner = scanner;
        this.empleadoReader = empleadoReader;
    }
    public Departamento read(){
        System.out.println("cual es el nombre");
        String name = scanner.nextLine();

        System.out.println("cual es el presupuesto");
        int budget = scanner.nextInt();
        scanner.nextLine();

        System.out.println("cuantos trabajadores tengo");
        int number = scanner.nextInt();
        scanner.nextLine();
        Empleado[] empleados = new Empleado[number];
        for (int i = 0; i < number; i++) {
            empleados[i] = empleadoReader.read();
        }
        return new Departamento(name, budget,empleados);
    }
}
