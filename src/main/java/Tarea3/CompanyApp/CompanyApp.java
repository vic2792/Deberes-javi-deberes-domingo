package Tarea3.CompanyApp;

import Tarea3.Models.Departamento;
import Tarea3.Models.Empresa;
import Tarea3.Readers.DepartamentoReader;
import Tarea3.Readers.EmpleadoReader;
import Tarea3.Readers.EmpresaReader;

import java.util.Scanner;

public class CompanyApp {
    public CompanyApp() {
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        EmpleadoReader empleadoReader = new EmpleadoReader(scanner);
        DepartamentoReader departamentoReader = new DepartamentoReader(scanner, empleadoReader);
        EmpresaReader empresaReader = new EmpresaReader(scanner, departamentoReader);

        System.out.println("dame los datos de la empresa");
        Empresa e1 = empresaReader.read();
        int option;
        do {
            System.out.println("elige una opcion");
            System.out.println("1. Buscar el deparmento y muestra los datos");
            System.out.println("2. Buscar los empleados y el departamento");
            System.out.println("3. Mostrar el departamento segun el departamento");


            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("danos el nombre del departamento que desea buscar");
                String name = scanner.nextLine();
                if (e1.hasDepartment(name)) {
                    e1.findDepartment(name);
                } else {
                    System.out.println("no se encuentra el departamento");
                }
            } else if (option == 2) {
                System.out.println("danos el nombre del departamento que desea mostrar los empleados");
                String name1 = scanner.nextLine();
                if (e1.hasDepartment(name1)) {
                    e1.showEmployees(name1);
                } else {
                    System.out.println("no se encuentra el departamento");
                }
            } else if (option == 3) {
                System.out.println("dame el nombre del departamento");
                String name2 = scanner.nextLine();
                System.out.println("dame el nif");
                String nif = scanner.nextLine();
                if (e1.hasDepartment(name2)) {

                    if (e1.hasEmployee( name2,nif)) {
                        e1.findEmployee(name2,nif);
                    }
                }

            }
        } while (option != 5);


    }


}

