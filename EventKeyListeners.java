import javax.swing.*;
import java.awt.event.*;
class EventKeyListeners
{
	JFrame f;
	JPanel p;
	JLabel lblStatus;
	JLabel lblMessage,lblSendMessage;
	JTextField txtMessage;
	JButton btnSend;
	public EventKeyListeners()
	{
		f = new JFrame();
		p = new JPanel();
		lblStatus = new JLabel("WhatsApp Message: ");
		lblMessage = new JLabel("Type Message");
		txtMessage = new JTextField();
		btnSend = new JButton("Send");
		lblSendMessage = new JLabel("Send Message :");
		p.setLayout(null);

		lblStatus.setBounds(50,40,200,30);
		p.add(lblStatus);

		lblMessage.setBounds(50,80,150,30);
		p.add(lblMessage);

		txtMessage.setBounds(50,120,150,30);
		p.add(txtMessage);

		txtMessage.addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent ke)
			{
				lblStatus.setText("WhatsApp Message: Typing..... ");
			}
			public void keyReleased(KeyEvent ke)
			{
				lblStatus.setText("WhatsApp Message: Online");
			}
			public void keyTyped(KeyEvent ke)
			{
				lblStatus.setText("WhatsApp Message:Typing.... ");
			}
		});

		btnSend.setBounds(50,160,70,30);
		p.add(btnSend);

		btnSend.addActionListener(new ActionListener()
		{
			String Message = txtMessage.getText().toString();
			lblSendMessage.setText(Message);
		});

		lblSendMessage.setBounds(50,200,250,30);
		p.add(lblSendMessage);

		f.add(p);
		f.setSize(300,300);
		f.setLocation(50,50);
		f.setTitle("WhatsApp Status");
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new EventKeyListeners();
	}
}