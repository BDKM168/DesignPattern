package designpatterns.iterator;

//Iterator
public interface AbstractIterator {
	public void next();                //move to the next element
	public boolean isLast();           //judge whether the last element or not
	public void previous();            //move to the previous element
	public boolean isFirst();          //judge whether the first element or not
	public Object getNextItem();       //get the next element
	public Object getPreviousItem();   //get the previous element
}
