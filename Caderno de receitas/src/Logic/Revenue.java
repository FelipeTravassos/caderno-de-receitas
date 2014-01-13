package Logic;

public class Revenue {

	String name = "";
	String type = "";
	String ingredients = "";
	String recipe = "";
	
	public void setName(String name) throws Exception{
		if(!name.equals(""))
			this.name = name;
		else
			throw new Exception("Campo vazio");
	}

	public void setType(String type) throws Exception{
		if(!type.equals(""))
			this.type = type;
		else
			throw new Exception("Campo vazio");		
	}

	public void setIngredients(String ingredients) throws Exception{
		if(!ingredients.equals(""))
			this.ingredients = ingredients;
		else
			throw new Exception("Campo vazio");	
	}

	public void setRecipe(String recipe) throws Exception{
		if(!recipe.equals(""))
			this.recipe = recipe;
		else
			throw new Exception("Campo vazio");	
	}

}
