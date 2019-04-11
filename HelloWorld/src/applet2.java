import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class applet2 extends Applet 
{
  public void paint(Graphics g)
  {
	  int i=1;
	  int j=20;
	  int c=i+j;
	  String S = "Sum=" + String.valueOf(c); 
	  g.drawString(S, 50, 100);
	  setBackground(Color.orange);
  }
}

