package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
	
	private boolean flag = false;
	private List<IObserver> list = new ArrayList<IObserver>();

	public void registerObserver(IObserver ob) {
		// TODO Auto-generated method stub
		list.add(ob);
	}

	public void removeObserver(IObserver ob) {
		// TODO Auto-generated method stub
		list.remove(ob);
	}

	public void notifyAllObserver(String str,int ret) {
		// TODO Auto-generated method stub
		setChange();
		if(flag){
			for(IObserver ob:list){
				ob.update(str, ret);
			}
		}
		flag = false;
	}

	public void setChange() {
		// TODO Auto-generated method stub
		flag = true;
	}

}
