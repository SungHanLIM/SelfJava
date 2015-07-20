/**
 * 파일명 : ArrayEx02.java
 * 작성일 : 2015. 7. 19.
 * 파일설명 : 
 */
package array;

/**
 * @author 임승한(lim_designer@naver.com)
 *
 */
public class ArrayEx02 {
	public static void main(String[] arg) {
		int[] number = new int[10];
		
		for(int i=0; i < number.length; i++) {
			number[i] = i;
			System.out.print(number[i]);
		}
		System.out.println();
		
		for(int i=0; i < number.length; i++) {
			// 0 ~ 9중의 한 값을 임의로 얻는다.
			int n = (int)(Math.random() * 10);
			
			// number[0]과 number[n]의 값을 서로 바꾼다.
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		
		for (int i=0; i <number.length; i++) {
			// 배열의 내용 출력
			System.out.print(number[i]);
		}
	}
}
