package dojo1;

import java.util.HashSet;
import java.util.Set;

public class CalculadorNumeroFeliz {
	private Set<Integer> vistos = new HashSet<Integer>();
	
	public Integer retornaSomaDoQuadrado(int numero) {	
		String digitos = String.valueOf(numero).replace("0", "");
		Integer total =0;
		for (int i = 0; i < digitos.length(); i++) {
			char charAt = digitos.charAt(i);
			Integer valueOf = Character.getNumericValue(charAt);
			total += valueOf * valueOf;
		}
		return total;
	
	}
	
	
	public boolean calcular(int numero) {
		if(numero == 1)
			return  true;
//		if (numero <= 0) {
//			return false;
//		}
		
		int resposta = retornaSomaDoQuadrado(numero);
		if (!vistos.add(resposta)) {
			return false;
		}
		return calcular(resposta);
		
	}
}
