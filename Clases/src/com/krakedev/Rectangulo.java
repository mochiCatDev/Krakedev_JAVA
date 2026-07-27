package com.krakedev;

public class Rectangulo {
    private double base, altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // getter
    public double getBase() { return base; }
    public double getAltura() { return altura; }

    // setter
    public void setBase(double base) { this.base = base; }
    public void setAltura(double altura) { this.altura = altura; }

    public double calcularPerimetro() {
        double perimetro = 2 * base + 2 * altura;
        return perimetro;
    }
}
