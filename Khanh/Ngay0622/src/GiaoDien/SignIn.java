package GiaoDien;

import javax.swing.*;
import java.awt.*;

public class SignIn {
	JFrame f;

	SignIn() {

		f = new JFrame();// Tao instance cua JFrame

		JFrame f = new JFrame();// Tao instance cua JFrame
		JLabel user = new JLabel("User");
		JLabel pass = new JLabel("Password");
		JLabel repass = new JLabel("Re_password");
		JLabel sex = new JLabel("Sex");
		JLabel male = new JLabel("Male");
		JLabel female = new JLabel("Female");
		JLabel nation = new JLabel("Nation");
		JRadioButton male1 = new JRadioButton();
		JRadioButton female1 = new JRadioButton();
		JTextField user1 = new JTextField();
		JPasswordField pass1 = new JPasswordField();
		JPasswordField pass2 = new JPasswordField();
		JButton b = new JButton("Cancel");// Tao instance cua JButton
		JButton c = new JButton("OK");
		b.setBackground(Color.RED);
		c.setBackground(Color.GREEN);
		String country[] = { "Choose one", "England", "Fap", "U.S.A", "Vietnam" };
		JComboBox nation1 = new JComboBox(country);
		sex.setBounds(50, 220, 30, 15);
		nation.setBounds(50, 280, 60, 15);
		nation1.setBounds(180, 272, 100, 34);
		male.setBounds(220, 220, 35, 15);
		male1.setBounds(180, 213, 30, 30);
		female.setBounds(350, 220, 50, 15);
		female1.setBounds(310, 213, 30, 30);
		user1.setBounds(150, 80, 250, 20);
		pass1.setBounds(150, 120, 250, 20);
		pass2.setBounds(150, 160, 250, 20);
		user.setBounds(50, 80, 100, 15);
		pass.setBounds(50, 120, 100, 15);
		repass.setBounds(50, 160, 150, 15);
		b.setBounds(100, 380, 150, 50);// truc x, truc y, do rong, chieu cao
		c.setBounds(350, 380, 150, 50);
		ButtonGroup bg = new ButtonGroup();
		bg.add(male1);
		bg.add(female1);
		f.add(b);// Them button vao trong JFrame
		f.add(c);
		f.add(user);
		f.add(pass);
		f.add(repass);
		f.add(user1);
		f.add(pass1);
		f.add(pass2);
		f.add(sex);
		f.add(male);
		f.add(female);
		f.add(male1);
		f.add(female1);
		f.add(nation);
		f.add(nation1);
		f.setSize(600, 500);// Do rong va chieu cao
		f.setLayout(null);// Khong su dung Layout Manager
		f.setVisible(true);// Tao Frame la co the nhin thay (visible)
		f.getContentPane().setBackground(Color.GRAY);
	}

	public static void main(String[] args) {

		new SignIn();
	}

}
