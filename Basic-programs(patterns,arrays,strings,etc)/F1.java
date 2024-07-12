package basic;

public class F1 {
	 public static void main(String[] args) {
		 String a = "A5B6";
		 char b ='0';
		 int base =b;
		 for(int i=0;i<a.length();i=i+2)
		 {
			 int rep = a.charAt(i+1)-base;
			 for(int j=0;j<rep;j++)
			 {
				 System.out.print(a.charAt(i));
			 }
			 System.out.println();
		 }
}
}
