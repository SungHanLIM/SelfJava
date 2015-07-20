/**
 * 파일명 : ReferentialParameter.java
 * 작성일 : 2015. 7. 20.
 * 파일설명 : 
 */
package objectOriented;

/**
 * @author 임승한(lim_designer@naver.com)
 * 참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다. (read & write)
 */

public class ReferentialParameter {
	public static void main(String[] args) {
		Data01 d = new Data01();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	// 참조형 매개변수
	static void change (Data01 d){		
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}

class Data01 { int x; }