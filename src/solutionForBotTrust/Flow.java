package solutionForBotTrust;

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
	        int [][] Positions = new int[Test_Number][];
	        for(int i=0;i<Test_Number;i++){
	        	int test = sc.nextInt();
	        	Robots[i] = new int[test];
	        	Positions[i] = new int[test];
	        	for(int j=0;j<test;j++){
	        		String robot = sc.next();
	        		if(robot.equals("O")){
	        			Robots[i][j] = 1;
	        		}else{
	        			Robots[i][j] = 0;
	        		}
	        		
	        		int position = sc.nextInt();
	        		Positions[i][j] = position;
	        	}
	        	
	        	System.out.print("Test "+i+": ");
	        	for(int j=0;j<test;j++){
	        		System.out.print("Robot"+Robots[i][j]+" Position"+Positions[i][j]+" ");
	        	}
	        	System.out.println();
	        }
	        
	        sc.close();
	        
	        InputData inputdata = new InputData(Test_Number, Robots, Positions);
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
				pw.println("Case #"+(i+1)+": "+outputdata.getSteps()[i]);
			}
			
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
