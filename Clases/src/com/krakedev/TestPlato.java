package com.krakedev;

public class TestPlato {

    public static void main(String[] args) {
        Plato platoA = new Plato("??", "??", 0, false);
        Plato platoB = new Plato("??", "??", 0, false);
        Plato platoC = new Plato("??", "??", 0, false);

        String separador = "+-------+---------------------+---------------+----------+------------+";
        String cabecera  = "| %-5s | %-19s | %-13s | %-8s | %-10s |";
        String fila      = "| %-5s | %-19s | %-13s | $%-7.2f | %-10b |";

        System.out.println("=== VALORES POR DEFECTO ===");
        System.out.println(separador);
        System.out.println(cabecera.formatted("Plato", "Nombre", "Tipo", "Precio", "Disponible"));
        System.out.println(separador);
        System.out.println(fila.formatted("A", platoA.getNombre(), platoA.getTipo(), platoA.getPrecio(), platoA.getDisponible()));
        System.out.println(fila.formatted("B", platoB.getNombre(), platoB.getTipo(), platoB.getPrecio(), platoB.getDisponible()));
        System.out.println(fila.formatted("C", platoC.getNombre(), platoC.getTipo(), platoC.getPrecio(), platoC.getDisponible()));
        System.out.println(separador);

        platoA.setNombre("Empanadas Viento");
        platoA.setTipo("Entrada");
        platoA.setPrecio(2.50);
        platoA.setDisponible(true);

        platoB.setNombre("Seco de Chivo");
        platoB.setTipo("Plato fuerte");
        platoB.setPrecio(8.00);
        platoB.setDisponible(true);

        platoC.setNombre("Flan de Coco");
        platoC.setTipo("Postre");
        platoC.setPrecio(3.00);
        platoC.setDisponible(false);

        System.out.println("\n=== VALORES MODIFICADOS ===");
        System.out.println(separador);
        System.out.println(cabecera.formatted("Plato", "Nombre", "Tipo", "Precio", "Disponible"));
        System.out.println(separador);
        System.out.println(fila.formatted("A", platoA.getNombre(), platoA.getTipo(), platoA.getPrecio(), platoA.getDisponible()));
        System.out.println(fila.formatted("B", platoB.getNombre(), platoB.getTipo(), platoB.getPrecio(), platoB.getDisponible()));
        System.out.println(fila.formatted("C", platoC.getNombre(), platoC.getTipo(), platoC.getPrecio(), platoC.getDisponible()));
        System.out.println(separador);
    }
}
