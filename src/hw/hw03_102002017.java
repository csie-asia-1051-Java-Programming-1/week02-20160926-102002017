package hw;

/*
 *�ռ��g�@�ӵ{���A�i����LŪ�J�@�� 4 ��ƪ���ơA�N���v���~���A�M��P�O�o�Ӧ~���O�_���|�~
 *�]�C�|�~�@�|�A�C�ʦ~���|�A�C�|�ʦ~�@�|�A�Ҧp�褸 1900 ���� 4 �����ơA���i�Q 100 �㰣�A�ҥH���O�|�~�A
 *�P�z�A 2000 �~�O�|�~�A�]�i�Q 400 ��ơA�� 2004 ��M�]�O�|�~�A�]�i�H�Q 4 �㰣�^�C
 */

import java.util.Scanner;
public class hw03_102002017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�~��
		System.out.println("�п�J�~��");
		Scanner scn = new Scanner(System.in);
		int year = scn.nextInt();
		
		//�⦡
		if(year%4 == 0)
		{
			if(year%100 == 0 && year%400 != 0)
			{
				System.out.println("�_");
				return;
			}
			System.out.println("�O");
		}else
		{
			System.out.println("�_");
		}
	}
}
