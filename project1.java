import java.util.Scanner;
public class project1 {
	public static void main(String[] args) {
		System.out.println("ù��° ���� �߽ɰ� ������ �Է�>>");
		Scanner n=new Scanner(System.in);
		int i1=n.nextInt();
		int i2=n.nextInt();
		double v1=n.nextDouble();
	
		System.out.println("�ι�° ���� �߽ɰ� ������ �Է�>>");
		int c1=n.nextInt();
		int c2=n.nextInt();
		double v2=n.nextDouble();
		double distance=0;
		distance = Math.sqrt((i1-c1)*(i1-c1)+(i2-c2)*(i2-c2));
		if(distance<=v1+v2)
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		n.close();
	}
}
