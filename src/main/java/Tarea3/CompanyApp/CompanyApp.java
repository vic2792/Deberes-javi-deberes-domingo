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
    public void run () {
        Scanner scanner = new Scanner(System.in);
        EmpleadoReader empleadoReader = new EmpleadoReader(scanner);
        DepartamentoReader departamentoReader = new DepartamentoReader(scanner,empleadoReader);
        EmpresaReader empresaReader = new EmpresaReader(scanner, departamentoReader);

        System.out.println("dame los datos de la empresa");
        Empresa e1 = empresaReader.read ();
        System.out.println("danos el nombre del departamento que desea buscar");
        String name = scanner.nextLine();
        if(e1.hasDepartment(name)){
            e1.findDepartment(name);
        } else {
            System.out.println("no se encuentra el departamento");
        }
        System.out.println("danos el nombre del departamento que desea mostrar los empleados");
        String name1 = scanner.nextLine();
        if (e1.hasDepartment(name1)){
            e1.showEmployees(name1);
        }else {
            System.out.println("no se encuentra el departamento");
        }
        System.out.println("dame el nombre del departamento");
        String name2 = scanner.nextLine();
        System.out.println("dame el nif");
        String nif = scanner.nextLine();
         e1.findEmployee();
//        if (e1.hasDepartment(name)){
//
//        }else {
//            System.out.println("no se encuentra el departamento");
//
//        }
    }
}
