import java.util.Scanner;
public class project1 {
	public static void main(String[] args) {
		System.out.println("첫번째 원의 중심과 반지름 입력>>");
		Scanner n=new Scanner(System.in);
		int i1=n.nextInt();
		int i2=n.nextInt();
		double v1=n.nextDouble();
	
		System.out.println("두번째 원의 중심과 반지름 입력>>");
		int c1=n.nextInt();
		int c2=n.nextInt();
		double v2=n.nextDouble();
		double distance=0;
		distance = Math.sqrt((i1-c1)*(i1-c1)+(i2-c2)*(i2-c2));
		if(distance<=v1+v2)
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");
		n.close();
	}
}
