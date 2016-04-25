package decrator;

public class H2 extends Hero {
	
	private String name="灰烬之灵";
	private int attack=40;

	public H2() {
		super();
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
		return attack;
	}

}
