import java.awt.*;
import java.awt.event.*;
class DialogBox extends Dialog implements ActionListener{
	IntDivisionD id;
	DialogBox(Frame parent,String title){
		super(parent,title,true);
		id=(IntDivisionD)parent;
		setLayout(new FlowLayout());
		setSize(300,300);
		add(new Label(id.msg));
		Button b;
		add(b=new Button("OK"));
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		dispose();
	}
}
public class IntDivisionD extends Frame implements ActionListener{
	TextField num1,num2,result;
	String res,msg;
	Button div;
	public IntDivisionD(){
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
	}
	String divide(){
		double n1,n2,n=0;
		try
	{
		n1=Integer.parseInt(num1.getText());
	    n2=Integer.parseInt(num2.getText());
	   
	}
	catch (NumberFormatException ne)
	{
     msg="entered numbers must be integers";
	 DialogBox d = new DialogBox(this, "Dialog");
     d.setVisible(true);
	}
        n1=Integer.parseInt(num1.getText());
	    n2=Integer.parseInt(num2.getText());
	 if(n2==0)
		{

		 msg="cannot divide a number by 0";
		 DialogBox d = new DialogBox(this, "Dialog");
         d.setVisible(true);
		 return " ";
		}

		else
		{
	
		n1=Integer.parseInt(num1.getText());
	    n2=Integer.parseInt(num2.getText());
		n=n1/n2;
		}
	
        res=Double.toString(n);
		return res;
	}
public static void main(String args[]){
		IntDivisionD intdiv=new IntDivisionD();
		intdiv.setSize(new Dimension(380,180));
		intdiv.setTitle("TextFieldDemo");
		intdiv.setVisible(true);
	}
}