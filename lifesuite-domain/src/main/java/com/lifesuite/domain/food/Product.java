package com.lifesuite.domain.food;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Product {
	
	@Id @GeneratedValue
	public Long id;
	
	@Index
	@Property(name="long_name")
	private String name;
	
	@Property(name="ingredients_english")
	private String ingredients;
	
	@Relationship(type="HAS_NUTRIENT", direction="OUTGOING")
	private List<Nutrient> nutrients = new ArrayList<>();
	
	@Relationship(type="HAS_SERVING_SIZE", direction="OUTGOING")
	private ServingSize servingSize;

	public Product() {
		
	}
	
	public Product(String name, String ingredients) {
		super();
		this.name = name;
		this.ingredients = ingredients;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ingredients
	 */
	public String getIngredients() {
		return ingredients;
	}

	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	/**
	 * @return the nutrients
	 */
	public List<Nutrient> getNutrients() {
		return nutrients;
	}

	/**
	 * @param nutrients the nutrients to set
	 */
	public void setNutrients(List<Nutrient> nutrients) {
		this.nutrients = nutrients;
	}

	/**
	 * @return the servingSize
	 */
	public ServingSize getServingSize() {
		return servingSize;
	}

	/**
	 * @param servingSize the servingSize to set
	 */
	public void setServingSize(ServingSize servingSize) {
		this.servingSize = servingSize;
	}
	
	
}
