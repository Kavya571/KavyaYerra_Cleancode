package epam.task;

public class Budget {
	double ConstructionCost(double Area,int Standard, int Automated){
		
		double costPerSqft;
		
		int prizePerSqft;
		
		if( Standard == 1){
			
			prizePerSqft = 1200;
			
		} else if(Standard == 2){
			
			prizePerSqft = 1500;
			
		}else{
			
			if(Automated == 0){
				
				prizePerSqft = 1800;
				
			}else{
				
				prizePerSqft = 2500;
				
			}
			
		}
		
		costPerSqft = Area*prizePerSqft;
		
		return costPerSqft;
	}
	
}
