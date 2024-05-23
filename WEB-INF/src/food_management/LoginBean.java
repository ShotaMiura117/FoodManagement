package food_management;

public class LoginBean
{
	private String pkid;
	private String userid;
	private String password;


	public LoginBean() {
	}

	public LoginBean(String pkid, String userid, String password)
	{
		this.pkid = pkid;
		this.userid = userid;
		this.password = password;
	}

	public String getPkid()
	{
		return pkid;
	}
	public void setPkid(String pkid)
	{
		this.pkid = pkid;
	}
	public String getUserid()
	{
		return userid;
	}
	public void setUserid(String userid)
	{
		this.userid = userid;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}

}
