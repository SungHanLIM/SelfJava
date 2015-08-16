/**
 * 파일명 : Card.java
 * 작성일 : 2015. 7. 23.
 * 파일설명 : 
 */
package deckGame;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Card {
	static final int KIND_MAX = 4; // 카드 무늬의 수
	static final int NUM_MAX = 13; // 무늬별 카드 수

	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind;
	int number;

	Card() {
		this(SPADE, 1);
	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String kind = "";
		String number = "";

		switch (this.kind) {
		case 4:
			kind = "SPADE";
			break;
		case 3:
			kind = "DIAMOND";
			break;
		case 2:
			kind = "HEART";
			break;
		case 1:
			kind = "CLOVER";
			break;
		default:
		}

		switch (this.number) {
		case 13 :
			number = "K";
			break;
		case 12 :
			number = "Q";
			break;
		case 11 :
			number = "J";
			break;
			
		default :
			// 현재 클래스에서 number는 int형이기때문에 공백("")을 붙여 Stirng으로 형변환을 한다.
			number = this.number + "";
		}
		return "kind : " + kind + ", " + "number : " + number;
	}
}
