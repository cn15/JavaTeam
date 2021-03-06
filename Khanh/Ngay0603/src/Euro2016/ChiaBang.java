package Euro2016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class ChiaBang {

	public static void main(String[] args) {
		Bang b1 = new Bang();
		Bang b2 = new Bang();
		Bang b3 = new Bang();
		Bang b4 = new Bang();
		b1.setIdBang(1);
		b2.setIdBang(2);
		b3.setIdBang(3);
		b4.setIdBang(4);
		b1.setTenBang("Bang A");
		b2.setTenBang("Bang B");
		b3.setTenBang("Bang C");
		b4.setTenBang("Bang D");
		HatGiong h1 = new HatGiong();
		HatGiong h2 = new HatGiong();
		HatGiong h3 = new HatGiong();
		h1.setIdHatgiong(1);
		h2.setIdHatgiong(2);
		h3.setIdHatgiong(3);
		h1.setTenHatgiong("Hat giong so 1");
		h2.setTenHatgiong("Hat giong so 2");
		h3.setTenHatgiong("Khong phai hat giong.");
		ArrayList<Team> team = new ArrayList<Team>();
		int i, j;
		try {
			BufferedReader iK = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nWelcome to France");
			for (i = 0; i < 16; i++) {
				Team t1 = new Team();
				System.out.print("\nNhap ID team: ");
				String team1 = iK.readLine();
				t1.setIdTeam(Integer.parseInt(team1));
				System.out.print("\nNhap ten team: ");
				t1.setTenTeam(iK.readLine());
				System.out.print("\nNhap ID hat giong: ");
				String id1 = iK.readLine();
				t1.setIdHatgiong(Integer.parseInt(id1));
				team.add(t1);
			}
		} catch (Exception e) {
			System.out.print(e.toString());
		}
		int a[][];
		int k;
		ArrayList<TaoBang> tb = new ArrayList<TaoBang>();
		TaoBang tb1 = new TaoBang();
		TaoBang tb2 = new TaoBang();
		TaoBang tb3 = new TaoBang();
		TaoBang tb4 = new TaoBang();
		tb.add(0, tb1);
		tb.add(1, tb2);
		tb.add(2, tb3);
		tb.add(3, tb4);
		Random rd = new Random();
		a = new int[4][4];
		for (j = 0; j < 4; j++) {
			for (i = 0; i < 4; i++) {
				a[i][j] = 0;
			}
		}
		System.out.print("\n16 doi tham gia:");
		for (i = 0; i < 16; i++) {
			k = rd.nextInt(4);
			System.out.print("\n" + team.get(i).getTenTeam());
			if (team.get(i).getIdHatgiong() == 1) {
				for (j = 0; j < 2; j++) {
					if (a[k][0] == 1) {
						k = rd.nextInt(4);
						j = -1;
					}
				}
				a[k][0] = 1;
				team.get(i).setIdBang(k + 1);
				tb.get(k).setTeam1(team.get(i).getTenTeam());
			} else if (team.get(i).getIdHatgiong() == 2) {
				for (j = 0; j < 2; j++) {
					if (a[k][1] == 1) {
						k = rd.nextInt(4);
						j = -1;
					}
				}
				a[k][1] = 1;
				team.get(i).setIdBang(k + 1);
				tb.get(k).setTeam2(team.get(i).getTenTeam());
			} else if (team.get(i).getIdHatgiong() == 3) {
				for (j = 0; j < 2; j++) {
					if (a[k][2] == 0) {
						a[k][2] = 1;
						team.get(i).setIdBang(k + 1);
						tb.get(k).setTeam3(team.get(i).getTenTeam());
						break;
					} else if ((a[k][2] == 1) && (a[k][3] == 0)) {
						a[k][3] = 1;
						team.get(i).setIdBang(k + 1);
						tb.get(k).setTeam4(team.get(i).getTenTeam());
						break;
					} else if ((a[k][2] == 1) && (a[k][3] == 1)) {
						k = rd.nextInt(4);
						j = -1;
					}
				}
			}
		}
		System.out.print("\n--Chia bang---\n");
		for (i = 0; i < 4; i++) {
			System.out.print("\nBang " + (char) (i + 65));
			System.out.print("\n" + tb.get(i).getTeam1());
			System.out.print("\n" + tb.get(i).getTeam2());
			System.out.print("\n" + tb.get(i).getTeam3());
			System.out.print("\n" + tb.get(i).getTeam4());
			System.out.print("\n");
		}
	}
}
