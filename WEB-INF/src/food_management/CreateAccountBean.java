package food_management;

public class CreateAccountBean {

	private String user_id;
	private String password;

	public CreateAccountBean() {
	}

	public CreateAccountBean(String user_id, String password) {


		this.user_id = user_id;
		this.password = password;
	}

	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPasswor(String password) {
		this.password = password;
	}
}
