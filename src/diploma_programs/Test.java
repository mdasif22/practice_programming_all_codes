// Choice 
/*import java.applet.Applet;
import java.awt.*;
public class Test extends Applet {
    Choice os,android;
    List phones,lap;
    public void init()
    {
    	 os=new Choice();
    	 android=new Choice();
    	 phones=new List();
    	 lap=new List();
    	 os.add("Window");
    	 os.add("linux");
    	 os.add("ubantu");
    	 
    	 android.add("Phone");
    	 android.add("Neckless");
    	 android.add("Watch");
    	 
    	 phones.add("Samsung");
    	 phones.add("Realme");
    	 phones.add("Redmi");
    	 phones.add("iPhone");
    	 
    	 lap.add("Dell");
    	 lap.add("Hp");
    	 lap.add("Asus");
    	 lap.add("Mac");
    	 
    	 add(os);
    	 add(android);
    	 add(phones);
    	 add(lap);
    }
}
*/

//scroll bar
/*
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Test extends Applet
implements AdjustmentListener, MouseMotionListener {
String msg = "";
Scrollbar vertSB, horzSB;
public void init() {
int width = Integer.parseInt(getParameter("width"));
int height = Integer.parseInt(getParameter("height"));
vertSB = new Scrollbar(Scrollbar.VERTICAL,
0, 1, 0, height);
horzSB = new Scrollbar(Scrollbar.HORIZONTAL,
0, 1, 0, width);
add(vertSB);
add(horzSB);
// register to receive adjustment events
vertSB.addAdjustmentListener(this);
horzSB.addAdjustmentListener(this);
addMouseMotionListener(this);
}
public void adjustmentValueChanged(AdjustmentEvent ae) {
repaint();
}
// Update scroll bars to reflect mouse dragging.
public void mouseDragged(MouseEvent me) {
int x = me.getX();
int y = me.getY();
vertSB.setValue(y);
horzSB.setValue(x);
repaint();
}
public void mouseMoved(MouseEvent me) {
}
// Display current value of scroll bars.
public void paint(Graphics g) {
msg = "Vertical: " + vertSB.getValue();
msg += ", Horizontal: " + horzSB.getValue();
g.drawString(msg, 6, 160);
// show current mouse drag position
g.drawString("*", horzSB.getValue(),
vertSB.getValue());
}
}
*/

// TextArea
/*
import java.awt.*;
import java.applet.*;
public class Test extends Applet {
public void init() {
String val =
"Java SE 6 is the latest version of the most\n" +
"widely-used computer language for Internet programming.\n" +
"Building on a rich heritage, Java has advanced both\n" +
"the art and science of computer language design.\n\n" +
"One of the reasons for Java's ongoing success is its\n" +
"constant, steady rate of evolution. Java has never stood\n" +
"still. Instead, Java has consistently adapted to the\n" +
"rapidly changing landscape of the networked world.\n" +
"Moreover, Java has often led the way, charting the\n" +
"course for others to follow.";
TextArea text = new TextArea(val, 10, 30);
add(text);
}
}*/


//*************************** LAYOUT MANAGERS ***********************
// FLOW layout manager
/*
import java.applet.Applet;
import java.awt.*;
public class Test extends Applet
{
	TextField t1,t2,t3;
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		t1=new TextField(5);
		t2=new TextField(5);
		t3=new TextField(5);
		add(t1);
		add(t2);
		add(t3);
	}
}*/

// Boarder layout
/*
import java.applet.Applet;
import java.awt.*;

public class Test extends Applet
{
	Button b1,b2,b3,b4,b5;
	public void init()
	{
		String msg="THIS IS BORDER LAYOUT MANAGER";
		setLayout(new BorderLayout());
		b1=new Button("EAST");
		b2=new Button("WEST");
		b3=new Button("NORTH");
		b4=new Button("SOUTH");
		b5=new Button("CENTER");
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.NORTH);
		add(b4,BorderLayout.SOUTH);
		add(new TextArea(msg),BorderLayout.CENTER);
	}
}*/

// GridLayout 
/*
import java.applet.Applet;
import java.awt.*;
public class Test extends Applet
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	public void init()
	{
		setLayout(new GridLayout(3,3));
		setFont(new Font("SansSerif", Font.BOLD, 24));
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");		
		b8=new Button("8");
		b9=new Button("9");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
	}
}
*/


