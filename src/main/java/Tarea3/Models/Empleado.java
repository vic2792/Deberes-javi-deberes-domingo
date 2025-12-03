package Tarea3.Models;

import java.util.Objects;

public class Empleado {
    private String nif;
    private String name;
    private String lastName;
    private String job;

    public Empleado(String nif, String name, String lastName, String job) {
        this.nif = nif;
        this.name = name;
        this.lastName = lastName;
        this.job = job;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(nif, empleado.nif) && Objects.equals(name, empleado.name) && Objects.equals(lastName, empleado.lastName) && Objects.equals(job, empleado.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, lastName, job);
    }
}
