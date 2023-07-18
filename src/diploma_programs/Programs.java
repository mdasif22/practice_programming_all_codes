import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;
/*
 // Program for simple Frame
public class Programs extends Frame
{
	Programs(String title)
	{
		super(title);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("This is a frame window",30,40);
	}
}

/*
<Frame code="Programs.class" width="200" height="300" > 
</Frame>
*/


/*
// Program for AppletFrame
public class Programs extends Applet
{
	Frame f;
	public void init()
	{
		f=new Frame("A Frame Window");
		
		f.setSize(250,250);
		f.setVisible(true);
		
	}
	
	public void start()
	{
		f.setVisible(true);
	}
	
	public void stop()
	{
		f.setVisible(false);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("This is a applet window",10,20);
	}
}

/*
<applet code="Programs.class" width="200" height="300" > </applet>
*/

// Program for Colors
/*
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Programs extends Applet     
{
	public void paint(Graphics g)
	{
		Color c1=new Color(180,150,30);
		Color c2=new Color(130,171,110);
		Color c3=new Color(200,150,250);
		
		g.setColor(c1);
		
		g.drawLine(0,0,100,100);		
		g.drawLine(0,100,100,0);
		g.setColor(Color.red);
		
		
		g.drawLine(40,25,250,180);
		g.setColor(c3);
		
		
		g.drawLine(20,150,100,10);
		g.setColor(c2);
		
		g.drawOval(10,10,50,50);
		
		g.fillOval(70,90,140,100);
		
	}
}

/*
<applet code="Programs.class" height=300 width=500></applet>
 */


//Program to show Font
/*
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

public class Programs extends Applet
{
	public void paint(Graphics g)
	{
		String msg="";
		String FontList[];
		GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		FontList=ge.getAvailableFontFamilyNames();
		
		for(int i=0;i<FontList.length;i++)
		{
			msg+=FontList[i]+" ";
			
		}
		g.drawString(msg,4,16);
				
	}
}
/*
<applet code="Programs.class" width=200 height=300 > </applet>
*/

//Program for Fonts
/*
import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class Programs extends Applet 
{
	public void paint(Graphics g)
	{
		Font f1=new Font("TimesRoman",Font.PLAIN,18);
		Font f2=new Font("Courier",Font.BOLD,16);
		Font f3=new Font("Arial",Font.ITALIC,20);
		Font f4=new Font("Times",Font.BOLD+Font.ITALIC,22);
		
		g.setFont(f1);
		g.drawString("Times Roman Plain Font: 18",10,30);
		
		g.setFont(f2);
		g.drawString("Courier bold Font: 16",10,60);
		
		
		g.setFont(f3);
		g.drawString("Arial italic Font: 20",10,80);
		
		g.setFont(f4);
		g.drawString("Times bold italic Font: 22",10,120);
	}
}

/*
<applet code="Programs.class" width=200 height=300 > </applet>
*/

//Program for Label
/*
import java.applet.Applet;
import java.awt.Label;

public class Programs extends Applet 
{
	public void init()
	{
		Label one=new Label("SUM");
		Label two=new Label("SUB");
		Label three=new Label("MUL");
		
		add(one);
		add(two);
		add(three);
	}
}

/*
<applet code="Programs.class" width=200 height=300 > </applet>
*/

// Program for Buttons
/*
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;

public class Programs extends Applet 
{
	String msg="";
	Button yes,no,maybe;
	
	public void init()
	{
	
		yes=new Button("SUM");
		no=new Button("SUB");
		maybe=new Button("MUL");
		
		add(yes);
		add(no);
		add(maybe);
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,6,100);
	}
}

/*
<applet code="Programs.class" width=200 height=300 > </applet>
*/


//Program for CHECHBOX
import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Graphics;

public class Programs extends Applet 
{
	String msg="";
	Checkbox yes,no,maybe;
	
	public void init()
	{
	
		yes=new Checkbox("Yes");
		no=new Checkbox("No");
		maybe=new Checkbox("Undecided");
		
		add(yes);
		add(no);
		add(maybe);
	}
	
	/*public void paint(Graphics g)
	{
		g.drawString(msg,6,100);
	}*/
}

