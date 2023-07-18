
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

public class UserRegistration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnButton;
	private JLabel label;
	//private JPanel contentPane;
	private JFrame f;
	private JPanel p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//UserRegistration ur = new UserRegistration();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegistration f = new UserRegistration();
					f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// constructor
	public UserRegistration() {
		f=new JFrame();
		p1=new JPanel();
		
		f.setSize(300,300);
		
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.add(p1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		setResizable(false);
		p1 = new JPanel();
		p1.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(p1);
		p1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
		lblNewLabel.setBounds(423, 13, 273, 93);
		p1.add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField.setBounds(481, 170, 281, 68);
		p1.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));

		passwordField.setBounds(481, 286, 281, 68);
		p1.add(passwordField);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBackground(Color.BLACK);
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblUsername.setBounds(250, 166, 193, 52);
		p1.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setBackground(Color.CYAN);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblPassword.setBounds(250, 286, 193, 52);
		p1.add(lblPassword);

		btnButton = new JButton("Login");
		btnButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnButton.setBounds(545, 392, 162, 73);
		btnButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String userName = textField.getText();
				String password = passwordField.getText();
				try {
					Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
							"1234");
					PreparedStatement st = (PreparedStatement) connection
							.prepareStatement("Select name, pass from reg1 where name=? and pass=?");

					st.setString(1, userName);
					st.setString(2, password);
					ResultSet rs = st.executeQuery();
					if (rs.next()) {
						dispose();

						JOptionPane.showMessageDialog(btnButton, "You have successfully logged in");
					} else {
						JOptionPane.showMessageDialog(btnButton, "Wrong Username & Password");
					}
				} catch (SQLException sqlException) {
					sqlException.printStackTrace();
				}

			}
		});

		p1.add(btnButton);

		label = new JLabel("");
		label.setBounds(0, 0, 1008, 562);
		p1.add(label);
	
	
	
	btnButton.addActionListener(new ActionListener() {
		
public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==btnButton) {
				new LoginForm();
				//frm.dispose();
			}
} 
	});
	
	
}
	
     
}
