import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class EventFocusGainedLost
{
	JFrame f;
	JPanel p;
	JLabel lblFName , lblLName;
	JTextField txtFName ,txtLName;
	JButton btnSubmit;
	public EventFocusGainedLost()
	{
		f = new JFrame();
		p = new JPanel();

		lblFName = new JLabel("First Name :");
		lblLName = new JLabel("Last Name :");
		txtFName = new JTextField();
		txtLName = new JTextField();
		btnSubmit = new JButton("Submit");
		p.setLayout(null);

		lblFName.setBounds(50,50,150,30);
		p.add(lblFName);
		txtFName.setBounds(50,90,150,30);
		p.add(txtFName);

		txtFName.addFocusListener(new FocusListener()
		{
			public void focusGained(FocusEvent fe)
			{
				txtFName.setBackground(Color.YELLOW);
			}

			public void focusLost(FocusEvent fe)
			{
				txtFName.setBackground(Color.WHITE);
			}
		});
		lblLName.setBounds(50,130,150,30);
		p.add(lblLName);
		txtLName.setBounds(50,160,150,30);
		p.add(txtLName);

		txtLName.addFocusListener(new FocusListener()
		{
			public void focusGained(FocusEvent fe)
			{
				txtLName.setBackground(Color.YELLOW);
			}

			public void focusLost(FocusEvent fe)
			{
				txtLName.setBackground(Color.WHITE);
			}
		});

		btnSubmit.setBounds(50,200,90,30);
		p.add(btnSubmit);

		f.add(p);
		f.setSize(300,300);
		f.setLocation(50,50);
		f.setTitle("Event Focus Gained Lost");
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new EventFocusGainedLost();
	}
}