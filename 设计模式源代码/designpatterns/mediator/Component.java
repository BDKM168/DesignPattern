package designpatterns.mediator;

//Colleague
public abstract class Component {
	protected Mediator mediator;
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	//forward the calling
	public void changed() {
		mediator.componentChanged(this);
	}
	
	public abstract void update();	
}
