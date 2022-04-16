package pojo;

import com.fasterxml.jackson.annotation.JsonInclude;


public class Employee4 {

	private String name;
	private int age;
	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private boolean married;
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private String address,mobnos;
	
	
	
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
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobnos() {
		return mobnos;
	}
	public void setMobnos(String mobnos) {
		this.mobnos = mobnos;
	}
	
	
	
}
