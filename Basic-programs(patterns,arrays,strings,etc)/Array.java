package basic;

public class Array {
public static void main(String[] args) {
	int[] a= {11,2,3,4};
	int b[]=new int[4];
	b[0]=34;
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		//System.out.println(b[i]);
	}
	for(int i=0;i<a.length;i++) {
		//System.out.println(a[i]);
		System.out.println(b[i]);
	}
}
}
