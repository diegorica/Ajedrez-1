package Ajedrez;

public class Caballo extends Pieza {
	
	public Caballo(boolean pEsBlanca)
	{
		super(pEsBlanca);
	}

	public boolean posibleMovimiento(int filaCom, int columCom, int filaDest, int columDest)
	{
		boolean puedeMoverse = false;
		TableroAjedrez TA = TableroAjedrez.getTableroAjedrez();
		if (TA.obtenerCaja(columDest, filaDest).getPieza()==null || !TA.obtenerCaja(columDest, filaDest).getPieza().esDelMismoColor(TA.obtenerCaja(columCom, filaCom).getPieza()))
		{
			if (filaDest == filaCom+2 && columDest == columCom+1)
			{
				puedeMoverse = true;
			}
			else if (filaDest == filaCom+2 && columDest == columCom-1)
			{
				puedeMoverse = true;
			}
			else if (filaDest == filaCom+1 && columDest == columCom+2)
			{
				puedeMoverse = true;
			}
			else if (filaDest == filaCom+1 && columDest == columCom-2)
			{
				puedeMoverse = true;
			}
			else if (filaDest == filaCom-1 && columDest == columCom+2)
			{
				puedeMoverse = true;
			}
			else if (filaDest == filaCom-1 && columDest == columCom-2)
			{
				puedeMoverse = true;
			}
			else if (filaDest == filaCom-2 && columDest == columCom+1)
			{
				puedeMoverse = true;
			}
			else if (filaDest == filaCom-2 && columDest == columCom-1)
			{
				puedeMoverse = true;
			}
		}
		return puedeMoverse;
	}

}
