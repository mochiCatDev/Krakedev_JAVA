package com.krakedev;

public class Plato {
	private String nombre;
    private String tipo;
    private double precio;
    private boolean disponible;

    // Getter
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public double getPrecio() { return precio; }
    public boolean getDisponible() { return disponible; }

    // Setter
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
}
