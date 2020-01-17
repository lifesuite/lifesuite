package com.lifesuite.domain.food;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@NodeEntity
public class ServingSize {

	@Id @GeneratedValue
	public Long id;
	
	@Property(name="Serving_Size")
	private Double value;
	
	@Property(name="Serving_Size_UOM")
	private String unitOfMeasurement;
	
	@Property(name="Household_Serving_Size")
	private Double logicalValue;
	
	@Property(name="Household_Serving_Size_UOM")
	private String logicalUnitOfMeasure;
	
	public ServingSize() {
		
	}

	public ServingSize(Double value, String unitOfMeasurement, Double logicalValue, String logicalUnitOfMeasure) {
		super();
		this.value = value;
		this.unitOfMeasurement = unitOfMeasurement;
		this.logicalValue = logicalValue;
		this.logicalUnitOfMeasure = logicalUnitOfMeasure;
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

	/**
	 * @return the logicalValue
	 */
	public Double getLogicalValue() {
		return logicalValue;
	}

	/**
	 * @param logicalValue the logicalValue to set
	 */
	public void setLogicalValue(Double logicalValue) {
		this.logicalValue = logicalValue;
	}

	/**
	 * @return the logicalUnitOfMeasure
	 */
	public String getLogicalUnitOfMeasure() {
		return logicalUnitOfMeasure;
	}

	/**
	 * @param logicalUnitOfMeasure the logicalUnitOfMeasure to set
	 */
	public void setLogicalUnitOfMeasure(String logicalUnitOfMeasure) {
		this.logicalUnitOfMeasure = logicalUnitOfMeasure;
	}
	
	
	
}
