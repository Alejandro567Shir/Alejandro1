
package hola;

public class Producto {
    
    private String nombrePro;
    private String descripcion;
    private Double precio;
    private Integer stock;

    public Producto(String nombrePro, String descripcion, Double precio, Integer stock) {
        this.nombrePro = nombrePro;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
    
    
    

}
