package challenge_Java_Alura;

public class Moneda {

	String tipo;
	double cotizacion;
	
	public Moneda() {
	
	}
	
	public Moneda(double cotizacion, String tipo) {
		this.tipo = tipo;
		this.cotizacion = cotizacion;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getCotizacion() {
		return cotizacion;
	}


	public void setCotizacion(double cotizacion) {
		this.cotizacion = cotizacion;
	}
	
	
}
