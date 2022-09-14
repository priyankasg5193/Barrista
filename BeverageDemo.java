package com.maveric.barrista;

import java.util.Scanner;

public class BeverageDemo {
	public static void main(String[] args) {
		System.out.println("==============Barrista Coffee========================== ");
		Beverage b = null;
		TakeOrder(b);

	}

	private static void printOrderDetails(Beverage c) {
		System.out.println("Cost: " + c.getCost() + ", Description: " + c.getDescription());
	}

	private static void TakeOrder(Beverage b) {
		System.out.println("Select [1 for Cofee (RS.50)] [2 for Tea(RS 20)]");
		System.out.println("Enter your choice: ");

		boolean flag = true;
		while (flag) {
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				b = new Coffee(50);
				Takeaddons(b);
				flag = false;
				break;
			case 2:
				b = new Tea(20);
				Takeaddons(b);
				flag = false;

				break;
			default:
				System.out.println("Select [1 for Cofee (RS.50)] [2 for Tea(RS 20)]");
				System.out.println("Enter Correct choice");
			}
		}
	}

	private static void Takeaddons(Beverage b) {
		boolean flag = true;
		while (flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Select addons:");
			System.out.println("[1 for Caramel (Rs.20)]" + " [2 for Chocolate (Rs.30)]" + " [3 for Cream(Rs.40)]"
					+ " [4 for Honey(Rs.10)]" + " [5 Done] " + " [6. Exit] ");

			int addons = sc.nextInt();
			switch (addons) {
			case 1:
				b = new Caramel(b, 20);
				break;
			case 2:
				b = new Chocolate(b, 30);
				break;
			case 3:
				b = new Cream(b, 40);
				break;
			case 4:
				b = new Honey(b, 10);
				break;
			case 5:
				printOrderDetails(b);
				flag = false;
				break;

			case 6:
				flag = false;
				System.out.println("Exit");

			}
		}
	}

}
