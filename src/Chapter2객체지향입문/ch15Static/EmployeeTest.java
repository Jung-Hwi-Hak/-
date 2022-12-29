package Chapter2객체지향입문.ch15Static;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setEmployeeName("이순신");	
		
		Employee employee2 = new Employee();
		employee2.setEmployeeName("김유신");
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee2.getEmployeeId());
		System.out.println(Employee.getSerialNum());		
	}

}
