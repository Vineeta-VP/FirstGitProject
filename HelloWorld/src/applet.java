import java.applet.Applet;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class applet extends Applet implements ActionListener
{
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	Label l1 = new Label("First no: ");
	Label l2 = new Label("Second no: ");
	Label l3 = new Label("Result is: ");
	
	public applet()
	{
		setLayout(new GridLayout(3,2));
		setBackground(Color.green);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		t2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{	
	  Double num1 = Double.parseDouble(t1.getText());
	  Double num2 = Double.parseDouble(t2.getText());
	  Double Res = num1+num2;
	  t3.setText("Sum is :" + Res);
	  
	}
}
