package solutionforMagicka;



public class InputData {

	private int Test_Number;
	public int getTest_Number() {
		return Test_Number;
	}

	public String[][] getA() {
		return A;
	}

	public String[][] getB() {
		return B;
	}

	private String[][] A;
	private String[][] B;
	private char[][] C;

	public char[][] getC() {
		return C;
	}

	public InputData(int Test_Number, String[][] A, String[][] B, char [][] C){

		this.Test_Number = Test_Number;
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
}
