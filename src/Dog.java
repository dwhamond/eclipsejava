
public class Dog {

	private String name;
	private String breed;
	private int age;
	private int weight;

	public Dog(String name, String breed, int age, int weight) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public static void main(String[] args) {
		Dog romeo = new Dog("Romeo", "American Bulldog", 4, 105);
		System.out.println(romeo.name);
		System.out.println(romeo.breed);
		System.out.println(romeo.age + " years old");
		System.out.println(romeo.weight + "lbs");
		
	}
}
