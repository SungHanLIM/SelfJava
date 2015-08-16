/**
 * 파일명 : Main.java
 * 작성일 : 2015. 7. 23.
 * 파일설명 : 
 */
package deckGame;

/**
 * @author 임승한(lim_designer@naver.com)
 * 클래스간의 관계 
 */
public class Main {
	public static void main(String[] args) {

		// 카드 한 벌(Deck)을 만든다.
		Deck d = new Deck();
		
		// 섞기 전에 제일 위의 카드를 뽑는다.
		Card c = d.pick(0);
		
		// System.out.println(c.toString()); 과 같다.
		System.out.println(c);
		
		// 카드를 섞는다.
		d.shuffle();
		
		// 섞은 후에 제일 위의 카드를 뽑는다.
		c = d.pick(0);
		
		System.out.println(c);
		

	}

}
