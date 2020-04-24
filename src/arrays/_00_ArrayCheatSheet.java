package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] names= {"Daniel", "Rami", "Samson", "BillyBob", "Joe"};
		//2. print the third element in the array
		System.out.println( names[2] );
	
		//3. set the third element to a different value
		String thirdIndex=names[2];
		//4. print the third element again
		System.out.println(thirdIndex);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[]integers=new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i=0;i<integers.length;i++) {
			integers[i]=new Random().nextInt(51); 
		}
		//8. without printing the entire array, print only the smallest number in the array
		int lowestNum=integers[0];
		for(int i=1;i<integers.length;i++ ) {
			if(integers[i]<lowestNum) {
				lowestNum=integers[i];
				
			}
		}
		//9 print the entire array to see if step 8 was correct
		//System.out.println(lowestNum);
		for(int i=0;i<integers.length;i++ ) {
			//System.out.println(integers[i]);
			
		}
		//10. print the largest number in the array.
		int highestNum=integers[49];
		for(int i=49;i>integers.length;i--) {
			if(integers[i]>highestNum) {
				highestNum=integers[i];
			}
		}
		System.out.println(highestNum);
		}
	}

