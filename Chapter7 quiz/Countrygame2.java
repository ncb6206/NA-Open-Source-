import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Countrygame2 {
	HashMap<String, String> store = new HashMap<String, String>();
	Scanner scanner = new Scanner(System.in);
	
	public Countrygame2() {
		store.put("�߽���", "�߽��ڽ�Ƽ");
		store.put("�׸���", "���׳�");
		store.put("���þ�", "��ũ��");
		store.put("������", "���帮��");
		store.put("������", "�ĸ�");
		store.put("����", "����");
		store.put("�߱�", "������");
		store.put("�Ϻ�", "����");
		store.put("����", "������");
	}
	
	public static void main(String[] args) {
		Countrygame2 start = new Countrygame2();
		start.run();
	}
	
	void error(String a) {
		System.out.println(a);
	}
	
	void input() {
		int i = store.size();
		System.out.println("���� " + i + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		i++;
		while(true) {
			System.out.print("����� ���� �Է�" + i + ">> ");
			String country = scanner.next();
			if(country.equals("�׸�")) {
				break;
			}
			String capital = scanner.next();
			if(store.containsKey(country)) {
				System.out.println(country + "�� �̹� �ֽ��ϴ�");
				continue;
			}
			store.put(country, capital);
			i++;
		}
	}
	
	void quiz() {
		Set<String> keys = store.keySet();
		Object [] array = (keys.toArray());
		while(true) {
			int index = (int)(Math.random()*array.length); 
			 
			String question = (String)array[index];
			String answer = store.get(question);
			
			System.out.print(question + "�� ������? ");
			
			String inputsentence = scanner.next(); 
			if(inputsentence.equals("�׸�")) {
				break;
			}
			if(inputsentence.equals(answer))
				System.out.println("����!!");
			else
				System.out.println("�ƴմϴ�!!");				
		}	
		
	}
	
	void end() {
		System.out.println("������ �����մϴ�.");	
	}
	
	public void run() {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int menu = scanner.nextInt();
			switch(menu) {
				case 1: input(); break;
				case 2: quiz(); break;
				case 3: end(); return;
				default: 
					error("�߸��� �Է��Դϴ�.");
			}
		}
		
	}
}
