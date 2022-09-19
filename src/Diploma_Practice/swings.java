package Diploma_Practice;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.event.*;
import javax.swing.*;

//JLabel
/*
public class swings extends JApplet{
	public void init()
	{
		Container contentPane=getContentPane();
		ImageIcon ii=new ImageIcon("india.jpg");
		JLabel jl = new JLabel("INDIA",ii,JLabel.CENTER);
		contentPane.add(jl);
	}

}
*/

// JTextField
/*public class swings extends JApplet implements ActionListener
{
	JTextField t1;
	public void init()
	{
		setLayout(new FlowLayout());
		t1=new JTextField(20);
		add(t1);
		
		t1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		showStatus(t1.getText());
	}
}
*/

//JButton
/*
public class swings extends JApplet implements ActionListener
{
	JLabel l1;
	JButton b1,b2,b3;
	
	public void init()
	{
		setLayout(new FlowLayout());
		l1=new JLabel("Select Button");
		//ImageIcon ia=new ImageIcon();
		b1=new JButton("Button1");
		//b1.setActionCommand("India");
		add(b1);
		b1.addActionListener(this);
		
		//ImageIcon ib=new ImageIcon();
		b2=new JButton("Nutton2");
		//b2.setActionCommand("France");
		add(b2);
		b2.addActionListener(this);
		
		//ImageIcon ic=new ImageIcon();
		b3=new JButton("Button3");
		//b3.setActionCommand("Germany");
		add(b3);
		b3.addActionListener(this);
		
		add(l1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
		l1.setText("You selected : India");
		}
		
		if(e.getSource()==b2)
		{
		l1.setText("You selected : France");
		}
		
		if(e.getSource()==b3)
		{
		l1.setText("You selected : Germany");
		}
	}
}
*/

//JToggleButton
/*
public class swings extends JApplet implements ActionListener
{
	JLabel l1;
	JToggleButton b1;
	
	public void  init()
	{
		setLayout(new FlowLayout());
		l1= new JLabel("Button is OFF");
		b1=new JToggleButton("ON/OF");
		
		b1.addActionListener(this);
		add(l1);
		add(b1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(b1.isSelected())
		{
			l1.setText("Button is ON");
		}
		else
		{
			l1.setText("Button is OFF");
		}
	}
}*/

//JCheckBox
/*
//Demonstrate JCheckbox.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swings extends JApplet implements ItemListener {
	JLabel jlab;

	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					makeGUI();
				}
			});
		} catch (Exception exc) {
			System.out.println("Can't create because of " + exc);
		}
	}

	private void makeGUI() {
//Change to flow layout.
		setLayout(new FlowLayout());
//Add check boxes to the content pane.
		JCheckBox cb = new JCheckBox("C");
		cb.addItemListener(this);
		add(cb);
		cb = new JCheckBox("C++");
		cb.addItemListener(this);
		add(cb);
		cb = new JCheckBox("Java");
		cb.addItemListener(this);
		add(cb);
		cb = new JCheckBox("Perl");
		cb.addItemListener(this);
		add(cb);
//Create the label and add it to the content pane.
		jlab = new JLabel("Select languages");
		add(jlab);
	}

//Handle item events for the check boxes.
	public void itemStateChanged(ItemEvent ie) {
		JCheckBox cb = (JCheckBox) ie.getItem();
		if (cb.isSelected())
			jlab.setText(cb.getText() + " is selected");
		else
			jlab.setText(cb.getText() + " is cleared");
	}
}
*/

//JRadioButton
/*
public class swings extends JApplet implements ActionListener {
	JLabel jlab;

	public void init() {
		// Change to flow layout.
		setLayout(new FlowLayout());
		// Create radio buttons and add them to content pane.
		JRadioButton b1 = new JRadioButton("A");
		b1.addActionListener(this);
		add(b1);

		JRadioButton b2 = new JRadioButton("B");
		b2.addActionListener(this);
		add(b2);
		
		JRadioButton b3 = new JRadioButton("C");
		b3.addActionListener(this);
		add(b3);
		
		// Define a button group.
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		// Create a label and add it to the content pane.
		jlab = new JLabel("Select One");
		add(jlab);
	}

	// Handle button selection.
	public void actionPerformed(ActionEvent ae) {
		jlab.setText("You selected " + ae.getActionCommand());
	}
}
*/

