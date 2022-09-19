package Diploma_Practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorNew implements ActionListener {
	JFrame frm;
	JPanel pnl;
	JLabel lno1, lno2, lans;
	JTextField tno1, tno2, tans;
	JButton badd, bsub, bmul, bdiv, breset, bexit;

	public CalculatorNew() {
		frm = new JFrame("Calculator ver2020");
		frm.setVisible(true);
		frm.setSize(400, 400);
		pnl = new JPanel();
		frm.add(pnl);
		pnl.setBackground(Color.yellow);
		lno1 = new JLabel("Number1");
		lno2 = new JLabel("Number2");
		lans = new JLabel("Ans");
		tno1 = new JTextField(10);
		tno2 = new JTextField(10);
		tans = new JTextField(10);
		badd = new JButton("Add");
		bsub = new JButton("Sub");
		bmul = new JButton("Mul");
		bdiv = new JButton("Div");
		breset = new JButton("Reset");
		bexit = new JButton("Exit");
		GridLayout gl = new GridLayout(6, 2);
		pnl.setLayout(gl);
		pnl.add(lno1);
		pnl.add(tno1);
		pnl.add(lno2);
		pnl.add(tno2);
		pnl.add(lans);
		pnl.add(tans);
		pnl.add(badd);
		pnl.add(bsub);
		pnl.add(bmul);
		pnl.add(bdiv);
		pnl.add(breset);
		pnl.add(bexit);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		breset.addActionListener(this);
		bexit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == badd) {
				String s1 = tno1.getText();
				String s2 = tno2.getText();
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int add = n1 + n2;
				String str = Integer.toString(add);
				tans.setText(str);
			}
			if (e.getSource() == bsub) {
				String s1 = tno1.getText();
				String s2 = tno2.getText();
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int sub = n1 - n2;
				String str = Integer.toString(sub);
				tans.setText(str);
			}
			if (e.getSource() == bmul) {
				String s1 = tno1.getText();
				String s2 = tno2.getText();
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int mul = n1 * n2;
				String str = Integer.toString(mul);
				tans.setText(str);
			}
			if (e.getSource() == bdiv) {
				String s1 = tno1.getText();
				String s2 = tno2.getText();
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int div = n1 / n2;
				String str = Integer.toString(div);
				tans.setText(str);
			}
			if (e.getSource() == breset) {
				tno1.setText("");
				tno2.setText("");
				tans.setText("");
			}
			if (e.getSource() == bexit) {
				System.exit(0);
			}
		} catch (NumberFormatException e1) {
			tans.setText("Invalid Input");
		}
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
	}
}