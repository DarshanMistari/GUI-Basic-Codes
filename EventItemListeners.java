import javax.swing.*;
import java.awt.event.*;
class EventItemListeners
{
	JFrame f;
	JPanel p;
	JLabel lblGender ,lblMessage;
	JRadioButton rbMale , rbFemale, rbOthers;
	ButtonGroup bg;

	JLabel lblDoc ,lblDocMessage;
	JCheckBox chkAadhar , chkPan , chkLC ,chkTC;

	JLabel lblItem , lblcmbMessage;
	JComboBox cmbItem;

	JList lstItem;
	String [] strItems={"Pen","Pencil","NoteBook","Book"};


	public EventItemListeners()
	{
		f = new JFrame();
		p = new JPanel();
		p.setLayout(null);

		lblGender = new JLabel("Select the Gender:");

		rbMale = new JRadioButton("Male");
		rbFemale = new JRadioButton("Female");
		rbOthers = new JRadioButton("Others");
		lblMessage = new JLabel("You Selected :");
		bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);
		bg.add(rbOthers);

		lblDoc = new JLabel("Select the Documents :");
		chkAadhar = new JCheckBox("Aadhar");
		chkPan = new JCheckBox("Pan");
		chkLC = new JCheckBox("LC");
		chkTC = new JCheckBox("TC");
		lblDocMessage = new JLabel("You Select Documents:");

		lblItem = new JLabel("Select the Items :");
		cmbItem = new JComboBox();
		lblcmbMessage = new JLabel("You Select Item:");

		lstItem = new JList(strItems);


		lblGender.setBounds(80,40,150,30);
		p.add(lblGender);
		rbMale.setBounds(80,70,80,30);
		p.add(rbMale);

		rbMale.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(rbMale.isSelected() == true)
				{
					lblMessage.setText("You Selected:Male");
					System.out.println("You Selected:Male");
				}
			}
		});

		rbFemale.setBounds(160,70,90,30);
		p.add(rbFemale);

		rbFemale.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(rbFemale.isSelected() == true)
				{
					lblMessage.setText("You Selected:Female");
				    System.out.println("You Selected:Female");
				}
			}
		});

		rbOthers.setBounds(250,70,90,30);
		p.add(rbOthers);

		rbOthers.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(rbOthers.isSelected() == true)
				{
					lblMessage.setText("You Selected:Others");
					System.out.println("You Selected:Others");
				}
			}
		});

		lblMessage.setBounds(80,110,150,30);
		p.add(lblMessage);

		lblDoc.setBounds(80,150,150,30);
		p.add(lblDoc);
		chkAadhar.setBounds(80,190,100,30);
		p.add(chkAadhar);

		chkAadhar.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(chkAadhar.isSelected() == true)
				{
					lblDocMessage.setText("You Select Documents: AadharCard");
				    System.out.println("You Select Documents: AadharCard");
				}
			}
		});

		chkPan.setBounds(230,190,70,30);
		p.add(chkPan);

		chkPan.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(chkPan.isSelected() == true)
				{
					lblDocMessage.setText("You Select Documents: PanCard");
				    System.out.println("You Select Documents: PanCard");
				}
			}
		});

		chkLC.setBounds(80,240,80,30);
		p.add(chkLC);

		chkLC.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(chkLC.isSelected() == true)
				{
					lblDocMessage.setText("You Select Documents: Lc");
					System.out.println("You Select Documents: LC");
				}
			}
		});

		chkTC.setBounds(230,240,80,30);
		p.add(chkTC);

		chkTC.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(chkTC.isSelected() == true)
				{
					lblDocMessage.setText("You Select Documents: TC");
				    System.out.println("You Select Documents: TC");
				}
			}
		});

		lblDocMessage.setBounds(80,280,250,30);
		p.add(lblDocMessage);

		lblItem.setBounds(80,320,120,30);
		p.add(lblItem);
		cmbItem.setBounds(200,320,120,30);
		cmbItem.addItem("Pen");
		cmbItem.addItem("Pancil");
		cmbItem.addItem("NoteBook");
		cmbItem.addItem("Book");
		p.add(cmbItem);

		cmbItem.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				 lblcmbMessage.setText("You Select :"+cmbItem.getSelectedItem().toString());
				 System.out.println("You Select Item:"+cmbItem.getSelectedItem().toString());
			}
		});
		lblcmbMessage.setBounds(80,350,250,30);
		p.add(lblcmbMessage);


		lstItem.setBounds(350,320,120,100);
		p.add(lstItem);

		f.add(p);
		f.setSize(500,500);
		f.setLocation(30,30);
		f.setTitle("Event ItemListener");
		f.setVisible(true);

	}

	public static void main(String args[])
	{
		new EventItemListeners();
	}
}