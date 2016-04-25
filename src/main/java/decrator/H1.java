package decrator;

public class H1 extends Hero {
	
	private String name="风暴之灵";
	private int attack=50;

	public H1() {
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
