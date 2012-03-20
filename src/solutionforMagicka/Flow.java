package solutionforMagicka;

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
	        
	        String [][] A = new String[Test_Number][];
	        String [][] B = new String[Test_Number][];
	        char [][] C = new char[Test_Number][];
	        for(int i=0;i<Test_Number;i++){
	        	int testA = sc.nextInt();
	        	A[i] = new String [testA];
	        	for(int j=0;j<testA;j++){
	        		A[i][j] = sc.next();
	        	}
	        	
	        	int testB = sc.nextInt();
	        	B[i] = new String [testB];
	        	for(int j=0;j<testB;j++){
	        		B[i][j] = sc.next();
	        	}
	        	
	        	int testC = sc.nextInt();
	        	C[i] = new char [testC];
	        	String string = sc.next();
	        	for(int j=0;j<testC;j++){
	        		C[i][j] = string.charAt(j);
	        	}
	        	
	        	
	        	System.out.print("Test "+(i+1)+" "+testA+" ");
	        	for(int j=0;j<A[i].length;j++){
	        		System.out.print(A[i][j]+" ");
	        	}
	        	System.out.print(testB+" ");
	        	for(int j=0;j<B[i].length;j++){
	        		System.out.print(B[i][j]+" ");
	        	}
	        	System.out.print(testC+" ");
	        	System.out.println(C[i]);
	        }
	        
	        sc.close();
	        
	        InputData inputdata = new InputData(Test_Number, A, B, C);
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
				if(outputdata.getSteps()[i].length() == 0){
					pw.println("Case #"+(i+1)+": []");
					continue;
				}
				pw.print("Case #"+(i+1)+": "+"["+outputdata.getSteps()[i].charAt(0));
				for(int j=1;j<outputdata.getSteps()[i].length();j++){
					pw.print(", "+outputdata.getSteps()[i].charAt(j));
				}
				pw.println("]");
			}
			
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
