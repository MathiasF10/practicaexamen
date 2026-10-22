public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE FUNCIONAMIENTO ===");

        // Consultar contador inicial
        System.out.println("Productos al inicio: " + producto.getContadorProductos());

        // Crear objetos Producto
        producto p1 = new producto(1, "Mouse Inalambrico", 25.50);
        producto p2 = new producto(2, "Teclado Mecanico", 60.00);

        // Mostrar datos
        System.out.println("\n--- Lista de Productos ---");
        p1.mostrarInformacion();
        p2.mostrarInformacion();

        // Probar validación de precio
        System.out.println("\n--- Prueba de Validación ---");
        p1.setPrecio(-10.00);
        System.out.println("Precio de p1 tras fallo: $" + p1.getPrecio());

        p1.setPrecio(20.00);
        System.out.println("Precio de p1 actualizado: $" + p1.getPrecio());

        // Contador final
        System.out.println("\nTotal de productos creados: " + producto.getContadorProductos());
    }
}