package Ass2;
public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle();
		a.setLength(5);
		a.setWidth(4);
		System.out.println("Rectangle 1");
		System.out.println("width = " + a.getWidth());
		System.out.println("length = " + a.getLength());
		System.out.println("area = " + a.getArea());
		System.out.println();
		
		Rectangle b = new Rectangle(8, 12);
		System.out.println("Rectangle 2");
		System.out.println("width = " + b.getWidth());
		System.out.println("length = " + b.getLength());
		System.out.println("area = " + b.getArea());
		System.out.println();
		
		Rectangle c = new Rectangle();
		c.setLength(100);
		c.setWidth(300);
		System.out.println("Rectangle 3");
		System.out.println("width = " + c.getWidth());
		System.out.println("length = " + c.getLength());
		System.out.println("area = " + c.getArea());

	}

}
