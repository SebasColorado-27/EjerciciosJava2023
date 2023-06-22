import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Interfaz extends JFrame{

    private String jugador_1;
	private String jugador_2;
	private int turno;
	private char tablero[][];
	private boolean en_juego;
    private int cant_jugadas;
    int fila = 0;
    int columna = 0;

    public Interfaz(){
        this.jugador_1 = "";
		this.jugador_2 = "";
		this.turno = 1;
		this.en_juego = true;
        this.cant_jugadas = 0;
		this.tablero = new char [3][3];
        this.fila = 0;
        this.columna = 0;
        this.limpiarTablero();
        initComponent();
    }

    public void initComponent(){

        //Contenedores
        JPanel ContenedorPrincipal = new JPanel();
        JPanel Encabezado = new JPanel();
        JPanel mapatablero = new JPanel();
        JPanel piePagina = new JPanel();


        //----------------Añadidos a los contenedores---------------//


        //Panel Principal
        GridLayout LayoutPrincipal = new GridLayout(3,1);
        ContenedorPrincipal.setLayout(LayoutPrincipal);
        Color fondoTablero = new Color(0xEDFFBA);
        ContenedorPrincipal.setBackground(fondoTablero);


        //Encabezado datos
        GridLayout layoutEncabezado = new GridLayout(3,1);
        Encabezado.setLayout(layoutEncabezado);
        GridLayout layoutbtn = new GridLayout(1,2);
        JPanel panelbotones = new JPanel();
        panelbotones.setLayout(layoutbtn);
        JButton iniciarPartida = new JButton("INICIAR PARTIDA");
        JButton reiniciarPartida = new JButton("REINICIAR PARTIDA");
        JLabel estadopartida = new JLabel("Estado: ");
        JLabel turnopartida = new JLabel("Turno: ");
        Encabezado.add(panelbotones);
        panelbotones.add(iniciarPartida);
        panelbotones.add(reiniciarPartida);
        Encabezado.add(estadopartida);
        Encabezado.add(turnopartida);


        //Tablero y configuraciones
        GridLayout layouttablero = new GridLayout(3,3);
        mapatablero.setLayout(layouttablero);
        JLabel casilla1 = new JLabel("-");
        casilla1.setHorizontalAlignment(SwingConstants.CENTER);
        casilla1.setVerticalAlignment(SwingConstants.CENTER);
        JLabel casilla2 = new JLabel("-");
        casilla2.setHorizontalAlignment(SwingConstants.CENTER);
        casilla2.setVerticalAlignment(SwingConstants.CENTER);
        JLabel casilla3 = new JLabel("-");
        casilla3.setHorizontalAlignment(SwingConstants.CENTER);
        casilla3.setVerticalAlignment(SwingConstants.CENTER);
        JLabel casilla4 = new JLabel("-");
        casilla4.setHorizontalAlignment(SwingConstants.CENTER);
        casilla4.setVerticalAlignment(SwingConstants.CENTER);
        JLabel casilla5 = new JLabel("-");
        casilla5.setHorizontalAlignment(SwingConstants.CENTER);
        casilla5.setVerticalAlignment(SwingConstants.CENTER);
        JLabel casilla6 = new JLabel("-");
        casilla6.setHorizontalAlignment(SwingConstants.CENTER);
        casilla6.setVerticalAlignment(SwingConstants.CENTER);
        JLabel casilla7 = new JLabel("-");
        casilla7.setHorizontalAlignment(SwingConstants.CENTER);
        casilla7.setVerticalAlignment(SwingConstants.CENTER);
        JLabel casilla8 = new JLabel("-");
        casilla8.setHorizontalAlignment(SwingConstants.CENTER);
        casilla8.setVerticalAlignment(SwingConstants.CENTER);
        JLabel casilla9 = new JLabel("-");
        casilla9.setHorizontalAlignment(SwingConstants.CENTER);
        casilla9.setVerticalAlignment(SwingConstants.CENTER);
        mapatablero.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );
        mapatablero.add(casilla1);
        mapatablero.add(casilla2);
        mapatablero.add(casilla3);
        mapatablero.add(casilla4);
        mapatablero.add(casilla5);
        mapatablero.add(casilla6);
        mapatablero.add(casilla7);
        mapatablero.add(casilla8);
        mapatablero.add(casilla9);


        //Diseño al tablero
        String hexborder1 = "#CACACA";
        int bordes = Integer.parseInt(hexborder1.substring(1), 16);
        Color colorB = new Color(bordes);
        mapatablero.setBorder(BorderFactory.createLineBorder(colorB, 3));
        casilla1.setBorder(BorderFactory.createLineBorder(colorB, 4));
        casilla2.setBorder(BorderFactory.createLineBorder(colorB, 4));
        casilla3.setBorder(BorderFactory.createLineBorder(colorB, 4));
        casilla4.setBorder(BorderFactory.createLineBorder(colorB, 4));
        casilla5.setBorder(BorderFactory.createLineBorder(colorB, 4));
        casilla6.setBorder(BorderFactory.createLineBorder(colorB, 4));
        casilla7.setBorder(BorderFactory.createLineBorder(colorB, 4));
        casilla8.setBorder(BorderFactory.createLineBorder(colorB, 4));
        casilla9.setBorder(BorderFactory.createLineBorder(colorB, 4));


        //Pie de pagina
        GridLayout piePaginalayout = new GridLayout(1,1);
        piePagina.setLayout(piePaginalayout);
        JLabel resultado = new JLabel("GANADOR");
        piePagina.add(resultado);
        resultado.setHorizontalAlignment(SwingConstants.CENTER);
        resultado.setVerticalAlignment(SwingConstants.CENTER);
       

        //Diseño front-end a botones
        Color fondoboton1 = new Color(0xEAFFB1);
        String hexcolor1 = "#BCFF00";
        int rgb1 = Integer.parseInt(hexcolor1.substring(1), 16);
        Color color1 = new Color(rgb1);
        iniciarPartida.setBackground(fondoboton1);
        iniciarPartida.setBorder(BorderFactory.createLineBorder(color1, 4));
        iniciarPartida.setFont(new Font("Arial",Font.BOLD,15));

        Color btn_fondo2 = new Color(0xB6A7FE);
        String hexcolor2 = "#9E00FF";
        int rgb2 = Integer.parseInt(hexcolor2.substring(1), 16);
        Color color2 = new Color(rgb2);
        reiniciarPartida.setBackground(btn_fondo2);
        reiniciarPartida.setBorder(BorderFactory.createLineBorder(color2, 4));
        reiniciarPartida.setFont(new Font("Arial",Font.BOLD,15 ));


        //Eventos
        ActionListener reiniciarpartida = new ActionListener(){
			public void actionPerformed(ActionEvent e){
                System.out.println("Partida Reiniciada...");
                limpiarTablero(); 
                casilla1.setText("-");
                casilla2.setText("-");
                casilla3.setText("-");
                casilla4.setText("-");
                casilla5.setText("-");
                casilla6.setText("-");
                casilla7.setText("-");
                casilla8.setText("-");
                casilla9.setText("-");
            }
        };
        reiniciarPartida.addActionListener(reiniciarpartida);

        ActionListener iniciarpartida = new ActionListener(){
			public void actionPerformed(ActionEvent e){
                System.out.println("Iniciando Partida...");
                // limpiarTablero();
                imprimirTablero();

                MouseAdapter evento1 = new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        System.out.println("Click Casilla 1");
                        casilla1.setText("X");
                        marcarcasilla1();

                    }
                };
                casilla1.addMouseListener(evento1);

                MouseAdapter evento2 = new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        System.out.println("Click Casilla 2");
                        casilla2.setText("O");
                        marcarcasilla2();
                    }
                };
                casilla2.addMouseListener(evento2);

                MouseAdapter evento3 = new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        System.out.println("Click Casilla 3");
                        casilla3.setText("X");
                        marcarcasilla3();
                    }
                };
                casilla3.addMouseListener(evento3);

                MouseAdapter evento4 = new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        System.out.println("Click Casilla 4");
                        casilla4.setText("O");
                        marcarcasilla4();
                    }
                };
                casilla4.addMouseListener(evento4);

                MouseAdapter evento5 = new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        System.out.println("Click Casilla 5");
                        casilla5.setText("X");
                        marcarcasilla5();
                    }
                };
                casilla5.addMouseListener(evento5);

                MouseAdapter evento6 = new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        System.out.println("Click Casilla 6");
                        casilla6.setText("O");
                        marcarcasilla6();
                    }
                };
                casilla6.addMouseListener(evento6);

                MouseAdapter evento7 = new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        System.out.println("Click Casilla 7");
                        casilla7.setText("X");
                        marcarcasilla7();
                    }
                };
                casilla7.addMouseListener(evento7);

                MouseAdapter evento8 = new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        System.out.println("Click Casilla 8");
                        casilla8.setText("O");
                        marcarcasilla8();
                    }
                };
                casilla8.addMouseListener(evento8);

                MouseAdapter evento9 = new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        System.out.println("Click Casilla 9");
                        casilla9.setText("X");
                        marcarcasilla9();
                    }
                };
                casilla9.addMouseListener(evento9);             
            }
        };
                

		iniciarPartida.addActionListener( iniciarpartida );

        //Añadiendo los elementos a la ventana
        ContenedorPrincipal.add(Encabezado);
        ContenedorPrincipal.add(mapatablero);
        ContenedorPrincipal.add(piePagina);


        //Metodos de la ventana
        add(ContenedorPrincipal);
        setTitle("Tres En Linea");
        setResizable(false);
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    //METODOS
    public void marcarcasilla1(){
        this.tablero[0][0]=this.obtenerFichaActual();
        imprimirTablero();
        this.fila = 0;
        this.columna = 0;
    }
    public void marcarcasilla2(){
        this.tablero[0][1]=this.obtenerFichaActual();
        imprimirTablero();
        this.fila = 0;
        this.columna = 1;
    }
    public void marcarcasilla3(){
        this.tablero[0][2]=this.obtenerFichaActual();
        imprimirTablero();
        this.fila = 0;
        this.columna = 2;
    }
    public void marcarcasilla4(){
        this.tablero[1][0]=this.obtenerFichaActual();
        imprimirTablero();
        this.fila = 1;
        this.columna = 0;
    }
    public void marcarcasilla5(){
        this.tablero[1][1]=this.obtenerFichaActual();
        imprimirTablero();
        this.fila = 1;
        this.columna = 1;
    }
    public void marcarcasilla6(){
        this.tablero[1][2]=this.obtenerFichaActual();
        imprimirTablero();
        this.fila = 1;
        this.columna = 2;
    }
    public void marcarcasilla7(){
        this.tablero[2][0]=this.obtenerFichaActual();
        imprimirTablero();
        this.fila = 2;
        this.columna = 0;
    }
    public void marcarcasilla8(){
        this.tablero[2][1]=this.obtenerFichaActual();
        imprimirTablero();
        this.fila = 2;
        this.columna = 1;
    }
    public void marcarcasilla9(){
        this.tablero[2][2]=this.obtenerFichaActual();
        imprimirTablero();
        this.fila = 2;
        this.columna = 2;
        imprimirdatoc();
    }
    public void imprimirdatoc(){
        System.out.println("fila: "+fila+" columna: "+columna);
    }
    
    
    
    
    public void limpiarTablero(){
    for (int i=0; i<this.tablero.length; i++ ) {
            for (int j=0; j<this.tablero[i].length; j++) {
                this.tablero[i][j] = '-';
            }
        }
    }

    public void imprimirTablero(){
        for (int i=0; i<this.tablero.length; i++ ) {
            for (int j=0; j<this.tablero[i].length; j++) {
                System.out.print("["+this.tablero[i][j]+"] ");
            }
            System.out.println();
        }
    }

    public String jugadorActual(){
		return (this.turno==1)? jugador_1 : jugador_2 ;
	}

	public boolean validarCasillaVacia(int fila, int columna){
		if (this.tablero[fila][columna] == '-') {
			return false;
		}else{
			return true;
		}
	}

	public char obtenerFichaActual(){
		return (this.turno==1)? 'X' : 'O' ;
	}

	public boolean validarTableroLleno(){
		for (int i=0; i<this.tablero.length; i++) {
			for (int j=0; j<this.tablero[i].length; j++ ) {
				if (this.tablero[i][j]=='-') {
					return false;
				}
			}
		}
		return true;
	}

    public boolean validarGanador(){
		if ( (this.tablero[0][0]==this.tablero[0][1] && this.tablero[0][0]==this.tablero[0][2] && this.tablero[0][0]!='-') || 
			 (this.tablero[1][0]==this.tablero[1][1] && this.tablero[1][0]==this.tablero[1][2] && this.tablero[1][0]!='-') || 
			 (this.tablero[2][0]==this.tablero[2][1] && this.tablero[2][0]==this.tablero[2][2] && this.tablero[2][0]!='-') ||
			 
			 (this.tablero[0][0]==this.tablero[1][0] && this.tablero[0][0]==this.tablero[2][0] && this.tablero[0][0]!='-') || 
			 (this.tablero[0][1]==this.tablero[1][1] && this.tablero[0][1]==this.tablero[2][1] && this.tablero[0][1]!='-') || 
			 (this.tablero[0][2]==this.tablero[1][2] && this.tablero[0][2]==this.tablero[2][2] && this.tablero[0][2]!='-') || 

			 (this.tablero[0][0]==this.tablero[1][1] && this.tablero[0][0]==this.tablero[2][2] && this.tablero[0][0]!='-') || 
			 (this.tablero[2][0]==this.tablero[1][1] && this.tablero[2][0]==this.tablero[0][2] && this.tablero[2][0]!='-') 			 
			) {
			return true;
		}else{
			return false;
		}
	}
    
    public void start(){
        
		do{
			// Imprimir el tablero
            this.imprimirTablero();
            // break;
            if ( this.validarCasillaVacia(fila, columna)) {
				// Si - Marcar la jugada en la pos indicada
				this.tablero[fila][columna] = this.obtenerFichaActual(); //esta es la que pone la ficha
                System.out.println("==> POSICION INVALIDA - OCUPADA.");
        
				// Validar si la jugada fue ganadora
				if ( this.validarGanador() ) {
					// Si - El juego se termina
					en_juego = false;
					this.imprimirTablero();
					System.out.println(" ==== El jugador "+this.jugadorActual()+" ha ganado. ===");
				}else{
					// No - Validar si hubo empate
					if ( this.validarTableroLleno() ) {
						// Si - Terminar juego
						en_juego = false;
						this.imprimirTablero();
						System.out.println("  ==== EMPATE ====");
					}else{
						// No - Cambiar turno
						this.turno = (turno%2)+1;
					}
				}
			}else{
				// No - Repetir jugada
				System.out.println("==> POSICION INVALIDA - OCUPADA.");
			}
			

		}while(en_juego);
	}
}