package net.ukr.geka3;

public class Square extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	
	
	public Square() {
		super();
	}
	public Square(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	/* (non-Javadoc)
	 * @see net.ukr.geka3.Shape#getPerimetr()
	 */
	@Override
	public double getPerimetr() {
		// TODO Auto-generated method stub
		return 4 * getDistance(a, b);
	}
	/* (non-Javadoc)
	 * @see net.ukr.geka3.Shape#getArea()
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(getDistance(a, b),2);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Square, getPerimetr()=" + getPerimetr()
				+ ", getArea()=" + getArea() + "]";
	}
	

	
}
