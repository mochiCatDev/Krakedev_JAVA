package com.krakedev;

public class TestCuadrado {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado(), c2 = new Cuadrado(), c3 = new Cuadrado();

        c1.setLado(4);
        c2.setLado(10);
        c3.setLado(8);

        double resultadoC1Area = c1.calcularArea();
        double resultadoC1Perimetro = c1.calcularPerimetro();
        double resultadoC2Area = c2.calcularArea();
        double resultadoC2Perimetro = c2.calcularPerimetro();
        double resultadoC3Area = c3.calcularArea();
        double resultadoC3Perimetro = c3.calcularPerimetro();

        System.out.println("=== Primer Prueba (lado 4) ===");
        System.out.println("Area: %.2f".formatted(resultadoC1Area));
        System.out.println("Perimetro: %.2f".formatted(resultadoC1Perimetro));

        System.out.println("=== Primer Prueba (lado 10) ===");
        System.out.println("Area: %.2f".formatted(resultadoC2Area));
        System.out.println("Perimetro: %.2f".formatted(resultadoC2Perimetro));
    
        System.out.println("=== Primer Prueba (lado 8) ===");
        System.out.println("Area: %.2f".formatted(resultadoC3Area));
        System.out.println("Perimetro: %.2f".formatted(resultadoC3Perimetro));
    }
}