// Card Layout
/*
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Test extends Applet
implements ActionListener, MouseListener {
Checkbox winXP, winVista, solaris, mac;
Panel osCards;
CardLayout cardLO;
Button Win, Other;
public void init() {
Win = new Button("Windows");
Other = new Button("Other");
add(Win);
add(Other);
cardLO = new CardLayout();
osCards = new Panel();
osCards.setLayout(cardLO); // set panel layout to card layout
winXP = new Checkbox("Windows XP", null, true);
winVista = new Checkbox("Windows Vista");
solaris = new Checkbox("Solaris");
mac = new Checkbox("Mac OS");
// add Windows check boxes to a panel
Panel winPan = new Panel();
winPan.add(winXP);
winPan.add(winVista);
// add other OS check boxes to a panel
Panel otherPan = new Panel();
otherPan.add(solaris);
otherPan.add(mac);
// add panels to card deck panel
osCards.add(winPan, "Windows");
osCards.add(otherPan, "Other");
// add cards to main applet panel
add(osCards);
// register to receive action events
Win.addActionListener(this);
Other.addActionListener(this);
// register mouse events
addMouseListener(this);
}
// Cycle through panels.
public void mousePressed(MouseEvent me) {
cardLO.next(osCards);
}
// Provide empty implementations for the other MouseListener methods.
public void mouseClicked(MouseEvent me) {
}
public void mouseEntered(MouseEvent me) {
}
public void mouseExited(MouseEvent me) {
}
public void mouseReleased(MouseEvent me) {
}
public void actionPerformed(ActionEvent ae) {
if(ae.getSource() == Win) {
cardLO.show(osCards, "Windows");
}
else {
cardLO.show(osCards, "Other");
}
}
}*/

// MenuBar and Menus
/*
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
// Create a subclass of Frame.
class MenuFrame extends Frame {
String msg = "";
CheckboxMenuItem debug, test;
MenuFrame(String title) {
super(title);
// create menu bar and add it to frame
MenuBar mbar = new MenuBar();
setMenuBar(mbar);
// create the menu items
Menu file = new Menu("File");
MenuItem item1, item2, item3, item4, item5;
file.add(item1 = new MenuItem("New..."));
file.add(item2 = new MenuItem("Open..."));
file.add(item3 = new MenuItem("Close"));
file.add(item4 = new MenuItem("-"));
file.add(item5 = new MenuItem("Quit..."));
mbar.add(file);
Menu edit = new Menu("Edit");
MenuItem item6, item7, item8, item9;
edit.add(item6 = new MenuItem("Cut"));
edit.add(item7 = new MenuItem("Copy"));
edit.add(item8 = new MenuItem("Paste"));
edit.add(item9 = new MenuItem("-"));
Menu sub = new Menu("Special");
MenuItem item10, item11, item12;
sub.add(item10 = new MenuItem("First"));
sub.add(item11 = new MenuItem("Second"));
sub.add(item12 = new MenuItem("Third"));
edit.add(sub);
// these are checkable menu items
debug = new CheckboxMenuItem("Debug");
edit.add(debug);
test = new CheckboxMenuItem("Testing");
edit.add(test);
mbar.add(edit);
// create an object to handle action and item events
MyMenuHandler handler = new MyMenuHandler(this);
// register it to receive those events
item1.addActionListener(handler);
item2.addActionListener(handler);
item3.addActionListener(handler);
item4.addActionListener(handler);
item5.addActionListener(handler);
item6.addActionListener(handler);
item7.addActionListener(handler);
item8.addActionListener(handler);
item9.addActionListener(handler);
item10.addActionListener(handler);
item11.addActionListener(handler);
item12.addActionListener(handler);
debug.addItemListener(handler);
test.addItemListener(handler);
// create an object to handle window events
MyWindowAdapter adapter = new MyWindowAdapter(this);
// register it to receive those events
addWindowListener(adapter);
}
public void paint(Graphics g) {
g.drawString(msg, 10, 200);
if(debug.getState())
g.drawString("Debug is on.", 10, 220);
else
g.drawString("Debug is off.", 10, 220);
if(test.getState())
g.drawString("Testing is on.", 10, 240);
else
g.drawString("Testing is off.", 10, 240);
}
}
class MyWindowAdapter extends WindowAdapter {
MenuFrame menuFrame;
public MyWindowAdapter(MenuFrame menuFrame) {
this.menuFrame = menuFrame;
}
public void windowClosing(WindowEvent we) {
menuFrame.setVisible(false);
}
}
class MyMenuHandler implements ActionListener, ItemListener {
MenuFrame menuFrame;
public MyMenuHandler(MenuFrame menuFrame) {
this.menuFrame = menuFrame;
}
// Handle action events.
public void actionPerformed(ActionEvent ae) {
String msg = "You selected ";
String arg = ae.getActionCommand();
if(arg.equals("New..."))
msg += "New.";
else if(arg.equals("Open..."))
msg += "Open.";
else if(arg.equals("Close"))
msg += "Close.";
else if(arg.equals("Quit..."))
msg += "Quit.";
else if(arg.equals("Edit"))
msg += "Edit.";
else if(arg.equals("Cut"))
msg += "Cut.";
else if(arg.equals("Copy"))
msg += "Copy.";
else if(arg.equals("Paste"))
msg += "Paste.";
else if(arg.equals("First"))
msg += "First.";
else if(arg.equals("Second"))
msg += "Second.";
else if(arg.equals("Third"))
msg += "Third.";
else if(arg.equals("Debug"))
msg += "Debug.";
else if(arg.equals("Testing"))
msg += "Testing.";
menuFrame.msg = msg;
menuFrame.repaint();
}
// Handle item events.
public void itemStateChanged(ItemEvent ie) {
menuFrame.repaint();
}
}
// Create frame window.
public class Test extends Applet {
Frame f;
public void init() {
f = new MenuFrame("Menu Demo");
int width = Integer.parseInt(getParameter("width"));
int height = Integer.parseInt(getParameter("height"));
setSize(new Dimension(width, height));
f.setSize(width, height);
f.setVisible(true);
}
public void start() {
f.setVisible(true);
}
public void stop() {
f.setVisible(false);
}
}*/

