import java.util.ArrayList;

public class EquipoVentas {

    // Agregación: el equipo guarda referencias a vendedores creados afuera
    private ArrayList<Vendedor> vendedores;

    public EquipoVentas() {
        vendedores = new ArrayList<>();
    }

    public boolean agregarVendedor(Vendedor vendedor) {
        if (vendedor == null) {
            return false;
        }
        // Desafío: no se permiten identificaciones repetidas
        if (buscarVendedor(vendedor.getIdentificacion()) != null) {
            return false;
        }
        vendedores.add(vendedor);
        return true;
    }

    public boolean eliminarVendedor(String identificacion) {
        Vendedor encontrado = buscarVendedor(identificacion);
        if (encontrado != null) {
            vendedores.remove(encontrado);
            return true;
        }
        return false;
    }

    public Vendedor buscarVendedor(String identificacion) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getIdentificacion().equals(identificacion)) {
                return vendedor;
            }
        }
        return null;
    }

    public double calcularVentasTotales() {
        double total = 0;
        for (Vendedor vendedor : vendedores) {
            total += vendedor.getVentas();
        }
        return total;
    }

    public Vendedor obtenerMayorVendedor() {
        Vendedor mayor = null;
        for (Vendedor vendedor : vendedores) {
            if (mayor == null || vendedor.getVentas() > mayor.getVentas()) {
                mayor = vendedor;
            }
        }
        return mayor;
    }

    public int cantidadVendedores() {
        return vendedores.size();
    }

    public String mostrarEquipo() {
        if (vendedores.isEmpty()) {
            return "El equipo no tiene vendedores.";
        }
        String resultado = "";
        for (Vendedor vendedor : vendedores) {
            resultado += vendedor.mostrarInformacion() + "\n";
        }
        return resultado;
    }
}