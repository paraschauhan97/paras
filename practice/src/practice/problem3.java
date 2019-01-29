package practice;

public class problem3 {

	int [] rotateright(int shifts,int[]A)
	{

		int []A1=new int[A.length];
		 
		for(int i=0;i<A.length;i++)
		{
			A1[(shifts+i)%(A.length)]=A[i];
			
		}
		return A1;
	}
	public static void main(String[] args) {
	
	int []A={3,8,9,7,6};	
		    
	 problem3 p=new problem3();
	 A= p.rotateright(3,A);
	 
	 for(int k=0;k<A.length;k++)
		 {
		 System.out.println(A[k]);
	 }
	}

}
