package vehiculo;

/**
 *
 * @author
 */
public class Main {

    public static void main(String[] args) {
        VehiculoEUG1406 miVehiculoEUG1406;
        int stockActual;

        miVehiculoEUG1406 = new VehiculoEUG1406("Seat", 18000, 100);
        operativaVehiculosEUG1406(miVehiculoEUG1406, 50);
        stockActual = miVehiculoEUG1406.obtenerStock();
        System.out.println("El stock actual es " + stockActual);
    }

    public static void operativaVehiculosEUG1406(VehiculoEUG1406 miVehiculoEUG1406, int cantidad) {
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoEUG1406.vender(20);
        } catch (Exception e) {
            System.out.print("Fallo al vender");
        }

        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoEUG1406.comprar(100);
        } catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
    }

}
