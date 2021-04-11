package Ass2;

public class Rectangle {
	private int width;
	private int length;
	
	public Rectangle() {
		this.width  = 0;
		this.length = 0;
		}
	
	public Rectangle(int width, int length) {
		this.width  =  width;
		this.length = length;
		}
	
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return this.length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getArea() {
		return width*length;
	}
}
