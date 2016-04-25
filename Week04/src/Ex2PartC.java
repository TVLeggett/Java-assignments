import java.util.Scanner;

public class Ex2PartC {

	public static void main(String[] args) {
		System.out.println("Welcome!");
		//Input From User  
		Scanner input = new Scanner(System.in);
		//Declare count
		int count = 0;
		
		//Read in numbers from the user until the user enters "­1"
		while(true){
			System.out.println("Please enter number: ");
			int num = input.nextInt();
			if(num==-1){
				break;
			}
			if(num%2==0){
				count++;
			}
	}
		System.out.println("Even numbers entered: " + count);
}
}
