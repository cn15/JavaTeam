package BauCuaTomCa;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

import javax.swing.*;

public class GiaoDien {
	static int i = 0;
	JFrame f = new JFrame();
	static JButton chonBau = new JButton();
	static JButton chonCua = new JButton();
	static JButton chonTom = new JButton();
	static JButton chonCa = new JButton();
	static JButton chonNai = new JButton();
	static JButton chonGa = new JButton();
	static JButton anhResult = new JButton();
	static JLabel diemBau = new JLabel("Bau");
	static JLabel diemCua = new JLabel("Cua");
	static JLabel diemTom = new JLabel("Tom");
	static JLabel diemCa = new JLabel("Ca");
	static JLabel diemNai = new JLabel("Nai");
	static JLabel diemGa = new JLabel("Ga");
	static JButton play = new JButton("Play");
	static JButton confirm = new JButton("Confirm");
	static JButton reset = new JButton("Reset");
	static JLabel player1 = new JLabel("Player 1: ");
	static JLabel player2 = new JLabel("Player 2: ");
	static JLabel player3 = new JLabel("Player 3: ");
	static JLabel player4 = new JLabel("Player 4: ");
	static JLabel result = new JLabel("Choi di cac be.");
	static ImageIcon fa = new ImageIcon("FA.jpg");
	static ImageIcon playgame = new ImageIcon("playgame.jpg");
	static ImageIcon rsBau1 = new ImageIcon("Bau.jpg");
	static ImageIcon rsCua1 = new ImageIcon("Cua.jpg");
	static ImageIcon rsTom1 = new ImageIcon("Tom.jpg");
	static ImageIcon rsCa1 = new ImageIcon("Ca.jpg");
	static ImageIcon rsNai1 = new ImageIcon("Nai.jpg");
	static ImageIcon rsGa1 = new ImageIcon("Ga.jpg");

