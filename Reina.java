package Ajedrez;

public class Reina extends Pieza {
	
	public Reina(boolean pEsBlanca)
	{
		super(pEsBlanca);
	}

	public boolean posibleMovimiento(int filaCom, int columCom, int filaDest, int columDest)
	{
		return true;
	}

}
