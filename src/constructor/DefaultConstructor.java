/**
 * 파일명 : DefaultConstructor.java
 * 작성일 : 2015. 7. 22.
 * 파일설명 : 
 */
package constructor;

/**
 * @author 임승한(lim_designer@naver.com)
 * 모든 클래스는 하나 이상의 생성자가 있어야 한다.
 */

public class DefaultConstructor {
	public static void main(String[] args) {
		int test = 0;
		
		Data1_ data1 = new Data1_();
		Data2_ data2 = new Data2_(test);
		
		System.out.println(data2.getXx());
	}
}

class Data1_ {
	int value;
}

class Data2_ {
	
	private int xx;
	
	Data2_(int xx){
		this.xx = xx;
	}

	/**
	 * @return the xx
	 */
	public int getXx() {
		return xx;
	}

	/**
	 * @param xx the xx to set
	 */
	public void setXx(int xx) {
		this.xx = xx;
	}
}