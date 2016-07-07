package GiaoDien;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ChangeColour {
	static JFrame f=new JFrame();
	static int a = 0;
	static int a1 = 10;
	static String b = " Choi di em oi!";
	static JButton change = new JButton("Change");
	JLabel mark = new JLabel("Mark:");
	static JLabel numMark = new JLabel(" " + a);
	static JLabel numRemain = new JLabel(" " + a1);
	static JLabel result = new JLabel("" + b);
	static ImageIcon icon = new ImageIcon("default.png");
	static ImageIcon icon2 = new ImageIcon("Green.png");
	static ImageIcon icon3 = new ImageIcon("Solid_red.png");
	static JButton img = new JButton();
	static JButton reset = new JButton("Reset");
	static JButton quit = new JButton("Quit");
	ChangeColour() {
		JLabel remain = new JLabel("Remain:");
		mark.setForeground(Color.RED);
		mark.setBounds(400, 100, 40, 20);
		numMark.setForeground(Color.GREEN);
		numMark.setBounds(435, 100, 40, 20);
		remain.setBounds(400, 130, 60, 20);
		numRemain.setBounds(450, 130, 30, 20);
		result.setForeground(Color.BLUE);
		result.setBounds(120, 280, 200, 20);
		change.setBounds(60, 350, 120, 40);
		reset.setBounds(240, 350, 120, 40);
		quit.setBounds(420, 350, 120, 40);
		img.setBounds(70, 50, 200, 200);
		img.setIcon(icon);
		img.setOpaque(true);
		f.add(mark);
		f.add(numMark);
		f.add(result);
		f.add(change);
		f.add(reset);
		f.add(quit);
		f.add(img);
		f.add(remain);
		f.add(numRemain);
		f.setSize(600, 450);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void play() {
		change.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if ((a1 > 0) && (a < 3)) {
					Random rd = new Random();
					int k = rd.nextInt(2);
					a1--;
					if(a1==0){
						change.setEnabled(false);
					}
					if (k == 0) {
						a++;
						img.setIcon(icon2);
					} else if (k == 1) {
						a--;
						img.setIcon(icon3);
					}
					if (a == 3) {
						b = "Win cmmr!";
						numMark.setText(" " + a);
						change.setEnabled(false);
					} else if (a >= 0) {
						b = "Dung roi, choi di!";

						numMark.setText(" " + a);
					} else if (a < 0) {
						a = 0;
						numMark.setText(" " + a);
					}
					numRemain.setText(" " + a1);
					result.setText(" " + b);
					if ((a1 == 0) && (a < 3)) {
						b = "Ban thua me no roi!";
						result.setText(" " + b);
					}
				}
			}

		});
		reset.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				a1=10;
				a=0;
				img.setIcon(icon);
				b=" Choi di em oi!";
				numMark.setText(" "+a);
				numRemain.setText(" "+a1);
				result.setText(""+b);
				change.setEnabled(true);
			}
			
		});
		quit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
	}

	public static void main(String args[]) {
		new ChangeColour();
		play();
	}
}