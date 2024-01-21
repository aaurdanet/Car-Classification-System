
public class TestClass {

	public static void main(String[] args) {
		
		CarKind coupe = new CarKind("black", "bmw", "m4", 2300, 2, 6);
		System.out.println(coupe);
		coupe.carCylinder();
		coupe.carSound();
		coupe.carWeight();
		coupe.carSize();
		
		CarKind sedan = new CarKind("siver", "toyota", "camry", 3000, 3.7, 4);
		System.out.println(sedan);
		sedan.carCylinder();
		sedan.carSound();
		sedan.carWeight();
		sedan.carSize();
		
		CarKind suv = new CarKind("grey", "toyota", "fortuner", 5000, 6, 8);
		System.out.println(suv);
		suv.carCylinder();
		suv.carSound();
		suv.carWeight();
		suv.carSize();
		
		CarKind hatchback = new CarKind("white", "volkswaggen", "golf", 1500, 3, 6);
		System.out.println(hatchback);

		hatchback.carCylinder();
		hatchback.carSound();
		hatchback.carWeight();
		hatchback.carSize();
	}

}
