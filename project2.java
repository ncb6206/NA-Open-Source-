import java.util.Scanner;
public class project2 {
	public static void main(String[] args) {
		System.out.println("����>>");
		Scanner n=new Scanner(System.in);
		int i1=n.nextInt();
		String i2=n.next();
		int i3=n.nextInt();
		
		int answer=0;
		if(i2.equals("+"))
			answer=i1+i3;
		else if(i2.equals("-"))
			answer=i1-i3;
		else if(i2.equals("*"))
			answer=i1*i3;
		else if(i2.equals("/")) 
		{
			if(i3==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				n.close();
				return;
			}
			else
				answer=i1/i3;
		}
		else
		{
			System.out.println("��Ģ������ �Է��� �ֽʽÿ�.");
			n.close();
			return;
		}
		System.out.println(i1+i2+i3+"�� ��� ����� "+answer);
		n.close();
	}

}
