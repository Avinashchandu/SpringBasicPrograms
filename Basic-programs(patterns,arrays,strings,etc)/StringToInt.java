package assignment;

public class StringToInt {
      public static void main(String[] args) {
    	  String b ="0";
    	  int base =b.charAt(0);
    	  String a ="123456";
    	  int num = 0;
    	  for(int i = 0;i<a.length();i++)
    	  {
    		  int rem = a.charAt(i)-base;
    		  num=num*10+rem; 
    	  }
    	  System.out.println(num);
}
}
