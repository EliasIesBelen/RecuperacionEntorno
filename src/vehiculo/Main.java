package vehiculo;

/**
 * Clase principal que maneja las operaciones de venta y compra de vehículos.
 * Esta clase contiene el método main que inicializa un objeto VehiculoEUG1406 y 
 * ejecuta operaciones de venta y compra de vehículos.
 * 
 * @author elias
 */
public class Main {

    /**
     * Método principal que inicializa un vehículo y realiza operaciones de venta y compra.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        VehiculoEUG1406 miVehiculoEUG1406;
        int stockActual;

        miVehiculoEUG1406 = new VehiculoEUG1406("Seat", 18000, 100);
        operativaVehiculosEUG1406(miVehiculoEUG1406, 50);
        stockActual = miVehiculoEUG1406.obtenerStock();
        System.out.println("El stock actual es " + stockActual);
    }

    /**
     * Realiza operaciones de venta y compra de vehículos en el objeto VehiculoEUG1406.
     * Imprime mensajes indicando el resultado de cada operación.
     *
     * @param miVehiculoEUG1406 El vehículo sobre el cual se realizan las operaciones.
     * @param cantidad La cantidad de vehículos a operar.
     */
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
