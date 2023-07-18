import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class MoveBall extends Applet implements ActionListener {
    int x=500,y=200;
	Button up,down,left,right;
    
    public void init() {
    	
    	up=new Button("UP");
    	down=new Button("DOWN");
    	left=new Button("LEFT");
    	right=new Button("RIGHT");
    	
    	add(up);
    	add(down);
    	add(left);
    	add(right);
    	
    	setLayout(null);
    	up.setBounds(550,450,60,50);
    	down.setBounds(550,550,60,50);
    	left.setBounds(470,500,60,50);
    	right.setBounds(630,500,60,50);
    	
    	up.addActionListener(this);
    	down.addActionListener(this);
    	left.addActionListener(this);
    	right.addActionListener(this);
    	
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==up)
    	{
    		y=y-10;
    		repaint();
    	}
    	if(e.getSource()==down)
    	{
    		y=y+10;
    		repaint();
    	}
    	if(e.getSource()==left)
    	{
    		x=x-10;
    		repaint();
    	}
    	if(e.getSource()==right)
    	{
    		x=x+10;
    		repaint();
    	}
    }
    
    public void paint(Graphics g)
    {
    	 g.setColor(Color.blue);
    	  
		   // draw a ellipse
		 g.fillRect(1, 1, 900,450);
	     g.setColor(Color.red);
	     g.fillOval(x,y, 100, 100);
    }
}

/* <applet code=MoveBall.class width="500" height="500">
   </applet>
*/