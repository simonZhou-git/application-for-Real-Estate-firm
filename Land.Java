import java.io.Serializable;

/*
 * Author: Simon Zhou

 * This is a land class, a child class of property class
 */
public class Land extends Property implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7425747978700259264L;
	
	private double hectareNum; //initialize attribute
	
	public Land(double listPrice, double hectareNum) throws BadBuildingException {//constructor
		super(listPrice); //load attribute from parent class
		
		if (hectareNum <= 0) //throw exception if hectares is less than 0
			throw new BadBuildingException("The number of hactares should be greater than 0");
		
		this.hectareNum = hectareNum;//set attribute
	}
	
	public double calculateTax() {//Override calculate tax method
		double price = 0;
		price += 100 * this.hectareNum;
		return price;
	}
	
	public String toString() {//Override toString method
		String rslt = "Land, " + hectareNum + " hectares, asking price is: " + this.getListPrice();
		return rslt;
	}
	
	//All methods below are getter and setter method
	public double getHactareNum() {
		return hectareNum;
	}
	
	public void setHactareNum(double hectareNum) {
		this.hectareNum = hectareNum;
	}

}
