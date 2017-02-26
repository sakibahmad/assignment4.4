/* use of inheritence for manager and employee payroll
 * 
 */

package session4b;

// manager class inherited in management
public class management extends manager {

	// a method
	void output() {
		System.out.println(" salaries are ");
	}

	public static void main(String[] args) {
		// object creation
		manager o = new manager();
		// passing value to object
		o.salary(2000);
		o.tsalary(5000);
	}

}
