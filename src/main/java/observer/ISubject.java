package observer;

public interface ISubject {
	
	public void registerObserver(IObserver ob);
	
	public void removeObserver(IObserver ob);
	
	public void notifyAllObserver(String str,int ret);
	
	public void setChange();

}
