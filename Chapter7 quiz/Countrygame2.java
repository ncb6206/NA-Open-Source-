import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Countrygame2 {
	HashMap<String, String> store = new HashMap<String, String>();
	Scanner scanner = new Scanner(System.in);
	
	public Countrygame2() {
		store.put("멕시코", "멕시코시티");
		store.put("그리스", "아테네");
		store.put("러시아", "모스크바");
		store.put("스페인", "마드리드");
		store.put("프랑스", "파리");
		store.put("영국", "런던");
		store.put("중국", "베이찡");
		store.put("일본", "도쿄");
		store.put("독일", "베를린");
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
		System.out.println("현재 " + i + "개 나라와 수도가 입력되어 있습니다.");
		i++;
		while(true) {
			System.out.print("나라와 수도 입력" + i + ">> ");
			String country = scanner.next();
			if(country.equals("그만")) {
				break;
			}
			String capital = scanner.next();
			if(store.containsKey(country)) {
				System.out.println(country + "는 이미 있습니다");
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
			
			System.out.print(question + "의 수도는? ");
			
			String inputsentence = scanner.next(); 
			if(inputsentence.equals("그만")) {
				break;
			}
			if(inputsentence.equals(answer))
				System.out.println("정답!!");
			else
				System.out.println("아닙니다!!");				
		}	
		
	}
	
	void end() {
		System.out.println("게임을 종료합니다.");	
	}
	
	public void run() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int menu = scanner.nextInt();
			switch(menu) {
				case 1: input(); break;
				case 2: quiz(); break;
				case 3: end(); return;
				default: 
					error("잘못된 입력입니다.");
			}
		}
		
	}
}
