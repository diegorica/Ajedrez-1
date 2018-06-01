package Ajedrez;

public abstract class Pieza {
	
	private boolean esBlanca;
	
	public Pieza(boolean pEsBlanca){
		this.esBlanca = pEsBlanca;
	}
	
	public boolean esBlanca(){
		return this.esBlanca;
	}
	
	public boolean esDelMismoColor(Pieza pPieza)
	{
		if ((this.esBlanca && pPieza.esBlanca()) || (!this.esBlanca && !pPieza.esBlanca()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public abstract boolean posibleMovimiento(int pFilaComienzo, int pColumnaComienzo, int pFilaDestino, int pColumnaDestino);
}
