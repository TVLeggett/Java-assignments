import java.util.Scanner;

public class Ex2PartA {

	public static void main(String[] args){
		System.out.println("Welcome!");
		//Input From User  
		Scanner input = new Scanner(System.in);
		//Declare product
		int product = 1;
		
		//Read in 5 numbers from a user		
		for(int i=0; i<5; i++){
			System.out.println("Please enter number: ");
			int num = input.nextInt();
			product = product * num;
		}
		//print their product
		System.out.println("Your product is: " + product);
}
}
