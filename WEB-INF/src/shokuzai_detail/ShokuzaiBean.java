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
	private double default_volume;
	private int shokuzai_favorite;
	private String genre_name;
	private String unit_name;



	public ShokuzaiBean() {
	}
	public ShokuzaiBean(int shokuzai_id, int pk_id, String materials_name, String item_name,
			int quantity, int open_check, int save_method, int genre_id, String filling_date,
			String expiration_date, int volume, int unit_id, double default_volume,
			int shokuzai_favorite, String genre_name, String unit_name) {

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
		this.default_volume = default_volume;
		this.shokuzai_favorite = shokuzai_favorite;
		this.genre_name = genre_name;
		this.unit_name = unit_name;

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
	public String getOpen_check() {
		if(open_check == 1) {
			return "開封済み";
		} else{
			return "未開封";
		}
	}
	public void setOpen_check(int open_check) {
		this.open_check = open_check;
	}
	public String getSave_method() {
		if(save_method == 1) {
			return "冷蔵庫";
		} else if(save_method == 2) {
			return "冷凍庫";
		} else if(save_method == 3) {
			return "野菜室";
		} else if(save_method == 4) {
			return "常温保存";
		} else {
			return null;
		}
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
	public double getDefault_volume() {
		return default_volume;
	}
	public void setDefault_volume(double default_volume) {
		this.default_volume = default_volume;
	}
	public int getShokuzai_favorite() {
		return shokuzai_favorite;
	}
	public void setShokuzai_favorite(int shokuzai_favorite) {
		this.shokuzai_favorite = shokuzai_favorite;
	}
	public String getUnit_name() {
		return unit_name;
	}
	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}
	public String getGenre_name() {
		return genre_name;
	}
	public void setGenre_name(String genre_name) {
		this.genre_name = genre_name;
	}

}
