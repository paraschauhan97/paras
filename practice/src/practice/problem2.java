package practice;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a2	=	{
				{1,	0,	1,	0,	1},
				{0,	0,	1,	0,	1},
				{1,	1,	1,	0,	1},
				{1,	1,	1,	0,	1},
				{0,	0,	0,	0,	1},
				};
		int a[]=new int[10];
		int b[]=new int[10];
		int decn1=0,decn2=0;
		
		for(int i=0;i<a2.length;i++)
		{

			for(int j=0;j<a2[i].length;j++)
			{
				
				if(i==j)
				{
					int k=4-j;
					a[i]=a2[i][j];
					decn1+=a[i]*(int)Math.pow(2,k);
				}
			}
			for(int j=0;j<a2[i].length;j++)
			{
				if(j==4-i)
				{
					int l=4-i;
					b[i]=a2[i][j];
					decn2+=b[i]*(int)Math.pow(2,l);
				}
				
			}
				
			
		}
		System.out.println(decn1);
		System.out.println(decn2);
		System.out.println(decn1+decn2);
}
	}


