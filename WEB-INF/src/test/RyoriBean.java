package test;

public class RyoriBean {
	private String name;
	private int time;
	private String materials_name;
	private int volume;
	private String unit;


	public RyoriBean() {

	}

	public RyoriBean(String name, String materials_name, int time, int volume, String unit) {
		this.name = name;
		this.time = time;
		this.materials_name = materials_name;
		this.volume = volume;
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getMaterials_name() {
		return materials_name;
	}

	public void setMaterials_name(String materials_name) {
		this.materials_name = materials_name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}