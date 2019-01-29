package practice;

public class problems {

	public static void main(String[] args)
	{
		
		int []a={0,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1};
		int  count=0,max=0,n=a.length,j;
		int b[]=new int[n];
		for(int i=0;i<n-1;i++)
		{
		 j=i+1;
		if(a[i]>=a[j]&& a[j]!=1)
		{
			count++;
			b[i]=count;
		
		}
		else
		{
			count=0;
			continue;
		}
		
		if(b[i]>max)
		{
			max=b[i];
		}
		}
		
		System.out.println(max);
	
		}
		
	}

