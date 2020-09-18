import java.util.Scanner;

public class computer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String array[] = {"가위","바위","보"};
		String User;
		int i;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.println("가위 바위 보!>>");
			User = scanner.next();
			i = (int)(Math.random()*3);
			switch(User) {
				case "바위" :
					if(array[i].equals("바위")) {
						System.out.println("사용자 = 바위, 컴퓨터 = 바위, 비겼습니다.");
						break;
					}
					else if(array[i].equals("가위")) {
						System.out.println("사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.");
						break;
					}
					else if(array[i].equals("보")) {
						System.out.println("사용자 = 바위, 컴퓨터 = 보, 컴퓨터가 이겼습니다.");
						break;
					}
				case "가위" :
					if(array[i].equals("바위")) {
						System.out.println("사용자 = 가위, 컴퓨터 = 바위, 컴퓨터가 이겼습니다.");
						break;
					}
					else if(array[i].equals("가위")) {
						System.out.println("사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.");
						break;
					}
					else if(array[i].equals("보")) {
						System.out.println("사용자 = 가위, 컴퓨터 = 보, 사용자가 이겼습니다.");
						break;
					}
				case "보" :
					if(array[i].equals("바위")) {
						System.out.println("사용자 = 보, 컴퓨터 = 바위, 사용자가 이겼습니다.");
						break;
					}
					else if(array[i].equals("가위")) {
						System.out.println("사용자 = 보, 컴퓨터 = 가위, 컴퓨터가 이겼습니다.");
						break;
					}
					else if(array[i].equals("보")) {
						System.out.println("사용자 = 보, 컴퓨터 = 보, 비겼습니다.");
						break;
					}
				case "그만" :
					System.out.println("게임을 종료합니다...");
					scanner.close();
				    return;
				default :
					System.out.println("가위, 바위, 보, 그만 중에 하나만 입력해 주세요.");
				    break;
			}
		}
	}

}
