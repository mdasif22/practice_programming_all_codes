import javax.swing.*;
import java.io.*;
import java.lang.*;
import java.awt.*;

class EXER1 extends JFrame{
	JFrame f;
	JTabbedPane jtp1=new JTabbedPane();
    JPanel jp1=new JPanel();
    JTextArea t1=new JTextArea();
	public EXER1() {
		f=new JFrame();
		f.setSize(300,300);
        f.setVisible(true);   
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		try {
			
	        FileReader f=new FileReader("C:/FitMe/exercise.txt");
	        BufferedReader brk=new BufferedReader(f);       
	        String s;
	        while((s=brk.readLine())!=null){
	        t1.append(s);
	        }
	        jp1.add(t1);
	        jtp1.addTab("Tab1",t1);
	          
		} catch (Exception e) {
			System.out.println(e);
		}
		f.add(jtp1);
	}

}

public class EXEREPORT
{
	public static void main(String args[])
	{
		EXER1 obj = new EXER1();
	}
}


/*
class EXER1 extends JFrame
{
    JTabbedPane jtp1=new JTabbedPane();
    JPanel jp1=new JPanel();
    JTextArea t1=new JTextArea();
    public EXER1() throws Exception
    {
        super("MegaViewer");
        FileReader f=new FileReader("C:/FitMe/exercise.txt");
        BufferedReader brk=new BufferedReader(f);       
        String s;
        while((s=brk.readLine())!=null){
        t1.append(s);
        }
        jp1.add(t1);
        jtp1.addTab("Tab1",t1);
        add(jtp1);  
    }
    public static void main(String args[]) throws Exception
    {
    	EXEREPORT mv1=new EXEREPORT();
        mv1.pack();
        mv1.setVisible(true);   
        mv1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}*/