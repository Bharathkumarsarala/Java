package StreamLambda;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class Employee {
	String name;
	int salary;

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

}

class Test {
	public static void main(String args[]) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		populate(al);
		BiConsumer<Employee, Integer> c = (e, i) -> e.salary = e.salary + i;
		for (Employee e : al) {
			c.accept(e, 500);
		}
		for (Employee e : al) {
			System.out.println("employee salary:" + e.name);
			System.out.println("employee salary:" + e.salary);

		}
	}

	public static void populate(ArrayList<Employee> al) {
		al.add(new Employee("vinod", 5000));
		al.add(new Employee("acb", 500));

	}
}