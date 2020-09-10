
public class FlyingAnimal implements Actions, FlyingAnimalsInterface {

	public String sortName;
	
	public FlyingAnimal() {
		
	}

	public FlyingAnimal(String sortName) {
		super();
		this.sortName = sortName;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	@Override
	public void eat() {
		System.out.println(sortName + " is eating.");
	}

	@Override
	public void drinkWater() {
		System.out.println(sortName + " is drinking water.");
		
	}

	@Override
	public void spreadTheWings() {
		System.out.println(sortName + " is spreading his wings.");
		
	}

	@Override
	public void makeANest() {
		System.out.println(sortName + " is making the nest.");
		
	}
	
	
	
}
