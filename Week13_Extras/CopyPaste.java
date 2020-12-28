/*Create a GUI based program with the following specification: put two text field components
and one button. Label the button as paste. When some text is typed in the first text field
and paste button is pressed, then the text must gets copied into the second textfield.*/
import java.awt.*;
import java.awt.event.*;
public class CopyPaste extends Frame implements ActionListener{
	TextField a,b;
	Button bt;
	public CopyPaste(){
		setLayout(new FlowLayout());
		Label a1=new Label("Text1:",Label.RIGHT);
		Label b1=new Label("Text2:",Label.RIGHT);
		bt=new Button("Paste");
		a=new TextField(12);
		b=new TextField(12);
		add(a);
		add(bt);
		add(b);
		a.addActionListener(this);
		b.addActionListener(this);
		bt.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent ae){
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae){
		b.setText(pasteText());
	}
	String pasteText(){
		String g;
		g=a.getText();
		return g;
	}
	public static void main(String args[]){
		CopyPaste appwin=new CopyPaste();
		appwin.setSize(new Dimension(400,400));
		appwin.setTitle("CpoyPaste");
		appwin.setVisible(true);
	}
}