	GiaoDien() {
		ImageIcon chonBau1 = new ImageIcon("Bau1.png");
		ImageIcon chonCua1 = new ImageIcon("Cua1.png");
		ImageIcon chonTom1 = new ImageIcon("Tom1.png");
		ImageIcon chonCa1 = new ImageIcon("Ca1.png");
		ImageIcon chonNai1 = new ImageIcon("Nai1.png");
		ImageIcon chonGa1 = new ImageIcon("Ga1.jpg");
		ImageIcon rsBau1 = new ImageIcon("Bau.jpg");
		ImageIcon rsCua1 = new ImageIcon("Cua.jpg");
		ImageIcon rsTom1 = new ImageIcon("Tom.jpg");
		ImageIcon rsCa1 = new ImageIcon("Ca.jpg");
		ImageIcon rsNai1 = new ImageIcon("Nai.jpg");
		ImageIcon rsGa1 = new ImageIcon("Ga.jpg");
		chonBau.setIcon(chonBau1);
		chonCua.setIcon(chonCua1);
		chonTom.setIcon(chonTom1);
		chonCa.setIcon(chonCa1);
		chonNai.setIcon(chonNai1);
		chonGa.setIcon(chonGa1);
		chonBau.setBounds(25, 350, 155, 155);
		chonCua.setBounds(225, 350, 155, 155);
		chonTom.setBounds(425, 350, 155, 155);
		chonCa.setBounds(625, 350, 155, 155);
		chonNai.setBounds(825, 350, 155, 155);
		chonGa.setBounds(1025, 350, 155, 155);
		anhResult.setBounds(50, 20, 400, 300);
		diemBau.setBounds(75, 520, 80, 20);
		diemCua.setBounds(275, 520, 80, 20);
		diemTom.setBounds(475, 520, 80, 20);
		diemCa.setBounds(675, 520, 80, 20);
		diemNai.setBounds(875, 520, 80, 20);
		diemGa.setBounds(1075, 520, 80, 20);
		player1.setBounds(500, 20, 400, 20);
		player2.setBounds(500, 70, 400, 20);
		player3.setBounds(500, 120, 400, 20);
		player4.setBounds(500, 170, 400, 20);
		result.setBounds(550, 220, 400, 30);
		play.setBounds(475, 285, 200, 40);
		play.setEnabled(false);
		confirm.setBounds(725, 285, 200, 40);
		reset.setBounds(975, 285, 200, 40);
		chonBau.setBackground(Color.RED);
		chonCua.setBackground(Color.GREEN);
		chonTom.setBackground(Color.YELLOW);
		chonCa.setBackground(Color.CYAN);
		chonNai.setBackground(Color.BLUE);
		chonGa.setBackground(Color.MAGENTA);
		chonBau.setOpaque(true);
		chonCua.setOpaque(true);
		chonTom.setOpaque(true);
		chonCa.setOpaque(true);
		chonNai.setOpaque(true);
		chonGa.setOpaque(true);
		f.add(chonBau);
		f.add(chonCua);
		f.add(chonTom);
		f.add(chonCa);
		f.add(chonNai);
		f.add(chonGa);
		f.add(anhResult);
		f.add(diemBau);
		f.add(diemCua);
		f.add(diemTom);
		f.add(diemCa);
		f.add(diemNai);
		f.add(diemGa);
		f.add(player1);
		f.add(player2);
		f.add(player3);
		f.add(player4);
		f.add(result);
		f.add(play);
		f.add(confirm);
		f.add(reset);
		f.setSize(1200, 600);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void play(int sl, int coin[]) {
		int bet[][] = new int[sl][6];
		int rs[] = new int[sl];
		String c[] = new String[6];
		for (int j = 0; j < sl; j++) {
			rs[j] = coin[j];
			for (int j1 = 0; j1 < 6; j1++) {
				bet[j][j1] = 0;
				c[j1] = "";
			}
		}
		if (sl == 1) {
			anhResult.setIcon(fa);
		} else {
			anhResult.setIcon(playgame);
		}
		if (sl < 4) {
			player4.setVisible(false);
			if (sl < 3) {
				player3.setVisible(false);
				if (sl < 2) {
					player2.setVisible(false);
					confirm.setEnabled(false);
					player1.setText("Player 1: " + coin[0] + " coin ");
				} else {
					player1.setText("Player 1: " + coin[0] + " coin ");
					player2.setText("Player 2: " + coin[1] + " coin ");
				}
			} else {
				player1.setText("Player 1: " + coin[0] + " coin ");
				player2.setText("Player 2: " + coin[1] + " coin ");
				player3.setText("Player 3: " + coin[2] + " coin ");
			}
		} else {
			player1.setText("Player 1: " + coin[0] + " coin ");
			player2.setText("Player 2: " + coin[1] + " coin ");
			player3.setText("Player 3: " + coin[2] + " coin ");
			player4.setText("Player 4: " + coin[3] + " coin ");
		}
		play.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random rd = new Random();
				for(int j=0; j<6; j++){
					if(j==0){
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				int k = rd.nextInt(6);
				String rs1;
				reset.setEnabled(false);
				play.setEnabled(false);
				confirm.setEnabled(true);
				if (k == 0) {
					anhResult.setIcon(rsBau1);
					result.setText("Dinh bau roi!");
					for (int j = 0; j < sl; j++) {
						if (bet[j][0] > 0) {
							coin[j] = coin[j] + (bet[j][0] * 5);
						}
					}
				} else if (k == 1) {
					anhResult.setIcon(rsCua1);
					result.setText("Moc cua roi!");
					for (int j = 0; j < sl; j++) {
						if (bet[j][1] > 0) {
							coin[j] = coin[j] + (bet[j][1] * 5);
						}
					}
				} else if (k == 2) {
					anhResult.setIcon(rsTom1);
					result.setText("My tom roi!");
					for (int j = 0; j < sl; j++) {
						if (bet[j][2] > 0) {
							coin[j] = coin[j] + (bet[j][2] * 5);
						}
					}
				} else if (k == 3) {
					anhResult.setIcon(rsCa1);
					result.setText("Tao chon ca! :v");
					for (int j = 0; j < sl; j++) {
						if (bet[j][3] > 0) {
							coin[j] = coin[j] + (bet[j][3] * 5);
						}
					}
				} else if (k == 4) {
					anhResult.setIcon(rsNai1);
					result.setText("Naiiiii :v");
					for (int j = 0; j < sl; j++) {
						if (bet[j][4] > 0) {
							coin[j] = coin[j] + (bet[j][4] * 5);
						}
					}
				} else if (k == 5) {
					anhResult.setIcon(rsGa1);
					result.setText("Ga vcc =))");
					for (int j = 0; j < sl; j++) {
						if (bet[j][5] > 0) {
							coin[j] = coin[j] + (bet[j][5] * 5);
						}
					}
				}
				for(int j=0; j<sl; j++){
					rs[j]=coin[j];
					for(int j1=0; j1<6; j1++){
						bet[j][j1]=0;
						c[j1]="";
					}
				}
				if(coin[0]>0){
				player1.setText("Player 1: " + coin[0] + " coin ");
				}
				else{
					player1.setText("Thang nay pha san roi.");
				}
				if(sl>1){
					if(coin[1]>0){
				player2.setText("Player 2: " + coin[1] + " coin ");
				}
					else{
						player2.setText("Thang nay pha san roi.");
					}
				}
				if(sl>2){
					if(coin[2]>0){
				player3.setText("Player 3: " + coin[2] + " coin ");
					}
					else{
						player3.setText("Thang nay pha san roi.");
					}
				}
				if(sl>3){
					if(coin[3]>0){
				player4.setText("Player 4: " + coin[3] + " coin ");
					}
					else{
						player4.setText("Thang nay pha san roi.");
					}
				}
				chonBau.setEnabled(false);
				chonCua.setEnabled(false);
				chonTom.setEnabled(false);
				chonCa.setEnabled(false);
				chonNai.setEnabled(false);
				chonGa.setEnabled(false);
				i=-1;
			}

		});
		confirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(i<0){
					result.setText("Dung roi, choi tiep di.");
					anhResult.setIcon(fa);
					i++;
					if(coin[i]==0){
						result.setText("Thang Player "+(i+1)+" het coin roi em oi.");
						chonBau.setEnabled(false);
						chonCua.setEnabled(false);
						chonTom.setEnabled(false);
						chonCa.setEnabled(false);
						chonNai.setEnabled(false);
						chonGa.setEnabled(false);
					}
					else{
					chonBau.setEnabled(true);
					chonCua.setEnabled(true);
					chonTom.setEnabled(true);
					chonCa.setEnabled(true);
					chonNai.setEnabled(true);
					chonGa.setEnabled(true);
					}
				}
			else if (i < sl - 1) {
					i++;
					for (int j = 0; j < 6; j++) {
						c[j] = "";
					}
					if(coin[i]==0){
						result.setText("Thang Player "+(i+1)+" het coin roi em oi.");
						chonBau.setEnabled(false);
						chonCua.setEnabled(false);
						chonTom.setEnabled(false);
						chonCa.setEnabled(false);
						chonNai.setEnabled(false);
						chonGa.setEnabled(false);
					}
					else{
						chonBau.setEnabled(true);
						chonCua.setEnabled(true);
						chonTom.setEnabled(true);
						chonCa.setEnabled(true);
						chonNai.setEnabled(true);
						chonGa.setEnabled(true);
						}
				}
				if (i == sl - 1) {
					confirm.setEnabled(false);
					if(coin[i]==0){
						result.setText("Thang Player "+(i+1)+" het coin roi em oi.");
						chonBau.setEnabled(false);
						chonCua.setEnabled(false);
						chonTom.setEnabled(false);
						chonCa.setEnabled(false);
						chonNai.setEnabled(false);
						chonGa.setEnabled(false);
					}
					else{
						chonBau.setEnabled(true);
						chonCua.setEnabled(true);
						chonTom.setEnabled(true);
						chonCa.setEnabled(true);
						chonNai.setEnabled(true);
						chonGa.setEnabled(true);
						}
				}
			}
		});
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int j = 0; j < 6; j++) {
					bet[i][j] = 0;
				}
				coin[i] = rs[i];
				for (int j = 0; j < 6; j++) {
					c[j] = "";
				}
				if (i == 0) {
					player1.setText("Player 1: " + coin[i] + " coin ");
				} else if (i == 1) {
					player2.setText("Player 2: " + coin[i] + " coin ");
				} else if (i == 2) {
					player3.setText("Player 3: " + coin[i] + " coin ");
				} else if (i == 3) {
					player4.setText("Player 4: " + coin[i] + " coin ");
				}
				reset.setEnabled(false);
				play.setEnabled(false);
			}

		});
		chonBau.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (coin[i] > 0) {
					bet[i][0]++;
					coin[i]--;
					c[0] = " Bau " + bet[i][0] + " ";
					reset.setEnabled(true);
					if (i == 0) {
						player1.setText("Player 1: " + coin[0] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 1) {
						player2.setText("Player 2: " + coin[1] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 2) {
						player3.setText("Player 3: " + coin[2] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 3) {
						player4.setText("Player 4: " + coin[3] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					}
					if (i == sl - 1) {
						play.setEnabled(true);
					}
				}
			}

		});
		chonCua.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (coin[i] > 0) {
					bet[i][1]++;
					coin[i]--;
					c[1] = "  Cua " + bet[i][1] + " ";
					reset.setEnabled(true);
					if (i == 0) {
						player1.setText("Player 1: " + coin[0] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 1) {
						player2.setText("Player 2: " + coin[1] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 2) {
						player3.setText("Player 3: " + coin[2] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 3) {
						player4.setText("Player 4: " + coin[3] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					}
					if (i == sl - 1) {
						play.setEnabled(true);
					}
				}

			}

		});
		chonTom.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (coin[i] > 0) {
					bet[i][2]++;
					coin[i]--;
					c[2] = "  Tom " + bet[i][2] + " ";
					reset.setEnabled(true);
					if (i == 0) {
						player1.setText("Player 1: " + coin[0] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 1) {
						player2.setText("Player 2: " + coin[1] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 2) {
						player3.setText("Player 3: " + coin[2] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 3) {
						player4.setText("Player 4: " + coin[3] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					}
					if (i == sl - 1) {
						play.setEnabled(true);
					}
				}

			}

		});
		chonCa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (coin[i] > 0) {
					bet[i][3]++;
					coin[i]--;
					c[3] = "  Ca " + bet[i][3] + " ";
					reset.setEnabled(true);
					if (i == 0) {
						player1.setText("Player 1: " + coin[0] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 1) {
						player2.setText("Player 2: " + coin[1] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 2) {
						player3.setText("Player 3: " + coin[2] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 3) {
						player4.setText("Player 4: " + coin[3] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					}
					if (i == sl - 1) {
						play.setEnabled(true);
					}
				}

			}

		});
		chonNai.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (coin[i] > 0) {
					bet[i][4]++;
					coin[i]--;
					c[4] = "  Nai " + bet[i][4] + " ";
					reset.setEnabled(true);
					if (i == 0) {
						player1.setText("Player 1: " + coin[0] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 1) {
						player2.setText("Player 2: " + coin[1] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 2) {
						player3.setText("Player 3: " + coin[2] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 3) {
						player4.setText("Player 4: " + coin[3] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					}
					if (i == sl - 1) {
						play.setEnabled(true);
					}
				}
			}

		});
		chonGa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (coin[i] > 0) {
					bet[i][5]++;
					coin[i]--;
					c[5] = "  Ga " + bet[i][5] + " ";
					reset.setEnabled(true);
					if (i == 0) {
						player1.setText("Player 1: " + coin[0] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 1) {
						player2.setText("Player 2: " + coin[1] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 2) {
						player3.setText("Player 3: " + coin[2] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					} else if (i == 3) {
						player4.setText("Player 4: " + coin[3] + " coin " + c[0] + c[1] + c[2] + c[3] + c[4] + c[5]);
					}
					if (i == sl - 1) {
						play.setEnabled(true);
					}
				}

			}

		});
	}

	public static void main(String args[]) {
		int sl = 0;
		BufferedReader iK = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("\nNhap so nguoi choi (Toi da 4): ");
			String sll = iK.readLine();
			sl = Integer.parseInt(sll);
			if (sl > 4) {
				sl = 4;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		int coin[] = new int[sl];
		try {
			for (int i = 0; i < sl; i++) {
				System.out.print("\nNhap so coin nguoi choi so " + (i + 1) + ": ");
				String coinn1 = iK.readLine();
				int coinn = Integer.parseInt(coinn1);
				coin[i] = coinn;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		new GiaoDien();
		play(sl, coin);
	}
}
