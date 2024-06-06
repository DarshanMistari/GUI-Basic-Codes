import javax.swing.*;
class GUIDemo2
{
	JFrame f;
	JPanel p;
	JLabel lblGender;
	JRadioButton rbMale , rbFemale, rbOthers;
	ButtonGroup bg;

	JLabel lblDoc;
	JCheckBox chkAadhar , chkPan , chkLC ,chkTC;

	JLabel lblItem;
	JComboBox cmbItem;

	JList lstItem;
	String [] strItems={"Pen","Pencil","NoteBook","Book"};

	public GUIDemo2()
	{
		f = new JFrame();
		p = new JPanel();
		p.setLayout(null);

		lblGender = new JLabel("Select the Gender:");

		rbMale = new JRadioButton("Male");
		rbFemale = new JRadioButton("Female");
		rbOthers = new JRadioButton("Others");
		bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);
		bg.add(rbOthers);

		lblDoc = new JLabel("Select the Documents :");
		chkAadhar = new JCheckBox("Aadhar");
		chkPan = new JCheckBox("Pan");
		chkLC = new JCheckBox("LC");
		chkTC = new JCheckBox("TC");

		lblItem = new JLabel("Select the Items :");
		cmbItem = new JComboBox();

		lstItem = new JList(strItems);


		lblGender.setBounds(80,40,150,30);
		p.add(lblGender);
		rbMale.setBounds(80,70,80,30);
		p.add(rbMale);
		rbFemale.setBounds(160,70,90,30);
		p.add(rbFemale);
		rbOthers.setBounds(250,70,90,30);
		p.add(rbOthers);

		lblDoc.setBounds(80,150,150,30);
		p.add(lblDoc);
		chkAadhar.setBounds(80,190,100,30);
		p.add(chkAadhar);
		chkPan.setBounds(230,190,70,30);
		p.add(chkPan);
		chkLC.setBounds(80,240,80,30);
		p.add(chkLC);
		chkTC.setBounds(230,240,80,30);
		p.add(chkTC);

		lblItem.setBounds(80,280,120,30);
		p.add(lblItem);
		cmbItem.setBounds(200,280,120,30);
		cmbItem.addItem("Pen");
		cmbItem.addItem("Pancil");
		cmbItem.addItem("NoteBook");
		cmbItem.addItem("Book");
		p.add(cmbItem);

		lstItem.setBounds(350,280,120,100);
		p.add(lstItem);


		f.add(p);
		f.setSize(500,500);
		f.setLocation(30,30);
		f.setTitle("GUIDemo2");
		f.setVisible(true);
	}

	public static void main(String args[])
	{
		new GUIDemo2();
	}
}