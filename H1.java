package gouzao;

import java.util.Random;
public class H1 {


	public static void main(String[] args) {
		short a=0,b=0,flag;
		char f='+';
		Random random=new Random();
		for (int i=0;i<50;i++)
		{
			flag=(short)random.nextInt(2);
			a=(short)random.nextInt(101);
			b=(short)random.nextInt(101);
			if(flag==1)
			{
				f='+';
			}else
			{
				f='-';
			}
			System.out.println((i+1)+":  "+a+f+b+"=");
		}

	}

}