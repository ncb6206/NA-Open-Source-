import java.util.Scanner;
import java.util.Vector;

class Nation {
	private String country;
	private String capital;
	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
	public String getCountry() {
		return country;
	}
	public String getCapital() {
		return capital;
	}
}

public class Countrygame {
	Vector<Nation> store = new Vector<Nation>();
	Scanner scanner = new Scanner(System.in);
	
	public Countrygame() {
		store.add(new Nation("���þ�", "��ũ��"));
		store.add(new Nation("�߱�", "����¡"));
		store.add(new Nation("������", "���帮��"));
		store.add(new Nation("�Ϻ�", "����"));
		store.add(new Nation("����", "����"));
		store.add(new Nation("�߽���", "�߽��ڽ�Ƽ"));
		store.add(new Nation("�׸���", "���׳�"));
		store.add(new Nation("����", "������"));
		store.add(new Nation("������", "�ĸ�"));
	}
	
	public static void main(String[] args) {
		Countrygame game = new Countrygame();
		game.run();
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
	
	void error(String a) {
		System.out.println(a);
	}
	
	void quiz() {
		while(true) {
			int index = (int)(Math.random()*store.size()); 
			
			Nation nation = store.get(index);
			String question = nation.getCountry();
			String answer = nation.getCapital();
			
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

	boolean contains(String country) {
		for(int i=0; i<store.size(); i++) {
			if(store.get(i).getCountry().equals(country)) { 
				return true;
			}
		}
		
		return false;
	}
	
	void input() {
		int m = store.size();
		System.out.println("���� " + m + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		m++;
		while(true) {
			System.out.print("����� ���� �Է�" + m + ">> ");
			String country = scanner.next(); 
			if(country.equals("�׸�")) {
				break;
			}
			String capital = scanner.next(); 
			if(contains(country)) { 
				System.out.println(country + "�� �̹� �ֽ��ϴ�!");
				continue;
			}
				
			store.add(new Nation(country, capital));
			m++;
		}
	}
	
}