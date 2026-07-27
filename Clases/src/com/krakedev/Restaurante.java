package com.krakedev;

public class Restaurante {
	private String nombre;
	private String direccion;
	private double calificacion;

    // Constructor
    public Restaurante(String nombre, String direccion, double calificacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.calificacion = calificacion;
    }

    // Getter
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public double getCalificacion() { return calificacion; }

    // Setter
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setCalificacion(double calificacion) { this.calificacion = calificacion; }
}
