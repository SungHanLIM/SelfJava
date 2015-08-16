/**
 * 파일명 : Factoral.java
 * 작성일 : 2015. 7. 21.
 * 파일설명 : 
 */
package objectOriented;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Factoral {
	public static void main(String[] args) {
		System.out.println(factoralMeth(5));
	}
	static long factoralMeth(int n) {
		long result = 0;
		
		if( n == 1 ) {
			result = 1;
		} else {
			// 재귀호출
			// 5 * 4 * 3 * 2 * 1
			result = n * factoralMeth(n-1);
		}
		return result;
	}
}
