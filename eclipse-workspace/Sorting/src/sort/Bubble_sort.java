package sort;
//import java.util.Scanner;
//import java.lang.Math;
public class Bubble_sort {

	public static void main(String[] args) {
		int arr[]= {2,6,5,4,3,2,1};
		for (int i = 0; i < arr.length; i++) //number of passes
	    {
			//keeps track of positions per pass      
	    	for (int j = 0; j < (arr.length - 1 - i); j++) //Think you can add a -i to remove uneeded comparisons 
	        {
	          	//if left value is great than right value 
	        	if (arr[j] > arr[j + 1])
	            {
	              	//swap values
	            	int temp = arr[j];
	              	arr[j] = arr[j + 1];
	              	arr[j + 1] = temp; 
	            }
	        }
	    }
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		// TODO Auto-generated method stub

	}

}
