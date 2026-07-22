package com.krakedev;

public class TestPlato {

    public static void main(String[] args) {
        Plato platoA = new Plato();
        Plato platoB = new Plato();
        Plato platoC = new Plato();

        String separador = "+-------+---------------------+---------------+----------+------------+";
        String cabecera  = "| %-5s | %-19s | %-13s | %-8s | %-10s |";
        String fila      = "| %-5s | %-19s | %-13s | $%-7.2f | %-10b |";

        System.out.println("=== VALORES POR DEFECTO ===");
        System.out.println(separador);
        System.out.println(cabecera.formatted("Plato", "Nombre", "Tipo", "Precio", "Disponible"));
        System.out.println(separador);
        System.out.println(fila.formatted("A", platoA.nombre, platoA.tipo, platoA.precio, platoA.disponible));
        System.out.println(fila.formatted("B", platoB.nombre, platoB.tipo, platoB.precio, platoB.disponible));
        System.out.println(fila.formatted("C", platoC.nombre, platoC.tipo, platoC.precio, platoC.disponible));
        System.out.println(separador);

        platoA.nombre = "Empanadas Viento";
        platoA.tipo = "Entrada";
        platoA.precio = 2.50;
        platoA.disponible = true;

        platoB.nombre = "Seco de Chivo";
        platoB.tipo = "Plato fuerte";
        platoB.precio = 8.00;
        platoB.disponible = true;

        platoC.nombre = "Flan de Coco";
        platoC.tipo = "Postre";
        platoC.precio = 3.00;
        platoC.disponible = false;

        System.out.println("\n=== VALORES MODIFICADOS ===");
        System.out.println(separador);
        System.out.println(cabecera.formatted("Plato", "Nombre", "Tipo", "Precio", "Disponible"));
        System.out.println(separador);
        System.out.println(fila.formatted("A", platoA.nombre, platoA.tipo, platoA.precio, platoA.disponible));
        System.out.println(fila.formatted("B", platoB.nombre, platoB.tipo, platoB.precio, platoB.disponible));
        System.out.println(fila.formatted("C", platoC.nombre, platoC.tipo, platoC.precio, platoC.disponible));
        System.out.println(separador);
    }
}
