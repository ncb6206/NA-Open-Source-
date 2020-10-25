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
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");
		Scanner scanner = new Scanner(System.in);
		String Filename = scanner.nextLine();

		readFile(Filename); 
		
		while(true) {
			System.out.print("검색할 단어나 문장>> ");
			String line = scanner.nextLine();
			if(line.equals("그만"))
				break; 
			Vector<Integer> numVector = searchWord(line); 
			printLines(numVector);
		}
		
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
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