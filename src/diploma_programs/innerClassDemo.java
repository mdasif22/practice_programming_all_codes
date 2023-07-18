// Inner classes
 public class innerClassDemo {
	int x=10,y=20;
  public void car()
  {
	  System.out.println("This is Lamborgini car");
  }
  
  class newCar
  {
	  public void ncar()
	  {
		  System.out.println("This is new car");
	  }
  }
  
  static class Bike
  {
	  public void bike()
	  {
		 System.out.println("This is New Ninja Bikes"); 
	  }
  }
  
  class newBike
  {
	  public void nbike()
	  {
		  System.out.println("We have total Bikes="+(x+y));
	  }
  }
  
  public static void main(String args[])
  {
	  innerClassDemo obj1=new innerClassDemo();
	  obj1.car();
	  innerClassDemo.newCar obj2=obj1.new newCar();
	  obj2.ncar();
	  innerClassDemo.Bike bk=new Bike();
	  bk.bike();
	  innerClassDemo.newBike bk1=obj1.new newBike();
	  bk1.nbike();
  }
}

 
/*
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

<applet code="XOR" width=400 height=200>
</applet>

public class innerClassDemo extends Applet {
int chsX=100, chsY=100;
public innerClassDemo() {
addMouseMotionListener(new MouseMotionAdapter() {
public void mouseMoved(MouseEvent me) {
int x = me.getX();
int y = me.getY();
chsX = x-10;
chsY = y-10;
repaint();
}
});
}
public void paint(Graphics g) {
g.drawLine(0, 0, 100, 100);
g.drawLine(0, 100, 100, 0);
g.setColor(Color.blue);
g.drawLine(40, 25, 250, 180);
g.drawLine(75, 90, 400, 400);
g.setColor(Color.green);
g.drawRect(10, 10, 60, 50);
g.fillRect(100, 10, 60, 50);
g.setColor(Color.red);
g.drawRoundRect(190, 10, 60, 50, 15, 15);
g.fillRoundRect(70, 90, 140, 100, 30, 40);
g.setColor(Color.cyan);
g.drawLine(20, 150, 400, 40);
g.drawLine(5, 290, 80, 19);
// xor cross hairs
g.setXORMode(Color.black);
g.drawLine(chsX-10, chsY, chsX+10, chsY);
g.drawLine(chsX, chsY-10, chsX, chsY+10);
g.setPaintMode();
}
}
*/
// Annonymous classes
