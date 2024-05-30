package food_management;

import java.sql.Date;

public class ShokuzaiListBean {

	private int shokuzaiID;
	private String name;
	private String item;
	private Date expiration;
	private double volume;
	private String unit;
	private double quantity;
	private String genre;
	private int open;
	private int save;
	private Date filling;
	private int sFavorite;
	private double defaVolume;

	public ShokuzaiListBean(){
	}

	public ShokuzaiListBean(int shokuzaiID, String name, String item,Date expiration,
			double volume, String unit, double quantity, String genre,
			int open, int save, Date filling, int sFavorite, double defaVolume) {
		this.shokuzaiID=shokuzaiID;
		this.name=name;
		this.item=item;
		this.expiration=expiration;
		this.volume=volume;
		this.unit=unit;
		this.quantity=quantity;
		this.genre=genre;
		this.open=open;
		this.save=save;
		this.filling=filling;
		this.defaVolume=defaVolume;
		this.sFavorite=sFavorite;
	}


	public void setShokuzaiID(int shokuzaiID) {
		this.shokuzaiID=shokuzaiID;
	}
	public int getShokuzaiID() {
		return shokuzaiID;
	}


	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}


	public void setItem(String item) {
		this.item=item;
	}
	public String getItem() {
		return item;
	}

	public void setExpiration(Date expiration) {
		this.expiration=expiration;
	}
	public Date getExpiration() {
		return expiration;
	}


	public void setVolume(double volume) {
		this.volume=volume;
	}
	public double getVolume() {
		return volume;
	}


	public void setUnit(String unit) {
		this.unit=unit;
	}
	public String getUnit() {
		return unit;
	}


	public void setGenre(String genre) {
		this.genre=genre;
	}
	public String getGenre() {
		return genre;
	}


	public void setQuantity(double quantity) {
		this.quantity=quantity;
	}
	public double getQuantity() {
		return quantity;
	}


	public void setOpen(int open) {
		this.open=open;
	}
	public int getOpen() {
		return open;
	}


	public void setFilling(Date filling) {
		this.filling=filling;
	}
	public Date getFilling() {
		return filling;
	}


	public void setSave(int save) {
		this.save=save;
	}
	public int getSave() {
		return save;
	}


	public void setDefaVolume(double defaVolume) {
		this.defaVolume=defaVolume;
	}
	public double getDefaVolume() {
		return defaVolume;
	}


	public void setSFavorite(int sFavorite) {
		this.sFavorite=sFavorite;
	}
	public int getSFavorite() {
		return sFavorite;
	}

}
