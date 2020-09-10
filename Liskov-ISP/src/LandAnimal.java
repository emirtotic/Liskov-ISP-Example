
public class LandAnimal implements Actions, LandAnimalsInterface {

	public String sortName;
	
	public LandAnimal() {
		
	}

	public LandAnimal(String sortName) {
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
	public void run() {
		System.out.println(sortName + " is running.");
		
	}

	@Override
	public void makeAShelter() {
		System.out.println(sortName + " is making a shelter.");
		
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
	public String toString() {
		return sortName + " ";
	}
	
	
}
