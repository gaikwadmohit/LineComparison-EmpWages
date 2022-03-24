package lineComparison;

import java.util.Scanner;

public class LineComparisonsUC3 {
	


	
			
			public static void main(String[] args) {
				//also can use try to test the selected code during execution
				Scanner sc = new Scanner(System.in);
		        double x1,x2,y1,y2,x3,x4,y3,y4;
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
			
		
	        
		        //For second line 
		        System.out.println("Enter x3 & y3 values of Third point");
		        x3 = sc.nextDouble();
		        y3 = sc.nextDouble();
		        
		        System.out.println("Enter x4 & y4 values of Fourth point");
		        x4 = sc.nextDouble();
		        y4 = sc.nextDouble();
		        
		        line2 = (int)Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		        System.out.println("Distance of Second line = "+line2);
		        
		        String str1 = Double.toString(line1);
		        String str2 = Double.toString(line2);
		        
		        //Comparing the two lines using the "compareTo" method
		        int check = str1.compareTo(str2);
		        if(check == 0)
		         	System.out.println("Both the lines are Equal");
		         else if(check > 0)
		         	System.out.println("Line 2 less than line 1");
		         else
		        	 System.out.println("Line 2 greater than line 1");
		 	}

	}





