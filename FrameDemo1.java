import java.awt.*;
class FrameDemo1 extends Component
{
	public static void main(String args[])
	{
		Frame f = new Frame();

		f.setSize(400,400);
		f.setLocation(50,50);
		f.setTitle("My Frame");
		f.add(new FrameDemo1());
		f.setVisible(true);
	}

	public void paint(Graphics g)
	{
		g.drawRect(50,50,100,100);
		g.drawOval(50,50,100,100);
		g.drawLine(50,50,150,150);

	}
}