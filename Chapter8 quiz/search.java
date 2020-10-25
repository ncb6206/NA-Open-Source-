import java.io.*;
import java.util.*;

public class search {
	public static void main(String[] args) {
		search sw = new search();
		sw.run();
	}
	
	private File targetFile = null;
	Vector<String> lineVector = new Vector<String>();
	
	public void run() {
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");
		Scanner scanner = new Scanner(System.in);
		String Filename = scanner.nextLine();

		readFile(Filename); 
		
		while(true) {
			System.out.print("�˻��� �ܾ ����>> ");
			String line = scanner.nextLine();
			if(line.equals("�׸�"))
				break; 
			Vector<Integer> numVector = searchWord(line); 
			printLines(numVector);
		}
		
		scanner.close();
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	Vector<Integer> searchWord(String word) 
	{ 
		Vector<Integer> numVector = new Vector<Integer>();
		for(int i=0; i<lineVector.size(); i++) {
			String line = lineVector.get(i);
			if(line.indexOf(word) != -1) 
				numVector.add(i);
		}
		
		return numVector;
	}
	
	void readFile(String fileName) 
	{
		targetFile = new File(fileName);
		try {
			Scanner fileScanner = new Scanner(new FileReader(targetFile));
			while(fileScanner.hasNext()) { 
				String line = fileScanner.nextLine(); 
				lineVector.add(line); 
			}			
			fileScanner.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

	void printLines(Vector<Integer> numVector) 
	{
		for(int i=0; i<numVector.size(); i++) {
			int lineNum = numVector.get(i);
			String line = lineVector.get(lineNum);
			System.out.println(lineNum + ":" + line);
		}
	}
	
}