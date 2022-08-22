package webapp.Springcore;

import javax.swing.text.DefaultCaret;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeDI {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("data.xml");
		
		Employee emp = (Employee)context.getBean("employeeDataSetter");
		Employee emp1 = (Employee)context.getBean("employeeData");
		Employee emp2 = (Employee)context.getBean("employeeList");
		//Employee emp3 = (Employee)context.getBean("employeeSet");
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
		//System.out.println(emp3);
		
	}

}
