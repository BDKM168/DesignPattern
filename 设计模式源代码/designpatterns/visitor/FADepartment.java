package designpatterns.visitor;

//ConcreteVisitor
public class FADepartment extends Department {
    //deal with the full-time employee
	public void visit(FulltimeEmployee employee) {
		int workTime = employee.getWorkTime();
		double weekWage = employee.getWeeklyWage();
		if(workTime > 40) {
			weekWage = weekWage + (workTime - 40) * 100;
		}
		else if(workTime < 40) {
			weekWage = weekWage - (40 - workTime) * 80;
			if(weekWage < 0) {
				weekWage = 0;
			}
		}
		System.out.println("Full-time employee: " + employee.getName() + "'s wage is " + weekWage);			
	}

	//deal with the part-time employee
	public void visit(ParttimeEmployee employee) {
		int workTime = employee.getWorkTime();
		double hourWage = employee.getHourWage();
		System.out.println("Part-time employee: " + employee.getName() + "'s wage is " + workTime * hourWage);		
	}		
}
