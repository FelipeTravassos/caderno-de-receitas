package Controllers;

import java.util.ArrayList;

import Logic.Revenue;


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

	public ArrayList<String> getTypeOfRevenues() {
		return revenues.getTypeOfRevenues();
	}

	public ArrayList<String> getRevenuesOfType(String type) {
		return revenues.getRevenuesOfType(type);
	}

	public void delete(String nameOfRevenue) {
		revenues.delete(nameOfRevenue);
	}

}
