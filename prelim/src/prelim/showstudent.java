package prelim;
import java.util.Scanner;

public class showstudent {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		student s1 = new student();
		System.out.print("ID: ");
		System.out.println(s1.getid());
		System.out.print("Credit Hours: ");
		System.out.println(s1.getcredhours());
		System.out.print("Points: ");
		System.out.println(s1.getpoints());
		System.out.print("GPA: ");
		System.out.println(s1.getgpa());
	}
}
