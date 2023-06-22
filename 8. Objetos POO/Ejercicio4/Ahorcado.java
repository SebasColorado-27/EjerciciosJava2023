import java.util.Scanner;

public class Ahorcado{
	
	private String palabrasecreta;
	private String jugador;
	private char tablero[];
	private boolean en_juego;
	private int intentos;
	private int aciertos;

	public Ahorcado(String palabrasecreta){
		this.palabrasecreta=palabrasecreta;
		this.jugador="";
		this.tablero = new char [palabrasecreta.length()];
		this.en_juego=true;
		this.intentos=20;
		this.aciertos=0;
		this.limpiarTablero();
	}

	public void limpiarTablero(){
		for (int i=0; i<this.palabrasecreta.length(); i++ ) {
			this.tablero[i] = '_';
		}
	}

	public void imprimirTablero(){
		System.out.println(" ");
		for (int i=0; i<this.palabrasecreta.length(); i++ ) {
			System.out.print(this.tablero[i]);
		}
	}

	public boolean validarGanador(){
		for (int i=0; i<this.tablero.length; i++){
			if (this.tablero[i]=='_'){
				return false;
			}
		}
		return true;
	}

	public boolean validarPerdedor(){
		if (this.intentos<=0) {
			this.en_juego = false;
			System.out.println("GAME OVER ! la palabra era: ");
			System.out.println(this.palabrasecreta);
			System.out.println(" ==== El jugador "+this.jugador+" ha perdido. ===");
			return true;
		}else{
			return false;
		}
	}

	public void start(){
		
		Scanner entrada_texto = new Scanner(System.in);

		System.out.print("=> Ingrese nombre del Jugador : ");
		this.jugador = entrada_texto.nextLine();

		do{
			// Imprimir el tablero
			this.imprimirTablero();
			
			// Pedir la posicion al jugador actual
			System.out.println(" ");
			System.out.print("=> Jugador "+this.jugador+" ingrese la letra: ");
			char letra = entrada_texto.next().charAt(0);

			for (int i=0; i<palabrasecreta.length(); i++){
				if (letra==palabrasecreta.charAt(i)){
					aciertos=aciertos+1;
					this.tablero[i] = letra;
				} else{
					intentos=intentos-1;
				}
			}

			// Validar si la jugada fue ganadora
			if ( this.validarGanador() ) {
				// Si - El juego se termina
				this.en_juego = false;
				System.out.println("JUEGO FINALIZADO ! la palabra era: ");
				this.imprimirTablero();
				System.out.println(" ==== El jugador "+this.jugador+" ha ganado. ===");
			} else{
				this.en_juego=true;
			}
			
			this.validarPerdedor();
				
			
		}while(en_juego);
	}
}