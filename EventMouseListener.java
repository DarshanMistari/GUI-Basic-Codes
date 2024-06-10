import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class EventMouseListener
{
	JFrame f;
	JPanel p;
	JLabel lblFName , lblLName;
	JTextField txtFName ,txtLName;
	JButton btnSubmit;

	public EventMouseListener()
	{
		f = new JFrame();
		p = new JPanel();
		lblFName = new JLabel("First Name :");
		lblLName = new JLabel("Last Name :");
		txtFName = new JTextField();
		txtLName = new JTextField();
		btnSubmit = new JButton("Submit");
		p.setLayout(null);

		lblFName.setBounds(50,30,150,30);
		p.add(lblFName);

		lblFName.setOpaque(true);
		lblFName.addMouseListener(new MouseListener()
		{
			public void mouseEntered(MouseEvent me1)
			{
				lblFName.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent me2)
			{
				lblFName.setBackground(Color.YELLOW);
			}
			public void mousePressed(MouseEvent me3)
			{
				lblFName.setBackground(Color.GREEN);
		    }
		    public void mouseReleased(MouseEvent me4)
		    {
				lblFName.setBackground(Color.PINK);
			}
			public void mouseClicked(MouseEvent me5)
			{
				lblFName.setBackground(Color.ORANGE);
			}
		});

		txtFName.setBounds(50,60,150,30);
		p.add(txtFName);

		lblLName.setBounds(50,100,150,30);
		p.add(lblLName);

		txtLName.setBounds(50,140,150,30);
		p.add(txtLName);

		lblLName.setOpaque(true);
		lblLName.addMouseListener(new MouseListener()
		{
			public void mouseEntered(MouseEvent me1)
			{
				lblLName.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent me2)
			{
				lblLName.setBackground(Color.YELLOW);
			}
			public void mousePressed(MouseEvent me3)
			{
				lblLName.setBackground(Color.GREEN);
			}
			public void mouseReleased(MouseEvent me4)
			{
				lblLName.setBackground(Color.PINK);
			}
			public void mouseClicked(MouseEvent me5)
			{
				lblLName.setBackground(Color.ORANGE);
			}
		});

		btnSubmit.setBounds(50,180,90,30);
		p.add(btnSubmit);



		f.add(p);
		f.setSize(300,300);
		f.setLocation(50,50);
		f.setTitle("Mouse Listener");
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new EventMouseListener();
	}
}