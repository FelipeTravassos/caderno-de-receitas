package Tests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import Controllers.Controller;

/**
 * 
 * @author felipe
 *
 */
public class TestComportamento {

	/**
	 * Test US_001- Cadastrar
	 * Tests joined new revenue, field name, type, ingredients 
	 * and recipe must be filled
	 */
	@Test
	public void US_001() {
		Controller caderno = new Controller();
		
		Assert.assertEquals(caderno.getNumberOfRevenue(), 0);
		
		String name = "";
		String type = "type of revenue";
		String ingredients = "ingredients of revenue";
		String recipe = "recipe of revenue";
		
		try {
			caderno.addRevenue(name, type, ingredients, recipe);
		} catch (Exception e) {
		}
		Assert.assertEquals(caderno.getNumberOfRevenue(), 0);
		
		name = "name of revenue";
		type = "";
		ingredients = "ingredients of revenue";
		recipe = "recipe of revenue";
		
		try {
			caderno.addRevenue(name, type, ingredients, recipe);
		} catch (Exception e) {
		}
		Assert.assertEquals(caderno.getNumberOfRevenue(), 0);
		
		name = "name of revenue";
		type = "type of revenue";
		ingredients = "";
		recipe = "recipe of revenue";
		
		try {
			caderno.addRevenue(name, type, ingredients, recipe);
		} catch (Exception e) {
		}
		Assert.assertEquals(caderno.getNumberOfRevenue(), 0);
		
		name = "name of revenue";
		type = "type of revenue";
		ingredients = "ingredients of revenue";
		recipe = "";
		
		try {
			caderno.addRevenue(name, type, ingredients, recipe);
		} catch (Exception e) {
		}
		Assert.assertEquals(caderno.getNumberOfRevenue(), 0);
		
		name = "name of revenue";
		type = "type of revenue";
		ingredients = "ingredients of revenue";
		recipe = "recipe of revenue";
		
		try {
			caderno.addRevenue(name, type, ingredients, recipe);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertEquals(caderno.getNumberOfRevenue(), 1);
		
	}

}
