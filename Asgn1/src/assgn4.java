


import java.util.Scanner;

public class assgn4 {


	static int increaseDecreaseValue(int []arr, int x) 
	{ 
	    int TotalValue = 0; 
	    for (int i = 0; i < arr.length; i++)  
	    { 
	        if (arr[i] < x)  
	        { 
	        	for (int j = i + 1; j < arr.length; j++) 
	            { 
	                arr[j] += 1; 
	            } 
	        }  
	        else
	        { 
	  
	            TotalValue += 1; 
	            for (int j = i + 1; j < arr.length; j++) 
	            { 
	                if (arr[j] == 0)  
	                { 
	                    continue; 
	                } 
	                else 
	                { 
	                    arr[j] -= 1; 
	                } 
	            } 
	        } 
	    } 
	    return TotalValue; 
	} 
	public static void main(String[] args) {
		
		 int x = 60; 
		    int[] arr = new int[3];  
		    Scanner sc=new Scanner(System.in);  
		    System.out.println("Enter the elements of the array: ");  
		    for(int i=0; i<3; i++)  
		    {  
		      
		    arr[i]=sc.nextInt();  
		    }  
		    int countValue = increaseDecreaseValue(arr, x); 
		   if(countValue==3) {
			   System.out.println("Passed");
		   }
		   else if(countValue==2) {
			   System.out.println("Promoted");
		   }
		   else
			   System.out.println("fail");
	}

}