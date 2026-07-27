package com.krakedev;

public class TestRectangulo {
    public static void main(String[] args) {
        Rectangulo c1 = new Rectangulo();

        c1.setAltura(4);
        c1.setBase(2);

        double resultadoC1 = c1.calcularPerimetro();
        System.out.println(resultadoC1);
    }
}
