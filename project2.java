import java.util.Scanner;
public class project2 {
	public static void main(String[] args) {
		System.out.println("연산>>");
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
				System.out.println("0으로 나눌 수 없습니다.");
				n.close();
				return;
			}
			else
				answer=i1/i3;
		}
		else
		{
			System.out.println("사칙연산을 입력해 주십시오.");
			n.close();
			return;
		}
		System.out.println(i1+i2+i3+"의 계산 결과는 "+answer);
		n.close();
	}

}
