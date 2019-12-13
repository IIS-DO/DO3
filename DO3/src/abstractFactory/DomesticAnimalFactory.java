package abstractFactory;

public class DomesticAnimalFactory implements AnimalFactory{

	@Override
	public Animal createAnimal(String type) {
		switch(type) {
		case "dog":
			return new Dog();
		case "cow":
			return new Cow();
		default:
			return null;
		}
	}

}
