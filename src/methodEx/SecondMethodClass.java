/**
 * 파일명 : package-info.java
 * 작성일 : 2015. 7. 21.
 * 파일설명 : 
 */
/**
 * @author 임승한(lim_designer@naver.com)
 */
package methodEx;

class SecondMethodClass {
	long a,b;

	// 인스턴스 메서드
	long addInstance() {
		return a + b;
	}
	
	// 클래스메서드(static메서드)
	static long addStatic(long a, long b) {
		return a + b;
	}
}