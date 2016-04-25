import java.util.Scanner;

public class Ex2PartB {

	public static void main(String[] args) {
		System.out.println("Welcome!");
		//Input From User  
		Scanner input = new Scanner(System.in);
		//Declare count
		int count = 0;
		
		//Read in 5 numbers from a user		
		for(int i=0; i<5; i++){
			System.out.println("Please enter number: ");
			int num = input.nextInt();
			if(num>0){
				count++;
			}
		}
		System.out.println("Positive numbers entered: " + count);

	}

}
