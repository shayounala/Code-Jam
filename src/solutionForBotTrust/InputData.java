package solutionForBotTrust;



public class InputData {

	private int Test_Number;
	public int getTest_Number() {
		return Test_Number;
	}

	public int[][] getRobots() {
		return Robots;
	}

	public int[][] getPositions() {
		return Positions;
	}

	private int[][] Robots;
	private int[][] Positions;

	public InputData(int Test_Number, int[][] Robots, int[][] Positions){

		this.Test_Number = Test_Number;
		this.Robots = Robots;
		this.Positions = Positions;
	}
	
}
