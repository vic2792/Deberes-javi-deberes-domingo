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
