package solutionforGoroSort;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputData inputdata = Flow.Readin("src//solutionForGoroSort//D-small-practice.in");
		
		OutputData outputdata = Algorithms.getOutput(inputdata);
		
		Flow.Writeout(outputdata, "src//solutionForGoroSort//D-small-practice.out");

	}

}
