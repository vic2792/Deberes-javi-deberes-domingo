package Tarea3.Models;

import java.util.Arrays;
import java.util.Objects;

public class Departamento {
    private String name;
    private int budget;
    private Empleado[] employee;

    public Departamento(String name, int budget, Empleado[] employee) {
        this.name = name;
        this.budget = budget;
        this.employee = employee;
    }
    public void showInfo(){
        System.out.println("nombre: " + name);
        System.out.println("budget = " + budget);
        for (int i = 0; i < employee.length; i++) {
            employee[i].showInfo();
        }
    }
    public void showEmployees(){
        for (Empleado empleado:employee){
            empleado.showInfo();
        }
    }
    public void employeeNif(String nif) {
        for (Empleado empleado:employee) {
            if(empleado.getNif().equals(nif)) {
                empleado.showInfo();
            }
        }
    }
    public boolean hasNif(String nif){
        for (Empleado empleado:employee){
            if(empleado.getNif().equals(nif)) {
                return true;
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

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Empleado[] getEmployee() {
        return employee;
    }

    public void setEmployee(Empleado[] employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return budget == that.budget && Objects.equals(name, that.name) && Objects.deepEquals(employee, that.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, budget, Arrays.hashCode(employee));
    }
}
