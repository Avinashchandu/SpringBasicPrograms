package basic;

public class CombinationOfNumbers {
	
   public static void main(String[] args) {
	   
	   int a[]= {8,9,4};
	   int b[]={8,9,4};
	   int temp = 0;
	   for(int i = 0;i<a.length;i++)
	   {
		  for(int j =0;j<a.length;j++)
		  {
			  a[j]=b[j];
		  }
		   if(i>0)
		   {
			   temp = a[0];
			   a[0]=a[i];
			   a[i]=temp;
			   System.out.println(a[0]+""+a[1]+""+a[2]);
		   }
		   else
		   {
			   System.out.println(a[0]+""+a[1]+""+a[2]);
		   }
		   temp=a[2];
		   a[2]=a[1];
		   a[1]=temp;
		   System.out.println(a[0]+""+a[1]+""+a[2]);
		   
	   }
   }
}
