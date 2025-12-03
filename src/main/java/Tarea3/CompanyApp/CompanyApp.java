package Tarea3.CompanyApp;

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
    }
}
