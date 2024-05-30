package food_management;


public class SelectShokuzaiBean{
	private int food_id;
	private String food_name;

	public SelectShokuzaiBean() {
	}
	public SelectShokuzaiBean(int food_id, String food_name) {
		this.food_name=food_name;
		this.food_id=food_id;
	}


	public  void setFoodName(String food_name) {
		this.food_name=food_name;
	}

	public String getFoodName() {
		return food_name;
}
	public  void setFoodID(int food_id) {
		this.food_id=food_id;
	}

	public int getFoodID() {
		return food_id;
}
}
