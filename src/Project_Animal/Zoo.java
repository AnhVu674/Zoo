package Project_Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
	ArrayList<Room> roomList = new ArrayList<>();

	public void addRoom(Room room) {
		roomList.add(room);
	}

	public Room getRoom(double roll) {
		for (int i = 0; i < roomList.size(); i++) {
			if (roomList.get(i).getRoll() == roll) {
				return roomList.get(i);
			}
		}
		return null;
	}

	public void deleteRoom(double e) {
		for (int i = 0; i < roomList.size(); i++) {
			if (roomList.get(i).getRoll() == e) {
				roomList.remove(i);
				break;
			}
		}
	}

	public void addAnimal() {
		Scanner input = new Scanner(System.in);
		System.out.println("Chon chuong can them vao: ");
		for (int i = 0; i < roomList.size(); i++) {
			System.out.println(roomList.get(i).getRoll() + " : ");
		}
		Double roll = Double.parseDouble(input.nextLine());
		System.out.println("Chon con vat can them: ");
		System.out.println("1. Tiger");
		System.out.println("2. Dog");
		System.out.println("3. Cat");
		System.out.println("Chosse: ");
		int choose = Integer.parseInt(input.nextLine());
		Animal animal;
		switch (choose) {
		case 1:
			animal = new Tiger();
			break;
		case 2:
			animal = new Dog();
			break;
		default:
			animal = new Cat();
			break;
		}
		animal.input();
		Room room = getRoom(roll);
		if (room != null) {
			room.addAnimal(animal);
		}
	}

	public void deleteAnimal() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ten con vat can xoa: ");
		String name = input.nextLine();
		for (Room room : roomList) {
			room.deleteAnimal(name);
		}
	}

	public void showAllAnimal() {
		for (int i = 0; i < roomList.size(); i++) {
			roomList.get(i).display();
		}
	}
}
