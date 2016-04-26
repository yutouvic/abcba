package singleton;

public class Singleton3 {
	
	private volatile static Singleton3 s3;
	
	private Singleton3(){
		super();
	}
	
	public static Singleton3 getInstance(){
		if(s3==null){
			synchronized(Singleton3.class){
				if(s3==null){
					s3 = new Singleton3();
				}
			}
		}
		return s3;
	}

}
