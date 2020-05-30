package assignment;
import java.util.*;

public class f {

		public static void main(String[] args) {
		    int conterOfMarks;
		    int totalofsum = 0;
		    int totalofclasses=0;
		    int numOfCourses;
			float  avgOfSemester,totalavg=0;
			int sum=0;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter number of Semester");
			numOfCourses=scanner.nextInt();
			
			for(int a=0;a<numOfCourses;a++)		
			{
			 System.out.println("Enter number  the of subjects ");
			 conterOfMarks=scanner.nextInt();
				
			 int marks[] = new int[conterOfMarks];
	         totalofclasses+=conterOfMarks;
			        
		   for(int x=0; x<conterOfMarks; x++) { 
				System.out.print("Enter the Subjects  " +(x+1));
				marks[x]=scanner.nextInt();
				System.out.println();
			   
			           if(marks[x]<35) {
			        	   marks[x]=35;
			        	   
			           }
			           if(marks[x] >= 100) {
			        	   marks[x]=100;
			        	   
			           }
			           sum = sum + marks[x];
		}
			       
			       totalofsum= sum+totalofsum ;
			       avgOfSemester=(sum/conterOfMarks)/25;
			        System.out.println("The student Grade is:  :"+ avgOfSemester);
			        avgOfSemester=0;
			        sum=0;

			        

			}
			totalavg=totalofsum/totalofclasses;
			
			
			 scanner.close();
			 System.out.println("the GBA'S IS : " +totalavg/25);
			        
			        

			  
			    }
			
		
		

	}
