package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

/**
 * Helper class to print information about all found appliances
 */
public class PrintApplianceInfo {
	/**
	 * Prints information about all appliances in given array
	 * @param appliances array of appliances
	 */
	public static void print(Appliance[] appliances) {
		if (appliances == null) {
			System.out.println("No appliances found");
			return;
		}
		for (Appliance appliance : appliances) {
			if (appliance == null) {
				System.out.println("Invalid appliance");
			}
			else {
				System.out.println(appliance);
			}
		}
	}
}