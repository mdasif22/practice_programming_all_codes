package Diploma_Practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginCalulator implements ActionListener {
	JFrame frm;
	JPanel pnl;
	JLabel lbl, lunm, lpass;
	JTextField tunm;
	JPasswordField tpass;
	JButton blogin;

	public LoginCalulator() {
		frm = new JFrame("Login");
		frm.setSize(554, 424);
		frm.setVisible(true);
		pnl = new JPanel();
		pnl.setBackground(Color.YELLOW);
		frm.add(pnl);
		lbl = new JLabel("Login");
		lunm = new JLabel("User Name ");
		lpass = new JLabel("Passsword ");
		tunm = new JTextField(10);
		tpass = new JPasswordField(10);
		blogin = new JButton("Login");
		Font f = new Font("Times New Roman", Font.BOLD, 35);
		lbl.setForeground(Color.RED);
		lbl.setFont(f);
		Font f1 = new Font("Times New Roman", Font.BOLD, 20);
		lunm.setFont(f1);
		lpass.setFont(f1);
		pnl.add(lbl);
		pnl.add(lunm);
		pnl.add(tunm);
		pnl.add(lpass);
		pnl.add(tpass);
		pnl.add(blogin);
		pnl.setLayout(null);
		lbl.setBounds(224, 45, 100, 60);
		lunm.setBounds(170, 130, 100, 30);
		tunm.setBounds(275, 130, 100, 35);
		lpass.setBounds(170, 180, 100, 30);
		tpass.setBounds(275, 180, 100, 35);
		blogin.setBounds(222, 240, 100, 30);
		blogin.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == blogin) {
			String Uid = tunm.getText();
			String Upass = tpass.getText();
			if (Uid.equals("Admin")) {
				if (Upass.equals("1234")) {
					CalculatorNew r = new CalculatorNew();
					System.out.println("Login successful..");
					frm.dispose();
				}
			} else {
				Label l12;
				Font f2 = new Font("Arial Rounded MT Bold", Font.BOLD, 18);
				l12 = new Label("!! INVALID USERNAME OR PASSWORD !!");
				l12.setBounds(80, 300, 390, 30);
				l12.setForeground(Color.RED);
				l12.setFont(f2);
				pnl.add(l12);
			}
		}
	}

	public static void main(String args[]) {
		LoginCalulator l = new LoginCalulator();
	}
}