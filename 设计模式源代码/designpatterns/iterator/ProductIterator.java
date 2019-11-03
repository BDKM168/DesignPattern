package designpatterns.iterator;
import java.util.*;

//ConcreteIterator
public class ProductIterator  implements AbstractIterator {
	private ProductList productList;
	private List products;
	private int cursor1; //define a cursor for forward traversal
	private int cursor2; //define a cursor for reverse traversal
	
	public ProductIterator(ProductList list) {
		this.productList = list;
		this.products = list.getObjects(); //get the objects list
		cursor1 = 0;                       //set the cursor's initial value for forward traversal 
		cursor2 = products.size() -1;      //set the cursor's initial value for reverse traversal
	}
	
	public void next() {
		if(cursor1 < products.size()) {
			cursor1++;
		}
	}
	
	public boolean isLast() {
		return (cursor1 == products.size());
	}
	
	public void previous() {
		if (cursor2 > -1) {
			cursor2--;
		}
	}
	
	public boolean isFirst() {
		return (cursor2 == -1);
	}
	
	public Object getNextItem() {
		return products.get(cursor1);
	} 
		
	public Object getPreviousItem() {
		return products.get(cursor2);
	} 	
}
