package Diploma_Practice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class Change_Color extends Applet implements ActionListener
  {
    int R=100,G=255,B=100;
    Color c2=new Color(200,169,107);
    Color c3=new Color(160,100,200);
    Button button=new Button("Change Color Of Ball");
 public void paint(Graphics g)
  {
    setBackground(Color.black);
    Color c1=new Color(R,G,B);
    g.setColor(c1);
    g.fillOval(250,100,300,300);
  }
    public void init()
    {
      setLayout(null);
      button.setBounds(200,2,500,50);
      button.setFont(new Font("Lucida",Font.PLAIN,30));
      add(button);
      button.addActionListener(this);
    }
   public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==button)
        {
    	  R=100;
    	  G=100;
    	  B=255;
        repaint();
        }
    }
 }

/*
<applet code="Change_Color.class" height=300 width=500></applet>
*/