//JTabbedPane
/*
public class swings extends JApplet {
	public void init() {
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Country", new CountryPanel());
		jtp.addTab("Department", new DepPanel());
		jtp.addTab("College", new ColPanel());
		add(jtp);
	}

// Make the panels that will be added to the tabbed pane.
	class CountryPanel extends JPanel {
		public CountryPanel() {
			JButton b1 = new JButton("India");
			add(b1);
			JButton b2 = new JButton("Japan");
			add(b2);
			JButton b3 = new JButton("China");
			add(b3);
			JButton b4 = new JButton("Russia");
			add(b4);
		}
	}

	class DepPanel extends JPanel {
		public DepPanel() {
			JCheckBox cb1 = new JCheckBox("Comp Science");
			add(cb1);
			JCheckBox cb2 = new JCheckBox("Civil");
			add(cb2);
			JCheckBox cb3 = new JCheckBox("Electrical");
			add(cb3);
		}
	}

	class ColPanel extends JPanel {
		public ColPanel() {
			JComboBox jcb = new JComboBox();
			jcb.addItem("Govt Plytech Pune");
			jcb.addItem("DY Patil");
			jcb.addItem("COEP");
			add(jcb);
		}
	}
}
*/

//JScrollPane
/*
public class swings extends JApplet {
	public void init() {
// Add 400 buttons to a panel.
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(20, 20));
		int b = 0;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				jp.add(new JButton("Button " + b));
				++b;
			}
		}
// Create the scroll pane.
		JScrollPane jsp = new JScrollPane(jp);
// Add the scroll pane to the content pane.
// Because the default border layout is used,
// the scroll pane will be added to the center.
		add(jsp, BorderLayout.CENTER);
	}
}


//JComboBox.
/*
public class swings extends JApplet {
	JLabel jlab;
	ImageIcon france, germany, italy, japan;
	JComboBox jcb;
	String flags[] = { "France", "Germany", "Italy", "Japan" };

	public void init() {
		setLayout(new FlowLayout());
//Instantiate a combo box and add it to the content pane.
		jcb = new JComboBox(flags);
		add(jcb);
//Handle selections.
		jcb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String s = (String) jcb.getSelectedItem();
				jlab.setIcon(new ImageIcon(s + ".gif"));
			}
		});
//Create a label and add it to the content pane.
		jlab = new JLabel(new ImageIcon("france.gif"));
		add(jlab);
	}
}*/

//scrollpane
/*
import java.awt.*;
import javax.swing.*;

public class swings {
	private static final long serialVersionUID = 1L;

	private static void createAndShowGUI() {
		final JFrame frame = new JFrame("Scroll Pane Example");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout());
		JTextArea textArea = new JTextArea(20, 20);
		JScrollPane scrollableTextArea = new JScrollPane(textArea);
		scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(scrollableTextArea);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
*/

//JTree
/*
import javax.swing.tree.*;

public class swings extends JApplet{
	JLabel l1;
	JTree t1;

	public void init() {
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
		DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A");
		top.add(a1);
		DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A1");
		a1.add(a2);
		DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("A2");
		a1.add(a3);

		DefaultMutableTreeNode child = new DefaultMutableTreeNode("B");
		top.add(child);
		DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
		child.add(b1);
		DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
		child.add(b2);
		DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
		child.add(b3);

		t1 = new JTree(top);

		JScrollPane jsp = new JScrollPane(t1);
		add(jsp);

		l1 = new JLabel();
		add(l1, BorderLayout.SOUTH);

		t1.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent tse) {
				l1.setText("Selection is " + tse.getPath());
			}
		});
	}
}
*/

//JTable
/*
import java.awt.*;
import javax.swing.*;
public class swings extends JApplet {
	public void init() {
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		final String[] colHeads = { "Name", "Phone", "Pin-Code" };
		final Object[][] data = { { "Asif", "7030", "411015" }, { "Ruqayya", "1111", "412307" },
				{ "Abhijit", "2222", "412307" }, { "Lokesh", "3333", "412307" }, { "Rushikesh", "4444", "412307" },
				{ "Mrudul", "5555", "412307" }, { "Roham", "6666", "412307" }, { "PP", "7777", "412307" },
				{ "PM", "8888", "412307" }, { "Soham", "9999", "412307" }, { "Omkar","1010", "412307" },
				{ "Banku", "1234", "412307" }, { "Aashu", "1122", "412307" } };
		JTable table = new JTable(data, colHeads);
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp = new JScrollPane(table, v, h);
		contentPane.add(jsp, BorderLayout.CENTER);
	}
}
*/