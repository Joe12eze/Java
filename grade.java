import java.util.Scanner;
public class grade {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Mark:");
		int marks =sc.nextInt();
		String grade;
		if(marks>=90) {
			grade = "A";
		}
		else if(marks>=80) {
			grade = "B";
		}
		else if(marks>=70) {
			grade = "C";
		}
		else if(marks>=60) {
			grade = "D";
		}else if (marks>=50) {
			grade = "E";
			
		}
		else {
			grade ="F";
		}

        System.out.println("Your grade is: " + grade);
        sc.close();
	}

}
