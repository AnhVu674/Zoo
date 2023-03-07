package Project_Animal;

import java.util.Date;
import java.util.Scanner;

public abstract class Animal {
	private double id;
	private String name;
	private Date birthday;
	private String moTa;

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", birthday=" + birthday + ", moTa=" + moTa + "]";
	}

	public Animal(double id, String name, Date birthday, String moTa) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.moTa = moTa;
	}

	public Animal() {
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap id con vat: ");
		double id =Double.parseDouble(input.nextLine());
		System.out.println("Nhap ten con vat: ");
		String name = input.nextLine();
		System.out.println("Nhap tuoi: ");
		String birthday =input.nextLine();
		System.out.println("Nhap mo ta: ");
		String moTa = input.nextLine();
	}

	public void display() {
		System.out.println(toString());
	}

	public abstract void sound();
}
