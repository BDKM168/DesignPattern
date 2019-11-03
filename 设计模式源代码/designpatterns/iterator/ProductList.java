package designpatterns.iterator;
import java.util.*;

//ConcreteAggregate
public class ProductList extends AbstractObjectList {
	public ProductList(List products) {
		super(products);
	}
	
    //implement the factory method to create an Iterator
	public AbstractIterator createIterator() {
		return new ProductIterator(this);
	}
} 
