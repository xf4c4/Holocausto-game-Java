package HolocaustoH;

public class Main {

	public static void main(String[] args) {
		//Generamos una habitación
		Habitacion habInicial = new Habitacion();
		
		//Posicionaremos las puertas de entrada y salida
		Posicion puertaIn = new Posicion(0,3);
		habInicial.setPuertaEntrada(puertaIn);
		Posicion puertaOut = new Posicion(5,Habitacion.alto-1);
		habInicial.setPuertaSalida(puertaOut);
		
		//Generaremos el jugador y lo almacenaremos en la habitacion
		Personaje jugador = new Personaje();
		habInicial.setJugador(jugador);
		
		//Pintamos la habitacion
		Juego.PintarHabitacion(habInicial);
	}
}