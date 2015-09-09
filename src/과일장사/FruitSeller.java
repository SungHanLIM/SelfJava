/**
 * 파일명 : FruitSeller.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package 과일장사;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class FruitSeller {
	/*
     * FruitSeller{ 변수선언; } 하는 것은
     * FruitSeller 클래스 {} 에서만 접근이 가능
     * 단, main에서 객체 생성했을 경우에도 접근이 가능
     */
	
	int numOfApple;
	int myMoney;
	int APPLE_PRICE;
	
	public int saleApple(int money) {
		// 사과가격
		int num = money/APPLE_PRICE;
		
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	
}
