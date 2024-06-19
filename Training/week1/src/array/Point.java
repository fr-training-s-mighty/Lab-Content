package array;

public class Point {
	
	private int x;
	private int y;

	public Point(int x,int y) {
		this.x  = x;
		this.y = y;
	}
}

class PointArray {

	public Point[] createArray() {
		Point[] points;

		points = new Point[3];

		for (int i = 0; i < 3; i++) {
			points[i] = new Point(i, i + 1);
		}

		return points;

	}
}