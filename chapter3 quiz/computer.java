import java.util.Scanner;

public class computer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String array[] = {"����","����","��"};
		String User;
		int i;
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			System.out.println("���� ���� ��!>>");
			User = scanner.next();
			i = (int)(Math.random()*3);
			switch(User) {
				case "����" :
					if(array[i].equals("����")) {
						System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
						break;
					}
					else if(array[i].equals("����")) {
						System.out.println("����� = ����, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
						break;
					}
					else if(array[i].equals("��")) {
						System.out.println("����� = ����, ��ǻ�� = ��, ��ǻ�Ͱ� �̰���ϴ�.");
						break;
					}
				case "����" :
					if(array[i].equals("����")) {
						System.out.println("����� = ����, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
						break;
					}
					else if(array[i].equals("����")) {
						System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
						break;
					}
					else if(array[i].equals("��")) {
						System.out.println("����� = ����, ��ǻ�� = ��, ����ڰ� �̰���ϴ�.");
						break;
					}
				case "��" :
					if(array[i].equals("����")) {
						System.out.println("����� = ��, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
						break;
					}
					else if(array[i].equals("����")) {
						System.out.println("����� = ��, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
						break;
					}
					else if(array[i].equals("��")) {
						System.out.println("����� = ��, ��ǻ�� = ��, �����ϴ�.");
						break;
					}
				case "�׸�" :
					System.out.println("������ �����մϴ�...");
					scanner.close();
				    return;
				default :
					System.out.println("����, ����, ��, �׸� �߿� �ϳ��� �Է��� �ּ���.");
				    break;
			}
		}
	}

}
