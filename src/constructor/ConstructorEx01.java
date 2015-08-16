/**
 * 파일명 : package-info.java
 * 작성일 : 2015. 7. 20.
 * 파일설명 : 
 */
/**
 * @author 임승한(lim_designer@naver.com)
 *
 */
package constructor;

class Data1 {
	int value;
}
class Data2 {
	int value;
	
	Data2(){}
	// 매개변수가 있는 생성자
	Data2(int x){
		value = x;
		value = 100;
	}
}

class ConstructorrEx01 {
	public static void main(String[] args){
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();
		System.out.print(d2.value);
		System.out.print("test");
	}
}