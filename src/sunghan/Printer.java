/**
 * 파일명 : Printer.java
 * 작성일 : 2015. 7. 22.
 * 파일설명 : 
 */
package sunghan;

/**
 * @author 임승한(lim_designer@naver.com)
 *
 */
public class Printer {
	private People people;
	
	public Printer(People people) {
		this.people = people;
	}
	
	void start(){
		System.out.println(people.getName());
		System.out.println(people.getAge());
		System.out.println(people.getPhoneNum());
	}
}
