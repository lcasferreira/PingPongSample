package br.org.fpf.pingpong.calculo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculaValorImpostoTest {

	CalculoValorImposto calcImposto;
	Double salario;
	
	@Before
	public void prepara_testes() {
		calcImposto = new CalculoValorImposto();
	}
	
	@Test
	public void teste_calcula_imposto_valor_negativo_retorno_NaN(){
		salario = -1D;
		assertEquals(calcImposto.calculaValorImposto(salario), Double.NaN);
	}
	
	@Test
	public void teste_calcula_imposto_Faixa_A_valor_0_retorno_0(){
		salario = -1D;
		assertEquals(calcImposto.calculaValorImposto(0D), 0D);
	}
	
	@Test
	public void teste_calcula_imposto_Faixa_A_valor_max_retorno_0(){
		salario = 1903.98D;
		assertEquals(calcImposto.calculaValorImposto(salario), 0D);
	}

	@Test
	public void teste_calcula_imposto_Faixa_B_valor_min_retorno_0_00075(){
		salario = 1903.99D;
		assertEquals(calcImposto.calculaValorImposto(salario), 0.00075D);
	}
	
	@Test
	public void teste_calcula_imposto_Faixa_B_valor_2403_98_retorno_37_5(){
		salario = 2403.98D;
		assertEquals(calcImposto.calculaValorImposto(salario), 37.5D);
	}
	
	@Test
	public void teste_calcula_imposto_Faixa_B_valor_max_retorno_69_20025(){
		salario = 2826.65D;
		assertEquals(calcImposto.calculaValorImposto(salario), 69.20025D);
	}
	
	@Test
	public void teste_calcula_imposto_Faixa_C_valor_min_retorno_69_20025(){
		salario = 2826.65D;
		assertEquals(calcImposto.calculaValorImposto(salario), 69.20025D);
	}
}
