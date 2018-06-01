package Ajedrez;

public class Alfil extends Pieza {
	
	public Alfil(boolean pEsBlanca)
	{
		super(pEsBlanca);
	}

	public boolean posibleMovimiento(int filaCom, int columCom, int filaDest, int columDest)
	{
		boolean puedeMoverse = true;
		TableroAjedrez TA = TableroAjedrez.getTableroAjedrez();
		int sumadorFila;
		int sumadorColum;
		int colum = columCom;
		int fila = filaCom;
		if (filaCom==filaDest || columCom==columDest || Math.abs(filaCom-filaDest)!=Math.abs(columCom-columDest))
		{
			puedeMoverse = false;
		}
		else
		{
			if (filaCom<filaDest && columCom<columDest)
			{
				sumadorFila = 1;
				sumadorColum = 1;
			}
			else if (filaCom<filaDest && columCom>columDest)
			{
				sumadorFila = 1;
				sumadorColum = -1;
			}
			else if (filaCom>filaDest && columCom<columDest)
			{
				sumadorFila = -1;
				sumadorColum = 1;
			}
			else
			{
				sumadorFila = -1;
				sumadorColum = -1;
			}
			fila = fila + sumadorFila;
			colum = colum + sumadorColum;
			while (fila!=filaDest && puedeMoverse)
			{
				if (TA.obtenerCaja(colum, fila).getPieza()!=null)
				{
					puedeMoverse = false;
				}
				fila = fila + sumadorFila;
				colum = colum + sumadorColum;
			}
			if (puedeMoverse && TA.obtenerCaja(colum, fila).getPieza()!=null && TA.obtenerCaja(colum, fila).getPieza().esDelMismoColor(TA.obtenerCaja(columCom, filaCom).getPieza()))
			{
				puedeMoverse = false;
			}
		}
		return puedeMoverse;
	}

}
