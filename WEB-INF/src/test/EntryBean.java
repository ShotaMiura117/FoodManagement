package test;

public class EntryBean {
	private String materials_name;
	private String item_name;
	private String expiration_date;
	private double volume;
	private int unit_id;
	private double quantity;
	private int genre_id;
	private int open_check;
	private int save_method;
	private String filling_date;


	public EntryBean(String materials_name, String item_name, String expiration_date, double volume, int unit_id,
			double quantity, int genre_id, int open_check, int save_method,String filling_date) {
		this.materials_name = materials_name;
		this.item_name = item_name;
		this.expiration_date = expiration_date;
		this.volume = volume;
		this.unit_id = unit_id;
		this.genre_id = genre_id;
		this.open_check = open_check;
		this.quantity = quantity;
		this.filling_date = filling_date;
		this.save_method = save_method;
	}

	public void setMaterials_name(String materials_name) {
		this.materials_name = materials_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public void setUnit_id(int unit_id) {
		this.unit_id = unit_id;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}

	public void setOpen_check(int open_check) {
		this.open_check = open_check;
	}

	public void setSave_method(int save_method) {
		this.save_method = save_method;
	}

	public void setFilling_date(String filling_date) {
		this.filling_date = filling_date;
	}

	public String getMaterials_name() {
		return materials_name;
	}

	public String getItem_name() {
		return item_name;
	}

	public String getExpiration_date() {
		return expiration_date;
	}

	public double getVolume() {
		return volume;
	}

	public int getUnit_id() {
		return unit_id;
	}

	public double getQuantity() {
		return quantity;
	}

	public int getGenre_id() {
		return genre_id;
	}

	public int getOpen_check() {
		return open_check;
	}

	public int getSave_method() {
		return save_method;
	}

	public String getFilling_date() {
		return filling_date;
	}


}