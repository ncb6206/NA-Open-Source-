import java.util.Scanner;
class seat{
	String name;
	public seat() {
		this.name = "---";
	}
}

public class concert {
	public static void main(String[] args) {
		seat [] S = new seat[10];
		seat [] A = new seat[10];
		seat [] B = new seat[10];
		
		Scanner scanner = new Scanner(System.in);
		int n1=0, n2=0, n3=0, n4=0, i=0;
		String name1;
		for(i=0;i<S.length;i++)		{
			S[i] = new seat();
			A[i] = new seat();
			B[i] = new seat();
		}
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		while(true)
		{
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			n1 = scanner.nextInt();
			switch(n1) {
				case 1:
					System.out.print("�¼����� S(1), A(2), B(3)>>");
					n2 = scanner.nextInt();
					
					switch(n2) 
					{
						case 1:
							System.out.print("S>>");
							for(i=0;i<S.length;i++) 
								System.out.print(" "+S[i].name);
							System.out.println();
							System.out.print("�̸�>>");
							name1 = scanner.next();
							System.out.print("��ȣ>>");
							n3 = scanner.nextInt();
							if(n3>0&&n3<11)
								S[n3-1].name = name1;
							else
								System.out.println("��ȣ�� �����ϴ�.");
							break;
						case 2:
							System.out.print("A>>");
							for(i=0;i<A.length;i++) 
								System.out.print(" "+A[i].name);
							System.out.println();
							System.out.print("�̸�>>");
							name1 = scanner.next();
							System.out.print("��ȣ>>");
							n3 = scanner.nextInt();
							if(n3>0&&n3<11)
								A[n3-1].name = name1;
							else
								System.out.println("��ȣ�� �����ϴ�.");
							break;
						case 3:
							System.out.print("B>>");
							for(i=0;i<B.length;i++) 
								System.out.print(" "+B[i].name);
							System.out.println();
							System.out.print("�̸�>>");
							name1 = scanner.next();
							System.out.print("��ȣ>>");
							n3 = scanner.nextInt();
							if(n3>0&&n3<11)
								B[n3-1].name = name1;
							else
								System.out.println("��ȣ�� �����ϴ�.");
							break;
						default :
							System.out.println("�ٽ� �Է��ϼ���.");
							break;
					}
					break;
				case 2:
					System.out.print("S>>");
					for(i=0;i<S.length;i++) 
						System.out.print(" "+S[i].name);
					System.out.println();
					System.out.print("A>>");
					for(i=0;i<A.length;i++) 
						System.out.print(" "+A[i].name);
					System.out.println();
					System.out.print("B>>");
					for(i=0;i<B.length;i++) 
						System.out.print(" "+B[i].name);
					System.out.println();
					System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
					break;
				case 3:
					System.out.print("�¼�  S:1, A:2, B:3>>");
					n2 = scanner.nextInt();
					
					switch(n2) 
					{
					case 1:
						System.out.print("S>>");
						for(i=0;i<S.length;i++) 
							System.out.print(" "+S[i].name);
						System.out.println();
						System.out.print("�̸�>>");
						name1 = scanner.next();
						for(n4=0;n4<S.length;n4++) {
							if(S[n4].name.equals(name1)) 
								S[n4].name = "---";
						}
						break;
					case 2:
						System.out.print("A>>");
						for(i=0;i<A.length;i++) 
							System.out.print(" "+A[i].name);
						System.out.println();
						System.out.print("�̸�>>");
						name1 = scanner.next();
						for(n4=0;n4<A.length;n4++) {
							if(S[n4].name.equals(name1)) 
								A[n4].name = "---";
						}
						break;
					case 3:
						System.out.print("B>>");
						for(i=0;i<B.length;i++) 
							System.out.print(" "+B[i].name);
						System.out.println();
						System.out.print("�̸�>>");
						name1 = scanner.next();
						for(n4=0;n4<B.length;n4++) {
							if(S[n4].name.equals(name1)) 
								B[n4].name = "---";
						}
						break;
					default :
						System.out.println("�ٽ� �Է��ϼ���.");
						break;
					}
					break;
				case 4:
					return;
				default :
					System.out.println("�ٽ� �Է��ϼ���.");
					break;
			}
		}
	}
}
