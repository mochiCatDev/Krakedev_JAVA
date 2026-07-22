package com.krakedev;

public class TestRestaurante {

    public static void main(String[] args) {
        Restaurante rest1 = new Restaurante();
        Restaurante rest2 = new Restaurante();
        
        String separador = "+---------------+-----------------+-----------------+--------------+";
        String cabecera  = "| %-13s | %-15s | %-15s | %-12s |";
        String fila      = "| %-13s | %-15s | %-15s | %-12.1f |";

        System.out.println("=== VALORES POR DEFECTO ===");
        System.out.println(separador);
        System.out.println(cabecera.formatted("Restaurante", "Nombre", "Dirección", "Calificación"));
        System.out.println(separador);
        System.out.println(fila.formatted("Restaurante 1", rest1.nombre, rest1.direccion, rest1.calificacion));
        System.out.println(fila.formatted("Restaurante 2", rest2.nombre, rest2.direccion, rest2.calificacion));
        System.out.println(separador);

        rest1.nombre = "La Sazón";
        rest1.direccion = "Av. Central 123";
        rest1.calificacion = 4.8;

        rest2.nombre = "El Buen Gusto";
        rest2.direccion = "Calle 10 #45";
        rest2.calificacion = 4.2;

        System.out.println("\n=== VALORES MODIFICADOS ===");
        System.out.println(separador);
        System.out.println(cabecera.formatted("Restaurante", "Nombre", "Dirección", "Calificación"));
        System.out.println(separador);
        System.out.println(fila.formatted("Restaurante 1", rest1.nombre, rest1.direccion, rest1.calificacion));
        System.out.println(fila.formatted("Restaurante 2", rest2.nombre, rest2.direccion, rest2.calificacion));
        System.out.println(separador);
    }
}
