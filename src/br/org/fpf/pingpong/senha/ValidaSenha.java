package br.org.fpf.pingpong.senha;

public class ValidaSenha {

	private static final int MIN_PASSWD_LENGTH = 5;
	private static final int MAX_PASSWD_LENGTH = 10;

	public boolean ehValida(String senha) {
		
		if(senha == null || senha.isEmpty()) {
			return false;
		}
		
		senha = senha.trim();
		
		String specialChars = senha.replaceAll("[a-zA-Z0-9]", "");
		
		if(specialChars.isEmpty()) {
			return false;
		}

		if(senha.toCharArray().length < MIN_PASSWD_LENGTH){
			return false;
		} 

		if(senha.toCharArray().length > MAX_PASSWD_LENGTH) {
			return false;
		} 
		
		senha = senha.replaceAll("[^a-zA-Z0-9]", "");

		if(!senha.matches("(\\d*\\w*).([A-Z])+.(\\d*\\w*)")){
			return false;
		}

		if(!senha.matches("(\\d*\\w*).([a-z])+.(\\d*\\w*)")){
			return false;
		}
		
		return true;
	}

	
}
