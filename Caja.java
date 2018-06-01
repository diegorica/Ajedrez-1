package Ajedrez;

public class Caja {

	private Pieza pieza;

	public Caja(Pieza pPieza)
	{
		this.pieza = pPieza;
	}
	
	public Pieza getPieza(){
		return this.pieza;  
	}
	
	public void cambiarPieza(Pieza pPieza){
		this.pieza = pPieza;
	}
	
	public String imprimirPieza(){
		String S = "  ";
		if (this.pieza != null)
		{
			if (this.pieza.esBlanca())
			{
				if (this.pieza instanceof Torre)
				{
					S = "Tb";
				}
				else if (this.pieza instanceof Caballo)
				{
					S = "Cb";
				}
				else if (this.pieza instanceof Alfil)
				{
					S = "Ab";
				}
				else if (this.pieza instanceof Rey)
				{
					S = "Kb";
				}
				else if (this.pieza instanceof Reina)
				{
					S = "Qb";
				}
				else
				{
					S = "Pb";
				}
			}
			else
			{
				if (this.pieza instanceof Torre)
				{
					S = "Tn";
				}
				else if (this.pieza instanceof Caballo)
				{
					S = "Cn";
				}
				else if (this.pieza instanceof Alfil)
				{
					S = "An";
				}
				else if (this.pieza instanceof Rey)
				{
					S = "Kn";
				}
				else if (this.pieza instanceof Reina)
				{
					S = "Qn";
				}
				else
				{
					S = "Pn";
				}
			}
		}
		return S;
	}
	
	public boolean hayPieza() {
		boolean hay=true;
		if (this.pieza==null) {
			hay= false;
		}
		return hay;
	}
}
