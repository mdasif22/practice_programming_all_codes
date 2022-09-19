package Diploma_Practice;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.*;
public class newFrame {
	
	JFrame frame;
	JLabel label;
	public newFrame()
	{
		frame=new JFrame("Excercise");
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());
		
		label=new JLabel("hi");
		frame.add(label);
	}

	public static void main(String[] args) {
		new newFrame();

	}

}
