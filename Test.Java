import java.util.ArrayList;
/*
 * Author: Simon Zhou

 * This is a test class, code is given by Prof.Allision
 */


public class Test {

	
	public static void main(String[] args) throws BadBuildingException {
		// TODO Auto-generated method stub
		
		ArrayList<Property> propertyDB = new ArrayList<Property>();

        Property prop3 = new Office(120, 3, 1500, true, OfficeType.SERVICE);
        Property prop5 = new House(120, 3, 3, 4, 5.5, 80, HouseType.TOWNHOUSE);
        Property prop6 = new ApartmentBuilding(120, 3, 30, 400);
        Property prop7 = new Land(220, 100);
        propertyDB.add(prop3);
        propertyDB.add(prop5);
        propertyDB.add(prop6);
        propertyDB.add(prop7);
        Property prop4 = new Farm(250, 3400, "vegetables");
        propertyDB.add(prop4);
        System.out.println(prop3.CompareTo(prop4));
        for (Property element : propertyDB) {
             System.out.println(element);
             System.out.println("Listing Price = " + String.format("%.3f", element.getListPrice()));
        }

	}
}
