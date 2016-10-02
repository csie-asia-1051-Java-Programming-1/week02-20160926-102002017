package hw;

/*
      假設銅板有1元、5元、50元共三種，
      媽媽請小明去菜市場買水果，給了小明N元，且媽媽交待，要老闆找小明的零錢的數目要最少，
      而小明到了水果攤買了a1顆蘋果，a2顆柳丁，及a3顆桃子，
  1顆蘋果15元，1顆柳丁20元，1顆桃子30元，
      請問老問需找多少個1元、5元、50元，其銅板數目最少。
  (先輸入媽媽給小明多少錢，N，接著輸入a1, a2, a3 ， 在此n, a1, a2, a3為整數，
       且a1*15+ a2*20+ a3*30小於或等於N。列出共找小明多少個1元，5元及50元，若帶的錢不夠買水果，則顯示”0”)
*/

import java.util.Scanner;
public class hw01_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Money
		System.out.println("媽媽給小明多少錢 ");
		Scanner scn = new Scanner(System.in);
		int money = scn.nextInt();
		
		//Apple
		System.out.println("買幾個蘋果 ");
		Scanner scn1 = new Scanner(System.in);
		int apple = scn1.nextInt();
		int a1 = apple*15;
		
		//Orange
		System.out.println("買幾個柳橙 ");
		Scanner scn2 = new Scanner(System.in);
		int orange = scn2.nextInt();
		int a2 = orange*20;
		
		//Peach
		System.out.println("買幾個桃子 ");
		Scanner scn3 = new Scanner(System.in);
		int peach = scn3.nextInt();
		int a3 = peach*30;
		
		//算式
		

	}
}