

import java.util.Scanner;

public class assgn6 {
	static Scanner console = new Scanner (System.in);
	
	 final static String password =("rohi");

	public static void main(String[] args) {
		for(int n=0; n <3; n++){
			
			    System.out.println("Please enter your login username: ");  
			    String username = console.next();
			    System.out.println("Please enter password: "); 
			   

			   String password1 = console.next();
			
			   boolean login = false;

			                             
			
			    if (password1.equals(password)) {
			
			        System.out.println();
			
			        System.out.println("Welcome "+username);
			
			        login = true;
			
			       
			        break;     
		
			    }  
		
			     
			
			    if (login == false){
			
			        System.out.println();
			
			        System.out.println("Incorrect password, please try again.");
			
			       
			
			        if(n >= 2){ 
			
			            System.out.println("contact service desk");
			
			            System.exit(0);
			
			        }
			
			    }
			
			}

	}

}