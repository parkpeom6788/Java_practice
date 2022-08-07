package shopping;

import java.util.Scanner;

public class Buyer {
	private int money = 10000;
	private int bonusPoint = 0;
	static Product[] cart; Scanner sc; int choice;
	static int i; 
	boolean flag = true;
	Product p = new Product();
	public Buyer() {
		// association 렌트카처럼 카트도 가져다가 썻다 반납
		cart = new Product[3];
		sc = new Scanner(System.in);
		choice();
	}
	public int getMoney() { return money; }
	public void setMoney(int money) { this.money = money;}
	public int getBonusPoint() { return bonusPoint;}
	public void setBonusPoint(int bonusPoint) { this.bonusPoint = bonusPoint; }
	public void choice() {
		while(flag) {
				System.out.print("1. 담기(3개까지) 2. 빼기 3. 카트 목록 4. 계산카운터 5.내 정보 6. 종료 : ");
					choice = sc.nextInt();
			switch(choice) {
				case	1: // 장바구니에 담기 
					System.out.print("1. 컴퓨터(600) 2. Tv(800) : ");
					int  choice = sc.nextInt();
					switch(choice) {
						case 1: buy(new Computer(600,"삼성",60)); break;
						case 2: buy(new Tv(800,"LG",80)); break;
					}
					break;
				case 2: minus(); break; // 물품빼기
				case 3: showCart(); break; // 카트목록
				case 4: calculate(); break;  // 계산 카운터
				case 5: myPage(); break;    // 내 현재 잔액 ,포인트
				case 6: // 종료
					System.out.println("안녕히가세요");
					System.exit(0);
			}
		}
	}
	// 계산하기
	private void calculate() {
		int totalPrice = 0;
		for(int i = 0 ; i < cart.length; i++) {
			if(cart[i] != null) {
				if(money >= cart[i].getPrice()) {
					this.money -= cart[i].getPrice();
					this.bonusPoint += cart[i].getBonusPoint();
					totalPrice += cart[i].getPrice();
				} else {
					System.out.println("잔액 부족");
				}
			} 
		}
		System.out.println("총 물품 비용 : " + totalPrice);
		System.out.println("총 얻은 포인트 : " + bonusPoint);
		System.out.println("***계산완료*** ");
	}
	// 카트에 담기  
	public void buy(Product p) {
			if(i == cart.length) {
				System.out.println("더이상 담을수 없습니다");
			} else {
				cart[i++] = p;
				System.out.println("담기 완료");
			}
	}
	// 물품 빼기
	public void minus() {
		showCart();
		int save = 0;
		System.out.print("무슨 물품을 빼시겠습니까? : ");
		String del = sc.next();
		for(int i = 0; i < cart.length; i++) {
			if(del.equals(cart[i].getName())) {
				save = i;
			}
		}
		for(int a = save; a < cart.length-1; a++) {
			cart[a] = cart[a+1];
		}
	}
	// 카트목록 과 총 가격 
	public void showCart() {
		int total = 0;
		System.out.println("** 카트 목록 **");
		for(int i = 0 ; i < cart.length; i++) {
			if(cart[i] != null) {
				System.out.print(i+1 + "번째" + cart[i].getName() + cart[i].getPrice());
				total += cart[i].getPrice();
			}
			System.out.println();
		}
		System.out.println("장바구니 총 가격 : " + total);
	}
	public void myPage() {
		System.out.println("내 잔액 : " + this.money);
		System.out.println("내 포인트 : " + this.bonusPoint);
	}
}
