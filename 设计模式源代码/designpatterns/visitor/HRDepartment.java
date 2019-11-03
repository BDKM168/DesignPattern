package designpatterns.visitor;

//ConcreteVisitor
public class HRDepartment extends Department {
	//deal with the full-time employee
	public void visit(FulltimeEmployee employee) {
		int workTime = employee.getWorkTime();
		System.out.println("Full-time employee: " + employee.getName() + "'s actual work time is " + workTime + " hours");
		if(workTime > 40) {
			System.out.println("Full-time employee: " + employee.getName() + "'s overtime is " + (workTime - 40) + " hours");
		}
		else if(workTime < 40) {
			System.out.println("Full-time employee: " + employee.getName() + "'s leave time is " + (40 - workTime) + " hours");
		}						
	}

	//deal with the part-time employee
	public void visit(ParttimeEmployee employee) {
		int workTime = employee.getWorkTime();
		System.out.println("Part-time employee: " + employee.getName() + "'s actual work time is " + workTime + " hours");
	}		
}
