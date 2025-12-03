package Tarea3.Readers;

import Tarea3.Models.Departamento;
import Tarea3.Models.Empresa;

import java.util.Scanner;

public class EmpresaReader {
    private final Scanner scanner;
    private final DepartamentoReader departamentoReader;

    public EmpresaReader(Scanner scanner, DepartamentoReader departamentoReader) {
        this.scanner = scanner;
        this.departamentoReader = departamentoReader;
    }

    public Empresa read() {
        System.out.println("cual es el nombre");
        String name = scanner.nextLine();

        System.out.println("cual es tu cif");
        String cif = scanner.nextLine();

        System.out.println("cuantos departamentos tiene tu empresa");
        int number = scanner.nextInt();
        scanner.nextLine();
        Departamento[] departamentos = new Departamento[number];
        for (int i = 0; i < number; i++) {
            departamentos[i] = departamentoReader.read();
        }
        return new Empresa(name, cif, departamentos);
    }
}
