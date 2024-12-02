
import java.awt.event.*;
import javax.swing.*;


class Login_Page2 extends javax.swing.JFrame {


    public Login_Page2(){
    JFrame frame = new JFrame("Login Page2");
    JPanel panel = new JPanel();

    JLabel lbltitle = new JLabel("Login Page 2");
    JLabel lblusername = new JLabel("User Name :");
    JTextField txtusername = new JTextField();
    JLabel lblemail = new JLabel("Email id :");
    JTextField txtemail =new JTextField();
    JLabel lblpassword = new JLabel("Password :");
    JTextField txtpassword  =new JTextField();
    JButton btnLogin = new JButton("Login");
    JButton btnsignup = new JButton("Sign-up");
    JLabel lblmsg = new JLabel("");
    JLabel lblmesg = new JLabel("");
    panel.setLayout(null);

    lbltitle.setBounds(140,50,90,30);
    panel.add(lbltitle);

    lblusername.setBounds(70,100,100,30);
    panel.add(lblusername);

    txtusername.setBounds(180,100,150,30);
    panel.add(txtusername);

    lblemail.setBounds(70,150,100,30);
    panel.add(lblemail);

    txtemail.setBounds(180,150,150,30);
    panel.add(txtemail);

    lblpassword.setBounds(70,200,150,30);
    panel.add(lblpassword);

    txtpassword.setBounds(180,200,150,30);
    panel.add(txtpassword);

    btnLogin.setBounds(70,250,90,30);
    panel.add(btnLogin);

    btnsignup.setBounds(190,250,90,30);
    panel.add(btnsignup);

    lblmsg.setBounds(100,290,150,30);
    panel.add(lblmsg);

    lblmesg.setBounds(100,310,190,30);
    panel.add(lblmesg);

    btnLogin.setOpaque(true);
	btnLogin.addMouseListener(new MouseListener()
    {
		public void mouseEntered(MouseEvent me1)
		{
				
		}
		    public void mouseExited(MouseEvent me2)
		{

		}
		public void mousePressed(MouseEvent me3)
		{

		}
		public void mouseReleased(MouseEvent me4)
		{
				
		}
		public void mouseClicked(MouseEvent me5)
		{
			lblmsg.setText("Your Login SuccessFully..");
		}
        });

        btnsignup.addMouseListener(new MouseListener()
    {
		public void mouseEntered(MouseEvent me1)
		{
				
		}
		    public void mouseExited(MouseEvent me2)
		{

		}
		public void mousePressed(MouseEvent me3)
		{
            
		}
		public void mouseReleased(MouseEvent me4)
		{
				
		}
		public void mouseClicked(MouseEvent me5)
		{
            lblmesg.setText("Your create a new Account..");
		}
        });
    
        frame.add(panel);
        frame.setSize(400,400);
        frame.setLocation(100,100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Login_Page2 login_Page2 = new Login_Page2();
    }
}

