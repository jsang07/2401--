package chap6;

public class Ball extends Circle{
	private String color;
	
	public Ball(String color) {
		this.color  = color;
	}
	
	public void findColor() {
		System.out.println(color + "공이다.");
	}
	
	public void findvolume() {
		System.out.println("부피는 4/3*(3.14*반지름*반지름*반지름)이다.");
	}
}
