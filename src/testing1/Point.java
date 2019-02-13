package testing1;

public class Point {
	double x;
	double y;
	
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void printCords() {
		System.out.println("X: "+x+","+" Y: "+y);
	}
	
	public static double findDist(Point p1, Point p2) {
		// d = sqrt((x1 - x2)^2 + (y1 - y2)^2)
		double temp1 = Math.pow((p1.x - p2.x), 2);
		double temp2 = Math.pow((p1.y - p2.y), 2);
		return Math.sqrt(temp1 + temp2);
	}
	
	public static Point partionSegment(Point p1, Point p2, double a, double b) {
		double rise = (p2.y - p1.y);
		double run = (p2.x - p1.x);
		double fd = a/(a+b);
		double pX = (p1.x + (run*fd));
		double pY = (p1.y + (rise*fd));
		Point p = new Point(pX, pY);
		return p;
	}
	
	public static Point translatePoint(Point p, double xAm, double yAm) {
		Point tempPoint = new Point(p.x + xAm, p.y + yAm);
		return tempPoint;
	}
	
	public static double findSlope(Point p1, Point p2) {
		//  m=(y2-y1)/(x2-x1
		return (p2.y - p1.y) / (p2.x - p1.x);
	}
	
	public static Point dialatePoint(Point p1, double k) {
		return new Point(p1.x * k, p1.y * k);
	}
	
	public static Point rotate90ClockOfOrigin(Point p1) {
		return new Point(p1.y,(p1.x * -1));
	}
	
	public static Point rotate90CounterOfOrigin(Point p1) {
		return new Point((p1.y * -1), p1.x);
	}
}