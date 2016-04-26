package observer;

public class Ob implements IObserver {
	
	private String str;
	private int ret;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getRet() {
		return ret;
	}

	public void setRet(int ret) {
		this.ret = ret;
	}

	public void update(String str,int ret) {
		// TODO Auto-generated method stub
		this.setStr(str);
		this.setRet(ret);
	}

}
