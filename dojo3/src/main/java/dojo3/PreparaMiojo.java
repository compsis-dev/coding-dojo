package dojo3;

public class PreparaMiojo {
	public int contaTempo(Miojo miojo, Ampulheta ampulheta1, Ampulheta ampulheta2) {
		// calcula diferenca
		int diferenca = ampulheta1.getTempoDisponivel() - ampulheta2.getTempoDisponivel();
		System.out.println(ampulheta1 + " - " + ampulheta2);
		// valida regra de negócio
		if (diferenca == 0 || ampulheta1.getTempoTotal() < miojo.getTempoPreparo()
				|| ampulheta2.getTempoTotal() < miojo.getTempoPreparo()) {
			throw new RuntimeException();
		}

		if (miojo.getTempoPreparo() == ampulheta1.getTempoDisponivel()) {
			miojo.addTempoGasto(miojo.getTempoPreparo());
			System.out.println("Problema resolvido! " + miojo);
			return miojo.getTempoGasto();
		}
		if (miojo.getTempoPreparo() == ampulheta2.getTempoDisponivel()) {
			miojo.addTempoGasto(miojo.getTempoPreparo());
			System.out.println("Problema resolvido! " + miojo);
			return miojo.getTempoGasto();
		}
		if (miojo.getTempoPreparo() == diferenca) {
			System.out.println("Problema resolvido! " + miojo);
			//miojo.addTempoGasto(ampulheta1.getTempoTotal())
			return miojo.getTempoGasto();
		}
		// dif positivo set dif em ap1
		if (diferenca > 0) {
			miojo.addTempoGasto(Math.abs(ampulheta2.getTempoDisponivel()));
			ampulheta1.setTempoDisponivel(diferenca);
			ampulheta2.setTempoDisponivel(ampulheta2.getTempoTotal());
		} else {
			miojo.addTempoGasto(Math.abs(ampulheta1.getTempoDisponivel()));
			ampulheta2.setTempoDisponivel(-diferenca);
			ampulheta1.setTempoDisponivel(ampulheta1.getTempoTotal());
			;
		}

		return contaTempo(miojo, ampulheta1, ampulheta2);
	}
}