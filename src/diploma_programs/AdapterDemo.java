import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdapterDemo extends Applet {
	public void init()
	{
		addMouseListener(new MyMouseAdapter(this));
	}
	
	class MyMouseAdapter extends MouseAdapter
	{
		AdapterDemo obj;
		public MyMouseAdapter(AdapterDemo obj)
		{
			this.obj=obj;
		}
		
		public void mouseClicked(MouseEvent me)
		{
			obj.showStatus("Mouse Is Clicked");
		}
		
		public void mouseExited(MouseEvent me)
		{
			obj.showStatus("Mouse Is exited");
		}
	}

}

/*
<applet code=AdapterDemo.class width="300" height="300"></applet>
*/

// IN this program we have override only one method(mouseDragged) of MouseMotionAdaptor class using adaptor class..its like abstract class
/*
public class AdapterDemo extends Applet {
	public void init()
	{
		addMouseMotionListener(new MyMouseMotionAdapter(this));
	}
	
	class MyMouseMotionAdapter extends MouseMotionAdapter
	{
		AdapterDemo obj;
		public MyMouseMotionAdapter(AdapterDemo obj)
		{
			this.obj=obj;
		}
		
		public void mouseDragged(MouseEvent me) {
			obj.showStatus("Mouse dragged");
			}
	}

}*/