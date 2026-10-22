public class producto {

    // Atributos privados
    private final int id;
    private String nombre;
    private double precio;
    private static int contadorProductos = 0;

    // Constructor
    public producto(int id, String nombre, double precio) {
        if (id <= 0) {
            throw new IllegalArgumentException("El ID debe ser mayor a 0.");
        }

        this.id = id;
        this.nombre = nombre;
        setPrecio(precio);

        contadorProductos++;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Precio: $" + precio);
    }
}