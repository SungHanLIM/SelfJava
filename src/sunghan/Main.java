/**
 * 파일명 : Main.java
 * 작성일 : 2015. 7. 22.
 * 파일설명 : 
 */
package sunghan;

import java.awt.print.Printable;
import java.io.ObjectInputStream.GetField;

/**
 * @author 임승한(lim_designer@naver.com)
 *
 */
public class Main {
	public static void main(String[] args) {
		
		// People Class 객체 생성 후
		// People Class에 사용자 정보 전달
		People people = new People("임승한", 27, "01047306411");
		
		// Printer Class 객체 생성 후
		// people 객체를 인자로 넘겨줌
		Printer printer = new Printer(people);
		
		printer.start();
	}
}
