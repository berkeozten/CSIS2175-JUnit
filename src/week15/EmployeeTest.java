package week15;

// Berke Ozten

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {


	@Test
	void testSetAndGetName() {
		Employee emp = new Employee("Berke", 20.0);
		emp.setName("Anu");
		assertEquals("Anu", emp.getName());
	}

	@Test
	void testSetAndGetHours() {
		Employee emp = new Employee("Berke", 20.0);
		emp.setHours(40.0);
		assertEquals(40, emp.getHours());
	}

	@Test
	void testGetTotalPayUnder() {
		Employee emp = new Employee("Berke", 20.755);
		assertEquals(311.325, emp.getTotalPay());
	}
	
	@Test
	void testGetTotalPayOver() {
		Employee emp = new Employee("Berke", 40.755);
		assertEquals(612.4575, emp.getTotalPay(), 0.0001);
	}

}
