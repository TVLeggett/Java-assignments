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

//2nd variant
		//int[] myArray1 = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40};
		//for(int i=0; i<myArray1.length; i++){
		//System.out.println(myArray1[i]);
		//}
