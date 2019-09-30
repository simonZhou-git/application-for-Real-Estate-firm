import java.io.Serializable;

/*
 * Author: Simon Zhou

 * This class is a Farm class, child class of land.
 */
public class Farm extends Land implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1073289901270188059L;
	
	private String crop; //initialize attribute
	
	public Farm(double listPrice, double hectareNum, String crop) throws BadBuildingException {//constructor
		super(listPrice, hectareNum);//load attributes from parent class
		if (crop == null || crop == "") {
			throw new BadBuildingException("crop has to be a string"); //if crop is null or it is a empty string, throw exception
		}
		this.crop = crop;//set attribute
	}
	
	public String toString() {//Override toString method
		String result = this.getCrop() + " farm, has " + this.getHactareNum() + " hactares, asking price is: " + this.getListPrice();
		return result;
	}
	
	public double calculateTax() {//Override calculate tax method
		double tax = 50.0 * super.getHactareNum();
		return tax;
	}
	
	//All methods below are getter and setter method
	public String getCrop() {
		return crop;
	}
	
	public void setCrop(String crop) {
		this.crop = crop;
	}
}
