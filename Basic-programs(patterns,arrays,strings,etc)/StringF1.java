package basic;

public class StringF1 {
   public static void main(String[] args) {
	 String a = "A5B6";
	 String b ="0";
	 int base =b.charAt(0);
	 for(int i=0;i<a.length();i=i+2)
	 {
		 int rep = base-a.charAt(i+1);
		 for(int j=0;j<rep;j++)
		 {
			 System.out.println(a.charAt(i));
		 }
	 }
}
}
