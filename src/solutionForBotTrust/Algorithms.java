package solutionForBotTrust;

public class Algorithms {

	public static OutputData getOutput(InputData inputdata) {
		// TODO Auto-generated method stub
		int [] Steps = new int[inputdata.getTest_Number()];
		
		for(int i=0;i<Steps.length;i++){
			Steps[i] = getSingleResult(inputdata.getRobots()[i], inputdata.getPositions()[i]);
		}
		
		OutputData outputdata = new OutputData(Steps);
		return outputdata;
	}

	private static int getSingleResult(int[] robots, int[] positions) {
		// TODO Auto-generated method stub
		int steps = 0;//the steps used
		
		int action = 1;//the cost for button action
		
		int [] currentposition = new int [] {1,1};//the current position of both robots
		
		int [] leftmove = new int [] {0,0};//left moves for current robot
		
		int lastrobot = robots[0];//the last robot who buttons
		
		for(int i=0;i<robots.length;i++){
			int distance = Math.abs(positions[i]-currentposition[robots[i]]);
			if(robots[i] == lastrobot){
				int step = distance+action;
				steps += step;
				currentposition[robots[i]] = positions[i];
				leftmove[(1-robots[i])] += step;
			}else{
				if(leftmove[robots[i]]<distance){
					int step = action+distance-leftmove[robots[i]];
					steps += step;
					currentposition[robots[i]] = positions[i];
					leftmove[robots[i]] = 0;
					leftmove[(1-robots[i])] += step;
				}else{
					int step = action;
					steps += step;
					currentposition[robots[i]] = positions[i];
					leftmove[robots[i]] = 0; 
					leftmove[(1-robots[i])] += step;
				}
			}
			
			lastrobot = robots[i];
		}
		return steps;
	}

}
