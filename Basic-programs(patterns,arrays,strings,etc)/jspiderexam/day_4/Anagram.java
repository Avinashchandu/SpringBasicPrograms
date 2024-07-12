package day_4;

public class Anagram {

	public static void main(String[] args) {
		
		ThreadClass t1 = new ThreadClass();
		Thread t = new Thread(t1,"name");
		t.start();
		
	}
	
}
