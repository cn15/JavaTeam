package Test2GD;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.print.DocFlavor.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class Test {
	
	static Test2 t2 = new Test2();
	static String cbm = "CBM STUDIO";
	static String user = "";
	static JFrame f = new JFrame();
	static JLabel hello = new JLabel("Hello! Do you want to play a game?");
	static JLabel user1 = new JLabel("Username: ");
	static JTextField user2 = new JTextField();
	static JButton play = new JButton("P L A Y !");
	static JButton quit = new JButton("Q U I T");

	Test() {
		hello.setBounds(135, 60, 300, 20);
		user1.setBounds(110, 150, 100, 20);
		user2.setBounds(190, 145, 200, 30);
		play.setBounds(70, 250, 160, 50);
		quit.setBounds(270, 250, 160, 50);
		f.add(hello);
		f.add(user1);
		f.add(user2);
		f.add(play);
		f.add(quit);
		f.setTitle(cbm);
		f.setLocation(350, 150);
		f.setSize(500, 350);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void pl() {
		play.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				user = user2.getText();
				//Bat buoc nhap User.
				if (user.equals("")) {
					hello.setText("  Nhap Username de bat dau choi!");
				} else {
					//Xac nhan
					int output = JOptionPane.showConfirmDialog(f, "Hello " + user + "! Click YES to continue.",
							"CBM Studio", JOptionPane.YES_NO_OPTION);

					if (output == JOptionPane.YES_OPTION) {
						//Chuyen giao dien.
						f.setVisible(false);
						Timer timer = new Timer();
						timer.schedule(new TimerTask() {
							@Override
							public void run() {
								
								t2.f.setVisible(true);
								t2.user.setText("   Player: " + user);
								//Thiet lap Title chuyen dong tu trai qua phai.
								for (int j = 0; j < 117; j++) {
									t2.cbm1[j] = "";
								}
								for (int i = 0; i < 117; i++) {
									try {
										Thread.sleep(200);
										t2.cbm1[116]="";
										if (i <= 25) {
											if (i > 0) {
												for (int j = i; j > 0; j--) {
													t2.cbm1[j] = t2.cbm1[j - 1];
												}
											}
											String a="";
											for(int j=116; j>i; j--){
												a=a+" ";
											}
											t2.cbm1[116]=a;
											t2.cbm1[0] = "" + t2.cbm.charAt(25 - i);
											t2.cbm2=t2.cbm1[0]+t2.cbm2;
											t2.cbm1[0]="";
										}
										else{
											for (int j = i; j > 0; j--) {
												t2.cbm1[j] = t2.cbm1[j - 1];
											}
											if(i<=92){
											String a="";
											for(int j=116; j>i; j--){
												a=a+" ";
											}
											t2.cbm1[116]=a;
											}
											if(i==26){
												t2.cbm1[0] = " ";
											}
											else{
												t2.cbm1[0] = " " + t2.cbm1[0];
											}
											if(i>92){
												String b="";
												for(int j=115; j>=i; j--){
													b=t2.cbm.charAt(j - i)+b;
												}
												t2.cbm2=b;
											}
											if(i==116){
												for (int j = 0; j < 117; j++) {
													t2.cbm1[j] = "";
												}
												t2.cbm2="";
												i=0;
												continue;
											}
										}
										t2.f.setTitle(t2.cbm1[0]+t2.cbm2+t2.cbm1[116]);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							}
						}, 1 * 300);
					} else if (output == JOptionPane.NO_OPTION) {
					}
				}
			}
		});
		quit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Thoat game
				int output = JOptionPane.showConfirmDialog(f, "Are you sure you want to exit?", "CBM Studio",
						JOptionPane.YES_NO_OPTION);

				if (output == JOptionPane.YES_OPTION) {
					System.exit(0);
				} else if (output == JOptionPane.NO_OPTION) {
				}
			}
		});
	}

	public static void main(String args[]) {
		new Test();
		pl();
		t2.play();
	}
}
