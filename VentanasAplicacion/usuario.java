package VentanasAplicacion;

public class usuario {
	 private String email;
	    private String password;
	    private String full_name;
	    private String billing_address;
	    private String default_shipping_address;
	    private String country;
	    private int phone;
	    
	    // Constructor
	    public usuario(String email, String password, String full_name, String billing_address,
	                   String default_shipping_address, String country, int phone) {
	        this.email = email;
	        this.password = password;
	        this.full_name = full_name;
	        this.billing_address = billing_address;
	        this.default_shipping_address = default_shipping_address;
	        this.country = country;
	        this.phone = phone;
	    }
}
