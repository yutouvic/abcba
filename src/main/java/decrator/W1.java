package decrator;

public class W1 extends Weapon {
	
	private Hero h;
	private String name="诸葛连弩";
	private int attack=2;

	public W1(Hero h) {
		super();
		this.h = h;
	}

	public String getName() {
		return name;
	}

	public int getAttack() {
		return attack;
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return attack+h.attack();
	}

}
