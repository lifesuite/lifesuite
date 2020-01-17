package com.lifesuite.domain.food;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class Nutrient {

	@Id @GeneratedValue
	public Long id;
	
	@Property(name="Nutrient_name")
	private String name;
	
	@Property(name="Output_value")
	private Double value;
	
	@Property(name="Output_uom")
	private String unitOfMeasurement;
	
	public Nutrient() {
		
	}

	public Nutrient(String name, Double value, String unitOfMeasurement) {
		super();
		this.name = name;
		this.value = value;
		this.unitOfMeasurement = unitOfMeasurement;
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
	 * @return the value
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Double value) {
		this.value = value;
	}

	/**
	 * @return the unitOfMeasurement
	 */
	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	/**
	 * @param unitOfMeasurement the unitOfMeasurement to set
	 */
	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}
	
	
	
}
