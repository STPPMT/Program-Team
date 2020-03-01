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
	public static void main(String[] args) 
	{
		//1. return result String[]
		int num[]=mt2(result);
		Scanner scn=new Scanner(System.in);
		String sum[]=new String[]{"1","2","0","1","5","4","1","4","6","2","2","3","4"};
		int num[]=mt2(sum);
		for(int i=0;i<sum.length-1;i++){
			System.out.print(num[i]+" ");
		}
		scn.close();
	}
}