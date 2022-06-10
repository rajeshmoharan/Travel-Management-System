
import java.awt.Color;

import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class SingUp extends JFrame {
	
	SingUp(){
		setSize(1000,400);
		setLocation(200,200);
		setLayout(null);
		
		getContentPane().setBackground(Color.WHITE);
		
		JPanel p1=new JPanel();
		p1.setBackground(new Color(131,193,233));
		p1.setBounds(0, 0, 450,400);
		p1.setLayout(null);
		add(p1);
		
		JLabel email=new JLabel("Gmail");
		email.setBounds(20,60,80,30);
		email.setFont(new Font("Aohma",Font.BOLD,14));
		p1.add(email);
		
		JTextField tfusername=new JTextField();
		tfusername.setBounds(110,60,200,30);
		tfusername.setBorder(null);
		p1.add(tfusername);
		
		JLabel jlname=new JLabel("Name");
		jlname.setBounds(20,110,80,30);
		jlname.setFont(new Font("Aohma",Font.BOLD,14));
		p1.add(jlname);
		
		JTextField tfname=new JTextField();
		tfname.setBounds(110,110,200,30);
		tfname.setBorder(null);
		p1.add(tfname);
		
		JLabel ibpassword=new JLabel("Password");
		ibpassword.setBounds(20,210,100,30);
		ibpassword.setFont(new Font("Ahoma",Font.BOLD,14));
		p1.add(ibpassword);
		
		JTextField tfpassword=new JTextField();
		tfpassword.setBounds(110, 210, 200, 30);
		tfpassword.setBorder(null);
		p1.add(tfpassword);
		
		JLabel mobile=new JLabel("Mobile No");
		mobile.setBounds(20,160,200,30);
		mobile.setFont(new Font("Ahoma",Font.BOLD,14));
		p1.add(mobile);
		
		JTextField tfemail=new JTextField();
		tfemail.setBounds(110, 160, 200, 30);
		tfemail.setBorder(null);
		p1.add(tfemail);
		
		JButton create=new JButton("Create");
		create.setBounds(60, 280, 100, 40);
		create.setBackground(Color.GRAY);
		create.setForeground(Color.white);
		create.setBorder(null);
		p1.add(create);		
		
		JButton back=new JButton("Back");
		back.setBounds(220, 280, 100, 40);
		back.setBackground(Color.GRAY);
		back.setForeground(Color.white);
		back.setBorder(null);
		p1.add(back);		
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
		Image i2=i1.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel (i3);
		image.setBounds(480,20,450,300);
		add(image);
		
		
		
		
		
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new SingUp();
		// TODO Auto-generated method stub

	}

}
