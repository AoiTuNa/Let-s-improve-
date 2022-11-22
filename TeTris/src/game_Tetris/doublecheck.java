package game_Tetris;

public class doublecheck {
	public static int check1 =0, check2 =0, check3 =0, check4 =0, check5 =0, check6 =0,check7 =0,count = 0;
				
	public static boolean check(int x) {
		switch(x) {
		case 1:if(x==1) {
			if(check1<2) {
				check1++;
				count++;
				return true;
			}
		}
		
		case 2:if(x==2) {
			if(check2<2) {
				check2++;
				count++;
				return true;
			}	
			
		}
		case 3:if(x==3) {
			if(check3<2) {
				check3++;
				count++;
				return true;
			}
		}
		case 4:if(x==4) {
			if(check4<2) {
				check4++;
				count++;
				return true;
			}
		}
		case 5:if(x==5) {
			if(check5<2) {
				check5++;
				count++;
				return true;
			}
		}
		case 6:if(x==6) {
			if(check6<2) {
				check6++;
				count++;
				return true;
			}
			
		}
		case 7:if(x==7) {
			if(check7<2) {
				check7++;
				count++;
				return true;
			}
			
		}
		default: if(check1==2&&check2==2&&check3==2&&check4==2&&check5==2&&check6==2&&check7==2) {
			check1 = 0; check2=0; check3 =0; check4 =0; check5 =0; check6 =0; check7=0;
		}
		if(count==15) {
			count = 0;
			if(x==1) {
				check1++;
				return true;
			}
			if(x==2) {
				check2++;
				return true;
			}
			if(x==3) {
				check3++;
				return true;
			}
			if(x==4) {
				check4++;
				return true;
			}
			if(x==5) {
				check5++;
				return true;
			}
			if(x==6) {
				check6++;
				return true;
			}
			if(x==7) {
				check7++;
				return true;
			}
		}
		
		return false;
		
		
		}
	}
}
