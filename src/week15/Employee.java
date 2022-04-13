package week15;

//Berke Ozten

public class Employee {
	double hourRate = 15;
	double overRate = 16.5;
	
	String name;
	Double hours;
	
	Double totalPay;

	public Employee(String name, Double hours) {
		this.name = name;
		this.hours = hours;
		this.setTotalPay();	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHours() {
		return hours;
	}

	public void setHours(Double hours) {
		this.hours = hours;
	}

	public Double getTotalPay() {		
		return totalPay;
	}

	public void setTotalPay() {
		if(hours<=40) {
			this.totalPay = hours * hourRate;
		} else {
			this.totalPay = (40 * hourRate) + ((hours-40)* overRate);
		}
	}		
}
