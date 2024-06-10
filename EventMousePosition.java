import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class EventMousePosition
{
    JFrame f;
    JPanel p;
    JLabel lblFName , lblLName , lblPosition;
    JTextField txtFName ,txtLName;
    JButton btnSubmit;
    public EventMousePosition()
	{
		f = new JFrame();
		p = new JPanel();
		lblFName = new JLabel("First Name :");
		lblLName = new JLabel("Last Name :");
		txtFName = new JTextField();
		txtLName = new JTextField();
		btnSubmit = new JButton("Submit");
		lblPosition = new JLabel("Position : ");
		p.setLayout(null);

		lblFName.setBounds(90,30,150,30);
		p.add(lblFName);

		txtFName.setBounds(90,60,150,30);
		p.add(txtFName);

		lblLName.setBounds(90,100,150,30);
		p.add(lblLName);

		txtLName.setBounds(90,140,150,30);
		p.add(txtLName);

		btnSubmit.setBounds(90,180,90,30);
		p.add(btnSubmit);

		lblPosition.setBounds(15,270,150,30);
		p.add(lblPosition);

		f.addMouseListener(new MouseListener()
		{
			public void mouseEntered(MouseEvent me1)
			{
				lblPosition.setText("Position :"+me1.getX()+","+me1.getY());
			}
			public void mouseExited(MouseEvent me2)
			{
				lblPosition.setText("Position :"+me2.getX()+","+me2.getY());
			}
			public void mousePressed(MouseEvent me3)
			{
				lblPosition.setText("Position :"+me3.getX()+","+me3.getY());
		    }
		    public void mouseReleased(MouseEvent me4)
		    {
				lblPosition.setText("Position :"+me4.getX()+","+me4.getY());
			}
			public void mouseClicked(MouseEvent me5)
			{
				lblPosition.setText("Position :"+me5.getX()+","+me5.getY());
			}
		});


		f.add(p);
		f.setSize(350,350);
		f.setLocation(30,30);
		f.setTitle("Mouse Listener");
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new EventMousePosition();
	}
}