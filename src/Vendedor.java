public class Vendedor {

    private String identificacion;
    private String nombre;
    private double ventas;

    public Vendedor(String identificacion, String nombre, double ventas) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.ventas = ventas;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVentas() {
        return ventas;
    }

    public String mostrarInformacion() {
        return identificacion + " - " + nombre + " - Ventas: $" + String.format("%.2f", ventas);
    }
}