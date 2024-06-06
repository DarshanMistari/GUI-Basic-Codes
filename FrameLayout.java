import java.awt.*;
class FrameLayout extends Component
{
	Frame f;
	Panel p;
	Button btnNorth,btnSouth,btnWest,btnEast,btnCenter;

	public FrameLayout()
	{
		f = new Frame();
		p = new Panel();

		btnNorth = new Button("North");
		btnSouth = new Button("South");
		btnWest = new Button("West");
		btnEast = new Button("East");
		btnCenter = new Button("Center");
		p.setLayout(new BorderLayout());

		p.add(btnNorth,BorderLayout.NORTH);

		p.add(btnSouth,BorderLayout.SOUTH);

		p.add(btnWest,BorderLayout.WEST);

		p.add(btnEast,BorderLayout.EAST);

		p.add(btnCenter,BorderLayout.CENTER);

		f.add(p);
		f.setSize(400,400);
		f.setLocation(50,50);
		f.setTitle("Frame Layout");
		f.setVisible(true);
	}

	public static void main(String args[])
	{
		new FrameLayout();
	}
}