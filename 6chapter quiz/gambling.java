import java.util.Scanner;
import java.util.Random;

class Person{
	public String name; 
	
	public Person() {
	}
}

public class gambling {
	public static void main(String[] args) {
		int a=0,b=0,c=0;
		Scanner scanner = new Scanner(System.in);
		Person person1 = new Person();
		Person person2 = new Person();
		
		System.out.print("1��° ���� �̸�>>");
		person1.name=scanner.next();
		System.out.print("2��° ���� �̸�>>");
		person2.name=scanner.next();
		scanner.nextLine();
		
		while(true) {
			System.out.print("["+person1.name+"]:<Enter>");
			scanner.nextLine();
			a=(int)((Math.random()*3)+1);
			b=(int)((Math.random()*3)+1);
			c=(int)((Math.random()*3)+1);
			System.out.print("\t"+a+"   ");
			System.out.print(b+"   ");
			System.out.print(c+"   ");
			
			if(a==b&&b==c) {
				System.out.println(person1.name+"���� �̰���ϴ�!");
				break;
			}
			else
				System.out.println("�ƽ�����!");
			
			System.out.print("["+person2.name+"]:<Enter>");
			scanner.nextLine();
			a=(int)((Math.random()*3)+1);
			b=(int)((Math.random()*3)+1);
			c=(int)((Math.random()*3)+1);
			System.out.print("\t"+a+"   ");
			System.out.print(b+"   ");
			System.out.print(c+"   ");
			
			if(a==b&&b==c) {
				System.out.println(person2.name+"���� �̰���ϴ�!");
				break;
			}
			else
				System.out.println("�ƽ�����!");
		}
	}
}