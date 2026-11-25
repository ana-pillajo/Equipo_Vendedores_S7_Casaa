public class Main {

    public static void main(String[] args) {

        Vendedor v1 = new Vendedor("V01", "Andrea Salas", 4500.00);
        Vendedor v2 = new Vendedor("V02", "Jorge Castro", 3800.50);
        Vendedor v3 = new Vendedor("V03", "Paola Ríos", 6200.00);
        Vendedor v4 = new Vendedor("V04", "Martín Cruz", 2900.75);
        Vendedor v5 = new Vendedor("V05", "Lucía Vera", 5100.00);

        EquipoVentas equipo = new EquipoVentas();

        System.out.println("=== AGREGAR ===");
        System.out.println("Agregar V01: " + equipo.agregarVendedor(v1));
        System.out.println("Agregar V02: " + equipo.agregarVendedor(v2));
        System.out.println("Agregar V03: " + equipo.agregarVendedor(v3));
        System.out.println("Agregar V04: " + equipo.agregarVendedor(v4));
        System.out.println("Agregar V05: " + equipo.agregarVendedor(v5));
        System.out.println("Vendedores en el equipo: " + equipo.cantidadVendedores());
        System.out.println(equipo.mostrarEquipo());

        System.out.println("Ventas totales: $" + String.format("%.2f", equipo.calcularVentasTotales()));

        Vendedor mayor = equipo.obtenerMayorVendedor();
        if (mayor != null) {
            System.out.println("Mayor vendedor: " + mayor.mostrarInformacion());
        }
        System.out.println();

        System.out.println("=== BUSCAR ===");
        Vendedor encontrado = equipo.buscarVendedor("V04");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.mostrarInformacion());
        }
        Vendedor noExiste = equipo.buscarVendedor("V99");
        if (noExiste == null) {
            System.out.println("V99 no encontrado (retornó null)");
        }
        System.out.println();

        System.out.println("=== ELIMINAR ===");
        System.out.println("Eliminar V03: " + equipo.eliminarVendedor("V03"));
        System.out.println("Eliminar V99: " + equipo.eliminarVendedor("V99"));
        System.out.println("Vendedores en el equipo: " + equipo.cantidadVendedores());
        System.out.println(equipo.mostrarEquipo());
        System.out.println("Ventas totales: $" + String.format("%.2f", equipo.calcularVentasTotales()));
        System.out.println("Nuevo mayor vendedor: " + equipo.obtenerMayorVendedor().mostrarInformacion());
        System.out.println();

        System.out.println("El vendedor eliminado sigue existiendo: " + v3.mostrarInformacion());
        System.out.println();

        System.out.println("=== DESAFÍO ===");
        Vendedor repetido = new Vendedor("V01", "Otro Nombre", 1000.00);
        System.out.println("Agregar otro vendedor con identificación V01: " + equipo.agregarVendedor(repetido));
        System.out.println("Vendedores en el equipo: " + equipo.cantidadVendedores());
    }
}