package br.org.fpf.pingpong.senha;

public class ValidaSenha {

	private static final int MIN_PASSWD_LENGTH = 5;
	private static final int MAX_PASSWD_LENGTH = 10;

	public boolean ehValida(String senha) {
		
		if(senha.toCharArray().length < MIN_PASSWD_LENGTH){
			return false;
			
		} else if(senha.toCharArray().length > MAX_PASSWD_LENGTH) {
			return false;
			
		} else if(!senha.matches("(\\d*\\n*).([A-Z])+.(\\d*\\n*)")){
			return false;
			
		} else if(!senha.matches("(\\d*\\n*).([a-z])+.(\\d*\\n*)")){
			return false;
		}
		
		return true;
	}

	
}
