// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
		g.drawRect(100,100,200,200);
		g.drawRect(175,175,200,200);
		g.drawLine(100,100,175,175);
		g.drawLine(300,100,375,175);
		g.drawLine(100,300,175,375);
		g.drawLine(300,300,375,375);

		// DRAW SPHERE
		g.drawOval(137,137,200,200);
		g.drawOval(137,217,200,40);
		g.drawOval(137,187,200,100);
		g.drawOval(137,152,200,170);
		g.drawOval(217,137,40,200);
		g.drawOval(187,137,100,200);
		g.drawOval(152,137,170,200);

		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
		g.drawOval(600,100,200,200);
		g.drawLine(600,200,800,150);


		// DRAW APCS



		// DRAW PACMEN FLOWER



	}

}
