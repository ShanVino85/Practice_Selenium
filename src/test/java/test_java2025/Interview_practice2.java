package test_java2025;

import java.util.Arrays;

public class Interview_practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int[] numbers = {5, 2, 9, 1, 3};

	        System.out.println("Before sorting: " + Arrays.toString(numbers));

	        // Sorting the array in ascending order
	        Arrays.sort(numbers);

	        System.out.println("After sorting: " + Arrays.toString(numbers));*/
		
		int[] arr = {4, 2, 7, 1, 3};

        // Sort the array (using a simple swapping method)
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    // Swap the values
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        
        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }



	}
}