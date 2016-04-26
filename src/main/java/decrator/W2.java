package decrator;

public class W2 extends Weapon {
	
	private Hero h;
	private String name="古锭刀";
	private int attack=8;

	public W2(Hero h) {
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
	};

}
