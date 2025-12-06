package com.aprendec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @Column(name = "dni")
    private String dni;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private char sexo;

    @Column(nullable = false)
    private int categoria;

    @Column(name = "anyos", nullable = false)
    private int anyos;

    public Empleado() {
    }

    public Empleado(String dni, String nombre, char sexo, int categoria, int anyos) {
        this.dni = dni;
        this.nombre = nombre;
        this.sexo = sexo;
        this.categoria = categoria;
        this.anyos = anyos;
    }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public char getSexo() { return sexo; }
    public void setSexo(char sexo) { this.sexo = sexo; }

    public int getCategoria() { return categoria; }
    public void setCategoria(int categoria) { this.categoria = categoria; }

    public int getAnyos() { return anyos; }
    public void setAnyos(int anyos) { this.anyos = anyos; }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", categoria=" + categoria +
                ", anyos=" + anyos +
                '}';
    }
}
