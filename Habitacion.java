package HolocaustoH;

public class Habitacion {
	//Puertas
	private Posicion puertaEntrada;
	private Posicion puertaSalida;
	
	//Tamaño de la habitacion
	public static final int ancho = 15;
	public static final int alto = 10;
	
	//Hacemos una copia del jugador
	private Personaje j;
	
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

	public Personaje getJugador() {
		return j;
	}

	public void setJugador(Personaje j) {
		this.j = j;
	}	
	public boolean esunaPuerta(Posicion p) {
		if(p.esIgual(puertaEntrada) || p.esIgual(puertaSalida)) return true;
		else return false;
	}
}