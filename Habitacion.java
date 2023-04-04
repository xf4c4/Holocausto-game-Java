package HolocaustoH;

public class Habitacion {
	private Posicion puertaEntrada;
	private Posicion puertaSalida;
	public static final int ancho = 15;
	public static final int alto = 10;
	
	public Habitacion() {
		
	}

	public Posicion getPuertaEntrada() {
		return puertaEntrada;
	}

	public void setPuertaEntrada(Posicion puertaEntrada) {
		this.puertaEntrada = puertaEntrada;
	}

	public Posicion getPuertaSalida() {
		return puertaSalida;
	}

	public void setPuertaSalida(Posicion puertaSalida) {
		this.puertaSalida = puertaSalida;
	}

	public static int getAncho() {
		return ancho;
	}

	public static int getAlto() {
		return alto;
	}
	
}
