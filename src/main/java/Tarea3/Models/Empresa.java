package Tarea3.Models;

import java.util.Arrays;
import java.util.Objects;

public class Empresa {
    private String name;
    private String cif;
    private Departamento[] departamentos;

    public Empresa(String name, String cif, Departamento[] departamentos) {
        this.name = name;
        this.cif = cif;
        this.departamentos = departamentos;
    }
    public void findDepartment(String name){
        for (Departamento departamento: departamentos) {
            if (departamento.getName().equals(name)){
                departamento.showInfo();
            }
        }
    }
    public boolean hasDepartment(String name){
        for (Departamento departamento: departamentos) {
            if (departamento.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public void showEmployees(String name){
        for(Departamento departamento: departamentos) {
            if (departamento.getName().equals(name)){
                departamento.showEmployees();
            }
        }
    }
    public void findEmployee(String name, String nif){
        for (Departamento departamento: departamentos) {
            if(departamento.getName().equals(name)){
                if (departamento.hasNif(nif)) {
                    departamento.employeeNif(nif);
                }
            }
        }
    }
    public boolean hasEmployee(String name, String nif){
        for (Departamento departamento: departamentos) {
            if (departamento.getName().equals(name)){
                if (departamento.hasNif(nif)){
                    return true;
                }
            }
        }
        return false;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(name, empresa.name) && Objects.equals(cif, empresa.cif) && Objects.deepEquals(departamentos, empresa.departamentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cif, Arrays.hashCode(departamentos));
    }
}
