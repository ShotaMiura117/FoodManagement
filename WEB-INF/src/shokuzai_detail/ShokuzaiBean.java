package shokuzai_detail;

public class ShokuzaiBean {

	private int shokuzai_id;
	private int pk_id;
	private String materials_name;

	public ShokuzaiBean() {
	}
	public ShokuzaiBean(int shokuzai_id, int pk_id, String materials_name) {
		this.shokuzai_id = shokuzai_id;
		this.pk_id = pk_id;
		this.materials_name = materials_name;
	}

	public int getShokuzai_id() {
		return shokuzai_id;
	}
	public void setShokuzai_id(int shokuzai_id) {
		this.shokuzai_id = shokuzai_id;
	}
	public int getPk_id() {
		return pk_id;
	}
	public void setPk_id(int pk_id) {
		this.pk_id = pk_id;
	}
	public String getMaterials_name() {
		return materials_name;
	}
	public void setMaterials_name(String materials_name) {
		this.materials_name = materials_name;
	}


//	public String getNo() {
//		return no;
//	}
//	public void setNo(String no) {
//		this.no = no;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getMoney() {
//		return money;
//	}
//	public void setMoney(int money) {
//		this.money = money;
//	}
}
