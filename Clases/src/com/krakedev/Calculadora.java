package com.krakedev;

public class Calculadora {
    public double multiplicar(double valor1, double valor2) {
        double resultado = valor1 * valor2;
        return resultado;
    };

    public double dividir(double dividiendo, double divisor) {
        double resultado = dividiendo / divisor;
        return resultado;
    };

    public double promediar(double valor1, double valor2, double valor3) {
        double resultado = (valor1 + valor2 + valor3)/3;
        return resultado;
    };
}
