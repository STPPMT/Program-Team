import java.util.Scanner;
class program
{
	static int[] mt2(String str[]){
		int num[]=new int[str.length-1];
		for(int i=0,j=13;i<str.length-1;i++,j--){
			int sum=Integer.valueOf(str[i]);
			num[i]=j*sum;
		}
		return num;
	}
	static int mt34(int[] num){
		int plus=0,sum;
		for(int i=0;i<num.length;i++)
		{
			plus=plus+num[i];
		
		}
			
		
		sum=plus%11;
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		String sum[]=new String[]{"1","2","0","1","5","4","1","4","6","2","2","3","4"};
		int num[]=mt2(sum);
		int num2=mt34(num);
		
		System.out.println();
		System.out.println(num2);
		System.out.println("Hello world");
		//+++
		scn.close();
	}
}