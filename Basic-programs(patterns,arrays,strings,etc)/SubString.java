package string;

public class SubString {
   public static void main(String[] args) {
	   int[] a = new int[10];
	   int count = 0;
	   String s = "Hello Hi how do you do i am fine how are you and how do you do";
	   String key = "how";
	   for(int i = 0;i<s.length()-key.length();i++) 
	   {
		   //System.out.println(s.substring(i,i+key.length()).equals(key));
		  if(s.substring(i,i+key.length()).equals(key))
		  {
			  a[count++]=i;
		  }
	   }
	   int exit = 0;
	   int max = 0;
	   String max1 = new String();
	   String s1 = new String();
	   for(int i = 0;i<a.length;i++)
	   {
		   if(a[i+1]==0)
		   {
			   s1=s.substring(a[i]+key.length(),s.length()); 
			   exit = 1;
		   }
		   else {
		   s1=s.substring(a[i]+key.length(), a[i+1]);
		   }
		   if(s1.length()>max)
		   {
			   max = s1.length();
			   max1=s1;
		   }
		   if(exit==1)
			   break;
	   }
	   System.out.println(max1);
	   
	   
}
}
