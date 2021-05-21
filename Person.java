package Payment;

public class Person {

	private String firstName;
	private String lastName;
	private double hourlyRate;
	private int hours;
	
	//default person if no data entered
	public Person() {
		this.firstName = "DEFAULT_FIRSTNAME";
		this.lastName = "DEFAULT_LASTNAME";
		this.hourlyRate = 10;
		this.hours = 40;
	}
	
	public Person(String firstName, String lastName, double hourlyRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + ": " + hourlyRate + "/h @ " + hours + " hours\n" + this.getPayment(hours) + " earned this week before taxes" ;
	}

	public double getPayment(int hours) {
		return this.hourlyRate*hours;
	}
	
}
