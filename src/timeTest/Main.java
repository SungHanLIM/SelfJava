/**
 * 파일명 : Main.java
 * 작성일 : 2015. 7. 24.
 * 파일설명 : 
 */
package timeTest;

/**
 * @author 임승한(lim_designer@naver.com)
 * 접근제어자 테스트 클레스
 */
public class Main {
	public static void main(String[] args) {

		Time time = new Time(12, 35, 30);
		System.out.println(time.toString());
		System.out.println(time);
		
		// time.hour = 13;	// private으로 되어있기 때문에 error
		
		// 현재시간보다 1시간 후로 변경
		time.setHour(time.getHour() + 1);
		System.out.println(time);
	}

}
