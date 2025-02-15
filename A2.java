import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


class Pass extends JFrame implements ActionListener,ItemListener
{
	//Declaration
	
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JCheckBox ch1,ch2,ch3;
	ButtonGroup grp1;
	JRadioButton rb1,rb2,rb3;
	String s1;
	String s2="";
	Pass()
	{
		setTitle("Registration");
		setSize(500,500);
		setLocation(100,100);
		setLayout(null);
		
		
		
		//Memory Allocation
		l1=new JLabel("YOUR NAME =");
		t1=new JTextField();
		
		l2=new JLabel("YOUR CLASS");
		
		grp1=new ButtonGroup();
		rb1=new JRadioButton("FY");
		rb2=new JRadioButton("SY");
		rb3=new JRadioButton("TY");
		
		l3=new JLabel("YOUR HOBBIES");
		ch1=new JCheckBox("MUSIC"); ch2=new JCheckBox("DANCE"); ch3=new JCheckBox("SPORT");
		
		t2=new JTextField();
		
	
		
		
		
		
		
		//ADD
		add(l1);add(t1);
		add(l2);
		grp1.add(rb1); grp1.add(rb2); grp1.add(rb3); 
		add(rb1); add(rb2); add(rb3);
		add(l3);
		add(ch1); add(ch2); add(ch3);
		add(t2);
		
		
		
		//SETBOUNDS
		l1.setBounds(80,80,100,30); t1.setBounds(200,80,100,30);
		l2.setBounds(80,130,100,30);
		rb1.setBounds(90,170,50,30); rb2.setBounds(90,210,50,30); rb3.setBounds(90,250,50,30);
		l3.setBounds(220,130,100,30);
		ch1.setBounds(230,170,100,30); ch2.setBounds(230,210,100,30); ch3.setBounds(230,250,100,30);
		t2.setBounds(80,300,350,30);
		
		//Add Listeners
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		s1=t1.getText();
		if(e.getSource()==rb1)
			s2="FY";
		else if(e.getSource()==rb2)
			s2="SY";
		else if(e.getSource()==rb3)
			s2="TY";
		  
     t2.setText("Name="+s1+"  Class="+s2);
		
	}
	public void itemStateChanged(ItemEvent e)
	{
		
		String s3="";
			if(ch1.isSelected())
			s3=s3+"Music";
		if(ch2.isSelected())
			s3=s3+"Dance";
		if(ch3.isSelected())
			s3=s3+"Sport";
		
	/*	if(ch1.getState())
            s3=s3+"Music";
		if(ch2.getState())
			s3=s3+"Sport";
		if(ch3.getState())
*/		
		t2.setText("Name = "+s1+" Class ="+s2 +"  Hobby ="+s3);
	}
   
}

class A2
{
	public static void main(String args[])
	{
		new Pass();
		
	}

}