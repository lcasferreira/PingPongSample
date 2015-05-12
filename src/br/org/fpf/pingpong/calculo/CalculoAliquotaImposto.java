package br.org.fpf.pingpong.calculo; 

import java.text.DecimalFormat;

import br.org.fpf.pingpong.constants.FaixaRendaEnum;
import br.org.fpf.pingpong.utils.MathUtils;

public class CalculoAliquotaImposto {

	DecimalFormat formatter = new DecimalFormat("#.00");
	
	public String calculaFaixaAliquota(Double salario) {
		
		if(salario != null){
			salario = MathUtils.trucate(salario, 2);
			
			if(FaixaRendaEnum.A_MIN.getValor() <= salario
					&& salario <= FaixaRendaEnum.A_MAX.getValor()) {
				
				return FaixaRendaEnum.A_MAX.getNome();
				
			} else if(FaixaRendaEnum.B_MIN.getValor() <= salario
					&& salario <= FaixaRendaEnum.B_MAX.getValor() ) {
				
				return FaixaRendaEnum.B_MAX.getNome();
				
			} else if(FaixaRendaEnum.C_MIN.getValor() <= salario
					&& salario <= FaixaRendaEnum.C_MAX.getValor() ) {
				
				return FaixaRendaEnum.C_MAX.getNome();
				
			} else if(FaixaRendaEnum.D_MIN.getValor() <= salario
					&& salario <= FaixaRendaEnum.D_MAX.getValor() ) {
				
				return FaixaRendaEnum.D_MAX.getNome();
				
			}  else if(FaixaRendaEnum.E_MIN.getValor() <= salario ) {
				
				return FaixaRendaEnum.E_MIN.getNome();
			}
		}
				
		return "ERRO";
	}
}
