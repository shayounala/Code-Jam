package solutionforMagicka;

import java.util.ArrayList;

public class Algorithms {

	public static OutputData getOutput(InputData inputdata) {
		// TODO Auto-generated method stub
		String [] Results = new String[inputdata.getTest_Number()];
		
		for(int i=0;i<Results.length;i++){
			Results[i] = getSingleResult(inputdata.getA()[i], inputdata.getB()[i], inputdata.getC()[i]);
		}
		
		OutputData outputdata = new OutputData(Results);
		return outputdata;
	}

	private static String getSingleResult(String[] A, String[] B, char[] C) {
		// TODO Auto-generated method stub
		StringBuffer temp = new StringBuffer();
		for(int i=0;i<C.length;i++){
			temp.append(C[i]);
			ArrayList<String> a1 = new ArrayList<String>();
			ArrayList<String> a2 = new ArrayList<String>();
			for(int j=0;j<A.length;j++){
				StringBuffer sub = new StringBuffer();
				sub.append(A[j].substring(0, 2));
				a1.add(sub.toString());
				a1.add(sub.reverse().toString());
				a2.add(A[j].substring(2));
				a2.add(A[j].substring(2));
			}
			
			ArrayList<String> b1 = new ArrayList<String>();
			ArrayList<String> b2 = new ArrayList<String>();
			for(int j=0;j<B.length;j++){
				b1.add(B[j].substring(0,1));
				b1.add(B[j].substring(1,2));
				b2.add(B[j].substring(1,2));
				b2.add(B[j].substring(0,1));
			}
			temp = invoke(a1, a2, b1, b2, temp);
			System.out.println(temp);
		}
		
		return temp.toString();
	}

	private static StringBuffer invoke(ArrayList<String> a1,
			ArrayList<String> a2, ArrayList<String> b1, ArrayList<String> b2,
			StringBuffer temp) {
		// TODO Auto-generated method stub
		int length = temp.length();
		
		if(length == 1){
			return temp;
		}
		//System.out.println(b1+" "+temp.charAt(length-1)+" "+b1.indexOf(temp.substring(length-1)));
		
		
		if(a1.contains(temp.substring(length-2, length))){
			int index = a1.indexOf(temp.substring(length-2, length));
			temp.delete(length-2, length);
			temp.append(a2.get(index));
			
			return temp;
		}else{
			if(b1.contains(temp.substring(length-1))){
				for(int i=0;i<b1.size();i++){
					if(b1.get(i).equals(temp.substring(length-1))){
						if(temp.indexOf(b2.get(i)) != -1){
							temp = new StringBuffer();
							return temp;
						}
					}
				}
			}
		}
		
		return temp;
	}


}
