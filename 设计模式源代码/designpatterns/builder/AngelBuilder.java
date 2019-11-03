package designpatterns.builder;

//ConcreteBuilder
public class AngelBuilder extends ActorBuilder {
	public void buildType() {
		actor.setType("Angel");
	}

	public void buildSex() {
		actor.setSex("Female");
	}

	public void buildFace() {
		actor.setFace("Beautiful");
	}

	public void buildCostume() {
		actor.setCostume("White dresses");
	}

	public void buildHairstyle() {
		actor.setHairstyle("Long hair");
	}	
}
