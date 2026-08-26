package com.krakedev.test;
import com.krakedev.Calculadora;

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();

        double r1, r2, r3;

        r1 = c1.multiplicar(10, 5);
        r2 = c1.dividir(10, 2);
        r3 = c1.promediar(10, 8, 9);

        // Ver resultados para verificar si todo esta bien
        System.out.println("Resultado de la multiplicación entre 10 y 5: %.2f".formatted(r1));
        System.out.println("Resultado de la división entre 10 y 2: %.2f".formatted(r2));
        System.out.println("Resultado de promediar 10, 8 y 9: %.2f".formatted(r3));

        // Funcion que no retorna nada, ejecuta un mensaje por consola
        System.out.print("=== Mensaje del metodo mostrarResultado() ===\n");
        c1.mostrarResultado();
    }
}
