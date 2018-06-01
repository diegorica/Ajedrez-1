package Ajedrez;

public class Torre extends Pieza {
	
	public Torre(boolean pEsBlanca)
	{
		super(pEsBlanca);
	}

	public boolean posibleMovimiento(int filaCom, int columCom, int filaDest, int columDest)
	{
		boolean puedeMoverse = true;
		TableroAjedrez TA = TableroAjedrez.getTableroAjedrez();
		int sumador;
		int colum = columCom;
		int fila = filaCom;
		if (filaCom==filaDest && columCom==columDest)
		{
			puedeMoverse = false;
		}
		else if (filaCom!=filaDest && columCom==columDest)
		{
			if (filaCom<filaDest)
			{
				sumador = 1;
			}
			else
			{
				sumador = -1;
			}
			while (fila!=filaDest && puedeMoverse)
			{
				fila = fila + sumador;
				if (TA.obtenerCaja(colum, fila).getPieza()!=null)
				{
					puedeMoverse = false;
				}
			}
			if (TA.obtenerCaja(columDest, filaDest).getPieza()!=null && this.esDelMismoColor(TA.obtenerCaja(columDest, filaDest).getPieza()))
			{
				puedeMoverse = false;
			}
		}
		else if (filaCom==filaDest && columCom!=columDest)
		{
			if (columCom<columDest)
			{
				sumador = 1;
			}
			else
			{
				sumador = -1;
			}
			while (colum!=columDest && puedeMoverse)
			{
				colum = colum + sumador;
				if (TA.obtenerCaja(colum, fila).getPieza()!=null)
				{
					puedeMoverse = false;
				}
			}
			if (TA.obtenerCaja(columDest, filaDest).getPieza()!=null && this.esDelMismoColor(TA.obtenerCaja(columDest, filaDest).getPieza()))
			{
				puedeMoverse = false;
			}
		}
		else
		{
			puedeMoverse = false;
		}
		return puedeMoverse;
	}
}
