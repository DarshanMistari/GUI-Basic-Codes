import java.awt.*;
class FrameSetColor extends Component
{
	public static void main(String args[])
	{
		Frame F = new Frame();
		F.setSize(400,400);
		F.setLocation(50,50);
		F.setTitle("My Frame");
		F.add(new FrameSetColor());
	    F.setVisible(true);
     }

     public void paint(Graphics g)
     {
		 g.setColor(Color.RED);
		 g.fillRect(50,50,100,100);
		 g.setColor(Color.YELLOW);
		 g.fillOval(50,50,100,100);
		 g.setColor(Color.BLACK);
	     g.drawLine(50,50,150,150);
	 }

}