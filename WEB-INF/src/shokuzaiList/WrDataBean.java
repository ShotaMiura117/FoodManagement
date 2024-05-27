package shokuzaiList;

public class WrDataBean {
	private String wShokuzaiID;
	private String wVolume;


	public WrDataBean() {
	}

	public WrDataBean(String wShokuzaiID,String wVolume) {
		this.wShokuzaiID=wShokuzaiID;
		this.wVolume=wVolume;

	}

	public void setWShokuzaiID(String wShokuzaiID) {
		this.wShokuzaiID=wShokuzaiID;
	}
	public String getWShokuzaiID() {
		return wShokuzaiID;
	}


	public void setWVolume(String wVolume) {
		this.wVolume=wVolume;
	}
	public String getWVolume() {
		return wVolume;
	}

}
