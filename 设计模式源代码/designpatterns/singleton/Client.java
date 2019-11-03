package designpatterns.singleton;

public class Client {
	public static void main(String args[]) {
        //create four LoadBalancer objects
		LoadBalancer balancer1,balancer2,balancer3,balancer4;
		balancer1 = LoadBalancer.getLoadBalancer();
		balancer2 = LoadBalancer.getLoadBalancer();
		balancer3 = LoadBalancer.getLoadBalancer();
		balancer4 = LoadBalancer.getLoadBalancer();
		
		//judge the load balancers are the same or not
		if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
			System.out.println("Only one load balancer!");
		}
		
		//add server
		balancer1.addServer("Server 1");
		balancer1.addServer("Server 2");
		balancer1.addServer("Server 3");
		balancer1.addServer("Server 4");
		
		//simulate to handle the client requests
		for (int i = 0; i < 100; i++) {
            String server = balancer1.getServer();
			System.out.println("Distribute the request to " + server);
      }
	}
}
