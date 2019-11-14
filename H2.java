package gouzao;
import java.util.Random;
public class H2 {
public static short generateoperand()
{
	Random random=new Random();
	return (short)random.nextInt(101);
	
	}//随机产生100以内的数
	public static void main(String[] args) {
		short a=0,b=0,flag;
		int v;
		char f='+';
		Random random=new Random();
		for (int i=0;i<50;i++)
		{
			do{
			flag=(short)random.nextInt(2);
			a= generateoperand();
			b=generateoperand();
			v=a+b;
			}while(v>=100);
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
