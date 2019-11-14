package gouzao;

public class T3 {
	static int arrleft[]=new int[50];
	static int arrright[]=new int[50];
	static int value[]=new int[50];
	static char f='+';
	static int flag;

	// 打印标题
		public static void printHeader() {
			System.out.println("********************************************");
			System.out.println("*********50道100以内的加减法运算*******************");
			System.out.println("********************************************");
		}
	// 输出题目
	public static void generateEquations() {
		for (int i = 0; i < 50; i++) {
			arrleft[i] = (int) (101 * Math.random());
			if (arrleft[i] <= 50) {
				arrright[i] = (int) (arrleft[i] * Math.random());	
			} else {
				arrright[i] = (int) ((100 - arrleft[i]) * Math.random());				
			}		
		}

		
		for (int i = 0; i < 50; i++) {
			flag= (int) (2 * Math.random());
			if(flag==1)
			{
				f='+';
				value[i]=arrleft[i]+arrright[i];
			}else
			{
				f='-';
				value[i]=arrleft[i]-arrright[i];
			}
		   if(i%5==0)
		    {
			
			System.out.println();
		    }
		   System.out.print("第"+(i+1)+"题目是："+arrleft[i]+" "+f+" "+arrright[i]+"   ");
		}
		
	}
	// 输出答案
	public static void printCalculation() {
		System.out.println();
		System.out.println("*************************答案*******************************");
		for (int i = 0; i < 50; i++) {

			if (i % 5 == 0) {

				System.out.println();
			}
			System.out.print("第" + (i + 1) + "答案是：" + value[i] + " ");
		}

	}
	public static void main(String[] args) {
		
		printHeader();
		generateEquations();
		printCalculation();
	}

}
