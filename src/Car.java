
public abstract class Car {
	String color;

	public Car(String color) {
		super();
		this.color = color;
	}

	@Override
	public String toString() {

		String result = "Color: " + color + "\n";

		return result;
	}

	public abstract void carSound();

	public abstract void carWeight();

	public abstract void carSize();

	public abstract void carCylinder();

}
