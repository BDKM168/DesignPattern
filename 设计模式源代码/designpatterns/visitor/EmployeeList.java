package designpatterns.visitor;
import java.util.*;

//ObjectStructure
public class EmployeeList {
    //define a list to save employees
	private ArrayList<Employee> list = new ArrayList<Employee>();

	public void addEmployee(Employee employee) {
		list.add(employee);
	}

    //traverser all employees in the list
	public void accept(Department handler) {
		for(Object obj : list) {
			((Employee)obj).accept(handler);
		}
	}
}
