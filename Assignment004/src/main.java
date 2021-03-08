import java.util.Scanner;

public class main {
	
		public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			Person fn1 = new Person();
			Person fn2 = new Person();
			Person fn3 = new Person();
			Person fn4 = new Person();
			Person fn5 = new Person();
			System.out.println("Enter First Names");
			fn1.setFirstname(sc1.nextLine());
			fn2.setFirstname(sc1.nextLine());
			fn3.setFirstname(sc1.nextLine());
			fn4.setFirstname(sc1.nextLine());
			fn5.setFirstname(sc1.nextLine());
			System.out.println("Enter Last Names");
			fn1.setLastname(sc1.nextLine());
			fn2.setLastname(sc1.nextLine());
			fn3.setLastname(sc1.nextLine());
			fn4.setLastname(sc1.nextLine());
			fn5.setLastname(sc1.nextLine());
			System.out.print(fn1.getFirstname());
			System.out.print(" ");
			System.out.println(fn1.getLastname());
			System.out.print(fn2.getFirstname());
			System.out.print(" ");
			System.out.println(fn2.getLastname());
			System.out.print(fn3.getFirstname());
			System.out.print(" ");
			System.out.println(fn3.getLastname());
			System.out.print(fn4.getFirstname());
			System.out.print(" ");
			System.out.println(fn4.getLastname());
			System.out.print(fn5.getFirstname());
			System.out.print(" ");
			System.out.println(fn5.getLastname());
		}
	}
