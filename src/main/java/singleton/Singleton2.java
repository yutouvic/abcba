package singleton;

public class Singleton2 {
	
	private static Singleton2 s2 = new Singleton2();
	
	private Singleton2(){
		super();
	}
	
	public static Singleton2 getInstance(){
		return s2;
	}

}
