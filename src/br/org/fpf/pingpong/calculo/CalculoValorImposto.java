package br.org.fpf.pingpong.calculo;

import br.org.fpf.pingpong.constants.FaixaRendaEnum;
import br.org.fpf.pingpong.utils.MathUtils;

public class CalculoValorImposto {

	public Object calculaValorImposto(Double salario) {
		
		salario = MathUtils.trucate(salario, 2);

		if (FaixaRendaEnum.A_MIN.getValor() <= salario
				&& salario <= FaixaRendaEnum.A_MAX.getValor()) {
			return 0D;
			
		} else if(FaixaRendaEnum.B_MIN.getValor() <= salario
				&& salario <= FaixaRendaEnum.B_MAX.getValor()){
			
			salario -= FaixaRendaEnum.A_MAX.getValor();
			salario = MathUtils.round(salario, 2);
			
			return salario * 0.075D;
			
		}  else if(FaixaRendaEnum.B_MIN.getValor() <= salario
				&& salario <= FaixaRendaEnum.B_MAX.getValor()){
			
			salario -= FaixaRendaEnum.A_MAX.getValor();
			salario = MathUtils.round(salario, 2);
			
			return salario * 0.15D;
		}

		return Double.NaN;
	}
}
