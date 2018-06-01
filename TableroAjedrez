package Ajedrez;

import java.util.Scanner;

public class TableroAjedrez {
	
	private Caja[][] tablero=new Caja[9][9];
	private static TableroAjedrez miTableroAjedrez = new TableroAjedrez();
	
	private TableroAjedrez()
	{	 
		 for(int i=0; i<tablero.length; i++){
	            for(int j=0; j<tablero.length; j++){
	                this.tablero[i][j] = new Caja(null);
	            }
	        }
		 
		 
		 Torre tB=new Torre(true);
		 Torre tN=new Torre(false);
		 Caballo cB=new Caballo(true);
		 Caballo cN=new Caballo(false);
		 Alfil aB=new Alfil(true);
		 Alfil aN=new Alfil(false);
		 Rey rB=new Rey(true);
		 Rey rN=new Rey(false);
		 Reina reinaB=new Reina(true);
		 Reina reinaN=new Reina(false);
		 Peon peonB=new Peon(true);
		 Peon peonN=new Peon(false);
		 
		 tablero[0][0].cambiarPieza(tB);
		 tablero[0][1].cambiarPieza(cB);
		 tablero[0][2].cambiarPieza(aB);
		 tablero[0][3].cambiarPieza(reinaB);
		 tablero[0][4].cambiarPieza(rB);
		 tablero[0][5].cambiarPieza(aB);
		 tablero[0][6].cambiarPieza(cB);
		 tablero[0][7].cambiarPieza(tB);
		 tablero[1][0].cambiarPieza(peonB);
		 tablero[1][1].cambiarPieza(peonB);
		 tablero[1][2].cambiarPieza(peonB);
		 tablero[1][3].cambiarPieza(peonB);
		 tablero[1][4].cambiarPieza(peonB);
		 tablero[1][5].cambiarPieza(peonB);
		 tablero[1][6].cambiarPieza(peonB);
		 tablero[1][7].cambiarPieza(peonB);
		 tablero[7][0].cambiarPieza(tN);
		 tablero[7][1].cambiarPieza(cN);
		 tablero[7][2].cambiarPieza(aN);
		 tablero[7][3].cambiarPieza(reinaN);
		 tablero[7][4].cambiarPieza(rN);
		 tablero[7][5].cambiarPieza(aN);
		 tablero[7][6].cambiarPieza(cN);
		 tablero[7][7].cambiarPieza(tN);
		 tablero[6][0].cambiarPieza(peonN);
		 tablero[6][1].cambiarPieza(peonN);
		 tablero[6][2].cambiarPieza(peonN);
		 tablero[6][3].cambiarPieza(peonN);
		 tablero[6][4].cambiarPieza(peonN);
		 tablero[6][5].cambiarPieza(peonN);
		 tablero[6][6].cambiarPieza(peonN);
		 tablero[6][7].cambiarPieza(peonN);
	

	 }
	
	public static TableroAjedrez getTableroAjedrez()
	{
		return miTableroAjedrez;
	}
	
	public Caja obtenerCaja(int colum, int fila){
		return this.tablero[colum][fila];
	}
	
	private int escanearNumero(){
		int n;
		Scanner entrada = new Scanner(System.in);
		n = entrada.nextInt();
		return n;
	}
	
	private boolean reyBlancoVivo(){
		int fila = 0;
		int columna = 0;
		boolean vivo = false;
		Pieza P = null;
		while (fila<8 && !vivo){
			while (columna<8 && !vivo){
				P = TableroAjedrez.getTableroAjedrez().obtenerCaja(columna, fila).getPieza();
				if (P!=null && P instanceof Rey && P.esBlanca()){
					vivo = true;
				}
				columna = columna + 1;
			}
			fila = fila + 1;
			columna = 0;
		}
		return vivo;
	}
	
	private boolean reyNegroVivo(){
		int fila = 0;
		int columna = 0;
		boolean vivo = false;
		Pieza P = null;
		while (fila<8 && !vivo){
			while (columna<8 && !vivo){
				P = TableroAjedrez.getTableroAjedrez().obtenerCaja(columna, fila).getPieza();
				if (P!=null && P instanceof Rey && !P.esBlanca()){
					vivo = true;
				}
				columna = columna + 1;
			}
			fila = fila + 1;
			columna = 0;
		}
		return vivo;
	}
	
