
public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ea=" ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//char [] englishAlphabetArray= englishAlphabet.toCharArray();
		String hl=" \u0904\u097f\u0915\u0921\u090f\u092b\u0917\u0939\u0908\u091c\u0915\u0932\u092e\u0928\u0913\u092a\u0915\u0930\u0938\u091f\u092f\u0935\u0935\u0937\u092f\u095b";
	 String f="";
	 String j="Happy Republic Day";
	 String in=j.toUpperCase();
	 for(int i=0;i<in.length();i++)
	 {
		 int a=ea.indexOf(in.charAt(i));
		 f=f+String.valueOf(hl.charAt(a));
		 
	 }
	 System.out.println(f);
	}

}
