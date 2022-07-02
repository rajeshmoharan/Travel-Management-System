
import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SingUp extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton create,back;
	JTextField tfusername,tfpassword,tfname,tfmobile,tfgmail;
	
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
		
		JLabel ibgmail=new JLabel("Gmail");
		ibgmail.setBounds(20,20,50,30);
		ibgmail.setFont(new Font("Aohma",Font.BOLD,14));
		p1.add(ibgmail);
		
		tfgmail=new JTextField();
		tfgmail.setBounds(110,20,200,30);
		tfgmail.setBorder(null);
		p1.add(tfgmail);
		
		
		JLabel ibusername=new JLabel("username");
		ibusername.setBounds(20,60,80,30);
		ibusername.setFont(new Font("Aohma",Font.BOLD,14));
		p1.add(ibusername);
		
		tfusername=new JTextField();
		tfusername.setBounds(110,60,200,30);
		tfusername.setBorder(null);
		p1.add(tfusername);
		
		JLabel jlname=new JLabel("Name");
		jlname.setBounds(20,110,80,30);
		jlname.setFont(new Font("Aohma",Font.BOLD,14));
		p1.add(jlname);
		
		tfname=new JTextField();
		tfname.setBounds(110,110,200,30);
		tfname.setBorder(null);
		p1.add(tfname);
		
		JLabel ibpassword=new JLabel("Password");
		ibpassword.setBounds(20,210,100,30);
		ibpassword.setFont(new Font("Ahoma",Font.BOLD,14));
		p1.add(ibpassword);
		
		tfpassword=new JTextField();
		tfpassword.setBounds(110, 210, 200, 30);
		tfpassword.setBorder(null);
		p1.add(tfpassword);
		
		JLabel mobile=new JLabel("Mobile No");
		mobile.setBounds(20,160,200,30);
		mobile.setFont(new Font("Ahoma",Font.BOLD,14));
		p1.add(mobile);
		
		tfmobile=new JTextField();
		tfmobile.setBounds(110, 160, 200, 30);
		tfmobile.setBorder(null);
		p1.add(tfmobile);
		
		create=new JButton("Create");
		create.setBounds(60, 280, 100, 40);
		create.setBackground(Color.GRAY);
		create.setForeground(Color.white);
		create.setBorder(null);
		create.addActionListener(this);
		p1.add(create);		
		
		back=new JButton("Back");
		back.setBounds(220, 280, 100, 40);
		back.setBackground(Color.GRAY);
		back.setForeground(Color.white);
		back.setBorder(null);
		back.addActionListener(this);
		p1.add(back);		
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
		Image i2=i1.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel (i3);
		image.setBounds(480,20,450,300);
		add(image);
		
		
		
		
		
		
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == create) {
			String username=tfusername.getText();
			String name=tfname.getText();
			String mobile=tfmobile.getText();
			String gmail=tfgmail.getText();
			
			String query ="insert into account values('"+username+"','"+name+"','"+mobile+"','"+gmail+"')";
			try {
				Conn c=new Conn();
				c.s.executeUpdate(query);
				
				
				JOptionPane.showMessageDialog(null, "Account Createed Succesfully");
				setVisible(false);
				new Login();
			}catch(Exception e) {
				e.printStackTrace();
			}
					
		}else if (ae.getSource() == back){
			setVisible(false);
			new Login();
		}
		
	}

	public static void main(String[] args) {
		new SingUp();
		// TODO Auto-generated method stub

	}

}
