/**
 * 파일명 : CardTest.java
 * 작성일 : 2015. 7. 19.
 * 파일설명 : 
 */
package objectOriented;

/**
 * @author 임승한(lim_designer@naver.com)
 *
 */

class Card {
	String kind;				// 카드의 무늬 - 인스턴스 변수
	int number;					// 카드의 숫자 - 인스턴스 변수
	static int width = 100;		// 카드의 폭 - 클래스 변수
	static int height = 250;	// 카드의 높이 - 클래스 변수
}

public class CardTest {
	public static void main(String[] args) {
		// 클래스변수(static변수)는 객체생성 없이 '클래스이름.클래스변수'로 직접 사용 가능하다.
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		// 인스턴스 변수의 값을 변경한다.
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " +c1.number + "이며, 크기는" + "(" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " +c2.number + "이며, 크기는" + "(" + c2.width + ", " + c2.height + ")");
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		// 클래스변수의 값을 변경한다.
		c1.width = 50;
		c1.height = 80;
		
		
		/*
		인스턴스변수는 인스턴스가 생성될 때 마다 생성되므로 인스턴스마다 각기 다른 값을 유지할 수 있지만, 
		클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통괸 값을 갖는다.
		 */
		System.out.println("c1은 " + c1.kind + ", " +c1.number + "이며, 크기는" + "(" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " +c2.number + "이며, 크기는" + "(" + c2.width + ", " + c2.height + ")");
	}
}
