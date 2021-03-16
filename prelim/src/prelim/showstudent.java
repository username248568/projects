package prelim;
import java.util.Scanner;

public class showstudent {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		student s1 = new student();
		System.out.println("Enter id");
		s1.setid(sc1.nextInt());
		System.out.println("Enter credit hours");
		s1.setcredhours(sc1.nextInt());
		System.out.println("Enter points");
		s1.setpoints(sc1.nextInt());
		System.out.print("GPA: ");
		System.out.print(s1.getgpa());
	}
}
