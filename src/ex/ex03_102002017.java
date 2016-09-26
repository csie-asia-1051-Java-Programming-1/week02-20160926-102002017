package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，
 *        超過2小時，但未滿4小時的部份，每半小時40元，
 *        超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 *        如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 102002017 邱泓偉
 */
import java.util.Scanner;
public class ex03_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Start
		System.out.println("幾點幾分進入停車場 ");
		Scanner scn = new Scanner(System.in);
		int h1 = scn.nextInt();
		Scanner scn2 = new Scanner(System.in);
		int m1 = scn2.nextInt();
		
		//End
		System.out.println("幾點幾分離開停車場 ");
		Scanner scn3 = new Scanner(System.in);
		int h2 = scn3.nextInt();
		Scanner scn4 = new Scanner(System.in);
		int m2 = scn4.nextInt();
		
		//停車時間
		int h3 = h2 - h1;
		int m3 = m2 - m1;
		
		if(m3 < 0)
		{
			h3-=1;
			m3 = 60+m3;
		}
		int time = (h3*2)+(m3/30);
		
		//停車費
		int price = 0;
		int p1;
		int p2;
		int p3;
		
		if(time < 4)
		{
			p1 = time * 30;
			System.out.println("停車費 = " + p1);
		}
		else if (time > 4 && time < 8) 
		{
			p2 = time - 4;
			price = p2 * 40;
			System.out.println("停車費 = " + (120 + price));
		}
		else if (time > 8) 
		{
			p3 = time - 8;
			price = p3 * 60;
			System.out.println("停車費 = " + (120 + 160 + price));
		}
	}
}
