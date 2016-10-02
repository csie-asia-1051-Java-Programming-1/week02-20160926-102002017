package hw;

/*
 *已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；
 *試寫一個程式可以計算男生女生的標準體重。
 *(輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 */

import java.util.Scanner;
public class hw02_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//身高
		System.out.println("請輸入身高  ");
		Scanner scn = new Scanner(System.in);
		int height = scn.nextInt();
		
		//性別
		System.out.println("請輸入性別 ");
		Scanner scn1 = new Scanner(System.in);
		int gender = scn1.nextInt();
		
		//算式
		if(gender==1)
		{
			System.out.println("標準體重為 " + (height-80)*0.7);
		}
		
		if(gender==2)
		{
			System.out.println("標準體重為 " + (height-70)*0.6);
		}

	}

}
