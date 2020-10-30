import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
	}
}

class CenterPanel extends JPanel{
	public CenterPanel() {
		setLayout(null);
		JLabel love = new JLabel("Love");
		JLabel hello = new JLabel("Hello");
		JLabel java = new JLabel("Java");
		
		love.setBounds(200,150,50,20);
		hello.setBounds(100,10,50,20);
		java.setBounds(20,200,50,20);
		
		add(love);
		add(hello);
		add(java);
	}
}

public class stringarray extends JFrame{
	public stringarray() {
		setTitle("Open Challenge 9");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NorthPanel nor = new NorthPanel();
		CenterPanel cen = new CenterPanel();
		
		add(nor,BorderLayout.NORTH);
		add(cen,BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new stringarray();
	}
}
