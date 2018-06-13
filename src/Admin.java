
public class Admin {

	
	private String FirstName;
	private String LastName;
	private String UserId;
	private String HashPass;
	private String Privileges = "administrator";
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getUserName() {
		return UserId;
	}
	public void setUserName(String userName) {
		UserId = userName;
	}
	public String getHashPass() {
		return HashPass;
	}
	public void setHashPass(String hashPass) {
		HashPass = hashPass;
	}
}
