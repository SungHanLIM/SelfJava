/**
 * 파일명 : ConstructorEx03.java
 * 작성일 : 2015. 7. 20.
 * 파일설명 : 
 */
package constructor;

/**
 * @author 임승한(lim_designer@naver.com)
 * 생성자에서 다른 생성자 호출하기 - this(), this
 */

class Car00 {
	String color;
	String gearType;
	int door;
	
	Car00() {
		this("white", "auto", 4);
	}
	
	Car00(String color) {
		//this(color, "auto", 4);
	}
	
	Car00(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class ConstructorEx03 {
	public static void main(String[] args) {
		Car00 c1 = new Car00();
		Car00 c2 = new Car00("blue", "auto", 5);
		
		System.out.println(c1.color + ", " + c1.gearType + ", "+ c1.door);
		System.out.println(c2.color + ", " + c2.gearType + ", "+ c2.door);
	}
}