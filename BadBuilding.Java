/*
 * Author: Simon Zhou

 * This class is a exception class
 */

public class BadBuildingException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8477701852243174248L;
	
	public BadBuildingException(String aMessage) {
		super(aMessage); //prints out the exception message
	}

}
