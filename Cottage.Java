import java.io.Serializable;
/*
 * Author: Simon Zhou

 * This is a cottage class, a child class of house class.
 */


public class Cottage extends House implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5967550407623834121L;
	
	private double lakeFrontage; //initialize attribute
	
	public Cottage(double listPrice, double floorSpace, int bedroomNum, int bathroomNum, double widthNum,
			double depthNum, double lakeFrontage) throws BadBuildingException {//constructor
		super(listPrice, floorSpace, bedroomNum, bathroomNum, widthNum, depthNum, HouseType.WATERFRONT_HOME); //load attributes from parent class
		
		if (lakeFrontage <= 0) //throw exception if lake frontage less than 0
			throw new BadBuildingException("The lake frontage has to be greater than 0");
		this.lakeFrontage = lakeFrontage;//set attribute
	}
	
	public String toString() {//Override toString method
		String result = "Cottage, " + this.getHouseClassification() + this.getWidthNum() + "m width by " + this.getDepthNum() + "m depth, ";
		result += this.getBedRoomNum() + " bedrooms, " + this.getFloorSpace() + " square meters building, asking price is: " + this.getListPrice();
		return result;
	}
	
	public double calculateTax() {//Override calculate tax method
		double start = 2000;
		start += 2.0 * this.lakeFrontage;
		return start;
	}
	
	//All methods below are getter and setter method
	public double getLakeFrontage() {
		return lakeFrontage;
	}
	
	public void setLakeFrontage(double lakeFrontage) {
		this.lakeFrontage = lakeFrontage;
	}
}
