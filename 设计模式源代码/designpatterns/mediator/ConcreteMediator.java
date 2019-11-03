package designpatterns.mediator;

public class ConcreteMediator extends Mediator {
	//declare Colleague objects
	public Button addButton;
	public List list;
	public TextBox userNameTextBox;
	public ComboBox cb;

    //encapsulate the interactions between colleagues
	public void componentChanged(Component c) {
		//click the button
		if (c == addButton) {
			System.out.println("--Click the Add Button--");
			list.update();
			cb.update();
			userNameTextBox.update();
		}
        //select a customer from the ListBox
		else if (c == list) {
			System.out.println("--Select a customer from the ListBox--");
			cb.select();
			userNameTextBox.setText();
		}
        //select a customer from the ComboBox
		else if (c == cb) {
			System.out.println("--Select a customer from the ComboBox--");
			cb.select();
			userNameTextBox.setText();
		}
	}
}
