package com.krakedev.test;
import com.krakedev.Restaurante;

public class TestRestaurante {
    public static void main(String[] args) {
        Restaurante rest1 = new Restaurante("??", "??", 0);
        Restaurante rest2 = new Restaurante("??", "??", 0);
        
        String separador = "+---------------+-----------------+-----------------+--------------+";
        String cabecera  = "| %-13s | %-15s | %-15s | %-12s |";
        String fila      = "| %-13s | %-15s | %-15s | %-12.1f |";

        System.out.println("=== VALORES POR DEFECTO ===");
        System.out.println(separador);
        System.out.println(cabecera.formatted("Restaurante", "Nombre", "Dirección", "Calificación"));
        System.out.println(separador);
        System.out.println(fila.formatted("Restaurante 1", rest1.getNombre(), rest1.getDireccion(), rest1.getCalificacion()));
        System.out.println(fila.formatted("Restaurante 2", rest2.getNombre(), rest2.getDireccion(), rest2.getCalificacion()));
        System.out.println(separador);

        rest1.setNombre("La Sazón");
        rest1.setDireccion("Av. Central 123");
        rest1.setCalificacion(4.8);

        rest2.setNombre("El Buen Gusto");
        rest2.setDireccion("Calle 10 #45");
        rest2.setCalificacion(4.2);

        System.out.println("\n=== VALORES MODIFICADOS ===");
        System.out.println(separador);
        System.out.println(cabecera.formatted("Restaurante", "Nombre", "Dirección", "Calificación"));
        System.out.println(separador);
        System.out.println(fila.formatted("Restaurante 1", rest1.getNombre(), rest1.getDireccion(), rest1.getCalificacion()));
        System.out.println(fila.formatted("Restaurante 2", rest2.getNombre(), rest2.getDireccion(), rest2.getCalificacion()));
        System.out.println(separador);
    }
}
