package OOPS_Part3.Assignment_1;

public class Values {
	public static void main (String[] args) {
		int length, height;
		length=10;
		height=5;
		
		AreaOfRectangle rect = new AreaOfRectangle();
		rect.getArea(length, height);
		
		AreaOfTriangle tri = new AreaOfTriangle();
		tri.getArea(length, height);
	}
	
	
}
