/**
 * 파일명 : MemberVar.java
 * 작성일 : 2015. 7. 22.
 * 파일설명 : 
 */
package constructor;

/**
 * @author 임승한(lim_designer@naver.com)
 * 맴버변수의 초기화 시기, 순서
 */
public class MemberVar {
	public static void main(String[] args) {

		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("제품번호(SerialNo) = " + p1.serialNo);
		System.out.println("제품번호(SerialNo) = " + p2.serialNo);
		System.out.println("제품번호(SerialNo) = " + p3.serialNo);

	}
}

class Product {
	static int count = 0;	// 생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo;			// 인스턴스 고유의 번호
	
	// 인스턴스 초기화 블럭
	// 모든 생성자에서 공통적으로 수행될 코드
	{
		++count;
		serialNo = count;
	}
	public Product() {}
}
