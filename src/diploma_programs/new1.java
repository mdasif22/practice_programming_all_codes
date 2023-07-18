import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.JFrame;

public class new1 extends JFrame{
	//JFrame f;
	private ImageIcon img;
	private JLabel l1;
 public new1()
 {
	 
	setSize(1000,1000);
	setLayout(new FlowLayout());
	 img=new ImageIcon(getClass().getResource("loh.jpg"));
	 l1=new JLabel(img);
	 //setBounds(0,0,1200,700);
	add(l1);
	 setVisible(true);
 }
	private Object getResource(String string) {
	// TODO Auto-generated method stub
	return null;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new1 obj = new new1();
		
	}
	
	

}
