public class CarKind extends Car implements CarWeight, CarWeightClassification, CarSize, CarSizeClassification,
		ClassCylinderClassification, CarCylinder {

	String brand;
	String model;
	double weight;
	double height;
	double cylinder;

	public CarKind(String color, String brand, String model, double weight, double height, double cylinder) {
		super(color);
		this.brand = brand;
		this.model = model;
		this.weight = weight;
		this.height = height;
		this.cylinder = cylinder;
	}

	@Override
	public String toString() {
		String result = "Brand: " + brand + "\n";
		result += "Model : " + model + "\n";
		result += "Weight : " + weight + " pounds\n";
		result += "Height : " + height + " feet\n";
		result += "---------------------------------------------------";
		return result;
	}

	public void carSound() {
		System.out.println("Rum Rum brrr");

	}

	@Override
	public void carWeight() {
		if (weight <= LIGHT) {
			System.out.println("This is an small sized car");
		} else if (weight <= MID) {
			System.out.println("This is a Medium sized car");
		} else if (weight <= HEAVY) {
			System.out.println("This is a Big sized car");
		}
	}

	@Override
	public void carSize() {
		if (height <= COUPE) {
			System.out.println(
					"This is a Coupe because of its size\n---------------------------------------------------");
		} else if (height <= HATCHBACK) {
			System.out.println(
					"This is a Hatchback because of its size\n---------------------------------------------------");
		} else if (height <= SEDAN) {
			System.out.println(
					"This is a Sedan because of its size\n---------------------------------------------------");
		} else if (height <= SUV) {
			System.out
					.println("This is a SUV because of its size\n---------------------------------------------------");
		}
	}

	public void carCylinder() {
		if (cylinder <= FOURCYL) {
			System.out.println("This is four cylinder engine");
		} else if (cylinder <= V6) {
			System.out.println("This is a V6 engine");
		} else if (cylinder <= V8) {
			System.out.println("This is a V8 engine");
		}
	}
}
