import java.util.Scanner;
public class SumOfNumbers {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1st number:");
	int m= sc.nextInt();
	System.out.println("Enter the 2nd number:");
	int n=sc.nextInt();
	int sum=m+n;
	System.out.println("Sum is"+sum);
}
}
