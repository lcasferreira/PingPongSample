package br.org.fpf.pingpong.senha;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ValidaSenhaTest {

	private ValidaSenha validador;
	private String senha;
	
	@Before
	public void preparaTeste(){
		validador = new ValidaSenha();
	}
	
	@Test
	public void teste_senha_nula_retorna_falso(){
		senha = null;
		
		assertFalse(validador.ehValida(senha));
	}
	
	@Test
	public void teste_senha_espacos_retorna_falso(){
		senha = "     ";
		
		assertFalse(validador.ehValida(senha));
	}
	
	@Test
	public void teste_senha_em_branco_retorna_falso(){
		senha = "";
		
		assertFalse(validador.ehValida(senha));
	}
	
	@Test
	public void teste_senha_tamanho_minimo_retorna_falso(){
		senha = "1234";
		
		assertFalse(validador.ehValida(senha));
	}
	
	@Test
	public void teste_senha_tamanho_maximo_retorna_falso(){
		senha = "1234567891011";
		
		assertFalse(validador.ehValida(senha));
	}
	
	@Test
	public void teste_senha_tamanho_minimo_retorna_verdadeiro(){
		senha = "1aE4&";
		
		assertTrue(validador.ehValida(senha));
	}
	
	@Test
	public void teste_senha_tamanho_maximo_retorna_verdadeiro(){
		senha = "1a3A567@90";
		
		assertTrue(validador.ehValida(senha));
	}
	
	@Test
	public void teste_senha_letra_maiuscula_retorna_falso(){
		senha = "1234567890";
		
		assertFalse(validador.ehValida(senha));
	}
	
	@Test
	public void teste_senha_letra_minuscula_retorna_falso(){
		senha = "123A567890";
		
		assertFalse(validador.ehValida(senha));
	}
	
	@Test
	public void teste_senha_caracter_especial_retorna_falso(){
		senha = "123A56a890";
		
		assertFalse(validador.ehValida(senha));
	}
	
	@Test
	public void teste_senha_caracter_especial_retorna_verdadeiro(){
		senha = "1#3A56a890";
		
		assertTrue(validador.ehValida(senha));
	}
}
