/*Write a program that creates a user interface to perform integer divisions. The user enters two
numbers in the text fields, Num1 and Num2. The division of Num1 and Num2 is displayed in the
Result field when the Divide button is clicked. If Num1 or Num2 were not an integer, the program
would throw a NumberFormatException. If Num2 were Zero, the program would throw an
Arithmetic Exception Display the exception in a message dialog box.*/

import java.awt.*;
import java.awt.event.*;
public class IntDivision extends Frame implements ActionListener{
	TextField num1,num2,result;
	String res,msg1="",msg2="";
	Button div;
	public IntDivision(){
		setLayout(new FlowLayout());
		div=new Button("Divide");
		Label numa=new Label("Number 1: ",Label.RIGHT);
		Label numb=new Label("Number 2: ",Label.RIGHT);
		Label res1=new Label("Result: ",Label.RIGHT);
		num1=new TextField(5);
		num2=new TextField(5);
		result=new TextField(10);
		add(numa);
		add(num1);
		add(div);
		add(numb);
		add(num2);
		add(res1);
		add(result);
		num1.addActionListener(this);
		div.addActionListener(this);
		num2.addActionListener(this);
		result.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
public void actionPerformed(ActionEvent ae){
	String s=ae.getActionCommand();
	if(s.equals("Divide"))
	{
		result.setText(divide());
	}
	repaint();
	}
	String divide(){
		float r;
		int n1,n2;
		try{
		n1=Integer.parseInt(num1.getText());
		n2=Integer.parseInt(num2.getText());
	}
	catch(NumberFormatException nfe){
		msg2="The input number should be integer";
		return "";
	}
	try{
		r=(Float.parseFloat(num1.getText()))/(Float.parseFloat(num2.getText()));
		res=String.valueOf(r);
	}
	catch(ArithmeticException ae){
		msg1="Cannot divide a number by zero";
		return "";
	}
	if((Float.parseFloat(num2.getText()))==0){
		msg1="Cannot divide num1 by zero";
		return "";
	}
	else{
		r=(Float.parseFloat(num1.getText()))/(Float.parseFloat(num2.getText()));
		res=String.valueOf(r);
		return res;
	}
	}
	public void paint(Graphics g){
		g.drawString(msg1,20,100);
		msg1="";
		g.drawString(msg2,20,100);
		msg2="";
	}

public static void main(String args[]){
		IntDivision intdiv=new IntDivision();
		intdiv.setSize(new Dimension(380,180));
		intdiv.setTitle("TextFieldDemo");
		intdiv.setVisible(true);
	}
}