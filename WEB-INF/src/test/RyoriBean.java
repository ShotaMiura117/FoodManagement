package test;

public class RyoriBean {
	private String materials_name;
	private  double volume;
	private String unit_id;


	public RyoriBean(String materials_name, double volume, String unit_id) {
		this.materials_name = materials_name;
		this.volume = volume;
		this.unit_id = unit_id;
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


	public String getUnit_id() {
		return unit_id;
	}


	public void setUnit_id(String unit_id) {
		this.unit_id = unit_id;
	}
}
