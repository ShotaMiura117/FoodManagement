package shokuzaiList;

public class WrDataBean {
	private int wShokuzaiID;
	private double wVolume;


	public WrDataBean() {
	}

	public WrDataBean(int wShokuzaiID,double wVolume) {
		this.wShokuzaiID=wShokuzaiID;
		this.wVolume=wVolume;

	}

	public void setWShokuzaiID(int wShokuzaiID) {
		this.wShokuzaiID=wShokuzaiID;
	}
	public int getWShokuzaiID() {
		return wShokuzaiID;
	}


	public void setWVolume(double wVolume) {
		this.wVolume=wVolume;
	}
	public double getWVolume() {
		return wVolume;
	}

}
