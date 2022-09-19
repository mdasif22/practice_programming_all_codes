package Diploma_Practice;
/*import java.awt.*;
import java.awt.event.*;
class LoginPage extends Frame
{ 
	// Creating Controls
	Label l1,l2;
    TextField Name,Password;
    Button b1,b2;
    LoginPage()
    {
        setLayout(new FlowLayout());
       
        // Creating Label
        l1=new Label("Name:",Label.CENTER);
        l2=new Label("Password:",Label.CENTER);
        
        // Creating TextField
        Name=new TextField(20);
        Password=new TextField(20);
        
        //Creating Buttons
        b1=new Button("submit");
        b2=new Button("cancel");
        
        // Adding all elements
        add(l1);
        add(l2);
        add(Name);
        add(Password);
        add(b1);
        add(b2);
        
        // Setting Layout
        setLayout(null);
        l1.setBounds(70,90,90,60);
        l2.setBounds(70,130,90,60);
        Name.setBounds(200,100,90,20);
        Password.setBounds(200,140,90,20);
        b1.setBounds(100,260,70,40);
        b2.setBounds(180,260,70,40);
 
    }
    public static void main(String args[])
    {
    	LoginPage ml=new LoginPage();
        ml.setVisible(true);
        ml.setSize(400,400);
        ml.setTitle("Loging Window");
 
    }
}
*/


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class LoginPage extends Applet implements ActionListener {
    Label lab1=new Label("User Name");
    Label lab2=new Label("Password");
    Label lab3=new Label();
    TextField  name=new TextField ();
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
   
    	
    	b.addActionListener(this);	
    	
    }
    
    public void actionPerformed(ActionEvent e)
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

/* <applet code=LoginPage.class width="300" height="300">
</applet>
*/
