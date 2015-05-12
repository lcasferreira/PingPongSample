package br.org.fpf.pingpong;

import br.org.fpf.pingpong.calculo.CalculoAliquotaImposto;

public class MainClass {

	public static void main(String[] args) {
		
		CalculoAliquotaImposto calcAliquota = new CalculoAliquotaImposto();

		Double salario = 2826.669D;
		
		String result = calcAliquota.calculaFaixaAliquota(salario);
		
		System.out.println(result);
	}

}
