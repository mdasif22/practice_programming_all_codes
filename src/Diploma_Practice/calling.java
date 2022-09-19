package Diploma_Practice;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

	
	class xyz extends JFrame
	{
		public xyz()
		{
			JButton bt = new JButton("Add Frame");
			bt.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					
					new login();
				}
			});
            add(bt);
			setLayout(new FlowLayout());
			setVisible(true);
			setSize(400,400);
			
		}
	}


public class calling
{
	public static void main(String[] args) {
		
	     xyz obj = new xyz();
	     
		}
}
