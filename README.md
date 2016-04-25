public class Ex4PartA {
	public static void main(String[] args) {
		//Declare and create an array capable of containing 20 integers
		int[] myArray = new int[20];
		
		//fill the array you created with the first 20 even integers
		for(int i=0; i<myArray.length; i++){
			myArray[i] = (i+1)*2;
			System.out.println(myArray[i]);
		}
	}
}
