import java.io.Serializable;
/*
 * Author: Simon Zhou

 * This class is a apartment building class, it is a child class of multiunitbuilding class.
 */

public class ApartmentBuilding extends MultiUnitBuilding implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7151004755663852849L;
	
	private int tenantsNum;//attribute for this class

	
	public ApartmentBuilding(double listPrice, double floorSpaceB, int unitsInBuildingNum, int tenantsNum)//constructor
			throws BadBuildingException {
		super(listPrice, floorSpaceB, unitsInBuildingNum, true);//load attributes from parent class by using super()
		
		this.tenantsNum = tenantsNum;//set attribute
		
	}
	
	public String toString() {//Override toString method, prints information of apartment building.
		String result = "Apartment building, there are " + tenantsNum + " tenants, " + this.getFloorSpaceB() + " square meters, ";
		result += this.getUnitsInBuildingNum() + " units in the building, have elevator, asking price is: " + this.getListPrice();
		return result;
	}
	
	public double calculateTax() {//Override calculate tax method
		double tax = 35.0 * this.getFloorSpaceB() * this.getUnitsInBuildingNum();
		return tax;
	}
	
	//All methods below are getter and setter method.
	public int getTenantsNum() {
		return tenantsNum;
	}
	
	public void setTenantsNum(int tenantsNum) {
		this.tenantsNum = tenantsNum;
	}
}
