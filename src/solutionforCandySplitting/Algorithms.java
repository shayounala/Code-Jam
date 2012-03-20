package solutionforCandySplitting;

import java.util.ArrayList;

public class Algorithms {

	public static OutputData getOutput(InputData inputdata) {
		// TODO Auto-generated method stub
		int [] Steps = new int[inputdata.getTest_Number()];
		
		for(int i=0;i<Steps.length;i++){
			Steps[i] = getSingleResult(inputdata.getRobots()[i]);
			//System.exit(0);
		}
		
		OutputData outputdata = new OutputData(Steps);
		return outputdata;
	}

	private static int getSingleResult(int[] robots) {
		// TODO Auto-generated method stub
		int steps = 0;//the steps used
		int sum = robots[0];
		for(int i=1;i<robots.length;i++){
			sum = differ(sum, robots[i]);
		}
		
		if(sum == 0){
			int min = robots[0];
			for(int i=0;i<robots.length;i++){
				if(robots[i]<min){
					min = robots[i];
				}
				steps += robots[i];
			}
			
			steps -= min;
		}else{
			steps = -1;
		}
		System.out.println(sum);
		return steps;
	}

	private static int power(int i, int j) {
		// TODO Auto-generated method stub
		if(j==0){
			return 1;
		}else if(j == 1){
			return i;
		}else{
			return i*power(i,j-1);
		}

	}

	private static int differ(int a, int b) {
		// TODO Auto-generated method stub
		int sum = 0;
		ArrayList<Integer> bsum = new ArrayList<Integer>();
		String sa = Integer.toBinaryString(a);
		ArrayList<Boolean> ba = new ArrayList<Boolean>();
		String sb = Integer.toBinaryString(b);
		ArrayList<Boolean> bb = new ArrayList<Boolean>();
		for(int i=sa.length()-1;i>=0;i--){
			ba.add(sa.charAt(i) == '1');
		}
		for(int i=sb.length()-1;i>=0;i--){
			bb.add(sb.charAt(i) == '1');
		}
		if(ba.size()<bb.size()){
			for(int i=ba.size();i<bb.size();i++){
				ba.add(false);
			}
		}else{
			for(int i=bb.size();i<ba.size();i++){
				bb.add(false);
			}
		}
		for(int i=0;i<ba.size();i++){
			if(ba.get(i) == bb.get(i)){
				bsum.add(0);
			}else{
				bsum.add(1);
			}
		}
		//System.out.println(bsum);
		//System.exit(0);
		for(int i=0;i<bsum.size();i++){
			sum += bsum.get(i)*power(2, i);
		}
		return sum;
	}

}
