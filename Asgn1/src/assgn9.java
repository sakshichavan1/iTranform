
public class assgn9 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s1 = new Student(); 
	        Student s2 = new Student(); 
	        Student s3 = new Student(); 
	        s1.get("Sakshi",21,78); 
	        s2.get("seema",  77,91);
	 
	        s3.get("neha",  85, 65); 
	        s1.disp(); 
	        s2.disp(); 
	        s3.disp(); 
	}

}
class Student{ 

    
    String name; 
    int sub1; 
    int sub2; 
    int total;
    int Avg; 
    
    void get(String n, int a, int b) { 
        
        name = n; 
        sub1 = a; 
        sub2 = b; 
} 

void disp() { 
    Avg = (sub1 + sub2)/2; 
   int total= (sub1+sub2);
    System.out.println("Name=" + name); 
    System.out.println("Sub1=" + sub1); 
    System.out.println("Sub2=" + sub2); 
    System.out.println("total marks=" + total); 
    System.out.println("Average=" + Avg); 
    
    } 
} 