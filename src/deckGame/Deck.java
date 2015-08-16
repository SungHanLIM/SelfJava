/**
 * 파일명 : Deck.java
 * 작성일 : 2015. 7. 23.
 * 파일설명 : 
 */
package deckGame;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Deck {
	final int CARD_NUM = 52;		// 카드의 개수
	Card c[] = new Card[CARD_NUM];
	
	//Deck Class 생성자
	Deck (){
		int i=0;
		
		for(int k = Card.KIND_MAX; k > 0; k--) {
			for(int n = 1; n < Card.NUM_MAX; n++) {
				c[i++] = new Card(k, n);
			}
		}
	}
	
	// 지정된 위치(index)에 있는 카드 하나를 선택한다.
	Card pick(int index) {
		if(0 <= index && index < CARD_NUM) {
			return c[index];
		}
		else
			return pick();
	}
	
	// Deck에서 카드 하나를 선택한다.
	Card pick(){
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	// 카드의 순서를 섞는다.
	void shuffle() {
		for(int n = 0; n < 1000; n++) {
			int i = (int)(Math.random() * CARD_NUM);
			Card temp = c[0];
			c[0] = c[i];
			c[i] = temp;
		}
	}
}

