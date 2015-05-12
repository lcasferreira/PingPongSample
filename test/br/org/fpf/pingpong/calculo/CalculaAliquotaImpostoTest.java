package br.org.fpf.pingpong.calculo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.org.fpf.pingpong.constants.FaixaRendaEnum;

public class CalculaAliquotaImpostoTest {

	CalculoAliquotaImposto calcAliquota;
	Double salario;

	@Before
	public void prepara_testes() {
		calcAliquota = new CalculoAliquotaImposto();
	}

	@Test
	public void teste_calcula_imposto_valor_negativo_retorno_ERRO() {
		salario = -1D;
		assertEquals(calcAliquota.calculaFaixaAliquota(salario), "ERRO");
	}

	@Test
	public void teste_calcula_imposto_valor_NULO_retorno_ERRO() {
		salario = null;
		assertEquals(calcAliquota.calculaFaixaAliquota(salario), "ERRO");
	}

	// Teste da Faixa B
	@Test
	public void teste_calcula_aliquota_valor_0_retorno_Faixa_A() {
		salario = 0D;
		assertEquals(FaixaRendaEnum.A_MIN.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}

	@Test
	public void teste_calcula_aliquota_valor_intermediario_retorno_Faixa_A() {
		salario = 1403.98D;
		assertEquals(FaixaRendaEnum.A_MAX.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}

	@Test
	public void teste_calcula_aliquota_valor_max_retorno_Faixa_A() {
		salario = 1903.98D;
		assertEquals(FaixaRendaEnum.A_MAX.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}
	
	@Test
	public void teste_calcula_aliquota_valor_entre_Faixas_A_e_B_retorno_Faixa_A() {
		salario = 1903.981D;
		assertEquals(FaixaRendaEnum.A_MAX.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}

	// Teste da Faixa B
	@Test
	public void teste_calcula_aliquota_valor_min_retorno_Faixa_B() {
		salario = 1903.99D;
		assertEquals(FaixaRendaEnum.B_MIN.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}

	@Test
	public void teste_calcula_aliquota_valor_intermediario_retorno_Faixa_B() {
		salario = 2400.00D;
		assertEquals(FaixaRendaEnum.B_MIN.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}

	@Test
	public void teste_calcula_aliquota_valor_max_retorno_Faixa_B() {
		salario = 2826.65D;
		assertEquals(FaixaRendaEnum.B_MAX.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}

	// Teste da Faixa C
	@Test
	public void teste_calcula_aliquota_valor_min_retorno_Faixa_C() {
		salario = 2826.66D;
		assertEquals(FaixaRendaEnum.C_MIN.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}

	@Test
	public void teste_calcula_aliquota_valor_intermediario_retorno_Faixa_C() {
		salario = 3500.00D;
		assertEquals(FaixaRendaEnum.C_MIN.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}

	@Test
	public void teste_calcula_aliquota_valor_max_retorno_Faixa_C() {
		salario = 3751.05D;
		assertEquals(FaixaRendaEnum.C_MAX.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}

	// Teste da Faixa D
	@Test
	public void teste_calcula_aliquota_valor_min_retorno_Faixa_D() {
		salario = 3751.06D;
		assertEquals(FaixaRendaEnum.D_MIN.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}
	
	@Test
	public void teste_calcula_aliquota_valor_intermediario_retorno_Faixa_D() {
		salario = 4150.00D;
		assertEquals(FaixaRendaEnum.D_MIN.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}

	@Test
	public void teste_calcula_aliquota_valor_max_retorno_Faixa_D() {
		salario = 4664.68D;
		assertEquals(FaixaRendaEnum.D_MAX.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}

	// Teste da Faixa E
	@Test
	public void teste_calcula_aliquota_valor_min_retorno_Faixa_E() {
		salario = 4664.69D;
		assertEquals(FaixaRendaEnum.E_MIN.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}
		
	@Test
	public void teste_calcula_aliquota_valor_qualquer_retorno_Faixa_E() {
		salario = 5000.00D;
		assertEquals(FaixaRendaEnum.E_MIN.getNome(), calcAliquota.calculaFaixaAliquota(salario));
	}
}
