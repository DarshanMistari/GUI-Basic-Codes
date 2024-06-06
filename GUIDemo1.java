import java.awt.*;
class GUIDemo1 extends Component
{
	Frame f;
	Panel p;

	Label lblUserName;
	TextField txtUserName;
	Label lblPassword;
	TextField txtPassword;
	Button btnLogin;
	Button btnReset;
	public GUIDemo1()
	{
		f = new Frame();
		p = new Panel();
		lblUserName = new Label();
		txtUserName = new TextField();
		lblPassword = new Label();
		txtPassword = new TextField();
		btnLogin = new Button("Login");
		btnReset = new Button("Reset");
		p.setLayout(null);

		lblUserName.setText("Enter the UserName :");
		lblUserName.setBounds(100,50,150,30);
		p.add(lblUserName);

		txtUserName.setBounds(100,80,150,30);
		p.add(txtUserName);

		lblPassword.setText("Enter the Password :");
		lblPassword.setBounds(100,120,150,30);
		p.add(lblPassword);

		txtPassword.setBounds(100,150,150,30);
		p.add(txtPassword);

		btnLogin.setBounds(100,200,70,30);
		p.add(btnLogin);

		btnReset.setBounds(180,200,70,30);
		p.add(btnReset);

		f.add(p);
		f.setSize(400,400);
		f.setLocation(50,50);
		f.setTitle("Frame Layout");
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new GUIDemo1();
	}
}