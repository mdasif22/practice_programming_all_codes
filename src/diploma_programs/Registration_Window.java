import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
import java.lang.*;

public class Registration_Window extends Applet implements ActionListener
{
	
	//TEXT_FIELDS
	TextField name=new TextField();
	TextField pass=new TextField();
	TextField wel=new TextField ("WELCOME ...");
	
	
	//LABELS
	Label lab1=new Label("UserName :");
	Label lab2=new Label("Password : ");
	
	
	//BUTTONs
	Button button=new Button("Log-In");
	
	public void init()
	{
	
	//ADDING
	setLayout(null);
	wel.setBounds(200,110,250,40);
	wel.setEditable(false);
	    //l1.setFont(new Font("Lucida",Font.PLAIN,24));
     	//l2.setFont(new Font("Lucida",Font.PLAIN,24));
	pass.setEchoChar('#');
	lab1.setBounds(20, 150, 150, 100);
  	lab2.setBounds(20, 240, 150, 100);
	name.setBounds(180, 180, 250, 40);
    pass.setBounds(180, 270, 250, 40);
 	button.setBounds(100, 350, 100, 40);
	add(lab1);
	add(name);
	add(lab2);
	add(pass);
	add(button);
	add(wel);
	button.addActionListener(this);
	
	
	}
	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==button)
		{
			String name2=name.getText();
			String password2=pass.getText();
			if(name2.equals("1806091") && password2.equals("1806091"))
			{
				Frame frame=new Frame("REGISRATION FORM ");
				frame.setVisible(true);
				frame.setSize(900,900);
				
				//Labels
				Label title=new Label("REGISTRATION FORM");
		        Label name = new Label("Full Name :");
				Label email =  new Label("Email :");
				Label addr = new Label("Address :");
				Label gender = new Label("Gender :");
				Label Dept = new Label("Department :");
				
				
				TextField tname = new TextField(30);
				TextField temail = new TextField(20);
			    TextArea taddr = new TextArea();
				CheckboxGroup gen = new CheckboxGroup();
				Checkbox male = new Checkbox("Male",gen,false);
				Checkbox female = new Checkbox("Female",gen,false);
				Choice department= new Choice();
				
				department.add("Computer Engineering");
				department.add("Electrical Engineering");
				department.add("Mechanical Engineering");
				department.add("Entc Engineering");
				department.add("Civil Engineering");
				department.add("Information Technology");
				department.select("Computer Engineering");
				
				frame.setLayout(null);
				//Bounds
				title.setBounds(150,50,280,25);
				name.setBounds(30,90,140,25);
				tname.setBounds(170,90,280,30);
				email.setBounds(30,130,100,25);
				temail.setBounds(170,130,230,30);
				addr.setBounds(30,170,120,25);
				taddr.setBounds(170,170,260,50);
				gender.setBounds(30,240,120,25);
				male.setBounds(170,240,80,25);
				female.setBounds(290,240,100,25);
				Dept.setBounds(30,290,140,25);
				department.setBounds(190,290,280,250);
				
				//Changing Fonts
				
				title.setFont(new Font("Lucida",Font.PLAIN,24));
				name.setFont(new Font("Lucida",Font.PLAIN,24));
				tname.setFont(new Font("Lucida",Font.PLAIN,24));
				email.setFont(new Font("Lucida",Font.PLAIN,24));
				temail.setFont(new Font("Lucida",Font.PLAIN,24));
				addr.setFont(new Font("Lucida",Font.PLAIN,24));
				taddr.setFont(new Font("Lucida",Font.PLAIN,24));
				gender.setFont(new Font("Lucida",Font.PLAIN,24));
				male.setFont(new Font("Lucida",Font.PLAIN,24));
				female.setFont(new Font("Lucida",Font.PLAIN,24));
				Dept.setFont(new Font("Lucida",Font.PLAIN,24));
				department.setFont(new Font("Lucida",Font.PLAIN,24));
				
				
				
				
				//adding elements
				
				frame.add(title);
				frame.add(name);
				frame.add(tname);
				frame.add(email);
				frame.add(temail);
				frame.add(addr);
				frame.add(taddr);
				frame.add(gender);
				frame.add(male);
				frame.add(female);
				frame.add(Dept);
				frame.add(department);
				}
				
			else
			{
				wel.setText("WRONG USERNAME OR PASSWORD !!!!");	
				
			}
		}
		else 
		{
		
		}
	}
}

/* <applet code=Registration_Window.class width="300" height="300">
</applet>
*/