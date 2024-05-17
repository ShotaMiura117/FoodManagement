package ryoriZairyo;

public class ryoriZairyoBean {
	private String materials_name;
	private double volume;
	private String unit;


	public ryoriZairyoBean(String materials_name, double volume, String unit) {
		this.materials_name = materials_name;
		this.volume = volume;
		this.unit = unit;
	}


	public String getMaterials_name() {
		return materials_name;
	}


	public void setMaterials_name(String materials_name) {
		this.materials_name = materials_name;
	}


	public double getVolume() {
		return volume;
	}


	public void setVolume(double volume) {
		this.volume = volume;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


}

