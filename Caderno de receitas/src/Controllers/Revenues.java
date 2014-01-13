package Controllers;

import java.util.ArrayList;
import java.util.List;

import Logic.Revenue;

public class Revenues {

	List<Revenue> revenues = new ArrayList<Revenue>();
	
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
	}

}
