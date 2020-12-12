import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Programming3_1 implements ItemListener
{
	JFrame f;
	JPanel p1,p2,p3;
	JLabel l1,l2;
	JComboBox cb;
	JButton b1,b2,b3;
	BorderLayout bl;
	GridLayout g1;
	Locale cl1,cl2;
	ResourceBundle rb1,rb2;
	public Programming3_1()
	{
		f=new JFrame("Puzzle Game");
		bl=new BorderLayout();
		f.setSize(200,200);
		f.setLayout(bl);
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		f.add(p1,BorderLayout.NORTH);
		f.add(p2,BorderLayout.CENTER);
		f.add(p3,BorderLayout.SOUTH);
		
		f.setVisible(true);
		g1=new GridLayout(3,1);
		Font f;
		
		l1=new JLabel("Select the language:");
		cb=new JComboBox();
		
		cb.addItem("Select");
		cb.addItem("English");
		cb.addItem("French");
		
			cl1=new Locale("en","IN");
			rb1=ResourceBundle.getBundle("MessageBundle",cl1);
			b1=new JButton();
			b2=new JButton();
			b3=new JButton();
			b1.setVisible(false);
			b2.setVisible(false);
			b3.setVisible(false);
			l2=new JLabel();
			f=new Font("Arial",Font.BOLD,30);
			l2.setFont(f);
			cl2=new Locale("fr","FR");
			rb2=ResourceBundle.getBundle("MessageBundle",cl2);
			
			
		
		p1.add(l1);
		p1.add(cb);
		p2.add(l2);
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
	
		cb.addItemListener(this);//registering event with component
		
		
	}
	public void itemStateChanged(ItemEvent e)
	{
		
		if(e.getStateChange()==ItemEvent.SELECTED)
		{
			if(cb.getSelectedItem().toString().equals("English"))
			{
			p3.setLayout(g1);
			p1.remove(l1);
			p1.remove(cb);
			f.setTitle(rb1.getString("Puzzle"));	
			b1.setText(rb1.getString("PlayGame"));
			b2.setText(rb1.getString("ViewInstructions"));
			b3.setText(rb1.getString("Exit"));
			b1.setVisible(true);
			b2.setVisible(true);
			b3.setVisible(true);
			
			
			l2.setText(rb1.getString("Puzzle"));
			
			}
			
		
			if(cb.getSelectedItem().toString().equals("French"))
			{
			p3.setLayout(g1);
			p1.remove(l1);
			p1.remove(cb);
			f.setTitle(rb2.getString("Puzzle"));		
			b1.setText(rb2.getString("PlayGame"));
			b2.setText(rb2.getString("ViewInstructions"));
			b3.setText(rb2.getString("Exit"));
			b1.setVisible(true);
			b2.setVisible(true);
			b3.setVisible(true);
			
			l2.setText(rb2.getString("Puzzle"));
				
			}
		}
	}
	
	public static void main(String[] args)
	{
		Programming3_1 obj=new Programming3_1();
	}
}
