package Controllers;


public class Controller {

	Revenues revenues;
	
	public Controller() {
		this.revenues = new Revenues();
	}
	
	public int getNumberOfRevenue() {
		return this.revenues.getNumberOfRevenue();
	}

	public void addRevenue(String name, String type, String ingredients,
			String recipe) throws Exception{
		this.revenues.addRevenue(name, type, ingredients, recipe);
	}

}
