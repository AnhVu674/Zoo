package Project_Animal;

import java.util.Scanner;

public class Client {
	static Scanner input = new Scanner(System.in);
	static Zoo zoo = new Zoo();
public static void main(String[] args) {
	int choose;
	do {
		showMenu();
		choose =Integer.parseInt(input.nextLine());
		switch (choose) {
		case 1:
			inputRoom();
			break;
		case 2:
			deleteRoom();
			break;
		case 3:
			addAnimal();
			break;
		case 4: 
			zoo.deleteAnimal();
			break;
		case 5: 
			zoo.showAllAnimal();
			break;
		case 6: 
			System.out.println("Exit!!!");
			break;
		default: 
			System.out.println("Nhap sai, Nhap lai!!!");
			break;
		}
		
	} while (choose!=6);
}
static void inputRoom() {
	System.out.println("Nhap so chuong can them: ");
	int n = Integer.parseInt(input.nextLine());
    for (int i = 0; i < n; i++) {
		Room room = new Room();
		room.input();
		zoo.addRoom(room);
	}
}
static void deleteRoom() {
	System.out.println("Nhap ma chuong can xoa: ");
    Double romroll = (double) Integer.parseInt(input.nextLine());
	zoo.deleteRoom(romroll);
}
static void addAnimal() {
	zoo.addAnimal();
}
static void showMenu() {
	System.out.println("1. Add Room");
	System.out.println("2. Delete Room");
	System.out.println("3. Add Animal");
	System.out.println("4. Delete Animal");
	System.out.println("5. See All Animal Information ");
	System.out.println("6. Exits");
	System.out.println("Choose: ");
}
}
