import java.util.Scanner;

public class JuegoTriqui {
	//Atributos
		private char [][] tablero;
		
				
		//Metodos
		void crearYLlenarTablero( ) {
			tablero = new char[3][3];
			
			for ( int i = 0 ; i < tablero.length ; i++ ) {
				for ( int j = 0 ; j < tablero.length ; j++ ) {
					tablero[i][j] = '-';
				}
			}
		}
		
		void mostrarTablero( ) {
			for ( int i = 0 ; i < tablero.length ; i++ ) {
				for ( int j = 0 ; j < tablero.length ; j++ ) {
					System.out.print( tablero[i][j] + " ") ;
				}
				
				System.out.println();
			}	
		}
		
		void movimientoJugador( ) {
		        Scanner teclado = new Scanner( System.in );
				int fila, columna;
				
				do {
					do {
						System.out.print( "En que fila desea jugar?: " );
						fila = teclado.nextInt( );
						// if ( fila >= 1 && fila <= 3 ) 
					}while ( fila  < 1 || fila > 3 );
					fila--;
					
					do {
						System.out.print( "En que columna desea jugar?: " );
						columna = teclado.nextInt( );
					}while ( columna  < 1 || columna > 3 );
					columna--;
					
					// if (tablero[fila][columna] == '-' )
				} while (tablero[fila][columna] != '-' );
						
				tablero[fila][columna] = 'O';
			}
		
		
		void movimientoComputadora( ) {
			int fila, columna;
			
			do {
				do {
					fila = (int)( Math.random()* ( 3 - 1 + 1 ) + 1);
				}while ( fila  < 1 || fila > 3 );
				fila--;
				
				do {
					columna = (int)( Math.random()* ( 3 - 1 + 1 ) + 1);
				}while ( columna  < 1 || columna > 3 );
				columna--;
				
			} while (tablero[fila][columna] != '-' );
					
			tablero[fila][columna] = 'X';
		}
		
		boolean haGanado( char quienJuega ) {
			// revisar filas
			if ( tablero[0][0] == quienJuega && tablero[0][1] == quienJuega && tablero[0][2] == quienJuega ) {
				return true;
			} 
			else if ( tablero[1][0] == quienJuega && tablero[1][1] == quienJuega && tablero[1][2] == quienJuega ) {
				return true;
			}
			else if ( tablero[2][0] == quienJuega && tablero[2][1] == quienJuega && tablero[2][2] == quienJuega ) {
				return true;
			}	
			// revisar columnas 
			else if ( tablero[0][0] == quienJuega && tablero[1][0] == quienJuega && tablero[2][0] == quienJuega ) {
				return true;
			}
			else if ( tablero[0][1] == quienJuega && tablero[1][1] == quienJuega && tablero[2][1] == quienJuega ) {
				return true;
			}
			else if ( tablero[0][2] == quienJuega && tablero[1][2] == quienJuega && tablero[2][2] == quienJuega ) {
				return true;
			}
			// revisar 2 diagonales
			else if ( tablero[0][0] == quienJuega && tablero[1][1] == quienJuega && tablero[2][2] == quienJuega ) {
				return true;
			}
			else if ( tablero[2][0] == quienJuega && tablero[1][1] == quienJuega && tablero[0][2] == quienJuega ) {
				return true;
			}
			else {
				return false;
			}
		}
		
		boolean hayCeldaVacia( ) {
			for ( int i = 0 ; i < tablero.length ; i++ ) {
				for ( int j = 0 ; j < tablero.length ; j++ ) {
					if ( tablero[i][j] == '-') {
						return true;
					}
				}
			}
			
			return false;
		}

}
