package designpatterns.builder;

//ConcreteBuilder
public class HeroBuilder extends ActorBuilder {
	public void buildType() {
		actor.setType("Hero");
	}

	public void buildSex() {
		actor.setSex("Male");
	}

	public void buildFace() {
		actor.setFace("Handsome");
	}

	public void buildCostume() {
		actor.setCostume("Armour");
	}

	public void buildHairstyle() {
		actor.setHairstyle("Flowing ");
	}	
}
