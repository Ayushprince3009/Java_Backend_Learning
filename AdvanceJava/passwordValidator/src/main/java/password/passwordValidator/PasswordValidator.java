package password.passwordValidator;

public class PasswordValidator {
	
	public boolean isValid(String password) {
		if(password == null) {
			return false;
		}
		
		return password.length() >= 8;
	}
}
