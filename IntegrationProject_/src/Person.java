
public class Person {
	private String name;

	//This is a  constructor with parameters
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//This is a default constructor without parameters
	public Person() {
		super();
	}
	
	
	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}
	
	int age;
	
	public void setAge(int newAge) {
	age = newAge;
	}
	
	public int getAge() {
		return age;
	}
}
