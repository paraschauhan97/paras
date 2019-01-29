
public class abc {

	public static void main(String[] args) {
	
		int N=12;
	
		int tc=0,mb=0;
		for(int jb=1;jb<=N;jb++)
		{
			tc=tc+jb;
			if(tc>=N)
			{
				tc=tc-jb;
				System.out.println("wall completed with "+N+"bricks.Last"+(N-tc)+" brick was placed by john");
			   break;
			}
			mb=mb+2*jb;
			tc=tc+mb;
			if(tc>=N)
			{
				tc=tc-mb;
				System.out.println("wall completed with "+N+"bricks.Last"+(N-tc)+" brick was placed by mark");
				   break;
			}
		}

	}

}
