/**
 * 파일명 : ArrayEx01
 * 작성일 : 2015. 7. 19.
 * 파일설명 : 
 */
/**
 * @author 임승한(lim_designer@naver.com)
 *
 */
package array;

class ArrayEx01{
	public static void main(String[] args) {
		int[] score = {19, 100, 20, 30, 40, 50};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
	}
}