package solutionforMagicka;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputData inputdata = Flow.Readin("src//solutionForMagicka//B-large-practice.in");
		
		OutputData outputdata = Algorithms.getOutput(inputdata);
		
		Flow.Writeout(outputdata, "src//solutionForMagicka//B-large-practice.out");

	}

}
