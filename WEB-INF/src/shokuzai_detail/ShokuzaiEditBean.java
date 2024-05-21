package shokuzai_detail;

public class ShokuzaiEditBean {

	private String materials_name;
	private String item_name;
	private double quantity;
	private int open_check;
	private int save_method;
	private int genre_id;
	private String filling_date;
	private String expiration_date;
	private double volume;
	private int unit_id;
	private int shokuzai_favorite;

	public ShokuzaiEditBean() {
	}

	public ShokuzaiEditBean(String materials_name, String item_name,
			double quantity, int open_check, int save_method, int genre_id,
			String filling_date, String expiration_date, double volume, int unit_id,
			int shokuzai_favorite) {


		this.materials_name = materials_name;
		this.item_name = item_name;
		this.quantity = quantity;
		this.open_check = open_check;
		this.save_method = save_method;
		this.genre_id = genre_id;
		this.filling_date = filling_date;
		this.expiration_date = expiration_date;
		this.unit_id = unit_id;
		this.shokuzai_favorite = shokuzai_favorite;


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
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
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
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public int getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(int unit_id) {
		this.unit_id = unit_id;
	}
	public int getShokuzai_favorite() {
		return shokuzai_favorite;
	}
	public void setShokuzai_favorite(int shokuzai_favorite) {
		this.shokuzai_favorite = shokuzai_favorite;
	}

}
