/**
 * 파일명 : Overloading.java
 * 작성일 : 2015. 7. 20.
 * 파일설명 : 
 */
package objectOriented;

/**
 * @author 임승한(lim_designer@naver.com)
 * [오버로딩의 조건]
 * 1. 메서드 이름이 같아야 한다.
 * 2. 매개변수의 개수 또는 타입이 달라야 한다.
 * 3. 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 성립되지 않는다.
 */
public class Overloading {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과 :" + mm.add(3, 3));
		System.out.println("mm.add(3L, 3) 결과 :" + mm.add(3L, 3));
		System.out.println("mm.add(3, 3L) 결과 :" + mm.add(3, 3L));
		System.out.println("mm.add(3L, 3L) 결과 :" + mm.add(3L, 3L));
		
		int[] a = { 100, 200, 300 };
		System.out.println("mm.add(a) 결과 :" + mm.add(a));
	}

}

class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) ::");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) ::");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("int add(long a, int b) ::");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("int add(long a, long b) ::");
		return a+b;
	}
	
	// 배열의 모든 요소의 합을 결과로 돌려준다.
	int add(int[] a){		
		System.out.print
		("int add(int[] a) ::");
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}
}
