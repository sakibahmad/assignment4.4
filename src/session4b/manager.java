package session4b;

//creating a class manager which will be inherited
public class manager {
	// create a method which will be called
	void salary(double b) {
		// manager salary
		System.out.println("Manager salary before allowance " + b);
		b = b + (0.15) * b;
		System.out.println("salary after adding allowance " + b);
	}

	void tsalary(double b) {

		// trainee salary
		System.out.println("TRAINEE salary before allowance " + b);
		b = b + (0.10) * b;
		System.out.println("trainee salary after adding allowance " + b);
	}

}
