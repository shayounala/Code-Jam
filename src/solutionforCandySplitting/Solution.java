package solutionforCandySplitting;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputData inputdata = Flow.Readin("src//solutionForCandySplitting//C-large-practice.in");
		
		OutputData outputdata = Algorithms.getOutput(inputdata);
		
		Flow.Writeout(outputdata, "src//solutionForCandySplitting//C-large-practice.out");

	}

}
