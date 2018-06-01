package Ajedrez;

public class Peon extends Pieza {
	
	public Peon(boolean pEsBlanca)
	{
		super(pEsBlanca);
	}

	public boolean posibleMovimiento(int filaCom, int columCom, int filaDest, int columDest){
		boolean esPosible=false;
		Caja cajaDestino=TableroAjedrez.getTableroAjedrez().obtenerCaja(columDest, filaDest);
		if(this.esBlanca()) {
			//dos para adelante
			if(filaCom==1 && filaDest==3 && columCom==columDest) {
				esPosible=true;
			}
			//uno para adelante
			if(filaCom+1==filaDest && columCom==columDest && !cajaDestino.hayPieza()) {
				esPosible=true;
			}
			//para comer
			if(cajaDestino.hayPieza() && !cajaDestino.getPieza().esBlanca() && (columDest==columCom+1 ||columDest==columCom-1)&& filaCom==filaDest-1) {
				esPosible=true;
			}
		}
		if(!this.esBlanca()) {
			//dos para adelante
			if(filaCom==6 && filaDest==4 && columCom==columDest) {
				esPosible=true;
			}
			//uno para adelante
			if(filaCom-1==filaDest && columCom==columDest && !cajaDestino.hayPieza()) {
				esPosible=true;
			}
			//para comer
			if(cajaDestino.hayPieza() && !cajaDestino.getPieza().esBlanca() && (columDest==columCom+1 ||columDest==columCom-1)&& filaCom==filaDest+1) {
				esPosible=true;
			}
		}
		
		return esPosible;
	}

}
