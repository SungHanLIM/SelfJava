/**
 * 파일명 : Child.java
 * 작성일 : 2015. 7. 23.
 * 파일설명 : 
 */
package superEx;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Child extends Parent {
	int var = 20;

	void method() {
		System.out.println("this.var = " + this.var);
		System.out.println("super.var = " + super.var);
	}
}
