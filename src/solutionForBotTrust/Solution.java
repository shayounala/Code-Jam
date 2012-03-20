package solutionForBotTrust;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputData inputdata = Flow.Readin("src//solutionForBotTrust//A-large-practice.in");
		
		OutputData outputdata = Algorithms.getOutput(inputdata);
		
		Flow.Writeout(outputdata, "src//solutionForBotTrust//A-large-practice.out");

	}

}
