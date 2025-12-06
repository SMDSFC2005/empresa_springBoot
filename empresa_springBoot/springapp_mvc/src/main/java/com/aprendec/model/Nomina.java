package com.aprendec.model;

import jakarta.persistence.*;

@Entity
@Table(name = "nominas")
public class Nomina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nomina")
    private Integer idNomina;

    @Column(name = "dni_empleado", nullable = false)
    private String dniEmpleado;

    @Column(nullable = false)
    private int sueldo;

    @Transient
    private String nombreEmpleado;

    public Nomina() {
    }

    public Nomina(Integer idNomina, String dniEmpleado, int sueldo, String nombreEmpleado) {
        this.idNomina = idNomina;
        this.dniEmpleado = dniEmpleado;
        this.sueldo = sueldo;
        this.nombreEmpleado = nombreEmpleado;
    }

    public Integer getIdNomina() { return idNomina; }
    public void setIdNomina(Integer idNomina) { this.idNomina = idNomina; }

    public String getDniEmpleado() { return dniEmpleado; }
    public void setDniEmpleado(String dniEmpleado) { this.dniEmpleado = dniEmpleado; }

    public int getSueldo() { return sueldo; }
    public void setSueldo(int sueldo) { this.sueldo = sueldo; }

    public String getNombreEmpleado() { return nombreEmpleado; }
    public void setNombreEmpleado(String nombreEmpleado) { this.nombreEmpleado = nombreEmpleado; }

    @Override
    public String toString() {
        return "Nomina{" +
                "idNomina=" + idNomina +
                ", dniEmpleado='" + dniEmpleado + '\'' +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
