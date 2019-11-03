package designpatterns.builder;

//ConcreteBuilder
public class DevilBuilder extends ActorBuilder {
	public void buildType() {
		actor.setType("Devil");
	}

	public void buildSex() {
		actor.setSex("Male");
	}

	public void buildFace() {
		actor.setFace("Ugly");
	}

	public void buildCostume() {
		actor.setCostume("Black clothes and Tattoo");
	}

	public void buildHairstyle() {
		actor.setHairstyle("Bareheaded");
	}	
}
