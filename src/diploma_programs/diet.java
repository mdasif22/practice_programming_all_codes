import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.util.*;

public class diet implements ActionListener {

	// private static final long serialVersionUID = 1L;
	JFrame frame;
	private JRadioButton Male;
	private JRadioButton Female;

	private JButton button;
	private ButtonGroup buttonGroup;
	
	
	public void paelo() {
		System.out.println("\t\t\t\tPaelo Diet");
		System.out.println("\n\t\tFood\n\n\t\t\t[1]Fishes\t\t\t[2]Meat\t\t\t[3]Eggs\t\t\t[4]Nuts");
		System.out.println("\n\t\t** Avoid**\n\n\t\t\t[1]Sugar\t\t\t[2]Processed food\t\t\t[3]Soft drinks\t\t\t[4]Dairy Products");
	}
	public void Vegan() {
		System.out.println("\t\t\t\t Vegan Diet");
		System.out.println("\n\t\tFood\n\n\t\t\t[1]high-fat dairy\t\t\t[2]healthy oils\t\t\t[3]tubers\t\t\t[4]Non-Glueten Grains");
		System.out.println("\n\t\t** Avoid **\n\n\t\t\t[1]HFCS\t\t\t[2]Sugar \t\t\t[3]seed oils\t\t\t[4]trans fats");
	}
	

	public diet() {

		frame = new JFrame();

		// Display the window.

		frame.pack();

		frame.setVisible(true);
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set flow layout for the frame
		frame.setLayout(new FlowLayout());

		Male = new JRadioButton("Male");
		Male.setActionCommand("Male");

		Female = new JRadioButton("Female");
		Female.setActionCommand("Female");

		button = new JButton("Check");

		button.addActionListener(this);

		buttonGroup = new ButtonGroup();

		// add radio buttons
		buttonGroup.add(Male);
		buttonGroup.add(Female);

		frame.add(Male);
		frame.add(Female);

		frame.add(button);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Check")) {
			Scanner sc = new Scanner(System.in);
			String s = buttonGroup.getSelection().getActionCommand();
			if (s == "Male") {
				Frame f = new Frame();
				System.out.println("Enter Your Age");
				int age = sc.nextInt();
				double bmr = (66.47 + (13.75 * 54) + (5.003 * 161.544) - (6.755 * age));
				double Cal = bmr * 1.2;
				System.out.println("HEY! CALORIES PER DAY FOR YOU ARE :" + Cal);
				//file operation
				try {
					FileWriter myWriter = new FileWriter("C:/FitMe/diet.txt");
					myWriter.write("CALORIES:"+Cal);
					myWriter.close();
				} catch (IOException ex) {
					System.out.println("An error occurred.");
					ex.printStackTrace();
				}

			} else {
				System.out.println("Enter Your Age");
				int age = sc.nextInt();
				double bmr = (655.1 + (9.563 * 54) + (1.85 * 161.544) - (4.676 * age));
				double Cal = bmr * 1.2;
				System.out.println("HEY! CALORIES PER DAY FOR YOU ARE :" + Cal);
				
				//file operation
				try {
					FileWriter myWriter = new FileWriter("C:/FitMe/diet.txt");
					myWriter.write("CALORIES:"+Cal);
					myWriter.close();
				} catch (IOException ex) {
					System.out.println("An error occurred.");
					ex.printStackTrace();
				}
			}
			
			
			System.out.println("\t\t\tChoose Your Diet Plan");
			System.out.println("\n\t\t[1]PAELO DIET");
			System.out.println("\n\t\t[2]VEGAN DIET");
			int ch1=sc.nextInt();
			switch(ch1)
			{
			case 1: paelo();
					
					try {
						FileWriter myWriter = new FileWriter("C:/FitMe/diet.txt");
						myWriter.write("\t\t\t\tPaelo Diet");
						myWriter.write("\n\t\tFood\n\n\t\t\t[1]Fishes\t\t\t[2]Meat\t\t\t[3]Eggs\t\t\t[4]Nuts");
						myWriter.write("\n\t\t** Avoid**\n\n\t\t\t[1]Sugar\t\t\t[2]Processed food\t\t\t[3]Soft drinks\t\t\t[4]Dairy Products");
						myWriter.close();
					} catch (IOException ex) {
						System.out.println("An error occurred.");
						ex.printStackTrace();
					}
					
					break;
			case 2:
					Vegan();
					try {
						FileWriter myWriter = new FileWriter("C:/FitMe/diet.txt");
						myWriter.write("\t\t\t Vegan Diet");
						myWriter.write("\n\t\tFood\n\n\t\t\t[1]high-fat dairy\t\t\t[2]healthy oils\t\t\t[3]tubers\t\t\t[4]Non-Glueten Grains");
						myWriter.write("\n\t\t** Avoid **\n\n\t\t\t[1]HFCS\t\t\t[2]Sugar \t\t\t[3]seed oils\t\t\t[4]trans fats");
						myWriter.close();
					} catch (IOException ex) {
						System.out.println("An error occurred.");
						ex.printStackTrace();
					}
					break;
			default:
					break;
			}
		}
	}

	public static void main(String[] args) {

		diet obj = new diet();

	}
}