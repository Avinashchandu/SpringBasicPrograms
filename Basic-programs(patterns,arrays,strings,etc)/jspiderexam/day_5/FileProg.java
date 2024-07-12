package day_5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProg {
	public static void main(String[] args) {
		File f = new File("C://Users//avina//OneDrive//Desktop//nf.txt");
		try {
			f.createNewFile();
			FileWriter f1 = new FileWriter(f);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter New String");
			String s = sc.nextLine();
			String s1 ="";
			int count = 0 ;
			for(int i =s.length()-1;i>=0;i--)
			{
				if(s.charAt(count++)==' ')
					s1+=' ';
				if(s.charAt(i)==' ')
					continue;
				s1+=s.charAt(i);
			}
			for(int i = 0;i<s1.length();i++)
			{
			f1.write(s1.charAt(i));
			}
			f1.flush();
			FileReader f2 = new FileReader(f);
			String s2 ="";
			System.out.println(s);
			for(int i = 0;i<s1.length();i++)
			{
			 System.out.print((char)f2.read()); 
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
