package lineComparison;

import java.util.Scanner;

public class LineComparisonUC1 {
	

		public static void main(String[] args) {
			//also can use try to test the selected code during execution
			Scanner sc = new Scanner(System.in);
	        double x1,x2,y1,y2;
	        int line1,line2;
	        
	        //For first line
	        System.out.println("Enter x1 & y1 values of First point");
	        x1 = sc.nextDouble();
	        y1 = sc.nextDouble();
	        
	        System.out.println("Enter x2 & y2 values of Second point");
	        x2 = sc.nextDouble();
	        y2 = sc.nextDouble();
	        
	        line1=(int)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	        System.out.println("Distance of the First line = "+line1);
		
	
        
	        
	       
		}
	}



