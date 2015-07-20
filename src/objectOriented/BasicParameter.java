/**
 * 파일명 : BasicParameter.java
 * 작성일 : 2015. 7. 19.
 * 파일설명 : 
 */
package objectOriented;

/**
 * @author 임승한(lim_designer@naver.com)
 * 기본형 매개변수 - 변수의 값을 읽기만 할 수 있다. (read only)
 */
public class BasicParameter {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	// 기본형 매개변수
	static void change(int x) {
		x = 1000;
		System.out.println("change() : " + x);
	}
}

class Data { int x; }