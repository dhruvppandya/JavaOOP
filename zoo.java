
public class zoo {
	
	String type;
	String name;
	int age;
	String size;
	String property;
	
	public zoo(String type, String name, int age, String size, String property) {
		this.type = type;
		this.name = name;
		this.age = age;
		this.size = size;
		this.property = property;
	}

	public void cage() {
		
		System.out.println("The cage has a "+type+" Creature");
	}
	
	public void des() {
		
		System.out.println("It is a "+name);
		System.out.println("It is "+age+" years old");
		System.out.println("A "+ name +" can "+property);
		System.out.println("It is a "+size+" "+type);
	}
	

}
