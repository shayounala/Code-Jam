package solutionforGoroSort;



public class InputData {

	private int Test_Number;
	public int getTest_Number() {
		return Test_Number;
	}

	public int[][] getRobots() {
		return Robots;
	}

	private int[][] Robots;

	public InputData(int Test_Number, int[][] Robots){

		this.Test_Number = Test_Number;
		this.Robots = Robots;
	}
	
}
