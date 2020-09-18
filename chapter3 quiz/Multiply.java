import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=0,m=0;
		while(true) 
		{
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try {
				n = scanner.nextInt();
				m = scanner.nextInt();
				break;
			}
			catch(InputMismatchException e){
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.nextLine();
				continue;
			}
		}
		System.out.print(n + "*" + m + "=" + n*m);
		scanner.close();
	}
}