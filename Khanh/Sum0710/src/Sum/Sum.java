package Sum;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;

public class Sum{
	static int t = 1;
	static int s = 0;
	static int j = 0;
	JFrame f = new JFrame();
	static String cbm = "CBM  STUDIO";
	static JLabel num = new JLabel("Number");
	static JLabel sum = new JLabel("SUM           = ");
	static JLabel sum1 = new JLabel("0");
	static JButton start = new JButton("Start");
	static JButton stop = new JButton("Stop");

	Sum() {
		num.setBounds(175, 45, 50, 20);
		sum.setBounds(120, 110, 100, 20);
		sum1.setBounds(255, 110, 100, 20);
		start.setBounds(50, 190, 120, 40);
		stop.setBounds(230, 190, 120, 40);
		f.setTitle(cbm);
		f.add(num);
		f.add(sum);
		f.add(sum1);
		f.add(start);
		f.add(stop);
		f.setSize(400, 300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void play() {
		start.addActionListener(new ActionListener() {
			
			Random rd = new Random();
			Timer timer = new Timer();

			@Override
			public void actionPerformed(ActionEvent e) {
				start.setEnabled(false);
				stop.setEnabled(true);
				
				
				t=1;
		
				timer.scheduleAtFixedRate(new TimerTask() {
					@Override
					public void run() {
						if (t == 1) {
							int i = rd.nextInt(999);
							s = s + i;
							num.setText(" " + i);

							timer.schedule(new TimerTask() {
								@Override
								public void run() {
									num.setText("");
								}
							}, 1 * 1000);
						}
						else if(t==0){
							cancel();
						}
					}
				}, 1 * 2000, 1 * 2000);
						
					
			}

		});
		stop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				t = 0;
				sum1.setText("" + s);
				s = 0;
				start.setEnabled(true);
				stop.setEnabled(false);
				
			}

		});
	}

	public static void main(String args[]) {
		
		Sum a =new Sum();
		a.play();
	}


}
