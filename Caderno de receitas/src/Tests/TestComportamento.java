package Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Controllers.Controller;
import Logic.Revenue;

/**
 * 
 * @author felipe
 *
 */
public class TestComportamento {

	Controller caderno;
	
	@Before
	public void setUp(){
		caderno = new Controller();
	}
	/**
	 * Test US_001- Cadastrar
	 * Tests joined new revenue, field name, type, ingredients 
	 * and recipe must be filled
	 */
	@Test
	public void US_001() {		
		Assert.assertEquals(caderno.getNumberOfRevenue(), 0);
		
		String name = "";
		String type = "type of revenue";
		String ingredients = "ingredients of revenue";
		String recipe = "recipe of revenue";
		
		try {
			caderno.addRevenue(name, type, ingredients, recipe);
			fail("Aceitou o cadastro de receita invalida");
		} catch (Exception e) {
		}
		Assert.assertEquals(caderno.getNumberOfRevenue(), 0);
		
		name = "name of revenue";
		type = "";
		ingredients = "ingredients of revenue";
		recipe = "recipe of revenue";
		
		try {
			caderno.addRevenue(name, type, ingredients, recipe);
			fail("Aceitou o cadastro de receita invalida");
		} catch (Exception e) {
		}
		Assert.assertEquals(caderno.getNumberOfRevenue(), 0);
		
		name = "name of revenue";
		type = "type of revenue";
		ingredients = "";
		recipe = "recipe of revenue";
		
		try {
			caderno.addRevenue(name, type, ingredients, recipe);
			fail("Aceitou o cadastro de receita invalida");
		} catch (Exception e) {
		}
		Assert.assertEquals(caderno.getNumberOfRevenue(), 0);
		
		name = "name of revenue";
		type = "type of revenue";
		ingredients = "ingredients of revenue";
		recipe = "";
		
		try {
			caderno.addRevenue(name, type, ingredients, recipe);
			fail("Aceitou o cadastro de receita invalida");
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
			fail("Nao cadastrou uma receita valida");
		}
		Assert.assertEquals(caderno.getNumberOfRevenue(), 1);
		
	}
	
	/**
	 * Test US_002- Deletar
	 * Delete revenue, first the type should be selected and 
	 * then the recipe to be deleted
	 */
	@Test
	public void US002() {
		String name = "name of revenue";
		String type = "type of revenue";
		String ingredients = "ingredients of revenue";
		String recipe = "recipe of revenue";
		
		try {
			caderno.addRevenue(name, type, ingredients, recipe);
		} catch (Exception e) {		}
		
		ArrayList<String> typesOfRevenues = caderno.getTypeOfRevenues();
		
		ArrayList<String> revenuesOfType = caderno.getRevenuesOfType(typesOfRevenues.get(0));
		
		Assert.assertEquals(revenuesOfType.size(), 1);
		
		caderno.delete(revenuesOfType.get(0));
		
		revenuesOfType = caderno.getRevenuesOfType(typesOfRevenues.get(0));
		
		Assert.assertEquals(revenuesOfType.size(), 0);
	}

}
