import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {
	
	String msg="";
	int mouseX=0;
	int mouseY=0;
	
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void mouseClicked(MouseEvent me) {
		// save coordinates
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse clicked.";
		repaint();
		}
	
	public void mouseEntered(MouseEvent me) {
		// save coordinates
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse entered.";
		repaint();
		}
	
	public void mouseExited(MouseEvent me) {
		// save coordinates
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse exited.";
		repaint();
		}
	
	public void mousePressed(MouseEvent me) {
		// save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Down";
		repaint();
		}
	
	public void mouseReleased(MouseEvent me) {
		// save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Up";
		repaint();
		}
	public void mouseDragged(MouseEvent me) {
		// save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "*";
		showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
		repaint();
		}
		// Handle mouse moved.
		public void mouseMoved(MouseEvent me) {
		// show status
		showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
		}
		// Display msg in applet window at current X,Y location.
		public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
		}

}


/*
<applet code="MouseEvents.class" width=300 height=300>
</applet>
*/
