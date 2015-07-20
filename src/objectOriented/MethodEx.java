/**
 * 파일명 : MethodEx.java
 * 작성일 : 2015. 7. 19.
 * 파일설명 : 
 */
package objectOriented;

/**
 * @author 임승한(lim_designer@naver.com)
 *
 */
public class MethodEx {
	public static void main(String[] args) {
		Method mm = new Method();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		// mm.divide(5L, 3L);의 long 값은 double로 자동형변환된다.
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + mm.add(5L, 3L));
		System.out.println("substract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		
	}
}

class Method {
	long add(long a, long b) {
		long result = a+b;
		return result;
		//	return a+b;		// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	
	long substract (long a, long b) {
		return a-b;
	}
	
	long multiply (long a, long b) {
		return a*b;
	}
	
	long divide (long a, long b) {
		return a/b;
	}
}
