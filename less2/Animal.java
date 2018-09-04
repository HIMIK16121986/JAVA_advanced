package less02;

import java.io.Serializable;

public class Animal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -367202532670052214L;
	protected String name;
	protected int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
