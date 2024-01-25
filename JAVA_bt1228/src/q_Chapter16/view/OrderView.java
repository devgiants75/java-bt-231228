package q_Chapter16.view;

import java.util.Scanner;

public class OrderView {
	private Scanner sc = new Scanner(System.in);
	
	// 메뉴 선택을 사용자에게 요청하는 메서드
	public String getUserChoice() {
		System.out.println("\nSelect an option : ");
		System.out.println("1. Pizza");
		System.out.println("2. Pasta");
		System.out.println("3. Juice");
		System.out.println("4. Complete Order");
		System.out.print("Your choice: ");
		return sc.nextLine();
	}
	
	// 주문 수량을 사용자에게 요청하는 메서드
	public int getQuantity() {
		System.out.println("Enter quantity :");
		return sc.nextInt();
	}
	
	// 총 주문 가격을 표시하는 메서드
	public void displayTotalPrice(int price) {
		System.out.println("Total Price: " + price + " KRW");
	}
	
	// 주문 완료 메시지 표시
	public void displayOrderComplete() {
		System.out.println("Order has been completed!");
	}
}
