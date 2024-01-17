package ex12;

class Point {
	int xPos, yPos;
	public Point (int x, int y) {
			xPos = x;
			yPos = y;
	}
	public void showPointInfo() {
		System.out.print("[ x좌표 = " + xPos + ", y좌표 = " + yPos );
	}
}

class Circle{
	
	int xPos, yPos, radius;
	Point p = new Point(xPos, yPos);
	public Circle(int x, int y, int r) {
		p.xPos = x;
		p.yPos = y;
		radius = r;
	}

	void showCircleInfoin() {
		p.showPointInfo();
		System.out.println(", 반지름의 길이 = " + radius + "]");
	}
	
}

public class Result2 {
	public static void main(String[] args) {
		Circle c = new Circle(2, 2, 4);
		c.showCircleInfoin();
	}
}


