package designpatterns.adapter;

public class Client {
	public static void main(String args[]) {
		ScoreOperation operation; 
		operation = (ScoreOperation)XMLUtil.getBean(); 
		int scores[] = {84,76,50,69,90,91,88,96}; //a score array
		int result[];
		int score;
		
		System.out.println("Sort Result:");
		result = operation.sort(scores);

        //output the scores
		for (int i : result) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		System.out.println("Search a score 90:");
		score = operation.search(result,90);
		if (score != -1) {
			System.out.println("Find 90!");
		}
		else {
			System.out.println("Don't find 90!");
		}
		
		System.out.println("Search a score 92:");
		score = operation.search(result,92);
		if (score != -1) {
			System.out.println("Find 92!");
		}
		else {
			System.out.println("Don't find 92!");
		}
	}
}
