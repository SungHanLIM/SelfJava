/**
 * 파일명 : ConstructorEx02.java
 * 작성일 : 2015. 7. 20.
 * 파일설명 : 
 */
package constructor;

/**
 * @author 임승한(lim_designer@naver.com)
 * 매개변수가 있는 생성자
 */
class Car {
	String color;
	String gearType;
	int door;
	
	Car() {}
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class ConstructorEx02 {
	public static void main(String[] args) {
		/* 비추천 */
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		/* 추천 */
		Car c2 = new Car("white", "auto", 4);
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		
	}

}
