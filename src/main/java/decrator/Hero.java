package decrator;

public abstract class Hero {
	
	private String name;
	private int attack;
	
	public String getName() {
		return name;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public Hero() {
		super();
	}

	public Hero(String name, int attack) {
		super();
		this.name = name;
		this.attack = attack;
	}
	
	public abstract int attack();

}
