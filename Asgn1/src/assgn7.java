



import java.util.Scanner;

public class assgn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] num = {5, 12, 14, 6, 78,19,1,23,26,35,37,7,52,86,47};
	       // int toFind
	        Scanner sc=new Scanner(System.in);
			System.out.println("Enter number ");
			int toFind=sc.nextInt();
	        boolean found = false;

	        for (int n : num) {
	            if (n == toFind) {
	                found = true;
	                break;
	            }
	        }

	        if(found)
	            System.out.println(toFind + " is found.");
	        else
	            System.out.println(toFind + " is not found.");
	    }
	
	
}