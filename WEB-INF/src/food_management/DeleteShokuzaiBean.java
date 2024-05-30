package food_management;

public class DeleteShokuzaiBean {

	private int deleteShokuzaiID;

	public DeleteShokuzaiBean(){
	}

	public  DeleteShokuzaiBean(int deleteShokuzaiID) {
	this.deleteShokuzaiID=deleteShokuzaiID;
	}

	public void setDeleteShokuzaiID(int deleteShokuzaiID) {
		this.deleteShokuzaiID=deleteShokuzaiID;
	}
	public int getDeleteShokuzaiID() {
		return deleteShokuzaiID;
	}

}