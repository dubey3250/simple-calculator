import java.awt.*;
import java.awt.event.*;
public class myframe2 extends Frame  implements ActionListener
{	
	Label l1;
	TextField t1;
	Button b1[]=new Button[30];
	Button eql;
	String str,str1="0",str2="0",str3;
	float x,y,z,f=0;
    float c;
	float f2=1;
	char ch[]={'1','2','3','4','5','6','7','8','9','0','!','.','R','C','+','-','*','/','%','='};
	myframe2()
	{
		setBackground(Color.green);
		setForeground(Color.white);
		setTitle("Java Calculator...");
	//	Color b=new Color(33,33,43,12);
		t1=new TextField("clcultor.",10);
		add(t1);
		t1.setBackground(Color.pink);
		
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}}); //for closing  frame window
		
	    for(int i=0;i<ch.length;i++)
		{
			b1[i]=new Button(String.valueOf(ch[i]));
			add(b1[i]);
		}
		for(int i=0;i<ch.length;i++)
		{
			if(!Character.isDigit(ch[i]))
			{
				b1[i].setBackground(Color.black);	
			}
			else
			{
				b1[i].setBackground(Color.blue);
			}
		}
		setLayout(new GridLayout(7,3));
		for(int i=0;i<ch.length;i++)
		{
			b1[i].addActionListener(this);
		}		
		setSize(400,400);
		setVisible(true);
	}	
	public void actionPerformed(ActionEvent e)
	{
		str=e.getActionCommand();
		//str1=str1+str;
		t1.setText(t1.getText()+str);
		char ch=str.charAt(0);
		if(Character.isDigit(ch))
		{
			str2=str2+String.valueOf(ch);
			y=Float.parseFloat(str2);
		}
		else if(e.getSource()==b1[11])
		{
			str2=str2+String.valueOf(ch);
		}
		else if(e.getSource()==b1[14])
		{
			f=1;
			str3=str2;
			str2="0";
		}
		else if(e.getSource()==b1[15])
		{
			f=2;
			str3=str2;
			str2="0";
		}
		else if(e.getSource()==b1[16]) 
		{
			f=3;
			str3=str2;
			str2="0";
		}
		else if(e.getSource()==b1[17])
		{
			f=4;
			str3=str2;
			str2="0";
		}
		else if(e.getSource()==b1[18])
		{
			f=5;
			str3=str2;
			str2="0";
		}
		else if(e.getSource()==b1[10])
		{
			f=6;
			str3=str2;
			str2="0";
		}
		  if(e.getSource()==b1[19])
			{
				  x=Float.parseFloat(str3);
				  str3="0"; 
				  str2="0";
				 if(f==1)
				 {
					 z=x+y;
					 t1.setText(String.valueOf(z));
					 c=Float.parseFloat(t1.getText());
					 str2=String.valueOf(c);
				 }
				 if(f==2)
				 {
					 z=x-y;
					 t1.setText(String.valueOf(z));
					 c=Float.parseFloat(t1.getText());
					 str2=String.valueOf(c);
				 }
				 if(f==3)
				 {
					 z=x*y;
					 t1.setText(String.valueOf(z));
					 c=Float.parseFloat(t1.getText());
					 str2=String.valueOf(c);
				 }
				 if(f==4)
				 {
					 if(y==0)
					 {
						 t1.setText("can't divided by zero.");
					 }
					 else
					 {
					 z=x/y;
					 t1.setText(String.valueOf(z));
					 c=Float.parseFloat(t1.getText());
					 str2=String.valueOf(c);
					 }
				 }
				 if(f==5)
				 {
					 z=x%y;
					 t1.setText(String.valueOf(z));
					 c=Float.parseFloat(t1.getText());
					 str2=String.valueOf(c);
				 }
				 if(f==6)
				 {
					 f2=1;
					 for(float i=1;i<=x;i++)
					 {
					  f2=f2*i;
					 } 
					  t1.setText(String.valueOf(f2));
					 c=Float.parseFloat(t1.getText());
					 str2=String.valueOf(c);
				 }
			 } 
			else if(e.getSource()==b1[12])
			{
				t1.setText(String.valueOf(c));
				str2=String.valueOf(c);
			}
			else if(e.getSource()==b1[13])
			{
				t1.setText(" ");
				str2="0";
			}				
	}	
	public static void main(String arg[])
	{
		new myframe2();
	}
}