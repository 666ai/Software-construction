package gouzao;

public class T3 {
	static int arrleft[]=new int[50];
	static int arrright[]=new int[50];
	static int value[]=new int[50];
	static char f='+';
	static int flag;

	// ��ӡ����
		public static void printHeader() {
			System.out.println("********************************************");
			System.out.println("*********50��100���ڵļӼ�������*******************");
			System.out.println("********************************************");
		}
	// �����Ŀ
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
		   System.out.print("��"+(i+1)+"��Ŀ�ǣ�"+arrleft[i]+" "+f+" "+arrright[i]+"   ");
		}
		
	}
	// �����
	public static void printCalculation() {
		System.out.println();
		System.out.println("*************************��*******************************");
		for (int i = 0; i < 50; i++) {

			if (i % 5 == 0) {

				System.out.println();
			}
			System.out.print("��" + (i + 1) + "���ǣ�" + value[i] + " ");
		}

	}
	public static void main(String[] args) {
		
		printHeader();
		generateEquations();
		printCalculation();
	}

}
