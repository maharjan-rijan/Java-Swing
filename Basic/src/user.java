import java.util.*;
public class user {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.nextLine();
		System.out.println("Enter Your RollNo:");
		Integer number = sc.nextInt();
		System.out.println("Enter Your Percentage:");
		String percentage = sc.nextLine();
		
		
		System.out.println("Your name is: "+name);
		System.out.println("Your RollNo is: "+number);
		System.out.println("Your Percentage is: "+percentage);
	}

}
