import java.io.Serializable;

/*
 * Author: Simon Zhou

 * This is a MultiUnitBuilding class, a secondary parent class
 */

public abstract class MultiUnitBuilding extends Property implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2216900272907678070L;
	
	private int unitsInBuildingNum;//initialize attributes
	private double floorSpaceB;
	private boolean elevator;
	
	public MultiUnitBuilding(double listPrice, double floorSpaceB, int unitsInBuildingNum, boolean elevator) throws BadBuildingException {
		//constructor
		super(listPrice); //load attribute from parent class
		
		if (unitsInBuildingNum <= 0) //throw exception if units in the building is less than 0
			throw new BadBuildingException("The number of units in bulding should be greater than 0");
		this.unitsInBuildingNum = unitsInBuildingNum; //set attribute
		
		if (floorSpaceB <= 0) //throw exception is floor space is less than 0
			throw new BadBuildingException("The number of square meters should be greater than 0");
		this.floorSpaceB = floorSpaceB; //set attribute
		this.elevator = elevator; //set attribute
	}
	
	public String toString() { //Override toString method
		String elevatorRlst = null;
		if (this.elevator == true) //if this building has elevator, print the following message
			elevatorRlst = "have elevator, ";
		else //if not, print the following message
			elevatorRlst = "have no elevator, ";
		
		String rslt = "MultiBuilding, " + unitsInBuildingNum + " units, " + floorSpaceB + " square meter building, ";
		rslt += elevatorRlst + "asking price is: " + this.getListPrice();
		return rslt;
	}
	
	//All methods below are getter and setter method
	public double getFloorSpaceB() {
		return floorSpaceB;
	}
	
	public void setFloorSpaceB(double floorSpaceB) {
		this.floorSpaceB = floorSpaceB;
	}
	
	public int getUnitsInBuildingNum() {
		return unitsInBuildingNum;
	}
	
	public void setUnitsInBuldingNum(int unitsInBuildingNum) {
		this.unitsInBuildingNum = unitsInBuildingNum;
	}
	
	public boolean getElevator() {
		return elevator;
	}
	
	public void setElevator(boolean elevator) {
		this.elevator = elevator;
	}
	
	//Override calculate tax method, since it is a secondary parent class, simply set to 0, so that the class that extend this class will just override this method
	public double calculateTax() {
		return 0;
	}
}
