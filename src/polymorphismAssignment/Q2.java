package polymorphismAssignment;

class Monster{
	private String name;
	
	public void Attack() {
		System.out.println("This is a Monster attack");
	}
} 

class FireMonster extends Monster{
	public void Attack() {
		System.out.println("This is a Fire Monster attack");
	}
}

class WaterMonster extends Monster{
	public void Attack() {
		System.out.println("This is a Water Monster attack");
	}
}

class StoneMonster extends Monster{
	public void Attack() {
		System.out.println("This is a Stone Monster attack");
	}
}

public class Q2 {

	public static void main(String[] args) {
		
		Monster dragon = new FireMonster();
		dragon.Attack();
		
		Monster vampire2 = new WaterMonster();
		vampire2.Attack();
		
		Monster champ = new StoneMonster();
		champ.Attack();

	}

}
