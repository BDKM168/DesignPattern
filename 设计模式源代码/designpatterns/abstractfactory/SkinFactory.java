package designpatterns.abstractfactory;

//Abstract Factory
public interface SkinFactory {
	public Button createButton();
	public TextField createTextField();
	public ComboBox createComboBox();
}
