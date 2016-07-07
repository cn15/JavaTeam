package Test2GD;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class Test2 {
	static int a[] = new int[10];
	static int b;
	static int c;
	static int diem = 0;
	static int diem2 = 0;
	static String cbm = "Mini game from CBM STUDIO ";
	static JFrame f = new JFrame();
	static JPanel sc = new JPanel();
	static Hinh h = new Hinh();
	static JPanel rs = h;
	static JRadioButton hv = new JRadioButton("Hình vuông");
	static JRadioButton hcn = new JRadioButton("Hình chữ nhật");
	static JRadioButton htg = new JRadioButton("Hình tam giác");
	static JRadioButton ht = new JRadioButton("Hình tròn");
	static JLabel user = new JLabel();
	static JLabel score = new JLabel("   Score: 0");
	static JLabel hscore = new JLabel("   High score: 0");
	static JLabel result = new JLabel("Bấm PLAY để bắt đầu chơi.");
	static JLabel time = new JLabel("              Time");
	static JProgressBar time2 = new JProgressBar(0, 100);
	static JButton play2 = new JButton("P L A Y");
	static JButton play3 = new JButton("O K");
	static ButtonGroup group = new ButtonGroup();
	static String[] cbm1 = new String[117];
	static String cbm2 = "";
	Test2() {
		rs.setBounds(50, 20, 248, 150);
		rs.setBackground(Color.WHITE);
		result.setBounds(90, 195, 200, 20);
		hv.setBounds(35, 240, 160, 20);
		hv.setVisible(false);
		hcn.setBounds(35, 285, 160, 20);
		hcn.setVisible(false);
		htg.setBounds(200, 240, 160, 20);
		htg.setVisible(false);
		ht.setBounds(200, 285, 160, 20);
		ht.setVisible(false);
		time2.setValue(100);
		group.add(hcn);
		group.add(ht);
		group.add(htg);
		group.add(hv);
		sc.setBounds(350, 0, 150, 350);
		sc.setLayout(new GridLayout(8, 1));
		sc.setBackground(Color.LIGHT_GRAY);
		sc.add(user);
		sc.add(score);
		sc.add(hscore);
		sc.add(time);
		sc.add(time2);
		sc.add(play2);
		sc.add(play3);
		play3.setVisible(false);
		f.add(rs);
		f.add(result);
		f.add(hv);
		f.add(hcn);
		f.add(htg);
		f.add(ht);
		f.add(sc);
		f.add(rs);
		f.setLocation(350, 150);
		f.setSize(500, 350);
		f.setLayout(null);
		f.setVisible(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void play() {
		Timer timer = new Timer();

		for (int j1 = 0; j1 < 10; j1++) {
			a[j1] = 0;
		}
		play2.addActionListener(new ActionListener() {
			
			int j;
			int aa[] = new int[4];

			@Override
			public void actionPerformed(ActionEvent e) {
				j = 0;
				for (int j1 = 0; j1 < 4; j1++) {
					aa[j1] = 0;
				}
				play2.setEnabled(false);
				timer.scheduleAtFixedRate(new TimerTask() {
					@Override
					public void run() {
						if (j < 10) {
							Random rd = new Random();
							if (j == 9) {
								for (int j1 = 0; j1 < 1; j1++) {
									int j2 = 0;
									h.i = rd.nextInt(4) + 1;
									a[j] = h.i;
									aa[h.i - 1]++;
									if (aa[h.i - 1] > c) {
										c = aa[h.i - 1];
										b = h.i;
									}
									for (int j3 = 0; j3 < 4; j3++) {
										if (aa[j3] == c) {
											j2++;
										}
									}
									if (j2 > 1) {
										aa[h.i - 1]--;
										j1 = -1;
										continue;
									} else {
										break;
									}
								}
							} else {
								h.i = rd.nextInt(4) + 1;
								a[j] = h.i;
								aa[h.i - 1]++;
								if (aa[h.i - 1] > c) {
									c = aa[h.i - 1];
									b = h.i;
								}
							}
							rs.repaint();
							timer.schedule(new TimerTask() {
								@Override
								public void run() {
									h.i = 0;
									rs.repaint();
								}
							}, 1 * 100);
							j++;
						} else if (j == 10) {
							// System.out.println("Vuong "+aa[0]);
							// System.out.println("CN "+aa[1]);
							// System.out.println("Tam giac "+aa[2]);
							// System.out.println("Tron "+aa[3]);
							int i = 100;
							cancel();
							hv.setVisible(true);
							hcn.setVisible(true);
							htg.setVisible(true);
							ht.setVisible(true);
							while (i >= 0) {
								time2.setValue(i);
								i = i - 5;
								try {
									Thread.sleep(100);
								} catch (Exception e) {
								}
							}
							if ((hv.isSelected() == true) || (hcn.isSelected() == true) || (htg.isSelected() == true)
									|| ((ht.isSelected() == true))) {
								play3.setVisible(true);
								time2.setValue(i);
								i=-1;
							} else if ((i <= 0) && (hv.isSelected() == false) && (hcn.isSelected() == false)
									&& (htg.isSelected() == false) && (ht.isSelected() == false)) {
								play3.setVisible(true);
								diem = 0;
								score.setText("   Score: " + diem);
								result.setText("Hết thời gian!");
								play3.setVisible(true);
								hv.setVisible(false);
								hcn.setVisible(false);
								htg.setVisible(false);
								ht.setVisible(false);
							}
							j++;
						}
					}
				}, 1 * 200, 1 * 200);
			}
		});
		hv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				hv.setEnabled(false);
				hcn.setVisible(false);
				htg.setVisible(false);
				ht.setVisible(false);
				if (b == 1) {
					result.setText("Trả lời chính xác!");
					score.setText("   Score: " + diem + " +1");
					diem = diem + 1;
					if (diem > diem2) {
						diem2 = diem;
						hscore.setText("   High score: " + diem2);
					}
				} else {
					diem = 0;
					score.setText("   Score: " + diem);
					result.setText("Không chính xác!");
				}
			}
		});
		hcn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				hcn.setEnabled(false);
				hv.setVisible(false);
				htg.setVisible(false);
				ht.setVisible(false);
				if (b == 2) {
					result.setText("Trả lời chính xác!");
					score.setText("   Score: " + diem + " +1");
					diem = diem + 1;
					if (diem > diem2) {
						diem2 = diem;
						hscore.setText("   High score: " + diem2);
					}
				} else {
					diem = 0;
					score.setText("   Score: " + diem);
					result.setText("Không chính xác!");
				}
			}
		});
		htg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				htg.setEnabled(false);
				hcn.setVisible(false);
				hv.setVisible(false);
				ht.setVisible(false);
				if (b == 3) {
					result.setText("Trả lời chính xác!");
					score.setText("   Score: " + diem + " +1");
					diem = diem + 1;
					if (diem > diem2) {
						diem2 = diem;
						hscore.setText("   High score: " + diem2);
					}
				} else {
					diem = 0;
					score.setText("   Score: " + diem);
					result.setText("Không chính xác!");
				}
			}
		});
		ht.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ht.setEnabled(false);
				hcn.setVisible(false);
				htg.setVisible(false);
				hv.setVisible(false);
				if (b == 4) {
					result.setText("Trả lời chính xác!");
					score.setText("   Score: " + diem + " +1");
					diem = diem + 1;
					if (diem > diem2) {
						diem2 = diem;
						hscore.setText("   High score: " + diem2);
					}
				} else {
					diem = 0;
					score.setText("   Score: " + diem);
					result.setText("Không chính xác!");
				}
			}
		});
		play3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				h.i = 0;
				for (int j1 = 0; j1 < 10; j1++) {
					a[j1] = 0;
				}
				b = 0;
				c = 0;
				result.setText("");
				rs.repaint();
				score.setText("   Score: " + diem);
				play3.setVisible(false);
				play2.setVisible(true);
				play2.setEnabled(true);
				hv.setEnabled(true);
				hcn.setEnabled(true);
				htg.setEnabled(true);
				ht.setEnabled(true);
				ht.setVisible(false);
				hcn.setVisible(false);
				htg.setVisible(false);
				hv.setVisible(false);
				if((hv.isSelected() == true) || (hcn.isSelected() == true) || (htg.isSelected() == true)
						|| ((ht.isSelected() == true))){
					group.clearSelection();
				}
			}
		});
	}
}
