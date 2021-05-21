package Payment;
import java.util.*;
public class Payment {
	
	public static void main(String[] args) {
		try {
			Scanner inputDevice = new Scanner(System.in);
		Person elmo = new Person();
		String first,last;
		double wage;
		int hours;

		System.out.println("input first name or 999 to leave blank");
		first = inputDevice.nextLine();
		if (!first.equalsIgnoreCase("999")) {
		elmo.setFirstName(first);
		}
		
		System.out.println("input last name or 999 to leave blank");
		last = inputDevice.nextLine();
		if (!last.equalsIgnoreCase("999")){
			elmo.setLastName(last);
		}
		
		System.out.println("input hourly rate or 999 to leave blank");
		wage = inputDevice.nextDouble();
		if (wage != 999) {
			elmo.setHourlyRate(wage);
		}
		
		System.out.println("input hours or 999 to leave blank");
		hours = inputDevice.nextInt();
		if (hours != 999) {
			elmo.setHours(hours);
			
		inputDevice.close();
		}
		
		System.out.println(elmo.toString());
		System.out.println(elmo.getPayment(hours));
		System.out.println("*****************************************");

		}
		catch (Exception e) {
			System.out.println("Oops... something went wrong.");
		}
	}
}
