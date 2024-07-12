package day_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class fileProg {

	public static void main(String[] args) {
		
		File f  = new File("C://Users//avina//OneDrive//Desktop//j.txt");
		try {
			//System.out.println(f.createNewFile());
			FileOutputStream f1 = new FileOutputStream(f);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter sz");
			byte sz = sc.nextByte();
			System.out.println("Enter Elements");
			for(int i = 0;i<sz;i++)
			{
				f1.write('0'+sc.nextInt());
			}
			f1.flush();
			FileInputStream f2 = new FileInputStream(f);
			while(true)
			{
				byte b = (byte)f2.read();
				if(b==-1)
					break;
				if(b%2==0)
				{
					System.out.print(b);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
