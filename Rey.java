package Ajedrez;

public class Rey extends Pieza {
	
	public Rey(boolean pEsBlanca)
	{
		super(pEsBlanca);
	}

	public boolean posibleMovimiento(int filaCom, int columCom, int filaDest, int columDest)
	{
		boolean esPosible=false;
		Caja cajaDestino=TableroAjedrez.getTableroAjedrez().obtenerCaja(filaDest, columDest);
		if (this.esBlanca()) {
			if(
					!(filaCom==filaDest && columCom==columDest) &&
					 (filaCom==filaDest+1 || filaCom==filaDest || filaCom==filaDest-1) &&
					(columCom==columDest+1 ||columCom==columDest ||columCom==columDest-1) &&
					!(cajaDestino.getPieza().esBlanca())
					) {
				esPosible=true;
			}
				
		}
		if(!this.esBlanca()) {
			if(
					!(filaCom==filaDest && columCom==columDest) &&
					 (filaCom==filaDest+1 || filaCom==filaDest || filaCom==filaDest-1) &&
					(columCom==columDest+1 ||columCom==columDest ||columCom==columDest-1) &&
					(cajaDestino.getPieza().esBlanca())
					) {
				esPosible=true;
			}
		}
		return esPosible;
		}
}
