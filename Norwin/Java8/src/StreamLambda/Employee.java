package StreamLambda;

import java.util.function.*;
import java.util.ArrayList;

public class Employee {

	String name;
	int salary;

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	class Predicate2 {
		public static void main(String args[]) {
			ArrayList<Employee> l = new ArrayList<>();
			l.add(new Employee("venkat", 1000));
			l.add(new Employee("howells", 4000));
			l.add(new Employee("greevss", 7000));

			Predicate<Employee> p = e -> e.salary > 3000;
			for (Employee e1 : l) {
				if (p.test(e1)) {
					System.out.println(e1.name + " " + e1.salary);

				}
			}
		}
	}
}
