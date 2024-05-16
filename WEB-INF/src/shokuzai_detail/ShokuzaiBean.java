package shokuzai_detail;

public class ShokuzaiBean {

	private int shokuzai_id;
	private int pk_id;
	private String materials_name;
	private String item_name;
	private int quantity;
	private int open_check;
	private int save_method;
	private int genre_id;
	private String filling_date;
	private String expiration_date;
	private int volume;
	private int unit_id;
//	private double default_volume;



	public ShokuzaiBean() {
	}
	public ShokuzaiBean(int shokuzai_id, int pk_id, String materials_name, String item_name,
			int quantity, int open_check, int save_method, int genre_id, String filling_date,
			String expiration_date, int volume, int unit_id) {
		this.shokuzai_id = shokuzai_id;
		this.pk_id = pk_id;
		this.materials_name = materials_name;
		this.item_name = item_name;
		this.quantity = quantity;
		this.open_check = open_check;
		this.save_method = save_method;
		this.genre_id = genre_id;
		this.filling_date = filling_date;
		this.expiration_date = expiration_date;
		this.unit_id = unit_id;
//		this.default_volume = default_volume;


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
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOpen_check() {
		return open_check;
	}
	public void setOpen_check(int open_check) {
		this.open_check = open_check;
	}
	public int getSave_method() {
		return save_method;
	}
	public void setSave_method(int save_method) {
		this.save_method = save_method;
	}
	public int getGenre_id() {
		return genre_id;
	}
	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}
	public String getFilling_date() {
		return filling_date;
	}
	public void setFilling_date(String filling_date) {
		this.filling_date = filling_date;
	}
	public String getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(int unit_id) {
		this.unit_id = unit_id;
	}
//	public double getDefault_volume() {
//		return default_volume;
//	}
//	public void setDefault_volume(double default_volume) {
//		this.default_volume = default_volume;
//	}


}
