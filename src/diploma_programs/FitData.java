import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FitData extends JFrame implements ActionListener {
	JLabel label1, label2, label3, label4, label5;
	JTextField t1, t2, t3;
	JRadioButton male, female;
	JButton submit;
	JTextArea screen;

	public FitData() {
		setTitle("FitData");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		label1 = new JLabel("Name");
		label1.setBounds(20, 50, 100, 20);
		c.add(label1);
		t1 = new JTextField();
		t1.setBounds(130, 50, 100, 20);
		c.add(t1);
		label2 = new JLabel("Height(in meters)");
		label2.setBounds(20, 100, 100, 20);
		c.add(label2);
		t2 = new JTextField();
		t2.setBounds(130, 100, 100, 20);
		c.add(t2);
		label3 = new JLabel("Weight");
		label3.setBounds(20, 150, 100, 20);
		c.add(label3);
		t3 = new JTextField();
		t3.setBounds(130, 150, 100, 20);
		c.add(t3);
		label4 = new JLabel("Gender");
		label4.setBounds(20, 200, 100, 20);
		c.add(label4);
		male = new JRadioButton("Male");
		female = new JRadioButton("female");
		male.setBounds(130, 200, 80, 20);
		female.setBounds(220, 200, 80, 20);
		c.add(male);
		c.add(female);
		submit = new JButton("Submit");
		submit.setBounds(150, 300, 80, 20);
		c.add(submit);
		submit.addActionListener(this);
		screen = new JTextArea();
		screen.setBounds(350, 50, 300, 300);
		c.add(screen);
		setVisible(true);
	}

	public void FileIO(String fname, String gender, String weight, String height, String msg, String diet, String exe) {
		try {
			String content = "\n" + fname + "\t" + gender + "\t" + weight + "\t" + height + "\t" + msg + "\t" + diet
					+ "\t" + exe;
//Specify the file name and path here
			File file = new File("FitMe.txt");
			if (!file.exists()) {
				file.createNewFile();
				FileWriter myWriter = new FileWriter("FitMe.txt");
				myWriter.write("First Name\tGender\tWeight\tHeight\tBMI and healt\tDiet plan\tExercise\n");
				myWriter.close();
			}
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			System.out.println("Data successfully appended at the end of file");
		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		String name = t1.getText();
		String height = t2.getText();
		String Weight = t3.getText();
		String gender = "female";
		String msg = null;
		String Diet = null;
		String exe = null;
		if (male.isSelected()) {
			gender = "male";
		}
		float h = Float.parseFloat(height) * Float.parseFloat(height);
		float bmi1 = Float.parseFloat(Weight) / h;
		System.out.println("YOUR BMI IS :" + bmi1);
		if (bmi1 > 18.5 && bmi1 < 25) {
			msg = "\n\n\t!!CONGRATULATIONS!! \n\tHELLO" + name + " you are NORMAL ";
			Diet = "Recommneded diet is-\n Broccoli cal(31/Cup)\n Brothcal(31/Cup)\nCabbage cal(22/Cup)";
			exe = "\\nRecommended exercise is-\n\t A brisk walk\n\tJogging\n\t Climbing the stairs\n\tPlaying tennis";
		} else if (bmi1 > 25) {
			msg = "\n\n\t\t\t\t !!PAY ATTENTION!! \n\tHELLO " + name + " you are OVERWEIGHT";
			Diet = "Recommneded diet is-\n Broccoli cal(31/Cup)\n Brothcal(31/Cup)\nCabbage cal(22/Cup)";
			exe = "\nRecommended exercise is-\\n\t Lifting free weights\n\t Using resistance machines at gym \n\t Using resistance bands ";
		} else if (bmi1 < 18.5) {
			msg = "\n\n\t\t\t\t !!NEED TO IMPROVE!! \n\tHELLO " + name + " You are UNDERWEIGHT";
			Diet = "\nRecommneded diet is-\n Broccoli cal(31/Cup)\n Brothcal(31/Cup)\nCabbage cal(22/Cup)";
			exe = "\nRecommended exercise is-\n\t Stretching various body parts\n\tDoing Yoga";
		}
		screen.setText("YOUR BMI IS :" + bmi1 + "\n" + msg + "\n" + Diet + "\n" + exe);
		FileIO(name, height, Weight, gender, msg, Diet, exe);
	}
}

class FitMe {
	public static void main(String[] args) {
		FitData f = new FitData();
	}
}