	private void moverPieza(int pFilaComienzo, int pColumnaComienzo, int pFilaDestino, int pColumnaDestino){
		TableroAjedrez TA = TableroAjedrez.getTableroAjedrez();
		Pieza P = TA.obtenerCaja(pColumnaComienzo, pFilaComienzo).getPieza();
		if (P instanceof Peon && ((pColumnaDestino==7 && P.esBlanca()) || (!P.esBlanca() && pColumnaDestino==0)))
		{
			Reina R = new Reina(P.esBlanca());
			P = R;
		}
		TA.obtenerCaja(pColumnaComienzo, pFilaComienzo).cambiarPieza(null);
		TA.obtenerCaja(pColumnaDestino, pFilaDestino).cambiarPieza(P);
	}

	
	public void imprimirTableroAjedrez(){
		TableroAjedrez TA = TableroAjedrez.getTableroAjedrez();
		System.out.println("|----|----|----|----|----|----|----|----|");
		System.out.println("| " + TA.obtenerCaja(7, 0).imprimirPieza() + " | " + TA.obtenerCaja(7,1).imprimirPieza() + " | " + TA.obtenerCaja(7,2).imprimirPieza() + " | " + TA.obtenerCaja(7,3).imprimirPieza() + " | " + TA.obtenerCaja(7, 4).imprimirPieza() + " | " + TA.obtenerCaja(7, 5).imprimirPieza() + " | " + TA.obtenerCaja(7, 6).imprimirPieza() + " | " + TA.obtenerCaja(7, 7).imprimirPieza() + " |");
		System.out.println("|----|----|----|----|----|----|----|----|");
		System.out.println("| " + TA.obtenerCaja(6, 0).imprimirPieza() + " | " + TA.obtenerCaja(6,1).imprimirPieza() + " | " + TA.obtenerCaja(6,2).imprimirPieza() + " | " + TA.obtenerCaja(6, 3).imprimirPieza() + " | " + TA.obtenerCaja(6, 4).imprimirPieza() + " | " + TA.obtenerCaja(6, 5).imprimirPieza() + " | " + TA.obtenerCaja(6, 6).imprimirPieza() + " | " + TA.obtenerCaja(6, 7).imprimirPieza() + " |");
		System.out.println("|----|----|----|----|----|----|----|----|");
		System.out.println("| " + TA.obtenerCaja(5, 0).imprimirPieza() + " | " + TA.obtenerCaja(5,1).imprimirPieza() + " | " + TA.obtenerCaja(5,2).imprimirPieza() + " | " + TA.obtenerCaja(5, 3).imprimirPieza() + " | " + TA.obtenerCaja(5, 4).imprimirPieza() + " | " + TA.obtenerCaja(5, 5).imprimirPieza() + " | " + TA.obtenerCaja(5, 6).imprimirPieza() + " | " + TA.obtenerCaja(5, 7).imprimirPieza() + " |");
		System.out.println("|----|----|----|----|----|----|----|----|");
		System.out.println("| " + TA.obtenerCaja(4, 0).imprimirPieza() + " | " + TA.obtenerCaja(4, 1).imprimirPieza() + " | " + TA.obtenerCaja(4,2).imprimirPieza() + " | " + TA.obtenerCaja(4, 3).imprimirPieza() + " | " + TA.obtenerCaja(4, 4).imprimirPieza() + " | " + TA.obtenerCaja(4, 5).imprimirPieza() + " | " + TA.obtenerCaja(4, 6).imprimirPieza() + " | " + TA.obtenerCaja(4, 7).imprimirPieza() + " |");
		System.out.println("|----|----|----|----|----|----|----|----|");
		System.out.println("| " + TA.obtenerCaja(3, 0).imprimirPieza() + " | " + TA.obtenerCaja(3, 1).imprimirPieza() + " | " + TA.obtenerCaja(3, 2).imprimirPieza() + " | " + TA.obtenerCaja(3, 3).imprimirPieza() + " | " + TA.obtenerCaja(3, 4).imprimirPieza() + " | " + TA.obtenerCaja(3, 5).imprimirPieza() + " | " + TA.obtenerCaja(3, 6).imprimirPieza() + " | " + TA.obtenerCaja(3, 7).imprimirPieza() + " |");
		System.out.println("|----|----|----|----|----|----|----|----|");
		System.out.println("| " + TA.obtenerCaja(2, 0).imprimirPieza() + " | " + TA.obtenerCaja(2, 1).imprimirPieza() + " | " + TA.obtenerCaja(2, 2).imprimirPieza() + " | " + TA.obtenerCaja(2, 3).imprimirPieza() + " | " + TA.obtenerCaja(2, 4).imprimirPieza() + " | " + TA.obtenerCaja(2, 5).imprimirPieza() + " | " + TA.obtenerCaja(2, 6).imprimirPieza() + " | " + TA.obtenerCaja(2, 7).imprimirPieza() + " |");
		System.out.println("|----|----|----|----|----|----|----|----|");
		System.out.println("| " + TA.obtenerCaja(1, 0).imprimirPieza() + " | " + TA.obtenerCaja(1, 1).imprimirPieza() + " | " + TA.obtenerCaja(1, 2).imprimirPieza() + " | " + TA.obtenerCaja(1, 3).imprimirPieza() + " | " + TA.obtenerCaja(1, 4).imprimirPieza() + " | " + TA.obtenerCaja(1, 5).imprimirPieza() + " | " + TA.obtenerCaja(1, 6).imprimirPieza() + " | " + TA.obtenerCaja(1, 7).imprimirPieza() + " |");
		System.out.println("|----|----|----|----|----|----|----|----|");
		System.out.println("| " + TA.obtenerCaja(0, 0).imprimirPieza() + " | " + TA.obtenerCaja(0, 1).imprimirPieza() + " | " + TA.obtenerCaja(0, 2).imprimirPieza() + " | " + TA.obtenerCaja(0, 3).imprimirPieza() + " | " + TA.obtenerCaja(0, 4).imprimirPieza() + " | " + TA.obtenerCaja(0, 5).imprimirPieza() + " | " + TA.obtenerCaja(0, 6).imprimirPieza() + " | " + TA.obtenerCaja(0, 7).imprimirPieza() + " |");
		System.out.println("|----|----|----|----|----|----|----|----|");
	}

	
	public void jugarPartida(){
		
	}
}
