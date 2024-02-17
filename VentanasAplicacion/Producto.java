package VentanasAplicacion;

public class Producto {
	    private int codigoBarra;
	    private String nombre;
	    private double precio;
	    private double peso;
	    private String descripcion;
	    private String categoria;

	 
	    public Producto(int codigoBarra, String nombre, double precio, String string, String string2, double peso, int i, String descripcion, String categoria) {
	        this.codigoBarra = codigoBarra;
	        this.nombre = nombre;
	        this.precio = precio;
	        this.peso = peso;
	        this.descripcion = descripcion;
	        this.categoria = categoria;
	    }

	    public int getCodigoBarra() {
	        return codigoBarra;
	    }

	    public void setCodigoBarra(int codigoBarra) {
	        this.codigoBarra = codigoBarra;
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
	        this.precio = precio;
	    }

	    public double getPeso() {
	        return peso;
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    public String getCategoria() {
	        return categoria;
	    }

	    public void setCategoria(String categoria) {
	        this.categoria = categoria;
	    }
}
