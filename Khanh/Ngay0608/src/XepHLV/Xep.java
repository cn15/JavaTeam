package XepHLV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Xep {

	public static void main(String[] args) {
		ArrayList<Team> team = new ArrayList<Team>();
		ArrayList<HLV> hlv = new ArrayList<HLV>();
		ArrayList<LienDoanBongDa> ld = new ArrayList<LienDoanBongDa>();
		int i;
		try{
			BufferedReader iK = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nNhap vao thong tin 4 Team.");
			for(i=0; i<4; i++)
			{
				Team t1 = new Team();
				System.out.print("\nTeam "+(i+1));
				System.out.print("\nNhap ID team: ");
				String id1 = iK.readLine();
				t1.setIdTeam(Integer.parseInt(id1));
				System.out.print("\nNhap quoc gia: ");
				t1.setQuocgia(iK.readLine());
				team.add(t1);
			}
			System.out.print("\nNhap vao thong tin 6 HLV.");
			for(i=0; i<6; i++)
			{
				HLV h1 = new HLV();
				System.out.print("\nHLV "+(i+1));
				System.out.print("\nNhap ID HLV: ");
				String hlv1 = iK.readLine();
				h1.setIdHlv(Integer.parseInt(hlv1));
				System.out.print("\nNhap ten HLV: ");
				h1.setTenHlv(iK.readLine());
				System.out.print("\nNhap quoc tich: ");
				h1.setQuoctich(iK.readLine());
				System.out.print("\nNhap muc luong: ");
				String l1 = iK.readLine();
				h1.setMucLuong(Integer.parseInt(l1));
				hlv.add(h1);
			}
			System.out.print("\nNhap vao thong tin 4 Lien doan bong da: ");
			for(i=0; i<4; i++)
			{
				LienDoanBongDa l1 = new LienDoanBongDa();
				System.out.print("\nLien doan "+(i+1));
				System.out.print("\nNhap ID Lien doan: ");
				String idld1 = iK.readLine();
				l1.setIdLiendoan(Integer.parseInt(idld1));
				System.out.print("\nNhap quoc gia: ");
				l1.setQuocgia(iK.readLine());
				System.out.print("\nNhap quy luong lien doan: ");
				String lld1 = iK.readLine();
				l1.setQuyluongHlv(Integer.parseInt(lld1));
				ld.add(l1);
			}
		}
		catch (Exception e){
			System.out.print(e.toString());
		}
		int a[];
		a = new int [6];
		for(i=0; i<6; i++)
		{
			a[i]=hlv.get(i).getIdHlv();
		}
		for(i=0; i<4; i++)
		{
			ArrayList<HLV> hlv1 = new ArrayList<HLV>();
			int b=0, c=0;
			for(int j=0; j<6; j++)
			{
				if(a[j]==0)
				{
					continue;
				}
				else if((ld.get(i).getQuocgia().equals(hlv.get(j).getQuoctich()))&&(ld.get(i).getQuyluongHlv()>=hlv.get(j).getMucLuong()))
				{
					hlv1.add(hlv.get(j));
					b++;
					c++;
				}
			}
			if(c==0)
			{
				for(int j=0; j<6; j++)
				{
					if(a[j]==0)
					{
						continue;
					}
					if((ld.get(i).getQuyluongHlv()>=hlv.get(j).getMucLuong())&&(b==0))
					{
						hlv1.add(hlv.get(j));
						c++;
					}
				}
			}
			if(c==0)
			{
				System.out.print("\nLien doan bong da "+ld.get(i).getQuocgia()+" khong tim duoc HLV thich hop.");
				continue;
			}
			Random rd=new Random();
			int k= rd.nextInt(c);
			for(int j=0; j<4; j++)
			{
				if(team.get(j).getQuocgia().equals(ld.get(i).getQuocgia()))
				{
					team.get(j).setHlv(hlv1.get(k).getTenHlv());
					break;
				}
			}
			for(int j=0; j<6; j++)
			{
				if(a[j]==hlv1.get(k).getIdHlv())
				{
					a[j]=0;
					break;
				}
			}
			System.out.print("\nLien doan bong da "+ld.get(i).getQuocgia()+" moi HLV "+hlv1.get(k).getTenHlv()+" dan dat doi tuyen.");
		}
	}

}
