package Jackpot;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Play {
	static int i = 0;
	static int c = 10;
	JFrame f = new JFrame();
	static ImageIcon jp1 = new ImageIcon("jp.jpg");
	static ImageIcon df = new ImageIcon("df.jpeg");
	static ImageIcon no1 = new ImageIcon("no1.jpg");
	static ImageIcon no2 = new ImageIcon("no2.jpg");
	static ImageIcon no3 = new ImageIcon("no3.png");
	static ImageIcon no4 = new ImageIcon("no4.png");
	static ImageIcon no5 = new ImageIcon("no5.png");
	static ImageIcon no6 = new ImageIcon("no6.png");
	static ImageIcon no7 = new ImageIcon("no7.jpg");
	static ImageIcon no8 = new ImageIcon("no8.jpg");
	static ImageIcon no9 = new ImageIcon("no9.jpg");
	static ImageIcon star = new ImageIcon("star.jpg");
	static ImageIcon minus = new ImageIcon("minus.png");
	static JButton jp = new JButton();
	static JButton play = new JButton("S P I N");
	static JLabel result = new JLabel("            CHƠI ĐI ANH LO");
	static JLabel result2 = new JLabel("");
	static JLabel coin = new JLabel("  |> > >| YOUR COIN: " + c + " |< < <|");
	static JButton j1 = new JButton();
	static JButton j2 = new JButton();
	static JButton j3 = new JButton();

	Play() {
		jp.setIcon(jp1);
		jp.setBounds(0, 0, 600, 195);
		j1.setIcon(df);
		j2.setIcon(df);
		j3.setIcon(df);
		j1.setBounds(50, 200, 155, 155);
		j2.setBounds(225, 200, 155, 155);
		j3.setBounds(400, 200, 155, 155);
		j1.setBackground(Color.YELLOW);
		j2.setBackground(Color.PINK);
		j3.setBackground(Color.RED);
		j1.setOpaque(true);
		j2.setOpaque(true);
		j3.setOpaque(true);
		result.setBounds(200, 380, 300, 30);
		result.setForeground(Color.GREEN);
		result2.setBounds(200, 410, 300, 30);
		result2.setForeground(Color.WHITE);
		coin.setBounds(196, 460, 250, 30);
		coin.setForeground(Color.MAGENTA);
		play.setBounds(220, 530, 160, 50);
		play.setBackground(Color.RED);
		play.setForeground(Color.BLUE);
		play.setOpaque(true);
		f.add(jp);
		f.add(j1);
		f.add(j2);
		f.add(j3);
		f.add(result);
		f.add(result2);
		f.add(coin);
		f.add(play);
		f.setSize(600, 650);
		f.setLayout(null);
		f.setVisible(true);
		f.getContentPane().setBackground(Color.BLACK);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void spin() {
		play.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i == 0) {
					c--;
					Random rd = new Random();
					// Jack 1
					int k1 = rd.nextInt(11);
					if (k1 == 0) {
						j1.setIcon(no1);
					} else if (k1 == 1) {
						j1.setIcon(no2);
					} else if (k1 == 2) {
						j1.setIcon(no3);
					} else if (k1 == 3) {
						j1.setIcon(no4);
					} else if (k1 == 4) {
						j1.setIcon(no5);
					} else if (k1 == 5) {
						j1.setIcon(no6);
					} else if (k1 == 6) {
						j1.setIcon(no7);
					} else if (k1 == 7) {
						j1.setIcon(no8);
					} else if (k1 == 8) {
						j1.setIcon(no9);
					} else if (k1 == 9) {
						j1.setIcon(star);
					} else if (k1 == 10) {
						j1.setIcon(minus);
					}
					// Jack 2
					int k2 = rd.nextInt(11);
					if (k2 == 0) {
						j2.setIcon(no1);
					} else if (k2 == 1) {
						j2.setIcon(no2);
					} else if (k2 == 2) {
						j2.setIcon(no3);
					} else if (k2 == 3) {
						j2.setIcon(no4);
					} else if (k2 == 4) {
						j2.setIcon(no5);
					} else if (k2 == 5) {
						j2.setIcon(no6);
					} else if (k2 == 6) {
						j2.setIcon(no7);
					} else if (k2 == 7) {
						j2.setIcon(no8);
					} else if (k2 == 8) {
						j2.setIcon(no9);
					} else if (k2 == 9) {
						j2.setIcon(star);
					} else if (k2 == 10) {
						j2.setIcon(minus);
					}
					// Jack 3
					int k3 = rd.nextInt(11);
					if (k3 == 0) {
						j3.setIcon(no1);
					} else if (k3 == 1) {
						j3.setIcon(no2);
					} else if (k3 == 2) {
						j3.setIcon(no3);
					} else if (k3 == 3) {
						j3.setIcon(no4);
					} else if (k3 == 4) {
						j3.setIcon(no5);
					} else if (k3 == 5) {
						j3.setIcon(no6);
					} else if (k3 == 6) {
						j3.setIcon(no7);
					} else if (k3 == 7) {
						j3.setIcon(no8);
					} else if (k3 == 8) {
						j3.setIcon(no9);
					} else if (k3 == 9) {
						j3.setIcon(star);
					} else if (k3 == 10) {
						j3.setIcon(minus);
					}
					if ((k1 == 6) && (k2 == 6) && (k3 == 6)) {
						j1.setBackground(Color.GREEN);
						j2.setBackground(Color.GREEN);
						j3.setBackground(Color.GREEN);
						result.setText("      TRIPPLE JACKPOT 777!");
						result2.setText("                +500 coin!");
						c = c + 501;
					} else if ((k1 == 10) && (k2 == 10) && (k3 == 10)) {
						j1.setBackground(Color.RED);
						j2.setBackground(Color.RED);
						j3.setBackground(Color.RED);
						result.setText("   XIN LỖI, BẠN ĐEN VL =))");
						result2.setText("                 -100 coin.");
						if (c >= 99) {
							c = c - 99;
						} else {
							c = 0;
						}
					} else if ((k1 == 9) && (k2 == 9) && (k3 == 9)) {
						j1.setBackground(Color.BLUE);
						j2.setBackground(Color.BLUE);
						j3.setBackground(Color.BLUE);
						result.setText("  PHÁT HIỆN NGHI VẤN HACK!");
						result2.setText("                +100 coin.");
						c = c + 101;
					} else if ((k1 == k2) && (k1 == k3)) {
						j1.setBackground(Color.PINK);
						j2.setBackground(Color.PINK);
						j3.setBackground(Color.PINK);
						result.setText("   CHÚC MỪNG! BẠN HÊN VCC!");
						result2.setText("                 +30 coin.");
						c = c + 31;
					} else if (((k1 == k2) && (k1 == 9)) || ((k1 == k3) && (k1 == 9)) || ((k2 == k3) && (k2 == 9))) {
						j1.setBackground(Color.YELLOW);
						j2.setBackground(Color.YELLOW);
						j3.setBackground(Color.YELLOW);
						result.setText("      BẠN MAY MẮN VC LUÔN!");
						result2.setText("                 +10 coin.");
						c = c + 11;
					} else if (((k1 == k2) && (k1 == 10)) || ((k1 == k3) && (k1 == 10)) || ((k2 == k3) && (k2 == 10))) {
						j1.setBackground(Color.ORANGE);
						j2.setBackground(Color.ORANGE);
						j3.setBackground(Color.ORANGE);
						result.setText("     XIN LỖI ĐỜI QUÁ ĐEN! :'(");
						result2.setText("                  -10 coin.");
						if (c > 9) {
							c = c - 9;
						} else {
							c = 0;
						}
					} else if ((k1 == k2) || (k1 == k3) || (k2 == k3)) {
						j1.setBackground(Color.CYAN);
						j2.setBackground(Color.CYAN);
						j3.setBackground(Color.CYAN);
						result.setText("CHÚC MỪNG BẠN TRÚNG 2 NHÁY!");
						result2.setText("                  +2 coin.");
						c = c + 3;
					} else {
						result.setText(" CHÚC BẠN MAY MẮN LẦN SAU!");
						result2.setText("                  -1 coin.");
					}
					coin.setText("  |> > >| YOUR COIN: " + c + " |< < <|");
					if (c > 0) {
						play.setText("TRY AGAIN!");
					} else {
						result.setText("                GAME OVER!");
						result2.setText("        Insert coin to continue");
						play.setText("PLAY");
						play.setBackground(null);
						play.setEnabled(false);
					}
					i = 1;
				} else {
					j1.setBackground(Color.YELLOW);
					j2.setBackground(Color.PINK);
					j3.setBackground(Color.RED);
					result.setText("        KHÔ MÁU LUÔN EM ƠI!");
					result2.setText("");
					play.setText("S P I N");
					j1.setIcon(df);
					j2.setIcon(df);
					j3.setIcon(df);
					i = 0;
				}
			}

		});
	}

	public static void main(String args[]) {
		new Play();
		spin();
	}
}