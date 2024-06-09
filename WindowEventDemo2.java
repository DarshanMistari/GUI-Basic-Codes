import javax.swing.*;
import java.awt.event.*;
class WindowEventDemo2 extends WindowAdapter
{
	JFrame f;
	public WindowEventDemo2()
	{
		f = new JFrame();
		f.addWindowListener(this);

		f.setSize(400,400);
		f.setLocation(50,50);
		f.setTitle("Window event");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void windowActivated(WindowEvent we1)
	{
		System.out.println("Online");
	}
	public void windowIconified(WindowEvent we2)
	{
		System.out.println("OffLine");
	}
	public static void main(String args[])
	{
		new WindowEventDemo2();
	}
}