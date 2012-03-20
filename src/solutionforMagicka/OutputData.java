package solutionforMagicka;


public class OutputData {

	private String[] Steps;


	public String[] getSteps() {
		return Steps;
	}


	public OutputData(String [] Steps){
		this.Steps = Steps;
		
		for(int i=0;i<this.Steps.length;i++){
			System.out.println("Test "+(i+1)+": "+Steps[i]);
		}
	}
	
}
