import java.util.Scanner;

public class Ex3PartA {
		public static void main(String[] args) {
			System.out.println("Welcome!");
			//Input From User  
			Scanner input = new Scanner(System.in);
			
			//Declare count, sum, smallest, largest
			int count = 0;
			double sum = 0;
			double smallest = 0;
			double largest = 0;
						
			//Read in numbers from the user until the user enters "End"
			while(true){
				System.out.println("Please enter real number: ");
				String x = input.next();
								
				//End
				if(x.equals("End")){
					break;
				}
				double dx = Double.parseDouble(x);
				System.out.println(dx);
								
				//Smallest
				if(count==0){
					smallest = dx;
				}
				else{
					if(dx<smallest){
						smallest = dx;
					}
				}
				//Largest
				if(count==0){
					largest = dx;
				}
				else{
					if(dx>largest){
						largest = dx;
					}
				}
				//Add number to sum to account the average
				sum = sum + dx;
				count++;
								
			}
			//Average
			double average = sum / count;
			
			System.out.println("Good job! " + "Your result is: ");
			System.out.println("Average: "+ average);
			System.out.println("Smallest: "+smallest);
			System.out.println("Largest: "+largest);
			
		}
			
}
			

