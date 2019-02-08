package dojo3;

public class Miojo {

	private int tempoPreparo;
	private int tempoGasto;

	public Miojo(int tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public void setTempoPreparo(int tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public int getTempoPreparo() {
		return tempoPreparo;
	}

	public int addTempoGasto(int tempo) {
		this.tempoGasto += tempo;
		return getTempoGasto();
	}

	public int getTempoGasto() {
		return tempoGasto;
	}

	@Override
	public String toString() {
		return "Miojo [tempoPreparo=" + tempoPreparo + ", tempoGasto=" + tempoGasto + "]";
	}
	
	
}