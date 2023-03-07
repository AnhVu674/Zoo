package Project_Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
	public ArrayList<Animal> listAnimal = new ArrayList<>();
	private double roll;

	public Room(double roll) {
		this.roll = roll;
	}

	public Room() {
	}

	public void addAnimal(Animal animal) {
		listAnimal.add(animal);
	}

	public void deleteAnimal(String name) {
		for (int i = 0; i < listAnimal.size(); i++) {
			if (listAnimal.get(i).getName().equalsIgnoreCase(name)) {
				listAnimal.remove(i);
				break;
			}
		}
	}

	public double getRoll() {
		return roll;
	}

	public void setRoll(double roll) {
		this.roll = roll;
	}

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ma chuong: ");
		roll = input.nextLong();

	}

	public void display() {
		for (Animal animal : listAnimal) {
			animal.display();
		}
	}

}
