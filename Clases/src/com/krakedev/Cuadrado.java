package com.krakedev;

public class Cuadrado {
    private int lado;

    // constructor
    public Cuadrado(int lado) { this.lado = lado; }

    // getter
    public int getLado() { return lado; }

    // setter
    public void setLado(int lado) { this.lado = lado; }

    public double calcularArea() {
        double resultado = Math.pow(lado, 2);
        return resultado;
    }

    public double calcularPerimetro() {
        double resultado = lado * 4;
        return resultado;
    }
}
