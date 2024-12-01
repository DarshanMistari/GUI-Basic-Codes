

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login_Page {
    JFrame F;
    JPanel P;
    JLabel lbltitle;
    JLabel lblname;
    JTextField txtname;
    JLabel lblemail;
    JTextField txtemail;
    JLabel lblpassword;
    JTextField txtpassword;
    JLabel lblconfirmpassword;
    JTextField txtconfirmpassword;
    JButton btnlogin;
    JButton btnsignup;

    public Login_Page(){
        F = new JFrame();
        P = new JPanel();

        lbltitle = new JLabel("Login Page");
        lblname = new JLabel("Customer Name :");
        txtname = new JTextField();
        lblemail = new JLabel("Customer Email id :");
        txtemail = new JTextField();
        lblpassword = new JLabel("Customer Password :");
        txtpassword = new JTextField();
        lblconfirmpassword = new JLabel("Confirm Password :");
        txtconfirmpassword = new JTextField();

        btnlogin = new JButton("Login");
        btnsignup = new JButton("sign-up");

        P.setLayout(null);

        lbltitle.setBounds(200,20,150,100);
        P.add(lbltitle);

        lblname.setBounds(100,100,110,30);
        P.add(lblname);

        txtname.setBounds(230,100,150,30);
        P.add(txtname);

        lblemail.setBounds(100,150,150,30);
        P.add(lblemail);

        txtemail.setBounds(230,150,150,30);
        P.add(txtemail);

        lblpassword.setBounds(100,200,150,30);
        P.add(lblpassword);

        txtpassword.setBounds(230,200,150,30);
        P.add(txtpassword);

        lblconfirmpassword.setBounds(100,250,150,30);
        P.add(lblconfirmpassword);

        txtconfirmpassword.setBounds(230,250,150,30);
        P.add(txtconfirmpassword);

        btnlogin.setBounds(120,300,70,30);
        P.add(btnlogin);

        btnlogin.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae){
                System.err.println("You are Login SuccessFully...");
            }

        });
        

        btnsignup.setBounds(260,300,70,30);
        P.add(btnsignup);
        

        F.add(P);
        F.setSize(500,500);
        F.setLocation(50,50);
        F.setTitle("Login Page");
        F.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        Login_Page login_Page = new Login_Page();
    }
}
