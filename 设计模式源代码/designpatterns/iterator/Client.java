package designpatterns.iterator;
import java.util.*;

public class Client {
	public static void main(String args[]) {
		List products = new ArrayList();
		products.add("Design Patterns");
		products.add("UML");
		products.add("Project Management");
		products.add("Refactoring");
		products.add("Software Testing");
			
		AbstractObjectList list;
		AbstractIterator iterator;
		
		list = new ProductList(products);   //create an Aggregate 
		iterator = list.createIterator();	//create an Iterator
		
		System.out.println("Forward traversal:");	
		while(!iterator.isLast()) {
			System.out.print(iterator.getNextItem() + ", ");
			iterator.next();
		}
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("Reverse traversal:");
		while(!iterator.isFirst()) {
			System.out.print(iterator.getPreviousItem() + ", ");
			iterator.previous();
		}
	}
}
