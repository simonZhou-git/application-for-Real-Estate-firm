import java.io.Serializable;
/*
 * Author: Simon Zhou

 * Date： 2019/08/01
 * This class is a parent class of this assignment. 
 */

public abstract class Property implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6512553863121261626L;
	
	private double listPrice;//initialize attribute for parent class
	
	public Property(double listPrice) throws BadBuildingException{//constructor
		if (listPrice * 1000 < 0)//if price is less than 0, throw an exception
			throw new BadBuildingException("The listing price has to be greater than 0");
		this.listPrice = listPrice; //set attribute
	}
	
	//Getter and setter method
	public double getListPrice() {
		return listPrice;
	}
	
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}
	
	public String CompareTo(Property T) { //CompareTo method, compare two types of building and print their difference in price 
		String currentName = this.getClass().getName(); //get first building name
		String TName = T.getClass().getName(); //get the other's name
		String rslt = null;
		double difference1 = this.listPrice - T.listPrice; //calculate the price difference
		double difference2 = T.listPrice - this.listPrice;
		if (this.listPrice > T.listPrice) {
			rslt = currentName + " is more expensive than " + TName + ". The difference is: " + "$" + difference1 + ".";
		}
		else if (this.listPrice < T.listPrice) {
			rslt = TName + " is more expensive than " + currentName + ". The difference is: " + "$" + difference2 + ".";
		}
		return rslt; //Return as a string
	}
	
	public abstract double calculateTax(); //this is a abstract calculate tax method. 

}
