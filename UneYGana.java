
public class UneYGana {

	public static void main(String[] args) {
		JuegoTriqui jugar = new JuegoTriqui( );

		jugar.crearYLlenarTablero( );
		jugar.mostrarTablero( );
		
		do {
			System.out.println( );
			jugar.movimientoJugador( );
			jugar.mostrarTablero( );
			boolean resultado = jugar.haGanado('O');
			if ( resultado == true) {
				System.out.println("\nEl jugador ha ganado :)" );
				break;
			}
			
			resultado = jugar.hayCeldaVacia( );
			if ( resultado == false) {
				System.out.println("\nHemos empatado" );
				break;
			}
			
			System.out.println("\nMe toca jugar.." );
			jugar.movimientoComputadora( );
			jugar.mostrarTablero( );
			resultado = jugar.haGanado('X');
			if ( resultado == true) {
				System.out.println("\nLa computadora ha ganado :( " );
				break;
			}

		} while ( true );

	}

}
