package designpatterns.visitor;

//Element
public interface Employee {
	public void accept(Department handler);
}