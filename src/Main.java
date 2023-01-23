import it.develhope.encapsulation02.Person;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		Person p =  new Person();
		p.setName(sc.next());
		System.out.println("Surname: ");
		p.setSurname(sc.next());
		System.out.println("Height: ");
		p.setHeight(sc.nextDouble());
		System.out.println("Age: ");
		p.setAge(sc.nextInt());
		System.out.printf("Name: %s\n", p.getName());
		System.out.printf("Surname: %s\n", p.getSurname());
		System.out.printf("Height: %.2f\n", p.getHeight());
		System.out.printf("Age: %s\n", p.getAge());

	}
}