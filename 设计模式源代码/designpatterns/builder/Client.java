package designpatterns.builder;

public class Client {
	public static void main(String args[]) {
		ActorBuilder ab; 
		ab = (ActorBuilder)XMLUtil.getBean(); 

        ActorController ac = new ActorController();
		Actor actor;
		actor = ac.construct(ab);

		String type = actor.getType();
		System.out.println(type + "'s characters:");
		System.out.println("Sex:" + actor.getSex());
		System.out.println("Face:" + actor.getFace());
		System.out.println("Costume:" + actor.getCostume());
		System.out.println("Hair style:" + actor.getHairstyle());
	}
}
