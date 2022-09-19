package Diploma_Practice;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class RailwayReservation extends JApplet implements ActionListener {

	JTextArea tout;
	JFrame frm;
	JPanel pnl;
	JLabel lgender, lname, lmno, lunm, llnm, lpass, lcpass, lmobile, lemail, ltname, ltno;
	JLabel lstate, lbl, laddr;
	JTextField tmno, ttno, tlnm, temail, tgender, tpass1, tname;
	JTextArea taddr;
	JButton bregister, bback;
	CheckboxGroup c = new CheckboxGroup();
	JRadioButton male;
	JRadioButton female;
	JComboBox ttname;

	public RailwayReservation() {

		frm = new JFrame("Registration Page");
		frm.setSize(800, 970);
		frm.setVisible(true);

		pnl = new JPanel();

		pnl.setBackground(Color.YELLOW);
		frm.add(pnl);

		lbl = new JLabel("Railway Reservation Form");
		lbl.setForeground(Color.RED);

		Font f2 = new Font("TimesNewRoman", Font.BOLD, 30);
		lbl.setFont(f2);

		Font f = new Font("TimesNewRoman", Font.BOLD, 20);

		lname = new JLabel("Name");
		lemail = new JLabel("Email");
		lmno = new JLabel("Mobile No");
		ltname = new JLabel("Train Name");
		ltno = new JLabel("Train No");
		lgender = new JLabel("Gender");

		laddr = new JLabel("Address");

		male = new JRadioButton("male");
		female = new JRadioButton("female");

		tname = new JTextField(10);
		temail = new JTextField(10);
		tmno = new JTextField(10);
		// ttname=new JCombobox();
		ttno = new JTextField(6);
		taddr = new JTextArea();

		String[] data = { "Vivek Express -- Dibrugarh-Kanyakumari", "Himsagar Express -- Kashmir to Kanyakumari",
				"Darjeeling Himalayan Railway", "Palace on Wheels", "Golden Chariot", "Maharaja Express",
				"Deccan Odyssey", "Maitree Express", "Howrah-Jaisalmer Express", "Island Express" };

		ttname = new JComboBox(data);
		pnl.add(ttname);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(240, 450);
		tout.setLineWrap(true);
		tout.setEditable(false);
		pnl.add(tout);

		lname.setForeground(Color.RED);
		lmno.setForeground(Color.RED);
		lemail.setForeground(Color.RED);
		ltno.setForeground(Color.RED);
		ltname.setForeground(Color.RED);
		lgender.setForeground(Color.RED);
		laddr.setForeground(Color.RED);
		lname.setFont(f);
		lmno.setFont(f);
		lemail.setFont(f);
		ltname.setFont(f);
		ltno.setFont(f);
		lgender.setFont(f);
		laddr.setFont(f);

		bregister = new JButton("Register");

		pnl.add(lbl);
		pnl.add(lname);
		pnl.add(ltname);
		pnl.add(ltno);
		pnl.add(lmno);
		pnl.add(lemail);
		pnl.add(lgender);
		pnl.add(male);
		pnl.add(female);
		pnl.add(laddr);
		pnl.add(tname);
		pnl.add(ttname);
		pnl.add(ttno);
		pnl.add(tmno);
		pnl.add(temail);
		pnl.add(taddr);

		pnl.add(bregister);

		pnl.setLayout(null);

		lbl.setBounds(230, 10, 500, 35);
		lname.setBounds(264, 65, 100, 30);
		laddr.setBounds(264, 105, 110, 30);
		ltname.setBounds(264, 105, 110, 30);
		ltno.setBounds(264, 145, 100, 30);
		lmno.setBounds(264, 185, 100, 30);
		lgender.setBounds(264, 225, 100, 30);
		ltname.setBounds(264, 265, 200, 30);

		tname.setBounds(379, 65, 100, 28);
		taddr.setBounds(379, 105, 100, 30);
		ttno.setBounds(379, 145, 100, 28);
		tmno.setBounds(379, 185, 100, 28);
		male.setBounds(379, 225, 100, 25);
		female.setBounds(490, 225, 100, 28);
		ttname.setBounds(379, 265, 270, 28);

		bregister.setBounds(320, 330, 90, 35);

		bregister.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bregister) {

			boolean gen = male.isSelected() || female.isSelected();

			if ((!tname.getText().isEmpty() && !tmno.getText().isEmpty() && !ttno.getText().isEmpty()
					&& !taddr.getText().isEmpty() && gen)) {

				String regex = "\\d{10}";
				// Matching the given phone number with regular expression
				boolean result = tmno.getText().matches(regex);

				if (result) {

					Label l12;
					Font f3 = new Font("Arial Rounded MT Bold", Font.BOLD, 20);
					l12 = new Label("Form Submitted Successfully");
					l12.setBounds(220, 380, 330, 50);
					l12.setForeground(Color.RED);
					l12.setFont(f3);
					pnl.add(l12);

					String train_n;
					train_n = (String) ttname.getSelectedItem();

					String Uname = "Name : " + tname.getText() + "\n";
					String Umno = "Mobile No : " + tmno.getText() + "\n";
					String Utname = "Train Name : " + train_n + "\n";
					String Upass = "Train No : " + ttno.getText() + "\n";

					String Uaddr = "Address : " + taddr.getText() + "\n";
					String Ugender;

					if (male.isSelected())
						Ugender = "Gender : Male" + "\n";
					else
						Ugender = "Gender : Female" + "\n";

					tout.setText(Uname + Umno + Uaddr + Upass + Ugender + Utname);
					tout.setEditable(false);

				}

				else {
					Label l4;
					Font f3 = new Font("Arial Rounded MT Bold", Font.BOLD, 18);
					l4 = new Label("!! Invalid Mobile No !!");
					l4.setBounds(275, 380, 330, 50);
					l4.setForeground(Color.RED);
					l4.setFont(f3);
					pnl.add(l4);
				}
			}

			else {
				Label l4;
				Font f3 = new Font("Arial Rounded MT Bold", Font.BOLD, 18);
				l4 = new Label("!! All Fields are Compulsary !!");
				l4.setBounds(220, 380, 330, 50);
				l4.setForeground(Color.RED);
				l4.setFont(f3);
				pnl.add(l4);
			}

		}
	}

	public static void main(String[] args) {
		RailwayReservation m = new RailwayReservation();
	}
}