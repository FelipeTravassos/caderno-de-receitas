package Controllers;

import java.util.ArrayList;
import java.util.List;

import Logic.Revenue;

public class Revenues {

	List<Revenue> revenues = new ArrayList<Revenue>();
	List<String> types = new ArrayList<String>();
	
	public int getNumberOfRevenue() {
		return revenues.size();
	}

	public void addRevenue(String name, String type, String ingredients,
			String recipe) throws Exception{
		Revenue revenue = new Revenue();
		
		revenue.setName(name);
		revenue.setType(type);
		revenue.setIngredients(ingredients);
		revenue.setRecipe(recipe);
		
		revenues.add(revenue);
		addType(type);
	}

	public ArrayList<String> getTypeOfRevenues() {
		return (ArrayList<String>) types;
	}

	public void addType(String type) {
		if (!this.types.contains(type)){
			this.types.add(type);
		}
	}

	public ArrayList<String> getRevenuesOfType(String type) {
		List<String> retorno = new ArrayList<String>();
		
		for (Revenue revenue : revenues) {
			if(revenue.getType().equals(type))
				retorno.add(revenue.getName());
		}
		
		return (ArrayList<String>) retorno;
	}

	public void delete(String nameOfRevenue) {
		for (int i = 0; i < revenues.size(); i++) {
			if(revenues.get(i).getName().equals(nameOfRevenue))
				revenues.remove(i);
		}
	}
}
