/**
 * 파일명 : MethodMain.java
 * 작성일 : 2015. 7. 21.
 * 파일설명 : 
 */
package methodEx;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class MethodMain {
	public static void main(String[] args) {
		// 클래스메서드 호출
		System.out.println(SecondMethodClass.addStatic(200L,300L));
		
		// 인스턴스 생성
		SecondMethodClass instanceVar = new SecondMethodClass();
		instanceVar.a = 200L;
		instanceVar.b = 500L;
		
		// 인스턴스메서드 호출
		System.out.println(instanceVar.addInstance());

	}

}
