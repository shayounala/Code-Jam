package solutionforGoroSort;

import java.util.ArrayList;

public class Algorithms {

	public static OutputData getOutput(InputData inputdata) {
		// TODO Auto-generated method stub
		int [] Steps = new int[inputdata.getTest_Number()];
		
		for(int i=0;i<Steps.length;i++){
			Steps[i] = getSingleResult(inputdata.getRobots()[i]);
		}
		
		OutputData outputdata = new OutputData(Steps);
		return outputdata;
	}

	private static int getSingleResult(int[] robots) {
		// TODO Auto-generated method stub
		int steps = 0;//the steps used

		ArrayList<Integer> input = new ArrayList<Integer>();
		for(int i=0;i<robots.length;i++){
			input.add(robots[i]);
		}
		ArrayList<Integer> output = insertsortInteger(input);
		
		for(int i=0;i<input.size();i++){
			if(input.get(i) != output.get(i)){
				steps++;
			}
		}
		return steps;
	}
	
	public static ArrayList<Integer> insertsortInteger(ArrayList<Integer> input) {
		// TODO Auto-generated method stub
		for(int index=1;index<input.size();index++){  
            int Comparablekey = input.get(index);  
            int position = index;  
            //shift larger values to the right  
            while(position>0 && input.get(position-1)<Comparablekey){  
            	input.set(position, input.get(position-1));  
                position--;  
            }  
            input.set(position, Comparablekey);  
        }
		
		return input;
	}

}
