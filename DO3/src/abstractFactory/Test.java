package abstractFactory;

public class Test {

	public static void main(String[] args) {
		AnimalFactory waf = FactoryForAnimalFactory.createAnimalFactory("wild");
		AnimalFactory daf = FactoryForAnimalFactory.createAnimalFactory("domestic");
		
		Animal dog = daf.createAnimal("dog");
		Animal cow = daf.createAnimal("cow");
		Animal bear = waf.createAnimal("bear");
		Animal dinosaur = waf.createAnimal("dinosaur");
		
		System.out.println(dog.goes());
		System.out.println(cow.goes());
		System.out.println(bear.goes());
		System.out.println(dinosaur.goes());

	}

}
