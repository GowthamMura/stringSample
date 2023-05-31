package org.hcl;

public class removeduplicate {

	
		// Java program to remove duplicates
		 
		    static int removeDuplicates(int arr[], int n)
		    {
		        if (n == 0 || n == 1)
		            return n;
		      
		        // To store index of next unique element
		        int j = 0;
		      
		        // Doing same as done in Method 1
		        // Just maintaining another updated index i.e. j
		        for (int i = 0; i < n-1; i++)
		            if (arr[i] != arr[i+1])
		                arr[j++] = arr[i];
		      
		        arr[j++] = arr[n-1];
		      
		        return j;
		    }
		     
		    public static void main (String[] args)
		    {
		        int arr[] = {1,3,2,2,5,5,4,4,9,8};
		        int n = arr.length;
		         
		        n = removeDuplicates(arr, n);
		  
		        // Print updated array
		        for (int i=0; i<n; i++)
		           System.out.print(arr[i]+" ");
		    }
		}
	


