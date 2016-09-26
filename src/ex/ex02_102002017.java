package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 *        請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 *        如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 102002017 邱泓偉
 */
import java.util.Scanner;
public class ex02_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("X座標  = ");
		Scanner scn = new Scanner(System.in);
		float x = scn.nextFloat();
		
		System.out.println("Y座標  = ");
		Scanner scn2 = new Scanner(System.in);
		float y = scn2.nextFloat();
		
		int range = 100;
		
		float a = x*x;
		float b = y*y;
		
		if(a+b>range*range)
		{
			System.out.println("在圓外");
		}
		else 
		{
			System.out.println("在圓內");
		}
	}

}
