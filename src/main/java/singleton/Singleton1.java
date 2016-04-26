package singleton;

public class Singleton1 {
	
	private static Singleton1 s1;
	
	private Singleton1(){
		super();
	}
	
	public static synchronized Singleton1 getInstance(){
		if(s1==null){
			s1 = new Singleton1();
		}
		return s1;
	}

}
