package hw;

/*
 *�w���k�ͼз��魫��(������80 )*0.7�F�k�ͼз��魫��(������70)*0.6�F
 *�ռg�@�ӵ{���i�H�p��k�ͤk�ͪ��з��魫�C
 *(��J��ӼƭȡA�̧ǥN�������ΩʧO�]1�N��k�ʡF2�N��k�ʡ^)
 */

import java.util.Scanner;
public class hw02_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����
		System.out.println("�п�J����  ");
		Scanner scn = new Scanner(System.in);
		int height = scn.nextInt();
		
		//�ʧO
		System.out.println("�п�J�ʧO ");
		Scanner scn1 = new Scanner(System.in);
		int gender = scn1.nextInt();
		
		//�⦡
		if(gender==1)
		{
			System.out.println("�з��魫�� " + (height-80)*0.7);
		}
		
		if(gender==2)
		{
			System.out.println("�з��魫�� " + (height-70)*0.6);
		}

	}

}
