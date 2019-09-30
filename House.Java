import java.io.Serializable;
/*
 * Author: Simon Zhou

 * This is a child House class that represents a house property.
 */

public class House extends Property implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2605661507151781932L;
	//initialize all attributes for house class
	private int bathroomNum;
	private int bedroomNum;
	private double widthNum;
	private double depthNum;
	private double floorSpace;
	private HouseType houseClassification; //HouseType is a type of enums, it has three values.
	
	public House(double listPrice, double floorSpace, int bedroomNum, int bathroomNum, double widthNum, double depthNum, HouseType houseClassification) throws BadBuildingException {
		//constructor of this class
		super(listPrice); //get the price attributes from parent class
		
		if (bathroomNum <= 0) //throw exception if bedroom number is less than 0
			throw new BadBuildingException("The number of bathroom has to be greater than 0!");
		this.bathroomNum = bathroomNum;//set the attribute
		
		if(bedroomNum <= 0)//throw exception if bathroom number is less than 0
			throw new BadBuildingException("The number of bedroom has to be greater than 0!");
		this.bedroomNum = bedroomNum;
		
		this.floorSpace = floorSpace; //set attributes
		this.widthNum = widthNum;
		this.depthNum = depthNum;
		this.houseClassification = houseClassification;
		
	}
	
	public String toString() { //Override toString method, it prints out the information of a type of house
		String rslt = "House: " + houseClassification + ", " + widthNum + "m width by " + depthNum + "m deep lot, ";
		rslt += bedroomNum + " bedrooms, " + bathroomNum + " bathrooms, ";
		rslt += floorSpace + " square meter building, asking price is: " + this.getListPrice();
		return rslt;
	}
	
	public double calculateTax() { //Override calculate tax method, it calculates the tax
		double start = 1000;
		start += 50 * this.bedroomNum;
		start += 10 * this.floorSpace;
		return start;
	}
	
	//All methods below are Getter and setter method
	public int getBathRoomNum() {
		return bathroomNum;
	}
	public void setBathRoomNum(int bathroomNum) {
		this.bathroomNum = bathroomNum;
	}
	
	public int getBedRoomNum() {
		return bedroomNum;
	}
	public void setBedRoomNum(int bedroomNum) {
		this.bedroomNum = bedroomNum;
	}
	
	public double getFloorSpace() {
		return floorSpace;
	}
	public void setFloorSpace(double floorSpace) {
		this.floorSpace = floorSpace;
	}
	
	public double getWidthNum() {
		return widthNum;
	}
	public void setWidthNUm(double widthNum) {
		this.widthNum = widthNum;
	}
	
	public double getDepthNum() {
		return depthNum;
	} 
	public void setDepthNum(double depthNum) {
		this.depthNum = depthNum;
	}
	
	public HouseType getHouseClassification() {
		return houseClassification;
	}
	public void setHouseCalssification(HouseType houseClassification) {
		this.houseClassification = houseClassification;
	}	

	

}
