package ioEx;

import java.io.Serializable;

public class Order implements Serializable{
	private String name;
	private Integer Lcd;
	private Integer Ram;
	private Integer Sum;
	public Order(String name, Integer lcd, Integer ram) {
		super();
		this.name = name;
		Lcd = lcd;
		Ram = ram;
		Sum=Lcd*4999+Ram*1280;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLcd() {
		return Lcd;
	}
	public void setLcd(Integer lcd) {
		Lcd = lcd;
	}
	public Integer getRam() {
		return Ram;
	}
	public void setRam(Integer ram) {
		Ram = ram;
	}
	public Integer getSum() {
		return Sum;
	}
	
	
	public void show()
	{
		System.out.println("名:"+name+
				"\tLcd:"+Lcd+
				"\tRam:"+Ram+
				"\tSum:"+Sum);
	}

}