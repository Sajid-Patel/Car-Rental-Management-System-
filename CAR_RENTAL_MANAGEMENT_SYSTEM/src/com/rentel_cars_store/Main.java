package com.rentel_cars_store;

public class Main {

	public static void main(String[] args) {
		CarRentalSystem rentalSystem = new CarRentalSystem();

		Car car1 = new Car("01", "Toyota", "Etos", 300.0); // Different base price per day for each car
		Car car2 = new Car("02", "Honda", "Amaze", 100.0);
		Car car3 = new Car("03", "Mahindra", "Thar", 150.0);
		Car car4 = new Car("04", "Maruti", "Swift", 40.0);
		Car car5 = new Car("05", "Tata", "Nexon", 50.0);
		rentalSystem.addCar(car1);
		rentalSystem.addCar(car2);
		rentalSystem.addCar(car3);
		rentalSystem.addCar(car4);
		rentalSystem.addCar(car5);

		rentalSystem.menu();
	}

}
