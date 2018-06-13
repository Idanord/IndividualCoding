
public class Login {
	
	public static void login(String user, String pw) {
		Admin admin = new Admin();
		user = admin.getUserName();
		pw = admin.getHashPass();
	}

}