// Menu Bar and Menu and ManuItems
/*
import java.awt.*;
import java.applet.Applet;
public class Test extends Applet
{
	public Test()
	{
		Frame f=new Frame("MenuBar And Menu");
		MenuBar mb=new MenuBar();
		Menu menu=new Menu("File");
		Menu submenu=new Menu("Option");
		
		MenuItem m1=new MenuItem("Save");
		MenuItem m2=new MenuItem("Save as");
		MenuItem m3=new MenuItem("Create");
		MenuItem m4=new MenuItem("Rename");
		MenuItem m5=new MenuItem("Properties");
		MenuItem m6=new MenuItem("Add");
		MenuItem m7=new MenuItem("Delete");
		MenuItem m8=new MenuItem("Search");
		
		
		menu.add(m1);
		menu.add(m2);
		menu.add(m3);
		menu.add(m4);
		menu.add(m5);
		submenu.add(m6);
		submenu.add(m7);
		submenu.add(m8);
		menu.add(submenu);
		
		mb.add(menu);
		f.setMenuBar(mb);
		
		f.setVisible(true);
		f.setSize(400,400);
		f.setLayout(null);
	}
}*/

// Program
/*
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Test extends Frame {
	public Test() {
		super("Java AWT Examples");
		prepareGUI();
	}

	public static void main(String[] args) {
		Test awtGraphicsDemo = new Test();
		awtGraphicsDemo.setVisible(true);
	}

	private void prepareGUI() {
		setSize(400, 400);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Font plainFont = new Font("Serif", Font.PLAIN, 24);
		g2.setFont(plainFont);
		g2.drawString("Advanced Java ", 50, 70);
		Font italicFont = new Font("Serif", Font.ITALIC, 24);
		g2.setFont(italicFont);
		g2.drawString("Asif This Side", 50, 120);
		Font boldFont = new Font("Serif", Font.BOLD, 24);
		g2.setFont(boldFont);
		g2.drawString("Program For Java Programming", 50, 170);
	}
}*/


import java.awt.*;
import java.awt.event.*;

public class Test extends Frame {
	Menu file, help;

	public Test() {
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		file = new Menu("File");
		help = new Menu("Help");
		mb.add(file);
		mb.add(help);
		file.add(new MenuItem("New"));
		file.add(new MenuItem("New Window"));
		file.add(new MenuItem("Open..."));
		file.add(new MenuItem("Save"));
		file.add(new MenuItem("Save As..."));
		file.addSeparator();
		file.add(new MenuItem("Page Setup..."));
		file.add(new MenuItem("Print"));
		file.addSeparator();
		file.add(new MenuItem("Exit"));
		help.add(new MenuItem("View Help"));
		help.add(new MenuItem("Send Feedback"));
		help.addSeparator();
		help.add(new MenuItem("About c++"));
		setTitle("Menu Program");
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String args[]) {
		new Test();
	}
}
