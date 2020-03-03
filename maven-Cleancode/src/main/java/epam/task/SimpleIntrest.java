package epam.task;

public class SimpleIntrest {
		double computesSI(double p, double r, double t){
			double result=p*r*t;
			return result / 100;
			
		}

		double computesCI(double p, double r, double t){
			
			return p*(Math.pow((1 + r/ 100), t)); 
			
		}
		
}
