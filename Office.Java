import java.io.Serializable;

/*
 * Author: Simon Zhou

 * This class is a child class of ntiUnitBuilding class.
 */

public class Office extends MultiUnitBuilding implements Serializable{

	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -7675487248799451726L;
	
	private OfficeType officeClassification; //initialize attribute
	
	
	public Office(double listPrice, double floorSpaceB, int unitsInBuildingNum, boolean elevator, OfficeType officeClassification)
			throws BadBuildingException { //constructor
		super(listPrice, floorSpaceB, unitsInBuildingNum, elevator); //load attributes from parent class
		
		this.officeClassification = officeClassification; //set attribute
		
		
	}
	
	//Getter and setter method
	public OfficeType getOfficeType() {
		return officeClassification;
	}
	
	public void setOfficeType(OfficeType officeClassification) {
		this.officeClassification = officeClassification;
	}
	
	public double calculateTax() {//Override calculate tax method
		double standardTaxTemp = 10.0 * this.getFloorSpaceB() + 20.0 * this.getUnitsInBuildingNum();
		if (this.getElevator() == true)
			standardTaxTemp += 50.0;
		else
			standardTaxTemp += 0.0;
		double standardTax = standardTaxTemp;
		if (this.officeClassification == OfficeType.INDUSTRIAL) //if office type is industrial, get 15% discount 
			standardTax = standardTax * 0.85;
		else if (this.officeClassification == OfficeType.SERVICE)//if office type is service, get 5% discount
			standardTax = standardTax * 0.95;
		
		return standardTax;
	}
	
	public String toString() { //Override toString method
		String elevatorRlst = null;
		if (this.getElevator() == true)
			elevatorRlst = "have elevator, ";
		else
			elevatorRlst = "have no elevator, ";
		
		String result = "Office, type: " + this.getOfficeType() + ", " + this.getUnitsInBuildingNum() + " units, ";
		result += super.getFloorSpaceB() + " sqaure meter bulding, " + elevatorRlst + "asking price is: " + this.getListPrice();
		return result;
	}

}
