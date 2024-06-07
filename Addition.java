import javax.swing.*;
import java.awt.event.*;
class Addition
{
	JFrame f;
	JPanel p;
	JLabel lblNo1,lblNo2,lblAdd;
	JTextField txtNo1,txtNo2,txtAdd;
	JButton btnAdd,btnCancel;

	Addition()
	{
		f = new JFrame();
		p = new JPanel();
		lblNo1 = new JLabel("Enter the No1:");
		txtNo1 = new JTextField();
		lblNo2 = new JLabel("Enter the No2:");
		txtNo2 = new JTextField();
		lblAdd = new JLabel("Addition:");
		txtAdd = new JTextField();

		btnAdd = new JButton("Addition");
		btnCancel = new JButton("Cancel");

		p.setLayout(null);

		lblNo1.setBounds(100,30,180,30);
		p.add(lblNo1);

		txtNo1.setBounds(100,60,180,30);
		p.add(txtNo1);

		lblNo2.setBounds(100,110,180,30);
		p.add(lblNo2);

		txtNo2.setBounds(100,140,180,30);
		p.add(txtNo2);

		lblAdd.setBounds(100,180,180,30);
		p.add(lblAdd);

		txtAdd.setBounds(100,210,180,30);
		p.add(txtAdd);

		btnAdd.setBounds(100,250,90,30);
		p.add(btnAdd);

		btnAdd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				int a = Integer.parseInt(txtNo1.getText().toString());
				int b = Integer.parseInt(txtNo2.getText().toString());
				int c = a + b;
				txtAdd.setText(String.valueOf(c));

				txtNo1.setText("");
				txtNo2.setText("");

				txtNo1.requestFocus();
			}
		});

		btnCancel.setBounds(200,250,80,30);
		p.add(btnCancel);

		btnCancel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.exit(0);
			}
		});


		f.add(p);
		f.setSize(400,400);
		f.setLocation(50,50);
		f.setTitle("Addition");
		f.setVisible(true);
	}

	public static void main(String args[])
	{
		new Addition();
	}
}