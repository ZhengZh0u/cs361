/**
 * 
 */
package employee;

/**
 * @author ZhengZhou
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO To complete 
		// emp3.whoAmI() // prints PART TIME EMPLOYEE because pEmp1 has been assigned for emp3.
		// emp3.getHourlyRate(); // returns syntax error because emp3 is from upcasting with pEmp1. We need to downcast.
		

		// TODO To complete
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time	
		// if (emp3 instanceof PartTimeEmployee) {
		// System.out.println("emp3 instance of part time employee"); // printed
		// } else {
		//System.out.println("emp3 not instance of part time employee");
		// }
		 if (emp3 instanceof PartTimeEmployee) {
			 System.out.println("emp3 instance of part time employee"); // printed
			 } else {
			System.out.println("emp3 not instance of part time employee");
			 }
		
		

		// Downcasting 1
		// TODO Uncomment and run the code. （already tried）
		//PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		// TODO To complete
		// This instruction compiles / does not compile
		// This instruction returns a ClassCastException at run time
		// Answer: Because emp1 is not an instance of PartTimeEmployee or a subclass of it.

		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception.
		// TODO Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
