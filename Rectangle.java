package Task6;

public class Rectangle {
	public int length;
	public int breadth;
	
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle(int value) {
		super();
		this.length = value;
		this.breadth = value;
	}
	
	public Rectangle() {
		super();
		this.length = 0;
		this.breadth = 0;
	}



	public void Area(Rectangle r)
	{
		System.out.println("The area of the triangle is :" + (r.length*r.breadth));
	}

}
