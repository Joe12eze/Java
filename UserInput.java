import java.util.Scanner;
public class UserInput {
public static void main(String [] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = sc.nextInt(); 
	System.out.println("The n numbers are:"+n+"numbers");
	for(int i=1; i<=n; i++) {
		System.out.println(i);
	}
	
}
}
