package Diploma_Practice;
/*import java.awt.Button;
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

public class Log {

	public static void main(String[] args) {
		Addition obj = new Addition();

	}

}


class Addition extends JFrame
{
	public Addition()
	{
		JButton b=new JButton("Hello");
		
		add(b);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		
	}
}

/*
class check extends Frame {
	public check()
	{
    JLabel lab1=new JLabel("User Name");
    Label lab2=new Label("Password");
    Label lab3=new Label();
    JTextField  name=new JTextField ();
    TextField  password=new TextField ();
    TextField welcome=new TextField ("WELCOME TO GPP LOG-IN ...");
    Button b=new Button("Submit");
    
    //public void init()
   {
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
    	lab3.setBounds(110,210,100,20);
   
    	
    	b.addActionListener(new ActionListener()
    			{

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
						
					
    		
    			});
    	
    
   /* public void actionPerformed(ActionEvent e)
	{
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
}}







import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
//REGESTRATION
/**
 *
 * @author RuqAsif
 *
 
public class Log extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField mob;
    private JPasswordField passwordField;
    private JButton btnNewButton;
   
    /**
     * Launch the application.
     
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LogPage frame = new LogPage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     
    public Log() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(550, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("New User Register");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("First name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 152, 99, 43);
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last name");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(58, 243, 110, 29);
        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        contentPane.add(lblEmailAddress);

        firstname = new JTextField();
        firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        firstname.setBounds(214, 151, 228, 50);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        lastname.setBounds(214, 235, 228, 50);
        contentPane.add(lastname);
        lastname.setColumns(10);

        email = new JTextField();

        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 320, 228, 50);
        contentPane.add(email);
        email.setColumns(10);

        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 32));
        username.setBounds(707, 151, 228, 50);
        contentPane.add(username);
        username.setColumns(10);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(542, 159, 99, 29);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(542, 245, 99, 24);
        contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Mobile number");
        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMobileNumber.setBounds(542, 329, 139, 26);
        contentPane.add(lblMobileNumber);

        mob = new JTextField();
        mob.setFont(new Font("Tahoma", Font.PLAIN, 32));
        mob.setBounds(707, 320, 228, 50);
        contentPane.add(mob);
        mob.setColumns(10);
        
        JLabel gender = new JLabel("Gender :");
        CheckboxGroup gen = new CheckboxGroup();
		Checkbox male = new Checkbox("Male",gen,false);
		Checkbox female = new Checkbox("Female",gen,false);
		 contentPane.add(gender);
		 contentPane.add(male);
		 contentPane.add(female);
		 gender.setFont(new Font("Tahoma", Font.PLAIN, 20));
	      gender.setBounds(58, 400, 80, 36);
	      male.setFont(new Font("Tahoma", Font.PLAIN, 20));
	      male.setBounds(200,400,100,50);
	      female.setFont(new Font("Tahoma", Font.PLAIN, 20));
	      female.setBounds(300,400,100,50);
		 


        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(707, 235, 228, 50);
        contentPane.add(passwordField);

        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstname.getText();
                String lastName = lastname.getText();
                String emailId = email.getText();
                String userName = username.getText();
                String mobileNumber = mob.getText();
                int len = mobileNumber.length();
                String password = passwordField.getText();

                String msg = "" + firstName;
                msg += " \n";
                if (len != 10) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 447, 259, 74);
        contentPane.add(btnNewButton);
    }
}*/


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Log
{
	login l = new login();
}


class login extends JFrame {
	
	 private static final long serialVersionUID = 1L;
	    private JTextField textField;
	    private JPasswordField passwordField;
	    private JButton btnNewButton;
	    private JLabel label;
	    private JPanel contentPane;

	    /**
	     * Launch the application.
	     */
	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                	login frame = new login();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }

	    //constructor
	    public login() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(450, 190, 1014, 597);
	        setResizable(false);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        JLabel lblNewLabel = new JLabel("Login");
	        lblNewLabel.setForeground(Color.BLACK);
	        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
	        lblNewLabel.setBounds(423, 13, 273, 93);
	        contentPane.add(lblNewLabel);

	        textField = new JTextField();
	        textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        textField.setBounds(481, 170, 281, 68);
	        contentPane.add(textField);
	        textField.setColumns(10);

	        passwordField = new JPasswordField();
	        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
	        
	        passwordField.setBounds(481, 286, 281, 68);
	        contentPane.add(passwordField);

	        JLabel lblUsername = new JLabel("Username");
	        lblUsername.setBackground(Color.BLACK);
	        lblUsername.setForeground(Color.BLACK);
	        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 31));
	        lblUsername.setBounds(250, 166, 193, 52);
	        contentPane.add(lblUsername);

	        JLabel lblPassword = new JLabel("Password");
	        lblPassword.setForeground(Color.BLACK);
	        lblPassword.setBackground(Color.CYAN);
	        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 31));
	        lblPassword.setBounds(250, 286, 193, 52);
	        contentPane.add(lblPassword);

	        btnNewButton = new JButton("Login");
	        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
	        btnNewButton.setBounds(545, 392, 162, 73);
	        btnNewButton.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	            	
	            	String userName = textField.getText();
	                String password = passwordField.getText();
	                try {
	                	 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "ruqayya");
	                    PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select name, pass from reg1 where name=? and pass=?");
	                    
	                    ResultSet rs = st.executeQuery();
	                    if (rs.next()) {
	                        dispose();
	                       
	                        JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
	                    } else {
	                        JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
	                    }
	                } catch (SQLException sqlException) {
	                    sqlException.printStackTrace();
	                }
	                
	            }
	        });

	        contentPane.add(btnNewButton);

	        label = new JLabel("");
	        label.setBounds(0, 0, 1008, 562);
	        contentPane.add(label);
	    }
	            }

