package Calcu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MT {
	static int i = 0;
	static int j = 0;
	static float a = 0;
	static float b = 0;
	static String a1 = "";
	static String b1 = "";
	JFrame f = new JFrame();
	static JPanel pn = new JPanel(new BorderLayout());
	static JLabel cc = new JLabel();
	static JLabel rs = new JLabel();
	static JButton n0 = new JButton("0");
	static JButton n00 = new JButton("00");
	static JButton n1 = new JButton("1");
	static JButton n2 = new JButton("2");
	static JButton n3 = new JButton("3");
	static JButton n4 = new JButton("4");
	static JButton n5 = new JButton("5");
	static JButton n6 = new JButton("6");
	static JButton n7 = new JButton("7");
	static JButton n8 = new JButton("8");
	static JButton n9 = new JButton("9");
	static JButton pl = new JButton("+");
	static JButton mn = new JButton("-");
	static JButton mt = new JButton("X");
	static JButton dv = new JButton("/");
	static JButton eq = new JButton("=");
	static JButton ac = new JButton("AC");
	static JButton dt = new JButton(".");

	MT() {
		pn.setBounds(5, 5, 300, 120);
		cc.setBounds(10, 20, 285, 30);
		rs.setBounds(10, 70, 285, 30);
		ac.setBounds(5, 130, 150, 60);
		dt.setBounds(155, 130, 75, 60);
		pl.setBounds(230, 130, 75, 60);
		n1.setBounds(5, 190, 75, 60);
		n2.setBounds(80, 190, 75, 60);
		n3.setBounds(155, 190, 75, 60);
		mn.setBounds(230, 190, 75, 60);
		n4.setBounds(5, 250, 75, 60);
		n5.setBounds(80, 250, 75, 60);
		n6.setBounds(155, 250, 75, 60);
		mt.setBounds(230, 250, 75, 60);
		n7.setBounds(5, 310, 75, 60);
		n8.setBounds(80, 310, 75, 60);
		n9.setBounds(155, 310, 75, 60);
		dv.setBounds(230, 310, 75, 60);
		n0.setBounds(5, 370, 75, 60);
		n00.setBounds(80, 370, 75, 60);
		eq.setBounds(155, 370, 150, 60);
		pn.add(cc);
		pn.add(rs);
		f.setSize(310, 455);
		f.add(pn);
		f.add(ac);
		f.add(dt);
		f.add(n0);
		f.add(n00);
		f.add(n1);
		f.add(n2);
		f.add(n3);
		f.add(n4);
		f.add(n5);
		f.add(n6);
		f.add(n7);
		f.add(n8);
		f.add(n9);
		f.add(pl);
		f.add(mn);
		f.add(mt);
		f.add(dv);
		f.add(eq);
		f.setLayout(null);
		f.setVisible(true);
		f.getContentPane().setBackground(Color.BLACK);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void play() {
		n0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i == 9) {
					a1 = "";
					i = 0;
				}
				cc.setText(a1 + "0");
				if (i > 0) {
					b1 = b1 + "0";
					if(j>0){
						a1=a1+".";
						cc.setText(a1+0);
						j=-1;
					}
				}
				a1 = a1 + "0";
			}

		});
		n00.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i == 9) {
					a1 = "";
					i = 0;
				}
				cc.setText(a1 + "00");
				if (i > 0) {
					b1 = b1 + "00";
					if(j>0){
						a1=a1+".";
					cc.setText(a1+00);
					j=-1;
					}
				}
				a1 = a1 + "00";
			}

		});
		n1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i == 9) {
					a1 = "";
					i = 0;
				}
				cc.setText(a1 + "1");
				if (i > 0) {
					b1 = b1 + "1";
					if(j>0){
						a1=a1+".";
						cc.setText(a1+1);
						j=-1;
					}
				}
				a1 = a1 + "1";
			}

		});
		n2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i == 9) {
					a1 = "";
					i = 0;
				}
				cc.setText(a1 + "2");
				if (i > 0) {
					b1 = b1 + "2";
					if(j>0){
						a1=a1+".";
						cc.setText(a1+2);
						j=-1;
					}
				}
				a1 = a1 + "2";
			}

		});
		n3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i == 9) {
					a1 = "";
					i = 0;
				}
				cc.setText(a1 + "3");
				if (i > 0) {
					b1 = b1 + "3";
					if(j>0){
						a1=a1+".";
						cc.setText(a1+3);
						j=-1;
					}
				}
				a1 = a1 + "3";
			}

		});
		n4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i == 9) {
					a1 = "";
					i = 0;
				}
				cc.setText(a1 + "4");
				if (i > 0) {
					b1 = b1 + "4";
					if(j>0){
						a1=a1+".";
						cc.setText(a1+4);
						j=-1;
					}
				}
				a1 = a1 + "4";
			}

		});
		n5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i == 9) {
					a1 = "";
					i = 0;
				}
				cc.setText(a1 + "5");
				if (i > 0) {
					b1 = b1 + "5";
					if(j>0){
						a1=a1+".";
						cc.setText(a1+5);
						j=-1;
					}
				}
				a1 = a1 + "5";
			}

		});
		n6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i == 9) {
					a1 = "";
					i = 0;
				}
				cc.setText(a1 + "6");
				if (i > 0) {
					b1 = b1 + "6";
					if(j>0){
						a1=a1+".";
						cc.setText(a1+6);
						j=-1;
					}
				}
				a1 = a1 + "6";
			}

		});
		n7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i == 9) {
					a1 = "";
					i = 0;
				}
				cc.setText(a1 + "7");
				if (i > 0) {
					b1 = b1 + "7";
					if(j>0){
						a1=a1+".";
						cc.setText(a1+7);
						j=-1;
					}
				}
				a1 = a1 + "7";
			}

		});
		n8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i == 9) {
					a1 = "";
					i = 0;
				}
				cc.setText(a1 + "8");
				if (i > 0) {
					b1 = b1 + "8";
					if(j>0){
						a1=a1+".";
						cc.setText(a1+8);
						j=-1;
					}
				}
				a1 = a1 + "8";
			}

		});
		n9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i == 9) {
					a1 = "";
					i = 0;
				}
				cc.setText(a1 + "9");
				if (i > 0) {
					b1 = b1 + "9";
					if(j>0){
						a1=a1+".";
						cc.setText(a1+9);
						j=-1;
					}
				}
				a1 = a1 + "9";
			}

		});
		// Clear
		ac.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				i = 0;
				j=0;
				a = 0;
				b = 0;
				a1 = "";
				b1 = "";
				cc.setText(a1);
				rs.setText("");
			}

		});
		// Bang
		eq.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i == 0) {
					rs.setText("" + a1);
					i = 9;
					j=0;
				} else if (i == 1) {
					b = Float.parseFloat(b1);
					rs.setText("" + (a + b));
					a1 = "" + (a + b);
					b1 = "";
					b = 0;
					i = 9;
					j=0;
				} else if (i == 2) {
					b = Float.parseFloat(b1);
					rs.setText("" + (a - b));
					a1 = "" + (a - b);
					b1 = "";
					b = 0;
					i = 9;
					j=0;
				} else if (i == 3) {
					b = Float.parseFloat(b1);
					rs.setText("" + (a * b));
					a1 = "" + (a * b);
					b1 = "";
					b = 0;
					i = 9;
					j=0;
				} else if (i == 4) {
					b = Float.parseFloat(b1);
					if (b == 0) {
						rs.setText("Error!");
						a1 = "";
						i = 0;
						b1 = "";
						b = 0;
						a = 0;
						j=0;
					} else {
						rs.setText("" + (a / b));
						a1 = "" + (a / b);
						b1 = "";
						b = 0;
						i = 9;
						j=0;
					}
				}
			}

		});
		// Cong
		pl.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if ((i == 0) || (i == 9)) {
					if (a1.equals("")) {

					} else {
						cc.setText(a1 + "+");
						a = Float.parseFloat(a1);
						i = 1;
						a1 = a1 + "+";
						j=0;
					}
				} else if (i == 1) {
					if (b1.equals("")) {

					} else {
						b = Float.parseFloat(b1);
						cc.setText((a + b) + "+");
						rs.setText("" + (a + b));
						a1 = "" + (a + b) + "+";
						b1 = "";
						a = a + b;
						b = 0;
						j=0;
					}
				} else if (((i == 4) || (i == 2) || (i == 3)) && (b1.equals(""))) {
					cc.setText(a + "+");
					i = 1;
					a1 = a + "+";
				} else if (i == 2) {
					b = Float.parseFloat(b1);
					cc.setText((a - b) + "+");
					rs.setText("" + (a - b));
					a1 = "" + (a - b) + "+";
					b1 = "";
					a = a - b;
					b = 0;
					i = 1;
					j=0;
				} else if (i == 3) {
					b = Float.parseFloat(b1);
					cc.setText((a * b) + "+");
					rs.setText("" + (a * b));
					a1 = "" + (a * b) + "+";
					b1 = "";
					a = a * b;
					b = 0;
					i = 1;
					j=0;
				} else if (i == 4) {
					b = Float.parseFloat(b1);
					if ((b > 0) || (b < 0)) {
						cc.setText((a / b) + "+");
						rs.setText("" + (a / b));
						a1 = "" + (a / b) + "+";
						b1 = "";
						a = a / b;
						b = 0;
						i = 1;
						j=0;
					}
				}
			}

		});
		// Tru
		mn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if ((i == 0) || (i == 9)) {
					if (a1.equals("")) {

					} else {
						cc.setText(a1 + "-");
						a = Float.parseFloat(a1);
						i = 2;
						a1 = a1 + "-";
						j=0;
					}
				} else if (i == 2) {
					if (b1.equals("")) {

					} else {
						b = Float.parseFloat(b1);
						cc.setText((a - b) + "-");
						rs.setText("" + (a - b));
						a1 = "" + (a - b) + "-";
						b1 = "";
						a = a - b;
						b = 0;
						j=0;
					}
				} else if (((i == 1) || (i == 4) || (i == 3)) && (b1.equals(""))) {
					cc.setText(a + "-");
					i = 2;
					a1 = a + "-";
				} else if (i == 1) {
					b = Float.parseFloat(b1);
					cc.setText((a + b) + "-");
					rs.setText("" + (a + b));
					a1 = "" + (a + b) + "-";
					b1 = "";
					a = a + b;
					b = 0;
					i = 2;
					j=0;
				} else if (i == 3) {
					b = Float.parseFloat(b1);
					cc.setText((a * b) + "-");
					rs.setText("" + (a * b));
					a1 = "" + (a * b) + "-";
					b1 = "";
					a = a * b;
					b = 0;
					i = 2;
					j=0;
				} else if (i == 4) {
					b = Float.parseFloat(b1);
					if ((b > 0) || (b < 0)) {
						cc.setText((a / b) + "-");
						rs.setText("" + (a / b));
						a1 = "" + (a / b) + "-";
						b1 = "";
						a = a / b;
						b = 0;
						i = 2;
						j=0;
					}
				}
			}

		});
		// Nhan
		mt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if ((i == 0) || (i == 9)) {
					if (a1.equals("")) {

					} else {
						cc.setText(a1 + "x");
						a = Float.parseFloat(a1);
						i = 3;
						a1 = a1 + "x";
						j=0;
					}
				} else if (i == 3) {
					if (b1.equals("")) {

					} else {
						b = Float.parseFloat(b1);
						cc.setText((a * b) + "x");
						rs.setText("" + (a * b));
						a1 = "" + (a * b) + "x";
						b1 = "";
						a = a * b;
						b = 0;
						j=0;
					}
				} else if (((i == 1) || (i == 4) || (i == 2)) && (b1.equals(""))) {
					cc.setText(a + "x");
					i = 3;
					a1 = a + "x";
				} else if (i == 1) {
					b = Float.parseFloat(b1);
					cc.setText((a + b) + "x");
					rs.setText("" + (a + b));
					a1 = "" + (a + b) + "x";
					b1 = "";
					a = a + b;
					b = 0;
					i = 3;
					j=0;
				} else if (i == 2) {
					b = Float.parseFloat(b1);
					cc.setText((a - b) + "x");
					rs.setText("" + (a - b));
					a1 = "" + (a - b) + "x";
					b1 = "";
					a = a - b;
					b = 0;
					i = 3;
					j=0;
				} else if (i == 4) {
					b = Float.parseFloat(b1);
					if ((b > 0) || (b < 0)) {
						cc.setText((a / b) + "x");
						rs.setText("" + (a / b));
						a1 = "" + (a / b) + "x";
						b1 = "";
						a = a / b;
						b = 0;
						i = 3;
						j=0;
					}
				}

			}

		});
		// Chia
		dv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if ((i == 0) || (i == 9)) {
					if (a1.equals("")) {

					} else {
						cc.setText(a1 + "/");
						a = Float.parseFloat(a1);
						i = 4;
						a1 = a1 + "/";
						j = 0;
					}
				} else if (i == 4) {
					if (b1.equals("")) {

					} else {
						b = Float.parseFloat(b1);
						if ((b < 0) || (b > 0)) {
							cc.setText((a / b) + "/");
							a1 = "" + (a / b) + "/";
							rs.setText("" + (a / b));
							b1 = "";
							a = a / b;
							b = 0;
							j = 0;
						}
					}
				} else if (((i == 1) || (i == 4) || (i == 2)) && (b1.equals(""))) {
					cc.setText(a + "/");
					i = 4;
					a1 = a + "/";
					j = 0;
				} else if (i == 1) {
					b = Float.parseFloat(b1);
					cc.setText((a + b) + "/");
					a1 = "" + (a + b) + "/";
					rs.setText("" + (a + b));
					b1 = "";
					a = a + b;
					b = 0;
					i = 4;
					j = 0;
				} else if (i == 2) {
					b = Float.parseFloat(b1);
					cc.setText((a - b) + "/");
					a1 = "" + (a - b) + "/";
					rs.setText("" + (a - b));
					b1 = "";
					a = a - b;
					b = 0;
					i = 4;
					j = 0;
				} else if (i == 3) {
					b = Float.parseFloat(b1);
					cc.setText((a * b) + "/");
					a1 = "" + (a * b) + "/";
					rs.setText("" + (a * b));
					b1 = "";
					a = a * b;
					b = 0;
					i = 4;
					j = 0;
				}
			}
		});
		// Cham
		dt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (j == 0) {
					if ((i == 9) || (a1.equals(""))) {
						i = 0;
						a1 = "0.";
						cc.setText(a1);
						j++;
					} else if (i == 0) {
						a1 = a1 + ".";
						cc.setText(a1);
						j++;
					} else if (b1.equals("")) {
						b1 = "0.";
						cc.setText(a1 + b1);
						j++;
					}
					else if(i>0){
						b1 = b1 +".";
						cc.setText(a1+".");
						j++;
					}
					else {
						b1 = b1 + ".";
						cc.setText(a1 + b1);
						j++;
					}
				}
			}

		});
	}

	public static void main(String args[]) {
		new MT();
		play();
	}
}
