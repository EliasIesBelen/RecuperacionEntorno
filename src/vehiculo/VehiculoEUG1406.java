
package vehiculo;

/**
 * Clase que representa un vehículo con nombre, precio y stock
 * Proporciona métodos para comprar y vender vehículos, así como para obtener y asignar valores de sus propiedades
 * 
 * @author elias
 */
public class VehiculoEUG1406 {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /**
     * Constructor sin argumentos
     */
    public VehiculoEUG1406() {
    }

    /**
     * Constructor con parámetros para inicializar la clase
     * 
     * @param nom   El nombre del vehículo
     * @param precio El precio del vehículo
     * @param stock  La cantidad de vehículos en stock
     */
    public VehiculoEUG1406(String nom, double precio, int stock) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Asigna el nombre del vehículo
     * 
     * @param nom El nombre a asignar al vehículo
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Devuelve el nombre del vehículo
     * 
     * @return El nombre del vehículo
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Devuelve el stock de vehículos disponible en cada momento
     * 
     * @return El stock de vehículos disponible
     */
    public int obtenerStock() {
        return getStock();
    }

    /**
     * Compra vehículos y modifica el stock
     * 
     * @param cantidad La cantidad de vehículos a comprar
     * @throws Exception Si la cantidad es negativa
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un número negativo de vehículos");
        }
        setStock(getStock() + cantidad);
    }

    /**
     * Vende vehículos y modifica el stock
     * 
     * @param cantidad La cantidad de vehículos a vender
     * @throws Exception Si la cantidad es negativa o si no hay suficientes vehículos en stock
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de vehículos");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No hay suficientes vehículos para vender");
        }
        setStock(getStock() - cantidad);
    }

    /**
     * Devuelve el nombre del vehículo
     * 
     * @return El nombre del vehículo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del vehículo
     * 
     * @param nombre El nombre a asignar al vehículo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el precio del vehículo
     * 
     * @return El precio del vehículo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Asigna el precio del vehículo
     * 
     * @param precio El precio a asignar al vehículo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el precio con IVA del vehículo
     * 
     * @return El precio con IVA del vehículo
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Asigna el precio con IVA del vehículo
     * 
     * @param precioIVA El precio con IVA a asignar al vehículo
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Devuelve el stock de los vehículos
     * 
     * @return El stock de vehículos
     */
    public int getStock() {
        return stock;
    }

    /**
     * Asigna el stock de vehículos
     * 
     * @param stock El stock a asignar a los vehículos
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
} 
   
    

