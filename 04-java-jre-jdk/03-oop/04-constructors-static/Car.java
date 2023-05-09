
public class Car {
	private int year;
	private String model;
	private double price;

	public Car(int year, String model, double price) {
		if (year >= 1891) {
			this.year = year;
		} else {
			System.out.println("Invalid year. We'll use 2017!");
			this.year = 2017;
		}

		if (model != null) {
			this.model = model;
		} else {
			System.out.println("Uknown model. We'll use Gol!");
			this.model = "Gol";
		}

		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Invalid price. We'll use 40000.00!");
			this.price = 40000.00;
		}
	}

	// Second constructor that uses a previously defined constructor
	public Car(String model, double price) {
		this(2017, model, price);
	}

	// getters and setters

}