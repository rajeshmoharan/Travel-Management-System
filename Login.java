
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class Login  extends JFrame{
	
		Login(){
			setSize(900,400);
			setLocation(350,200);
			setLayout(null);
			
			getContentPane().setBackground(Color.WHITE);
		
			
			
			JPanel p1=new JPanel();
			p1.setBounds(0,0,400,400);
			add(p1);
			p1.setLayout(null);
			
			
			
			ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
			Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);
			JLabel image=new JLabel (i3);
			image.setBounds(100,120,200,200);
			p1.add(image);
			p1.setBackground(new Color(131,193,233));
			
			
			JPanel p2=new JPanel();
			p2.setLayout(null);
			p2.setBounds(400,30,450,300);
			add(p2);
			
			
			JLabel ibusername=new JLabel("Username");
			ibusername.setBounds(60,20,100,25);
			ibusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
			p2.add(ibusername);
			
			JTextField tfusername=new JTextField();
			tfusername.setBounds(60, 60, 300, 30);
			tfusername.setBorder(null);
			p2.add(tfusername);
			
			
			JLabel ibpassword=new JLabel("Password");
			ibpassword.setBounds(60,110,100,25);
			ibpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
			p2.add(ibpassword);
			
			JTextField tfpassword=new JTextField();
			tfpassword.setBounds(60, 150, 300, 30);
			tfpassword.setBorder(null);
			p2.add(tfpassword);
			
			JButton login=new JButton("Login");
			login.setBounds(60, 200, 130, 30);
			login.setBackground(new Color(131,193,233));
			login.setForeground(Color.white);
			login.setBorder(null);
			p2.add(login);
			
			JButton singup=new JButton("Sing up");
			singup.setBounds(200, 200, 130, 30);
			singup.setBackground(new Color(131,193,233));
			singup.setForeground(Color.white);
			singup.setBorder(null);
			p2.add(singup);
			
			
			JLabel text=new JLabel("Trouble in login...");
			text.setBounds(150, 250, 100, 30);
			text.setForeground(Color.RED);
			p2.add(text);
			
			
//			JButton fpassword=new JButton("Forget Password");
//			fpassword.setBounds(340, 200, 130, 30);
//			fpassword.setBackground(new Color(131,193,233));
//			fpassword.setForeground(Color.white);
//			p2.add(fpassword);
		
			
			
			
			setVisible(true);
			
		}
	public static void main(String[]args) {
		new Login();
		
	}

}
