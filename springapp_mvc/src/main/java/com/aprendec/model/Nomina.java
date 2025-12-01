package com.aprendec.model;

import jakarta.persistence.*;

@Entity
@Table(name = "nomina")
public class Nomina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNomina;

    @Column(nullable = false)
    private String dniEmpleado;

    @Column(nullable = false)
    private int sueldo;

    @Column(nullable = false)
    private String nombreEmpleado;

    public Nomina() {}

    public Nomina(String dniEmpleado, int sueldo, String nombreEmpleado) {
        this.dniEmpleado = dniEmpleado;
        this.sueldo = sueldo;
        this.nombreEmpleado = nombreEmpleado;
    }

    public Integer getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public String getDniEmpleado() {
        return dniEmpleado;
    }

    public void setDniEmpleado(String dniEmpleado) {
        this.dniEmpleado = dniEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    @Override
    public String toString() {
        return "Nomina [idNomina=" + idNomina +
               ", dniEmpleado=" + dniEmpleado +
               ", nombreEmpleado=" + nombreEmpleado +
               ", sueldo=" + sueldo + "]";
    }
}
