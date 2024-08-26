package q3;

/*
 *     Write a program to serialize and deserialize an object of Employee class.
 *      Employee class has the following members.
		Employee
			Int id;
			String name; 
			Address address;
			double salary; (nonserializable)
			void display()

 */
public class Assignment3Q3 {

	public static void main(String[] args) {

		Address address = new Address("A21, Preet vihar", "delhi", "India");
		Employee employee = new Employee(121, "raj", address, 400000);

		// Serilization

		// Deserilization

	}
}
