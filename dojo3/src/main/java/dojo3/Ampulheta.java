package dojo3;

public class Ampulheta {
	private int tempoTotal;
	private int tempoDisponivel;

	public Ampulheta (int tempo ) {
		setTempoTotal(tempo);
		tempoDisponivel = tempo;
	}
	
	public int getTempoDisponivel() {
		return tempoDisponivel;
	}

	public void setTempoDisponivel(int tempoDisponivel) {
		this.tempoDisponivel = tempoDisponivel;
	}

	public int getTempoTotal() {
		return tempoTotal;
	}

	private void setTempoTotal(int tempo) {
		this.tempoTotal = tempo;
	}

	@Override
	public String toString() {
		return "Ampulheta [tempoTotal=" + tempoTotal + ", tempoDisponivel=" + tempoDisponivel + "]";
	}

	public void subtrai(int diferenca) {
		this.tempoDisponivel -= diferenca;
	}
	
	
}
