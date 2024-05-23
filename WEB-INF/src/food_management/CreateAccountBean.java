package food_management;

public class CreateAccountBean {

	private long pk_id;
	private String user_id;
	private String password;

	public CreateAccountBean() {
	}

	public CreateAccountBean(long pk_id, String user_id, String password) {

		this.pk_id = pk_id;
		this.user_id = user_id;
		this.password = password;
	}
	public long getPk_id() {
		return pk_id;
	}
	public void setPk_id(long pk_id) {
		this.pk_id = pk_id;
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
