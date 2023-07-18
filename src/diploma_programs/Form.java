import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Form {

	public static void main(String[] args) {
		Add obj = new Add();

	}

}


class Add extends JFrame implements ActionListener
{
	Button b;
	JLabel lab1;
	Label lab2;
	Label lab3;
	JTextField  name;
	TextField  password;
	TextField welcome;
	public Add()
	{
		lab1=new JLabel("User Name");
	    lab2=new Label("Password");
	    lab3=new Label();
	    name=new JTextField ();
	    password=new TextField ();
	    welcome=new TextField ("WELCOME TO GPP LOG-IN ...");
	    b=new Button("Submit");
	    add(lab1);
    	add(name);
    	add(lab2);
    	add(password);
    	add(lab3);
    	add(b);
    	add(welcome);
    	setLayout(null);
    	lab1.setBounds(50,50,80,50);
    	lab2.setBounds(50,110,80,50);
    	name.setBounds(150,60,80,30);
    	password.setBounds(150,120,80,30);
    	b.setBounds(110,170,100,20);
    	
    	b.addActionListener(this);
    	
    	lab3.setBounds(110,210,100,20);
		setVisible(true);
		setSize(400,400);

	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
			String l_name=name.getText();
			String l_pass=password.getText();
			if(l_name.equals("Asif") && l_pass.equals("1806091"))
			{
			TextField t=new TextField(25);
			t.setText("LOGIN SUCCESSFULL");
			add(t);
			t.setBounds(150,250,150,30);
			}
		}
	}
}

/*
public class Form {
	check c = new check();
}

class check extends JFrame {
	public check() {
		JLabel lab1 = new JLabel("User Name");
		JLabel lab2 = new JLabel("Password");
		JLabel lab3 = new JLabel();
		JTextField name = new JTextField();
		JTextField password = new JTextField();
		JTextField welcome = new JTextField("WELCOME TO GPP LOG-IN ...");
		JButton b = new JButton("Submit");
        
		// public void init()
        lab1.add(lab1);
        name.add(name);
		lab2.add(lab2);
		password.add(password);
		lab3.add(lab3);
		b.add(b);
		welcome.add(welcome);
		setLayout(new FlowLayout());
		lab1.setBounds(50, 50, 80, 50);
		lab2.setBounds(50, 110, 80, 50);
		name.setBounds(150, 60, 80, 30);
		password.setBounds(150, 120, 80, 30);
		b.setBounds(110, 170, 100, 20);
		lab3.setBounds(110, 210, 100, 20);
		setVisible(true);
		setSize(400,400);

	}
}
*/