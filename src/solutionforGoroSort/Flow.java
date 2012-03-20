package solutionforGoroSort;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Flow {

	public static InputData Readin(String filename){
		try {
			FileReader fr = new FileReader(filename);
			Scanner  sc = new Scanner(fr);  
	        
	        int Test_Number = sc.nextInt();
	        System.out.println("The Number of Tests: "+Test_Number);
	        
	        int [][] Robots = new int[Test_Number][];
	        
	        for(int i=0;i<Test_Number;i++){
	        	int test = sc.nextInt();
	        	Robots[i] = new int[test];
	        	for(int j=0;j<test;j++){
	        		Robots[i][j] = sc.nextInt();
	        	}
	        	
	        	System.out.print("Test "+i+": ");
	        	for(int j=0;j<test;j++){
	        		System.out.print(Robots[i][j]+" ");
	        	}
	        	System.out.println();
	        }
	        
	        sc.close();
	        
	        InputData inputdata = new InputData(Test_Number, Robots);
	        return inputdata;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;  
		}

	}

	public static void Writeout(OutputData outputdata, String filename) {
		// TODO Auto-generated method stub
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(filename));
			
			int Test_Number = outputdata.getSteps().length;
			for(int i=0;i<Test_Number;i++){
				if(outputdata.getSteps()[i] != -1){
					pw.println("Case #"+(i+1)+": "+outputdata.getSteps()[i]);
				}else{
					pw.println("Case #"+(i+1)+": NO");
				}
			}
			
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
