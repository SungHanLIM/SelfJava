/**
 * 파일명 : ArrayEx03_counter.java
 * 작성일 : 2015. 7. 19.
 * 파일설명 : 
 */
package array;

/**
 * @author 임승한(lim_designer@naver.com)
 *
 */
public class ArrayEx03_counter {
	public static void main(String[] args) {
		int[] number = new int[10];
		int[] counter = new int[10];
		
		for (int i=0; i < number.length; i++) {
			System.out.print(number[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		
		for(int i=0; i < number.length; i++) {
			counter[number[i]]++;
		}
		
		for(int i=0; i < number.length; i++) {
			System.out.println(i + "의 개수 : " + counter[i]);
		}
	}
}
